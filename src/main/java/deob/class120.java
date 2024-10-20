package deob;

import java.math.BigInteger;

@ObfuscatedName("ds")
public class class120 extends class209 {

    @ObfuscatedName("ds.s")
    public byte[] field2008;

    @ObfuscatedName("ds.j")
    public int field2006;

    @ObfuscatedName("ds.p")
    public static int[] field2011 = new int[256];

    @ObfuscatedName("ds.d")
    public static long[] field2009;

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
            field2011[var0] = var1;
        }
        field2009 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2009[var3] = var4;
        }
    }

    @ObfuscatedName("m.s([BIII)I")
    public static int method171(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2011[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class120(int arg0) {
        this.field2008 = class122.method2576(arg0);
        this.field2006 = 0;
    }

    public class120(byte[] arg0) {
        this.field2008 = arg0;
        this.field2006 = 0;
    }

    @ObfuscatedName("ds.j(IS)V")
    public void method2323(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.p(II)V")
    public void method2507(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
        this.field2008[++this.field2006 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.x(II)V")
    public void method2452(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 16);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
        this.field2008[++this.field2006 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.d(II)V")
    public void method2326(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 24);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 16);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
        this.field2008[++this.field2006 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.u(J)V")
    public void method2374(long arg0) {
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2008[++this.field2006 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ds.o(J)V")
    public void method2328(long arg0) {
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2008[++this.field2006 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2008[++this.field2006 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ap.b(Ljava/lang/String;I)I")
    public static int method636(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ds.k(Ljava/lang/String;I)V")
    public void method2329(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2006 += class166.method564(arg0, 0, arg0.length(), this.field2008, this.field2006);
        this.field2008[++this.field2006 - 1] = 0;
    }

    @ObfuscatedName("ds.c(Ljava/lang/String;I)V")
    public void method2335(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2008[++this.field2006 - 1] = 0;
        this.field2006 += class166.method564(arg0, 0, arg0.length(), this.field2008, this.field2006);
        this.field2008[++this.field2006 - 1] = 0;
    }

    @ObfuscatedName("ds.l(Ljava/lang/CharSequence;B)V")
    public void method2331(CharSequence arg0) {
        int var2 = class210.method2639(arg0);
        this.field2008[++this.field2006 - 1] = 0;
        this.method2468(var2);
        this.field2006 += class210.method1025(this.field2008, this.field2006, arg0);
    }

    @ObfuscatedName("ds.t([BIIB)V")
    public void method2332(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2008[++this.field2006 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ds.i(II)V")
    public void method2333(int arg0) {
        this.field2008[this.field2006 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2008[this.field2006 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2008[this.field2006 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2008[this.field2006 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.r(IS)V")
    public void method2370(int arg0) {
        this.field2008[this.field2006 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2008[this.field2006 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.m(II)V")
    public void method2408(int arg0) {
        this.field2008[this.field2006 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.e(II)V")
    public void method2336(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2323(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2507(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.h(II)V")
    public void method2468(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2323(arg0 >>> 28 | 0x80);
                    }
                    this.method2323(arg0 >>> 21 | 0x80);
                }
                this.method2323(arg0 >>> 14 | 0x80);
            }
            this.method2323(arg0 >>> 7 | 0x80);
        }
        this.method2323(arg0 & 0x7F);
    }

    @ObfuscatedName("ds.z(I)I")
    public int method2338() {
        return this.field2008[++this.field2006 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.a(B)B")
    public byte method2339() {
        return this.field2008[++this.field2006 - 1];
    }

    @ObfuscatedName("ds.w(I)I")
    public int method2430() {
        this.field2006 += 2;
        return ((this.field2008[this.field2006 - 2] & 0xFF) << 8) + (this.field2008[this.field2006 - 1] & 0xFF);
    }

    @ObfuscatedName("ds.g(B)I")
    public int method2341() {
        this.field2006 += 2;
        int var1 = ((this.field2008[this.field2006 - 2] & 0xFF) << 8) + (this.field2008[this.field2006 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.y(B)I")
    public int method2359() {
        this.field2006 += 3;
        return (this.field2008[this.field2006 - 1] & 0xFF) + ((this.field2008[this.field2006 - 2] & 0xFF) << 8) + ((this.field2008[this.field2006 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.f(I)I")
    public int method2343() {
        this.field2006 += 4;
        return (this.field2008[this.field2006 - 1] & 0xFF) + ((this.field2008[this.field2006 - 2] & 0xFF) << 8) + ((this.field2008[this.field2006 - 4] & 0xFF) << 24) + ((this.field2008[this.field2006 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.q(I)J")
    public long method2344() {
        long var1 = (long) this.method2343() & 0xFFFFFFFFL;
        long var3 = (long) this.method2343() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ds.n(I)Ljava/lang/String;")
    public String method2385() {
        if (this.field2008[this.field2006] == 0) {
            this.field2006++;
            return null;
        } else {
            return this.method2346();
        }
    }

    @ObfuscatedName("ds.v(B)Ljava/lang/String;")
    public String method2346() {
        int var1 = this.field2006;
        while (this.field2008[++this.field2006 - 1] != 0) {
        }
        int var2 = this.field2006 - var1 - 1;
        return var2 == 0 ? "" : class166.method562(this.field2008, var1, var2);
    }

    @ObfuscatedName("ds.ab(S)Ljava/lang/String;")
    public String method2347() {
        byte var1 = this.field2008[++this.field2006 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2006;
        while (this.field2008[++this.field2006 - 1] != 0) {
        }
        int var3 = this.field2006 - var2 - 1;
        return var3 == 0 ? "" : class166.method562(this.field2008, var2, var3);
    }

    @ObfuscatedName("ds.ad(I)Ljava/lang/String;")
    public String method2348() {
        byte var1 = this.field2008[++this.field2006 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2353();
        if (this.field2006 + var2 > this.field2008.length) {
            throw new IllegalStateException("");
        }
        String var3 = class210.method1041(this.field2008, this.field2006, var2);
        this.field2006 += var2;
        return var3;
    }

    @ObfuscatedName("ds.an([BIIB)V")
    public void method2349(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2008[++this.field2006 - 1];
        }
    }

    @ObfuscatedName("ds.au(I)I")
    public int method2431() {
        int var1 = this.field2008[this.field2006] & 0xFF;
        return var1 < 128 ? this.method2338() - 64 : this.method2430() - 49152;
    }

    @ObfuscatedName("ds.ap(I)I")
    public int method2351() {
        int var1 = this.field2008[this.field2006] & 0xFF;
        return var1 < 128 ? this.method2338() : this.method2430() - 32768;
    }

    @ObfuscatedName("ds.am(S)I")
    public int method2352() {
        return this.field2008[this.field2006] < 0 ? this.method2343() & Integer.MAX_VALUE : this.method2430();
    }

    @ObfuscatedName("ds.ae(B)I")
    public int method2353() {
        byte var1 = this.field2008[++this.field2006 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2008[++this.field2006 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ds.ao([II)V")
    public void method2354(int[] arg0) {
        int var2 = this.field2006 / 8;
        this.field2006 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2343();
            int var5 = this.method2343();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2006 -= 8;
            this.method2326(var4);
            this.method2326(var5);
        }
    }

    @ObfuscatedName("ds.as([IS)V")
    public void method2389(int[] arg0) {
        int var2 = this.field2006 / 8;
        this.field2006 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2343();
            int var5 = this.method2343();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2006 -= 8;
            this.method2326(var4);
            this.method2326(var5);
        }
    }

    @ObfuscatedName("ds.ai([IIII)V")
    public void method2499(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2006;
        this.field2006 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2343();
            int var8 = this.method2343();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2006 -= 8;
            this.method2326(var7);
            this.method2326(var8);
        }
        this.field2006 = var4;
    }

    @ObfuscatedName("ds.ah([IIII)V")
    public void method2427(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2006;
        this.field2006 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2343();
            int var8 = this.method2343();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2006 -= 8;
            this.method2326(var7);
            this.method2326(var8);
        }
        this.field2006 = var4;
    }

    @ObfuscatedName("ds.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2358(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2006;
        this.field2006 = 0;
        byte[] var4 = new byte[var3];
        this.method2349(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2006 = 0;
        this.method2507(var7.length);
        this.method2332(var7, 0, var7.length);
    }

    @ObfuscatedName("ds.aa(IB)I")
    public int method2497(int arg0) {
        int var2 = method171(this.field2008, arg0, this.field2006);
        this.method2326(var2);
        return var2;
    }

    @ObfuscatedName("ds.aq(I)Z")
    public boolean method2360() {
        this.field2006 -= 4;
        int var1 = method171(this.field2008, 0, this.field2006);
        int var2 = this.method2343();
        return var1 == var2;
    }

    @ObfuscatedName("ds.ay(II)V")
    public void method2436(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.aj(II)V")
    public void method2362(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ds.ar(II)V")
    public void method2527(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ds.aw(I)I")
    public int method2364() {
        return this.field2008[++this.field2006 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ds.at(I)I")
    public int method2459() {
        return -this.field2008[++this.field2006 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.af(B)I")
    public int method2366() {
        return 128 - this.field2008[++this.field2006 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.al(I)B")
    public byte method2367() {
        return (byte) (this.field2008[++this.field2006 - 1] - 128);
    }

    @ObfuscatedName("ds.ag(I)B")
    public byte method2368() {
        return (byte) (-this.field2008[++this.field2006 - 1]);
    }

    @ObfuscatedName("ds.ac(I)B")
    public byte method2530() {
        return (byte) (128 - this.field2008[++this.field2006 - 1]);
    }

    @ObfuscatedName("ds.ak(II)V")
    public void method2470(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) arg0;
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.av(II)V")
    public void method2403(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.az(IB)V")
    public void method2371(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 + 128);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bd(B)I")
    public int method2379() {
        this.field2006 += 2;
        return ((this.field2008[this.field2006 - 1] & 0xFF) << 8) + (this.field2008[this.field2006 - 2] & 0xFF);
    }

    @ObfuscatedName("ds.bt(I)I")
    public int method2372() {
        this.field2006 += 2;
        return ((this.field2008[this.field2006 - 2] & 0xFF) << 8) + (this.field2008[this.field2006 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.bq(I)I")
    public int method2373() {
        this.field2006 += 2;
        return ((this.field2008[this.field2006 - 1] & 0xFF) << 8) + (this.field2008[this.field2006 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.bj(I)I")
    public int method2375() {
        this.field2006 += 2;
        int var1 = ((this.field2008[this.field2006 - 1] & 0xFF) << 8) + (this.field2008[this.field2006 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.bf(II)V")
    public void method2361(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 16);
        this.field2008[++this.field2006 - 1] = (byte) arg0;
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.br(I)I")
    public int method2376() {
        this.field2006 += 3;
        return (this.field2008[this.field2006 - 3] & 0xFF) + ((this.field2008[this.field2006 - 2] & 0xFF) << 8) + ((this.field2008[this.field2006 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.bi(II)V")
    public void method2377(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) arg0;
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 16);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ds.bh(II)V")
    public void method2340(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
        this.field2008[++this.field2006 - 1] = (byte) arg0;
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 24);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ds.bv(IB)V")
    public void method2433(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 16);
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 24);
        this.field2008[++this.field2006 - 1] = (byte) arg0;
        this.field2008[++this.field2006 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bx(B)I")
    public int method2380() {
        this.field2006 += 4;
        return (this.field2008[this.field2006 - 4] & 0xFF) + ((this.field2008[this.field2006 - 3] & 0xFF) << 8) + ((this.field2008[this.field2006 - 2] & 0xFF) << 16) + ((this.field2008[this.field2006 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ds.ba(B)I")
    public int method2381() {
        this.field2006 += 4;
        return (this.field2008[this.field2006 - 3] & 0xFF) + ((this.field2008[this.field2006 - 4] & 0xFF) << 8) + ((this.field2008[this.field2006 - 2] & 0xFF) << 24) + ((this.field2008[this.field2006 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.bs(B)I")
    public int method2382() {
        this.field2006 += 4;
        return (this.field2008[this.field2006 - 2] & 0xFF) + ((this.field2008[this.field2006 - 1] & 0xFF) << 8) + ((this.field2008[this.field2006 - 3] & 0xFF) << 24) + ((this.field2008[this.field2006 - 4] & 0xFF) << 16);
    }
}
