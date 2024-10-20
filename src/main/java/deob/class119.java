package deob;

import java.math.BigInteger;

@ObfuscatedName("di")
public class class119 extends class208 {

    @ObfuscatedName("di.o")
    public byte[] field1977;

    @ObfuscatedName("di.e")
    public int field1974;

    @ObfuscatedName("di.u")
    public static int[] field1980 = new int[256];

    @ObfuscatedName("di.p")
    public static long[] field1976;

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
            field1980[var0] = var1;
        }
        field1976 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1976[var3] = var4;
        }
    }

    public class119(int arg0) {
        this.field1977 = class121.method2586(arg0);
        this.field1974 = 0;
    }

    public class119(byte[] arg0) {
        this.field1977 = arg0;
        this.field1974 = 0;
    }

    @ObfuscatedName("di.o(II)V")
    public void method2322(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.e(IS)V")
    public void method2481(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
        this.field1977[++this.field1974 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.u(IB)V")
    public void method2423(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 16);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
        this.field1977[++this.field1974 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.b(II)V")
    public void method2327(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 24);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 16);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
        this.field1977[++this.field1974 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.p(J)V")
    public void method2406(long arg0) {
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1977[++this.field1974 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("di.s(J)V")
    public void method2367(long arg0) {
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1977[++this.field1974 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1977[++this.field1974 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("di.t(Ljava/lang/String;B)V")
    public void method2328(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1974 += class165.method3239(arg0, 0, arg0.length(), this.field1977, this.field1974);
        this.field1977[++this.field1974 - 1] = 0;
    }

    @ObfuscatedName("di.w(Ljava/lang/String;I)V")
    public void method2551(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1977[++this.field1974 - 1] = 0;
        this.field1974 += class165.method3239(arg0, 0, arg0.length(), this.field1977, this.field1974);
        this.field1977[++this.field1974 - 1] = 0;
    }

    @ObfuscatedName("di.h(Ljava/lang/CharSequence;I)V")
    public void method2330(CharSequence arg0) {
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
        this.field1977[++this.field1974 - 1] = 0;
        this.method2336(var3);
        this.field1974 += class209.method948(this.field1977, this.field1974, arg0);
    }

    @ObfuscatedName("di.d([BIII)V")
    public void method2331(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1977[++this.field1974 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("di.l(II)V")
    public void method2332(int arg0) {
        this.field1977[this.field1974 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1977[this.field1974 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1977[this.field1974 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1977[this.field1974 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.n(II)V")
    public void method2432(int arg0) {
        this.field1977[this.field1974 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1977[this.field1974 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.q(II)V")
    public void method2334(int arg0) {
        this.field1977[this.field1974 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.f(II)V")
    public void method2335(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2322(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2481(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("di.v(IB)V")
    public void method2336(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2322(arg0 >>> 28 | 0x80);
                    }
                    this.method2322(arg0 >>> 21 | 0x80);
                }
                this.method2322(arg0 >>> 14 | 0x80);
            }
            this.method2322(arg0 >>> 7 | 0x80);
        }
        this.method2322(arg0 & 0x7F);
    }

    @ObfuscatedName("di.a(I)I")
    public int method2427() {
        return this.field1977[++this.field1974 - 1] & 0xFF;
    }

    @ObfuscatedName("di.k(I)B")
    public byte method2338() {
        return this.field1977[++this.field1974 - 1];
    }

    @ObfuscatedName("di.r(I)I")
    public int method2339() {
        this.field1974 += 2;
        return ((this.field1977[this.field1974 - 2] & 0xFF) << 8) + (this.field1977[this.field1974 - 1] & 0xFF);
    }

    @ObfuscatedName("di.i(I)I")
    public int method2340() {
        this.field1974 += 2;
        int var1 = ((this.field1977[this.field1974 - 2] & 0xFF) << 8) + (this.field1977[this.field1974 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("di.j(I)I")
    public int method2341() {
        this.field1974 += 3;
        return (this.field1977[this.field1974 - 1] & 0xFF) + ((this.field1977[this.field1974 - 2] & 0xFF) << 8) + ((this.field1977[this.field1974 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("di.z(I)I")
    public int method2342() {
        this.field1974 += 4;
        return (this.field1977[this.field1974 - 1] & 0xFF) + ((this.field1977[this.field1974 - 2] & 0xFF) << 8) + ((this.field1977[this.field1974 - 3] & 0xFF) << 16) + ((this.field1977[this.field1974 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("di.m(I)J")
    public long method2343() {
        long var1 = (long) this.method2342() & 0xFFFFFFFFL;
        long var3 = (long) this.method2342() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("di.g(I)Ljava/lang/String;")
    public String method2383() {
        if (this.field1977[this.field1974] == 0) {
            this.field1974++;
            return null;
        } else {
            return this.method2528();
        }
    }

    @ObfuscatedName("di.c(I)Ljava/lang/String;")
    public String method2528() {
        int var1 = this.field1974;
        while (this.field1977[++this.field1974 - 1] != 0) {
        }
        int var2 = this.field1974 - var1 - 1;
        return var2 == 0 ? "" : class165.method167(this.field1977, var1, var2);
    }

    @ObfuscatedName("di.x(I)Ljava/lang/String;")
    public String method2525() {
        byte var1 = this.field1977[++this.field1974 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1974;
        while (this.field1977[++this.field1974 - 1] != 0) {
        }
        int var3 = this.field1974 - var2 - 1;
        return var3 == 0 ? "" : class165.method167(this.field1977, var2, var3);
    }

    @ObfuscatedName("di.ah(I)Ljava/lang/String;")
    public String method2347() {
        byte var1 = this.field1977[++this.field1974 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2394();
        if (this.field1974 + var2 > this.field1977.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method949(this.field1977, this.field1974, var2);
        this.field1974 += var2;
        return var3;
    }

    @ObfuscatedName("di.ap([BIII)V")
    public void method2348(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1977[++this.field1974 - 1];
        }
    }

    @ObfuscatedName("di.aa(I)I")
    public int method2349() {
        int var1 = this.field1977[this.field1974] & 0xFF;
        return var1 < 128 ? this.method2427() - 64 : this.method2339() - 49152;
    }

    @ObfuscatedName("di.ay(I)I")
    public int method2350() {
        int var1 = this.field1977[this.field1974] & 0xFF;
        return var1 < 128 ? this.method2427() : this.method2339() - 32768;
    }

    @ObfuscatedName("di.ak(I)I")
    public int method2426() {
        return this.field1977[this.field1974] < 0 ? this.method2342() & Integer.MAX_VALUE : this.method2339();
    }

    @ObfuscatedName("di.an(I)I")
    public int method2394() {
        byte var1 = this.field1977[++this.field1974 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1977[++this.field1974 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("di.af([II)V")
    public void method2443(int[] arg0) {
        int var2 = this.field1974 / 8;
        this.field1974 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2342();
            int var5 = this.method2342();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1974 -= 8;
            this.method2327(var4);
            this.method2327(var5);
        }
    }

    @ObfuscatedName("di.ao([II)V")
    public void method2354(int[] arg0) {
        int var2 = this.field1974 / 8;
        this.field1974 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2342();
            int var5 = this.method2342();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1974 -= 8;
            this.method2327(var4);
            this.method2327(var5);
        }
    }

    @ObfuscatedName("di.as([IIII)V")
    public void method2510(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1974;
        this.field1974 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2342();
            int var8 = this.method2342();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1974 -= 8;
            this.method2327(var7);
            this.method2327(var8);
        }
        this.field1974 = var4;
    }

    @ObfuscatedName("di.am([IIII)V")
    public void method2356(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1974;
        this.field1974 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2342();
            int var8 = this.method2342();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1974 -= 8;
            this.method2327(var7);
            this.method2327(var8);
        }
        this.field1974 = var4;
    }

    @ObfuscatedName("di.ae(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2498(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1974;
        this.field1974 = 0;
        byte[] var4 = new byte[var3];
        this.method2348(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1974 = 0;
        this.method2481(var7.length);
        this.method2331(var7, 0, var7.length);
    }

    @ObfuscatedName("di.ax(IB)I")
    public int method2358(int arg0) {
        byte[] var2 = this.field1977;
        int var3 = this.field1974;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1980[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2327(var6);
        return var6;
    }

    @ObfuscatedName("di.aj(I)Z")
    public boolean method2417() {
        this.field1974 -= 4;
        byte[] var1 = this.field1977;
        int var2 = this.field1974;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1980[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2342();
        return var5 == var8;
    }

    @ObfuscatedName("di.ab(IB)V")
    public void method2360(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("di.av(IB)V")
    public void method2361(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("di.aq(IB)V")
    public void method2362(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("di.ac(B)I")
    public int method2363() {
        return this.field1977[++this.field1974 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("di.ar(I)I")
    public int method2364() {
        return -this.field1977[++this.field1974 - 1] & 0xFF;
    }

    @ObfuscatedName("di.az(I)I")
    public int method2365() {
        return 128 - this.field1977[++this.field1974 - 1] & 0xFF;
    }

    @ObfuscatedName("di.ad(B)B")
    public byte method2352() {
        return (byte) (-this.field1977[++this.field1974 - 1]);
    }

    @ObfuscatedName("di.au(B)B")
    public byte method2541() {
        return (byte) (128 - this.field1977[++this.field1974 - 1]);
    }

    @ObfuscatedName("di.aw(IS)V")
    public void method2390(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) arg0;
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.ag(II)V")
    public void method2369(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("di.al(IB)V")
    public void method2370(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (arg0 + 128);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.ai(I)I")
    public int method2371() {
        this.field1974 += 2;
        return ((this.field1977[this.field1974 - 1] & 0xFF) << 8) + (this.field1977[this.field1974 - 2] & 0xFF);
    }

    @ObfuscatedName("di.at(I)I")
    public int method2522() {
        this.field1974 += 2;
        return ((this.field1977[this.field1974 - 2] & 0xFF) << 8) + (this.field1977[this.field1974 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("di.bp(I)I")
    public int method2373() {
        this.field1974 += 2;
        return ((this.field1977[this.field1974 - 1] & 0xFF) << 8) + (this.field1977[this.field1974 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("di.bg(I)I")
    public int method2374() {
        this.field1974 += 2;
        int var1 = ((this.field1977[this.field1974 - 1] & 0xFF) << 8) + (this.field1977[this.field1974 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("di.bw(I)I")
    public int method2490() {
        this.field1974 += 2;
        int var1 = ((this.field1977[this.field1974 - 2] & 0xFF) << 8) + (this.field1977[this.field1974 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("di.bl(I)I")
    public int method2415() {
        this.field1974 += 3;
        return (this.field1977[this.field1974 - 3] & 0xFF) + ((this.field1977[this.field1974 - 1] & 0xFF) << 16) + ((this.field1977[this.field1974 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("di.bf(II)V")
    public void method2527(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) arg0;
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 16);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("di.be(IB)V")
    public void method2454(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
        this.field1977[++this.field1974 - 1] = (byte) arg0;
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 24);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("di.bn(II)V")
    public void method2520(int arg0) {
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 16);
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 24);
        this.field1977[++this.field1974 - 1] = (byte) arg0;
        this.field1977[++this.field1974 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.bc(B)I")
    public int method2333() {
        this.field1974 += 4;
        return (this.field1977[this.field1974 - 4] & 0xFF) + ((this.field1977[this.field1974 - 3] & 0xFF) << 8) + ((this.field1977[this.field1974 - 2] & 0xFF) << 16) + ((this.field1977[this.field1974 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("di.bd(I)I")
    public int method2380() {
        this.field1974 += 4;
        return (this.field1977[this.field1974 - 3] & 0xFF) + ((this.field1977[this.field1974 - 4] & 0xFF) << 8) + ((this.field1977[this.field1974 - 1] & 0xFF) << 16) + ((this.field1977[this.field1974 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("di.bx(I)I")
    public int method2381() {
        this.field1974 += 4;
        return (this.field1977[this.field1974 - 2] & 0xFF) + ((this.field1977[this.field1974 - 1] & 0xFF) << 8) + ((this.field1977[this.field1974 - 3] & 0xFF) << 24) + ((this.field1977[this.field1974 - 4] & 0xFF) << 16);
    }
}
