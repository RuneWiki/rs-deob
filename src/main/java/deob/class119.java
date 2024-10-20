package deob;

import java.math.BigInteger;

@ObfuscatedName("dj")
public class class119 extends class208 {

    @ObfuscatedName("dj.i")
    public byte[] field1988;

    @ObfuscatedName("dj.v")
    public int field1984;

    @ObfuscatedName("dj.f")
    public static int[] field1985 = new int[256];

    @ObfuscatedName("dj.a")
    public static long[] field1987;

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
        field1987 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1987[var3] = var4;
        }
    }

    @ObfuscatedName("cx.i([BIIB)I")
    public static int method1990(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1985[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1988 = class121.method2543(arg0);
        this.field1984 = 0;
    }

    public class119(byte[] arg0) {
        this.field1988 = arg0;
        this.field1984 = 0;
    }

    @ObfuscatedName("dj.v(II)V")
    public void method2296(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.f(II)V")
    public void method2381(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.h(II)V")
    public void method2298(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.a(II)V")
    public void method2299(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.s(J)V")
    public void method2504(long arg0) {
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1988[++this.field1984 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dj.p(J)V")
    public void method2301(long arg0) {
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1988[++this.field1984 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("hy.r(Ljava/lang/String;I)I")
    public static int method3638(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dj.k(Ljava/lang/String;B)V")
    public void method2302(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1984 += class165.method2670(arg0, 0, arg0.length(), this.field1988, this.field1984);
        this.field1988[++this.field1984 - 1] = 0;
    }

    @ObfuscatedName("bw.d(Ljava/lang/String;B)I")
    public static int method1187(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dj.n(Ljava/lang/String;I)V")
    public void method2432(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1988[++this.field1984 - 1] = 0;
        this.field1984 += class165.method2670(arg0, 0, arg0.length(), this.field1988, this.field1984);
        this.field1988[++this.field1984 - 1] = 0;
    }

    @ObfuscatedName("dj.z(Ljava/lang/CharSequence;I)V")
    public void method2454(CharSequence arg0) {
        int var2 = class209.method3414(arg0);
        this.field1988[++this.field1984 - 1] = 0;
        this.method2476(var2);
        this.field1984 += class209.method581(this.field1988, this.field1984, arg0);
    }

    @ObfuscatedName("dj.c([BIIB)V")
    public void method2305(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1988[++this.field1984 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dj.b(II)V")
    public void method2306(int arg0) {
        this.field1988[this.field1984 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1988[this.field1984 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1988[this.field1984 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1988[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.w(II)V")
    public void method2307(int arg0) {
        this.field1988[this.field1984 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1988[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.g(II)V")
    public void method2410(int arg0) {
        this.field1988[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.x(II)V")
    public void method2373(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2296(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2381(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dj.o(II)V")
    public void method2476(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2296(arg0 >>> 28 | 0x80);
                    }
                    this.method2296(arg0 >>> 21 | 0x80);
                }
                this.method2296(arg0 >>> 14 | 0x80);
            }
            this.method2296(arg0 >>> 7 | 0x80);
        }
        this.method2296(arg0 & 0x7F);
    }

    @ObfuscatedName("dj.l(I)I")
    public int method2310() {
        return this.field1988[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.j(I)B")
    public byte method2311() {
        return this.field1988[++this.field1984 - 1];
    }

    @ObfuscatedName("dj.m(B)I")
    public int method2312() {
        this.field1984 += 2;
        return ((this.field1988[this.field1984 - 2] & 0xFF) << 8) + (this.field1988[this.field1984 - 1] & 0xFF);
    }

    @ObfuscatedName("dj.e(I)I")
    public int method2313() {
        this.field1984 += 2;
        int var1 = ((this.field1988[this.field1984 - 2] & 0xFF) << 8) + (this.field1988[this.field1984 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.u(I)I")
    public int method2314() {
        this.field1984 += 3;
        return (this.field1988[this.field1984 - 1] & 0xFF) + ((this.field1988[this.field1984 - 3] & 0xFF) << 16) + ((this.field1988[this.field1984 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dj.y(B)I")
    public int method2315() {
        this.field1984 += 4;
        return (this.field1988[this.field1984 - 1] & 0xFF) + ((this.field1988[this.field1984 - 2] & 0xFF) << 8) + ((this.field1988[this.field1984 - 4] & 0xFF) << 24) + ((this.field1988[this.field1984 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.t(I)J")
    public long method2316() {
        long var1 = (long) this.method2315() & 0xFFFFFFFFL;
        long var3 = (long) this.method2315() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dj.q(I)Ljava/lang/String;")
    public String method2317() {
        if (this.field1988[this.field1984] == 0) {
            this.field1984++;
            return null;
        } else {
            return this.method2318();
        }
    }

    @ObfuscatedName("dj.ak(I)Ljava/lang/String;")
    public String method2318() {
        int var1 = this.field1984;
        while (this.field1988[++this.field1984 - 1] != 0) {
        }
        int var2 = this.field1984 - var1 - 1;
        return var2 == 0 ? "" : class165.method117(this.field1988, var1, var2);
    }

    @ObfuscatedName("dj.ap(I)Ljava/lang/String;")
    public String method2455() {
        byte var1 = this.field1988[++this.field1984 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1984;
        while (this.field1988[++this.field1984 - 1] != 0) {
        }
        int var3 = this.field1984 - var2 - 1;
        return var3 == 0 ? "" : class165.method117(this.field1988, var2, var3);
    }

    @ObfuscatedName("dj.al(I)Ljava/lang/String;")
    public String method2320() {
        byte var1 = this.field1988[++this.field1984 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2325();
        if (this.field1984 + var2 > this.field1988.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method2223(this.field1988, this.field1984, var2);
        this.field1984 += var2;
        return var3;
    }

    @ObfuscatedName("dj.ab([BIII)V")
    public void method2339(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1988[++this.field1984 - 1];
        }
    }

    @ObfuscatedName("dj.at(I)I")
    public int method2322() {
        int var1 = this.field1988[this.field1984] & 0xFF;
        return var1 < 128 ? this.method2310() - 64 : this.method2312() - 49152;
    }

    @ObfuscatedName("dj.au(B)I")
    public int method2323() {
        int var1 = this.field1988[this.field1984] & 0xFF;
        return var1 < 128 ? this.method2310() : this.method2312() - 32768;
    }

    @ObfuscatedName("dj.ae(I)I")
    public int method2478() {
        return this.field1988[this.field1984] < 0 ? this.method2315() & Integer.MAX_VALUE : this.method2312();
    }

    @ObfuscatedName("dj.ax(I)I")
    public int method2325() {
        byte var1 = this.field1988[++this.field1984 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1988[++this.field1984 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dj.aq([II)V")
    public void method2342(int[] arg0) {
        int var2 = this.field1984 / 8;
        this.field1984 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2315();
            int var5 = this.method2315();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1984 -= 8;
            this.method2299(var4);
            this.method2299(var5);
        }
    }

    @ObfuscatedName("dj.az([II)V")
    public void method2327(int[] arg0) {
        int var2 = this.field1984 / 8;
        this.field1984 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2315();
            int var5 = this.method2315();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1984 -= 8;
            this.method2299(var4);
            this.method2299(var5);
        }
    }

    @ObfuscatedName("dj.ac([IIII)V")
    public void method2328(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1984;
        this.field1984 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2315();
            int var8 = this.method2315();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1984 -= 8;
            this.method2299(var7);
            this.method2299(var8);
        }
        this.field1984 = var4;
    }

    @ObfuscatedName("dj.ai([IIII)V")
    public void method2329(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1984;
        this.field1984 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2315();
            int var8 = this.method2315();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1984 -= 8;
            this.method2299(var7);
            this.method2299(var8);
        }
        this.field1984 = var4;
    }

    @ObfuscatedName("dj.ay(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2330(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1984;
        this.field1984 = 0;
        byte[] var4 = new byte[var3];
        this.method2339(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1984 = 0;
        this.method2381(var7.length);
        this.method2305(var7, 0, var7.length);
    }

    @ObfuscatedName("dj.aj(II)I")
    public int method2331(int arg0) {
        int var2 = method1990(this.field1988, arg0, this.field1984);
        this.method2299(var2);
        return var2;
    }

    @ObfuscatedName("dj.af(I)Z")
    public boolean method2332() {
        this.field1984 -= 4;
        int var1 = method1990(this.field1988, 0, this.field1984);
        int var2 = this.method2315();
        return var1 == var2;
    }

    @ObfuscatedName("dj.ar(IB)V")
    public void method2430(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.ag(IB)V")
    public void method2334(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dj.ah(IB)V")
    public void method2335(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dj.am(I)I")
    public int method2303() {
        return this.field1988[++this.field1984 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dj.aa(I)I")
    public int method2362() {
        return -this.field1988[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.aw(I)I")
    public int method2447() {
        return 128 - this.field1988[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.an(I)B")
    public byte method2389() {
        return (byte) (this.field1988[++this.field1984 - 1] - 128);
    }

    @ObfuscatedName("dj.as(I)B")
    public byte method2340() {
        return (byte) (128 - this.field1988[++this.field1984 - 1]);
    }

    @ObfuscatedName("dj.av(II)V")
    public void method2341(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.ao(IB)V")
    public void method2466(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.ad(II)V")
    public void method2343(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 + 128);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bi(I)I")
    public int method2344() {
        this.field1984 += 2;
        return ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + (this.field1988[this.field1984 - 2] & 0xFF);
    }

    @ObfuscatedName("dj.bb(B)I")
    public int method2345() {
        this.field1984 += 2;
        return ((this.field1988[this.field1984 - 2] & 0xFF) << 8) + (this.field1988[this.field1984 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bp(I)I")
    public int method2396() {
        this.field1984 += 2;
        return ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + (this.field1988[this.field1984 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bd(B)I")
    public int method2347() {
        this.field1984 += 2;
        int var1 = ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + (this.field1988[this.field1984 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.by(I)I")
    public int method2436() {
        this.field1984 += 2;
        int var1 = ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + (this.field1988[this.field1984 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.bc(II)V")
    public void method2349(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dj.bs(I)I")
    public int method2350() {
        this.field1984 += 3;
        return (this.field1988[this.field1984 - 1] & 0xFF) + ((this.field1988[this.field1984 - 3] & 0xFF) << 8) + ((this.field1988[this.field1984 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.bw(II)V")
    public void method2351(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dj.bn(II)V")
    public void method2352(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dj.br(II)V")
    public void method2353(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bk(I)I")
    public int method2354() {
        this.field1984 += 4;
        return (this.field1988[this.field1984 - 4] & 0xFF) + ((this.field1988[this.field1984 - 3] & 0xFF) << 8) + ((this.field1988[this.field1984 - 2] & 0xFF) << 16) + ((this.field1988[this.field1984 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.bh(I)I")
    public int method2394() {
        this.field1984 += 4;
        return (this.field1988[this.field1984 - 3] & 0xFF) + ((this.field1988[this.field1984 - 4] & 0xFF) << 8) + ((this.field1988[this.field1984 - 2] & 0xFF) << 24) + ((this.field1988[this.field1984 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.bg(B)I")
    public int method2356() {
        this.field1984 += 4;
        return (this.field1988[this.field1984 - 2] & 0xFF) + ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + ((this.field1988[this.field1984 - 3] & 0xFF) << 24) + ((this.field1988[this.field1984 - 4] & 0xFF) << 16);
    }
}
