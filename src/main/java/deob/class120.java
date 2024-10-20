package deob;

import java.math.BigInteger;

@ObfuscatedName("dj")
public class class120 extends class209 {

    @ObfuscatedName("dj.f")
    public byte[] field2001;

    @ObfuscatedName("dj.u")
    public int field1999;

    @ObfuscatedName("dj.x")
    public static int[] field2000 = new int[256];

    @ObfuscatedName("dj.l")
    public static long[] field2003;

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
            field2000[var0] = var1;
        }
        field2003 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2003[var3] = var4;
        }
    }

    public class120(int arg0) {
        this.field2001 = class122.method2596(arg0);
        this.field1999 = 0;
    }

    public class120(byte[] arg0) {
        this.field2001 = arg0;
        this.field1999 = 0;
    }

    @ObfuscatedName("dj.f(IB)V")
    public void method2485(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.u(II)V")
    public void method2371(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field2001[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.x(II)V")
    public void method2372(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field2001[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.b(II)V")
    public void method2370(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 24);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field2001[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.l(J)V")
    public void method2395(long arg0) {
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2001[++this.field1999 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dj.d(J)V")
    public void method2457(long arg0) {
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2001[++this.field1999 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2001[++this.field1999 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("a.n(Ljava/lang/String;I)I")
    public static int method622(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dj.m(Ljava/lang/String;B)V")
    public void method2376(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1999 += class166.method2800(arg0, 0, arg0.length(), this.field2001, this.field1999);
        this.field2001[++this.field1999 - 1] = 0;
    }

    @ObfuscatedName("am.g(Ljava/lang/String;I)I")
    public static int method748(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dj.s(Ljava/lang/String;B)V")
    public void method2377(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2001[++this.field1999 - 1] = 0;
        this.field1999 += class166.method2800(arg0, 0, arg0.length(), this.field2001, this.field1999);
        this.field2001[++this.field1999 - 1] = 0;
    }

    @ObfuscatedName("dj.r(Ljava/lang/CharSequence;I)V")
    public void method2446(CharSequence arg0) {
        int var2 = class210.method746(arg0);
        this.field2001[++this.field1999 - 1] = 0;
        this.method2384(var2);
        int var3 = this.field1999;
        byte[] var4 = this.field2001;
        int var5 = this.field1999;
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
        this.field1999 = var10 + var3;
    }

    @ObfuscatedName("dj.k([BIII)V")
    public void method2422(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2001[++this.field1999 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dj.o(IB)V")
    public void method2523(int arg0) {
        this.field2001[this.field1999 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2001[this.field1999 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2001[this.field1999 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2001[this.field1999 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.q(II)V")
    public void method2381(int arg0) {
        this.field2001[this.field1999 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2001[this.field1999 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.p(II)V")
    public void method2382(int arg0) {
        this.field2001[this.field1999 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.h(II)V")
    public void method2431(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2485(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2371(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dj.e(II)V")
    public void method2384(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2485(arg0 >>> 28 | 0x80);
                    }
                    this.method2485(arg0 >>> 21 | 0x80);
                }
                this.method2485(arg0 >>> 14 | 0x80);
            }
            this.method2485(arg0 >>> 7 | 0x80);
        }
        this.method2485(arg0 & 0x7F);
    }

    @ObfuscatedName("dj.t(I)I")
    public int method2385() {
        return this.field2001[++this.field1999 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.w(S)B")
    public byte method2369() {
        return this.field2001[++this.field1999 - 1];
    }

    @ObfuscatedName("dj.v(B)I")
    public int method2387() {
        this.field1999 += 2;
        return ((this.field2001[this.field1999 - 2] & 0xFF) << 8) + (this.field2001[this.field1999 - 1] & 0xFF);
    }

    @ObfuscatedName("dj.y(I)I")
    public int method2388() {
        this.field1999 += 2;
        int var1 = ((this.field2001[this.field1999 - 2] & 0xFF) << 8) + (this.field2001[this.field1999 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.c(I)I")
    public int method2389() {
        this.field1999 += 3;
        return (this.field2001[this.field1999 - 1] & 0xFF) + ((this.field2001[this.field1999 - 3] & 0xFF) << 16) + ((this.field2001[this.field1999 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dj.i(I)I")
    public int method2527() {
        this.field1999 += 4;
        return (this.field2001[this.field1999 - 1] & 0xFF) + ((this.field2001[this.field1999 - 2] & 0xFF) << 8) + ((this.field2001[this.field1999 - 3] & 0xFF) << 16) + ((this.field2001[this.field1999 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.a(S)J")
    public long method2391() {
        long var1 = (long) this.method2527() & 0xFFFFFFFFL;
        long var3 = (long) this.method2527() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dj.z(B)Ljava/lang/String;")
    public String method2392() {
        if (this.field2001[this.field1999] == 0) {
            this.field1999++;
            return null;
        } else {
            return this.method2499();
        }
    }

    @ObfuscatedName("dj.j(B)Ljava/lang/String;")
    public String method2499() {
        int var1 = this.field1999;
        while (this.field2001[++this.field1999 - 1] != 0) {
        }
        int var2 = this.field1999 - var1 - 1;
        return var2 == 0 ? "" : class166.method2949(this.field2001, var1, var2);
    }

    @ObfuscatedName("dj.ag(B)Ljava/lang/String;")
    public String method2394() {
        byte var1 = this.field2001[++this.field1999 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1999;
        while (this.field2001[++this.field1999 - 1] != 0) {
        }
        int var3 = this.field1999 - var2 - 1;
        return var3 == 0 ? "" : class166.method2949(this.field2001, var2, var3);
    }

    @ObfuscatedName("dj.ax(B)Ljava/lang/String;")
    public String method2439() {
        byte var1 = this.field2001[++this.field1999 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2400();
        if (this.field1999 + var2 > this.field2001.length) {
            throw new IllegalStateException("");
        }
        String var3 = class210.method2994(this.field2001, this.field1999, var2);
        this.field1999 += var2;
        return var3;
    }

    @ObfuscatedName("dj.ao([BIII)V")
    public void method2396(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2001[++this.field1999 - 1];
        }
    }

    @ObfuscatedName("dj.ac(I)I")
    public int method2397() {
        int var1 = this.field2001[this.field1999] & 0xFF;
        return var1 < 128 ? this.method2385() - 64 : this.method2387() - 49152;
    }

    @ObfuscatedName("dj.aj(B)I")
    public int method2398() {
        int var1 = this.field2001[this.field1999] & 0xFF;
        return var1 < 128 ? this.method2385() : this.method2387() - 32768;
    }

    @ObfuscatedName("dj.an(I)I")
    public int method2559() {
        return this.field2001[this.field1999] < 0 ? this.method2527() & Integer.MAX_VALUE : this.method2387();
    }

    @ObfuscatedName("dj.al(I)I")
    public int method2400() {
        byte var1 = this.field2001[++this.field1999 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2001[++this.field1999 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dj.as([II)V")
    public void method2401(int[] arg0) {
        int var2 = this.field1999 / 8;
        this.field1999 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2527();
            int var5 = this.method2527();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1999 -= 8;
            this.method2370(var4);
            this.method2370(var5);
        }
    }

    @ObfuscatedName("dj.av([II)V")
    public void method2432(int[] arg0) {
        int var2 = this.field1999 / 8;
        this.field1999 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2527();
            int var5 = this.method2527();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1999 -= 8;
            this.method2370(var4);
            this.method2370(var5);
        }
    }

    @ObfuscatedName("dj.am([IIII)V")
    public void method2374(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1999;
        this.field1999 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2527();
            int var8 = this.method2527();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1999 -= 8;
            this.method2370(var7);
            this.method2370(var8);
        }
        this.field1999 = var4;
    }

    @ObfuscatedName("dj.az([IIII)V")
    public void method2404(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1999;
        this.field1999 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2527();
            int var8 = this.method2527();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1999 -= 8;
            this.method2370(var7);
            this.method2370(var8);
        }
        this.field1999 = var4;
    }

    @ObfuscatedName("dj.ai(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2405(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1999;
        this.field1999 = 0;
        byte[] var4 = new byte[var3];
        this.method2396(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1999 = 0;
        this.method2371(var7.length);
        this.method2422(var7, 0, var7.length);
    }

    @ObfuscatedName("dj.aq(IB)I")
    public int method2493(int arg0) {
        byte[] var2 = this.field2001;
        int var3 = this.field1999;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2000[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2370(var6);
        return var6;
    }

    @ObfuscatedName("dj.ah(I)Z")
    public boolean method2407() {
        this.field1999 -= 4;
        byte[] var1 = this.field2001;
        int var2 = this.field1999;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2000[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2527();
        return var5 == var8;
    }

    @ObfuscatedName("dj.ap(II)V")
    public void method2380(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.af(IB)V")
    public void method2408(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dj.aa(II)V")
    public void method2409(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dj.ay(S)I")
    public int method2410() {
        return this.field2001[++this.field1999 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dj.aw(I)I")
    public int method2411() {
        return -this.field2001[++this.field1999 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.ak(I)I")
    public int method2412() {
        return 128 - this.field2001[++this.field1999 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.ae(I)B")
    public byte method2390() {
        return (byte) (-this.field2001[++this.field1999 - 1]);
    }

    @ObfuscatedName("dj.ad(I)B")
    public byte method2414() {
        return (byte) (128 - this.field2001[++this.field1999 - 1]);
    }

    @ObfuscatedName("dj.au(II)V")
    public void method2415(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) arg0;
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.ar(II)V")
    public void method2416(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.at(IB)V")
    public void method2417(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 + 128);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.ab(B)I")
    public int method2428() {
        this.field1999 += 2;
        return ((this.field2001[this.field1999 - 1] & 0xFF) << 8) + (this.field2001[this.field1999 - 2] & 0xFF);
    }

    @ObfuscatedName("dj.bp(I)I")
    public int method2419() {
        this.field1999 += 2;
        return ((this.field2001[this.field1999 - 2] & 0xFF) << 8) + (this.field2001[this.field1999 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bo(I)I")
    public int method2526() {
        this.field1999 += 2;
        return ((this.field2001[this.field1999 - 1] & 0xFF) << 8) + (this.field2001[this.field1999 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bf(I)I")
    public int method2520() {
        this.field1999 += 2;
        int var1 = ((this.field2001[this.field1999 - 1] & 0xFF) << 8) + (this.field2001[this.field1999 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.bx(I)I")
    public int method2418() {
        this.field1999 += 2;
        int var1 = ((this.field2001[this.field1999 - 1] & 0xFF) << 8) + (this.field2001[this.field1999 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.bq(IB)V")
    public void method2423(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field2001[++this.field1999 - 1] = (byte) arg0;
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bc(II)V")
    public void method2424(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) arg0;
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dj.ba(II)V")
    public void method2425(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field2001[++this.field1999 - 1] = (byte) arg0;
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 24);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dj.by(II)V")
    public void method2426(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 24);
        this.field2001[++this.field1999 - 1] = (byte) arg0;
        this.field2001[++this.field1999 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bk(I)I")
    public int method2427() {
        this.field1999 += 4;
        return (this.field2001[this.field1999 - 4] & 0xFF) + ((this.field2001[this.field1999 - 3] & 0xFF) << 8) + ((this.field2001[this.field1999 - 2] & 0xFF) << 16) + ((this.field2001[this.field1999 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.bm(I)I")
    public int method2561() {
        this.field1999 += 4;
        return (this.field2001[this.field1999 - 3] & 0xFF) + ((this.field2001[this.field1999 - 4] & 0xFF) << 8) + ((this.field2001[this.field1999 - 2] & 0xFF) << 24) + ((this.field2001[this.field1999 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.be(I)I")
    public int method2429() {
        this.field1999 += 4;
        return (this.field2001[this.field1999 - 2] & 0xFF) + ((this.field2001[this.field1999 - 1] & 0xFF) << 8) + ((this.field2001[this.field1999 - 3] & 0xFF) << 24) + ((this.field2001[this.field1999 - 4] & 0xFF) << 16);
    }
}
