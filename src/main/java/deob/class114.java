package deob;

import java.math.BigInteger;

@ObfuscatedName("de")
public class class114 extends class202 {

    @ObfuscatedName("de.j")
    public byte[] field1891;

    @ObfuscatedName("de.y")
    public int field1894;

    @ObfuscatedName("de.z")
    public static int[] field1893 = new int[256];

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
            field1893[var0] = var1;
        }
    }

    @ObfuscatedName("n.j([BIII)I")
    public static int method228(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1893[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("am.y([BII)I")
    public static int method990(byte[] arg0, int arg1) {
        return method228(arg0, 0, arg1);
    }

    public class114(int arg0) {
        this.field1891 = class116.method2566(arg0);
        this.field1894 = 0;
    }

    public class114(byte[] arg0) {
        this.field1891 = arg0;
        this.field1894 = 0;
    }

    @ObfuscatedName("de.z(II)V")
    public void method2307(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.l(II)V")
    public void method2367(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1891[++this.field1894 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.w(IB)V")
    public void method2309(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 16);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1891[++this.field1894 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.d(II)V")
    public void method2310(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 24);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 16);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1891[++this.field1894 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.f(J)V")
    public void method2311(long arg0) {
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1891[++this.field1894 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("de.i(J)V")
    public void method2326(long arg0) {
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1891[++this.field1894 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1891[++this.field1894 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dd.a(Ljava/lang/String;I)I")
    public static int method2250(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("de.o(Ljava/lang/String;I)V")
    public void method2313(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1894 += class159.method176(arg0, 0, arg0.length(), this.field1891, this.field1894);
        this.field1891[++this.field1894 - 1] = 0;
    }

    @ObfuscatedName("ar.u(Ljava/lang/String;I)I")
    public static int method731(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("de.m(Ljava/lang/String;I)V")
    public void method2464(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1891[++this.field1894 - 1] = 0;
        this.field1894 += class159.method176(arg0, 0, arg0.length(), this.field1891, this.field1894);
        this.field1891[++this.field1894 - 1] = 0;
    }

    @ObfuscatedName("de.e(Ljava/lang/CharSequence;I)V")
    public void method2315(CharSequence arg0) {
        int var2 = class203.method997(arg0);
        this.field1891[++this.field1894 - 1] = 0;
        this.method2453(var2);
        this.field1894 += class203.method2954(this.field1891, this.field1894, arg0);
    }

    @ObfuscatedName("de.v([BIII)V")
    public void method2334(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1891[++this.field1894 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("de.r(IB)V")
    public void method2317(int arg0) {
        this.field1891[this.field1894 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1891[this.field1894 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1891[this.field1894 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1891[this.field1894 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.t(IS)V")
    public void method2318(int arg0) {
        this.field1891[this.field1894 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1891[this.field1894 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.g(II)V")
    public void method2319(int arg0) {
        this.field1891[this.field1894 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.s(II)V")
    public void method2320(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2307(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2367(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.n(II)V")
    public void method2453(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2307(arg0 >>> 28 | 0x80);
                    }
                    this.method2307(arg0 >>> 21 | 0x80);
                }
                this.method2307(arg0 >>> 14 | 0x80);
            }
            this.method2307(arg0 >>> 7 | 0x80);
        }
        this.method2307(arg0 & 0x7F);
    }

    @ObfuscatedName("de.h(S)I")
    public int method2322() {
        return this.field1891[++this.field1894 - 1] & 0xFF;
    }

    @ObfuscatedName("de.p(I)B")
    public byte method2323() {
        return this.field1891[++this.field1894 - 1];
    }

    @ObfuscatedName("de.c(I)I")
    public int method2324() {
        this.field1894 += 2;
        return ((this.field1891[this.field1894 - 2] & 0xFF) << 8) + (this.field1891[this.field1894 - 1] & 0xFF);
    }

    @ObfuscatedName("de.x(I)I")
    public int method2308() {
        this.field1894 += 2;
        int var1 = ((this.field1891[this.field1894 - 2] & 0xFF) << 8) + (this.field1891[this.field1894 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.q(I)I")
    public int method2321() {
        this.field1894 += 3;
        return (this.field1891[this.field1894 - 1] & 0xFF) + ((this.field1891[this.field1894 - 3] & 0xFF) << 16) + ((this.field1891[this.field1894 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("de.b(I)I")
    public int method2327() {
        this.field1894 += 4;
        return (this.field1891[this.field1894 - 1] & 0xFF) + ((this.field1891[this.field1894 - 2] & 0xFF) << 8) + ((this.field1891[this.field1894 - 3] & 0xFF) << 16) + ((this.field1891[this.field1894 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("de.k(I)J")
    public long method2328() {
        long var1 = (long) this.method2327() & 0xFFFFFFFFL;
        long var3 = (long) this.method2327() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("de.at(I)Ljava/lang/String;")
    public String method2329() {
        if (this.field1891[this.field1894] == 0) {
            this.field1894++;
            return null;
        } else {
            return this.method2440();
        }
    }

    @ObfuscatedName("de.au(B)Ljava/lang/String;")
    public String method2440() {
        int var1 = this.field1894;
        while (this.field1891[++this.field1894 - 1] != 0) {
        }
        int var2 = this.field1894 - var1 - 1;
        return var2 == 0 ? "" : class159.method692(this.field1891, var1, var2);
    }

    @ObfuscatedName("de.aa(I)Ljava/lang/String;")
    public String method2331() {
        byte var1 = this.field1891[++this.field1894 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1894;
        while (this.field1891[++this.field1894 - 1] != 0) {
        }
        int var3 = this.field1894 - var2 - 1;
        return var3 == 0 ? "" : class159.method692(this.field1891, var2, var3);
    }

    @ObfuscatedName("de.ak(I)Ljava/lang/String;")
    public String method2332() {
        byte var1 = this.field1891[++this.field1894 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2336();
        if (this.field1894 + var2 > this.field1891.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1891;
        int var4 = this.field1894;
        char[] var5 = new char[var2];
        int var6 = 0;
        int var7 = var4;
        int var8 = var2 + var4;
        while (var7 < var8) {
            int var9 = var3[var7++] & 0xFF;
            int var10;
            if (var9 < 128) {
                if (var9 == 0) {
                    var10 = 65533;
                } else {
                    var10 = var9;
                }
            } else if (var9 < 192) {
                var10 = 65533;
            } else if (var9 < 224) {
                if (var7 < var8 && (var3[var7] & 0xC0) == 128) {
                    var10 = (var9 & 0x1F) << 6 | var3[var7++] & 0x3F;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 < 240) {
                if (var7 + 1 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128) {
                    var10 = (var9 & 0xF) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
                    if (var10 < 2048) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 >= 248) {
                var10 = 65533;
            } else if (var7 + 2 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128 && (var3[var7 + 2] & 0xC0) == 128) {
                int var11 = (var9 & 0x7) << 18 | (var3[var7++] & 0x3F) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
                if (var11 >= 65536 && var11 <= 1114111) {
                    var10 = 65533;
                } else {
                    var10 = 65533;
                }
            } else {
                var10 = 65533;
            }
            var5[var6++] = (char) var10;
        }
        String var12 = new String(var5, 0, var6);
        this.field1894 += var2;
        return var12;
    }

    @ObfuscatedName("de.an([BIII)V")
    public void method2447(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1891[++this.field1894 - 1];
        }
    }

    @ObfuscatedName("de.ad(S)I")
    public int method2473() {
        int var1 = this.field1891[this.field1894] & 0xFF;
        return var1 < 128 ? this.method2322() - 64 : this.method2324() - 49152;
    }

    @ObfuscatedName("de.ap(B)I")
    public int method2401() {
        int var1 = this.field1891[this.field1894] & 0xFF;
        return var1 < 128 ? this.method2322() : this.method2324() - 32768;
    }

    @ObfuscatedName("de.ag(B)I")
    public int method2335() {
        return this.field1891[this.field1894] < 0 ? this.method2327() & Integer.MAX_VALUE : this.method2324();
    }

    @ObfuscatedName("de.aj(I)I")
    public int method2336() {
        byte var1 = this.field1891[++this.field1894 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1891[++this.field1894 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("de.av([II)V")
    public void method2337(int[] arg0) {
        int var2 = this.field1894 / 8;
        this.field1894 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2327();
            int var5 = this.method2327();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1894 -= 8;
            this.method2310(var4);
            this.method2310(var5);
        }
    }

    @ObfuscatedName("de.ar([IB)V")
    public void method2338(int[] arg0) {
        int var2 = this.field1894 / 8;
        this.field1894 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2327();
            int var5 = this.method2327();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1894 -= 8;
            this.method2310(var4);
            this.method2310(var5);
        }
    }

    @ObfuscatedName("de.ab([IIII)V")
    public void method2339(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1894;
        this.field1894 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2327();
            int var8 = this.method2327();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1894 -= 8;
            this.method2310(var7);
            this.method2310(var8);
        }
        this.field1894 = var4;
    }

    @ObfuscatedName("de.ai([IIIB)V")
    public void method2358(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1894;
        this.field1894 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2327();
            int var8 = this.method2327();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1894 -= 8;
            this.method2310(var7);
            this.method2310(var8);
        }
        this.field1894 = var4;
    }

    @ObfuscatedName("de.ae(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2316(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1894;
        this.field1894 = 0;
        byte[] var4 = new byte[var3];
        this.method2447(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1894 = 0;
        this.method2367(var7.length);
        this.method2334(var7, 0, var7.length);
    }

    @ObfuscatedName("de.ax(II)I")
    public int method2342(int arg0) {
        int var2 = method228(this.field1891, arg0, this.field1894);
        this.method2310(var2);
        return var2;
    }

    @ObfuscatedName("de.aw(B)Z")
    public boolean method2333() {
        this.field1894 -= 4;
        int var1 = method228(this.field1891, 0, this.field1894);
        int var2 = this.method2327();
        return var1 == var2;
    }

    @ObfuscatedName("de.ac(IB)V")
    public void method2344(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.al(II)V")
    public void method2345(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("de.az(II)V")
    public void method2346(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("de.as(I)I")
    public int method2388() {
        return this.field1891[++this.field1894 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("de.am(B)I")
    public int method2480() {
        return -this.field1891[++this.field1894 - 1] & 0xFF;
    }

    @ObfuscatedName("de.ay(B)I")
    public int method2517() {
        return 128 - this.field1891[++this.field1894 - 1] & 0xFF;
    }

    @ObfuscatedName("de.ao(I)B")
    public byte method2350() {
        return (byte) (this.field1891[++this.field1894 - 1] - 128);
    }

    @ObfuscatedName("de.aq(IS)V")
    public void method2351(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) arg0;
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.af(II)V")
    public void method2360(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.ah(IB)V")
    public void method2353(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 + 128);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bz(I)I")
    public int method2306() {
        this.field1894 += 2;
        return ((this.field1891[this.field1894 - 1] & 0xFF) << 8) + (this.field1891[this.field1894 - 2] & 0xFF);
    }

    @ObfuscatedName("de.bw(B)I")
    public int method2355() {
        this.field1894 += 2;
        return ((this.field1891[this.field1894 - 2] & 0xFF) << 8) + (this.field1891[this.field1894 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bd(B)I")
    public int method2356() {
        this.field1894 += 2;
        return ((this.field1891[this.field1894 - 1] & 0xFF) << 8) + (this.field1891[this.field1894 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bs(B)I")
    public int method2357() {
        this.field1894 += 2;
        int var1 = ((this.field1891[this.field1894 - 1] & 0xFF) << 8) + (this.field1891[this.field1894 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bj(B)I")
    public int method2376() {
        this.field1894 += 2;
        int var1 = ((this.field1891[this.field1894 - 1] & 0xFF) << 8) + (this.field1891[this.field1894 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bf(IB)V")
    public void method2359(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) arg0;
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 16);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("de.bo(II)V")
    public void method2481(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1891[++this.field1894 - 1] = (byte) arg0;
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 24);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("de.bi(IB)V")
    public void method2361(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 16);
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 24);
        this.field1891[++this.field1894 - 1] = (byte) arg0;
        this.field1891[++this.field1894 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bv(I)I")
    public int method2396() {
        this.field1894 += 4;
        return (this.field1891[this.field1894 - 4] & 0xFF) + ((this.field1891[this.field1894 - 3] & 0xFF) << 8) + ((this.field1891[this.field1894 - 2] & 0xFF) << 16) + ((this.field1891[this.field1894 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("de.bp(I)I")
    public int method2363() {
        this.field1894 += 4;
        return (this.field1891[this.field1894 - 3] & 0xFF) + ((this.field1891[this.field1894 - 4] & 0xFF) << 8) + ((this.field1891[this.field1894 - 2] & 0xFF) << 24) + ((this.field1891[this.field1894 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("de.bm(I)I")
    public int method2364() {
        this.field1894 += 4;
        return (this.field1891[this.field1894 - 2] & 0xFF) + ((this.field1891[this.field1894 - 1] & 0xFF) << 8) + ((this.field1891[this.field1894 - 4] & 0xFF) << 16) + ((this.field1891[this.field1894 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("de.br([BIIB)V")
    public void method2365(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1891[++this.field1894 - 1] - 128);
        }
    }
}
