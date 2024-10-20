package deob;

import java.math.BigInteger;

@ObfuscatedName("ds")
public class class120 extends class209 {

    @ObfuscatedName("ds.b")
    public byte[] field1983;

    @ObfuscatedName("ds.g")
    public int field1977;

    @ObfuscatedName("ds.j")
    public static int[] field1985 = new int[256];

    @ObfuscatedName("ds.x")
    public static long[] field1980;

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
        field1980 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1980[var3] = var4;
        }
    }

    @ObfuscatedName("l.b([BIIB)I")
    public static int method113(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1985[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class120(int arg0) {
        this.field1983 = class122.method2607(arg0);
        this.field1977 = 0;
    }

    public class120(byte[] arg0) {
        this.field1983 = arg0;
        this.field1977 = 0;
    }

    @ObfuscatedName("ds.g(IB)V")
    public void method2480(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.j(II)V")
    public void method2525(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1983[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.d(II)V")
    public void method2331(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1983[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.x(II)V")
    public void method2332(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1983[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.y(J)V")
    public void method2496(long arg0) {
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1983[++this.field1977 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ds.r(J)V")
    public void method2477(long arg0) {
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1983[++this.field1977 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1983[++this.field1977 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("x.c(Ljava/lang/String;I)I")
    public static int method42(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ds.l(Ljava/lang/String;I)V")
    public void method2335(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1977 += class166.method2606(arg0, 0, arg0.length(), this.field1983, this.field1977);
        this.field1983[++this.field1977 - 1] = 0;
    }

    @ObfuscatedName("ak.u(Ljava/lang/String;I)I")
    public static int method844(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ds.p(Ljava/lang/String;I)V")
    public void method2426(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1983[++this.field1977 - 1] = 0;
        this.field1977 += class166.method2606(arg0, 0, arg0.length(), this.field1983, this.field1977);
        this.field1983[++this.field1977 - 1] = 0;
    }

    @ObfuscatedName("ds.n(Ljava/lang/CharSequence;I)V")
    public void method2337(CharSequence arg0) {
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
        this.field1983[++this.field1977 - 1] = 0;
        this.method2343(var3);
        this.field1977 += class210.method3362(this.field1983, this.field1977, arg0);
    }

    @ObfuscatedName("ds.w([BIII)V")
    public void method2338(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1983[++this.field1977 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ds.z(II)V")
    public void method2339(int arg0) {
        this.field1983[this.field1977 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1983[this.field1977 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1983[this.field1977 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1983[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.k(IB)V")
    public void method2340(int arg0) {
        this.field1983[this.field1977 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1983[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.o(II)V")
    public void method2341(int arg0) {
        this.field1983[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.t(IB)V")
    public void method2342(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2480(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2525(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.h(IB)V")
    public void method2343(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2480(arg0 >>> 28 | 0x80);
                    }
                    this.method2480(arg0 >>> 21 | 0x80);
                }
                this.method2480(arg0 >>> 14 | 0x80);
            }
            this.method2480(arg0 >>> 7 | 0x80);
        }
        this.method2480(arg0 & 0x7F);
    }

    @ObfuscatedName("ds.v(I)I")
    public int method2344() {
        return this.field1983[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.a(B)B")
    public byte method2345() {
        return this.field1983[++this.field1977 - 1];
    }

    @ObfuscatedName("ds.f(I)I")
    public int method2346() {
        this.field1977 += 2;
        return ((this.field1983[this.field1977 - 2] & 0xFF) << 8) + (this.field1983[this.field1977 - 1] & 0xFF);
    }

    @ObfuscatedName("ds.q(I)I")
    public int method2347() {
        this.field1977 += 2;
        int var1 = ((this.field1983[this.field1977 - 2] & 0xFF) << 8) + (this.field1983[this.field1977 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.m(B)I")
    public int method2348() {
        this.field1977 += 3;
        return (this.field1983[this.field1977 - 1] & 0xFF) + ((this.field1983[this.field1977 - 3] & 0xFF) << 16) + ((this.field1983[this.field1977 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ds.s(I)I")
    public int method2349() {
        this.field1977 += 4;
        return (this.field1983[this.field1977 - 1] & 0xFF) + ((this.field1983[this.field1977 - 2] & 0xFF) << 8) + ((this.field1983[this.field1977 - 3] & 0xFF) << 16) + ((this.field1983[this.field1977 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("ds.i(I)J")
    public long method2529() {
        long var1 = (long) this.method2349() & 0xFFFFFFFFL;
        long var3 = (long) this.method2349() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ds.e(I)Ljava/lang/String;")
    public String method2351() {
        if (this.field1983[this.field1977] == 0) {
            this.field1977++;
            return null;
        } else {
            return this.method2352();
        }
    }

    @ObfuscatedName("ds.aw(I)Ljava/lang/String;")
    public String method2352() {
        int var1 = this.field1977;
        while (this.field1983[++this.field1977 - 1] != 0) {
        }
        int var2 = this.field1977 - var1 - 1;
        return var2 == 0 ? "" : class166.method2274(this.field1983, var1, var2);
    }

    @ObfuscatedName("ds.an(I)Ljava/lang/String;")
    public String method2357() {
        byte var1 = this.field1983[++this.field1977 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1977;
        while (this.field1983[++this.field1977 - 1] != 0) {
        }
        int var3 = this.field1977 - var2 - 1;
        return var3 == 0 ? "" : class166.method2274(this.field1983, var2, var3);
    }

    @ObfuscatedName("ds.ag(I)Ljava/lang/String;")
    public String method2470() {
        byte var1 = this.field1983[++this.field1977 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2359();
        if (this.field1977 + var2 > this.field1983.length) {
            throw new IllegalStateException("");
        }
        String var3 = class210.method3483(this.field1983, this.field1977, var2);
        this.field1977 += var2;
        return var3;
    }

    @ObfuscatedName("ds.ae([BIII)V")
    public void method2355(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1983[++this.field1977 - 1];
        }
    }

    @ObfuscatedName("ds.aj(I)I")
    public int method2519() {
        int var1 = this.field1983[this.field1977] & 0xFF;
        return var1 < 128 ? this.method2344() - 64 : this.method2346() - 49152;
    }

    @ObfuscatedName("ds.ah(I)I")
    public int method2472() {
        int var1 = this.field1983[this.field1977] & 0xFF;
        return var1 < 128 ? this.method2344() : this.method2346() - 32768;
    }

    @ObfuscatedName("ds.af(B)I")
    public int method2561() {
        return this.field1983[this.field1977] < 0 ? this.method2349() & Integer.MAX_VALUE : this.method2346();
    }

    @ObfuscatedName("ds.az(I)I")
    public int method2359() {
        byte var1 = this.field1983[++this.field1977 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1983[++this.field1977 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ds.ax([II)V")
    public void method2360(int[] arg0) {
        int var2 = this.field1977 / 8;
        this.field1977 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2349();
            int var5 = this.method2349();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1977 -= 8;
            this.method2332(var4);
            this.method2332(var5);
        }
    }

    @ObfuscatedName("ds.ac([II)V")
    public void method2361(int[] arg0) {
        int var2 = this.field1977 / 8;
        this.field1977 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2349();
            int var5 = this.method2349();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1977 -= 8;
            this.method2332(var4);
            this.method2332(var5);
        }
    }

    @ObfuscatedName("ds.ar([IIII)V")
    public void method2362(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        this.field1977 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2349();
            int var8 = this.method2349();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1977 -= 8;
            this.method2332(var7);
            this.method2332(var8);
        }
        this.field1977 = var4;
    }

    @ObfuscatedName("ds.aq([IIII)V")
    public void method2363(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        this.field1977 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2349();
            int var8 = this.method2349();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1977 -= 8;
            this.method2332(var7);
            this.method2332(var8);
        }
        this.field1977 = var4;
    }

    @ObfuscatedName("ds.aa(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2507(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1977;
        this.field1977 = 0;
        byte[] var4 = new byte[var3];
        this.method2355(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1977 = 0;
        this.method2525(var7.length);
        this.method2338(var7, 0, var7.length);
    }

    @ObfuscatedName("ds.ay(II)I")
    public int method2365(int arg0) {
        byte[] var2 = this.field1983;
        int var3 = this.field1977;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1985[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2332(var6);
        return var6;
    }

    @ObfuscatedName("ds.as(I)Z")
    public boolean method2508() {
        this.field1977 -= 4;
        int var1 = method113(this.field1983, 0, this.field1977);
        int var2 = this.method2349();
        return var1 == var2;
    }

    @ObfuscatedName("ds.ak(II)V")
    public void method2427(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.au(II)V")
    public void method2368(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ds.av(II)V")
    public void method2369(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ds.at(B)I")
    public int method2370() {
        return this.field1983[++this.field1977 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ds.am(I)I")
    public int method2404() {
        return -this.field1983[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.ab(I)I")
    public int method2372() {
        return 128 - this.field1983[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.ai(B)B")
    public byte method2373() {
        return (byte) (this.field1983[++this.field1977 - 1] - 128);
    }

    @ObfuscatedName("ds.ad(I)B")
    public byte method2374() {
        return (byte) (128 - this.field1983[++this.field1977 - 1]);
    }

    @ObfuscatedName("ds.ao(IS)V")
    public void method2375(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) arg0;
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.al(II)V")
    public void method2523(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.ap(IB)V")
    public void method2377(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 + 128);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bc(B)I")
    public int method2378() {
        this.field1977 += 2;
        return ((this.field1983[this.field1977 - 1] & 0xFF) << 8) + (this.field1983[this.field1977 - 2] & 0xFF);
    }

    @ObfuscatedName("ds.bj(I)I")
    public int method2491() {
        this.field1977 += 2;
        return ((this.field1983[this.field1977 - 2] & 0xFF) << 8) + (this.field1983[this.field1977 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.bs(I)I")
    public int method2380() {
        this.field1977 += 2;
        return ((this.field1983[this.field1977 - 1] & 0xFF) << 8) + (this.field1983[this.field1977 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.be(B)I")
    public int method2381() {
        this.field1977 += 2;
        int var1 = ((this.field1983[this.field1977 - 2] & 0xFF) << 8) + (this.field1983[this.field1977 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.bi(B)I")
    public int method2382() {
        this.field1977 += 2;
        int var1 = ((this.field1983[this.field1977 - 1] & 0xFF) << 8) + (this.field1983[this.field1977 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.ba(II)V")
    public void method2383(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) arg0;
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ds.bp(I)I")
    public int method2536() {
        this.field1977 += 3;
        return (this.field1983[this.field1977 - 3] & 0xFF) + ((this.field1983[this.field1977 - 1] & 0xFF) << 16) + ((this.field1983[this.field1977 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ds.bz(II)V")
    public void method2329(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) arg0;
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ds.bb(II)V")
    public void method2386(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1983[++this.field1977 - 1] = (byte) arg0;
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ds.bl(IB)V")
    public void method2387(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1983[++this.field1977 - 1] = (byte) arg0;
        this.field1983[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bh(I)I")
    public int method2568() {
        this.field1977 += 4;
        return (this.field1983[this.field1977 - 4] & 0xFF) + ((this.field1983[this.field1977 - 3] & 0xFF) << 8) + ((this.field1983[this.field1977 - 1] & 0xFF) << 24) + ((this.field1983[this.field1977 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.bt(I)I")
    public int method2389() {
        this.field1977 += 4;
        return (this.field1983[this.field1977 - 3] & 0xFF) + ((this.field1983[this.field1977 - 4] & 0xFF) << 8) + ((this.field1983[this.field1977 - 2] & 0xFF) << 24) + ((this.field1983[this.field1977 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.bx(I)I")
    public int method2390() {
        this.field1977 += 4;
        return (this.field1983[this.field1977 - 2] & 0xFF) + ((this.field1983[this.field1977 - 1] & 0xFF) << 8) + ((this.field1983[this.field1977 - 3] & 0xFF) << 24) + ((this.field1983[this.field1977 - 4] & 0xFF) << 16);
    }
}
