package deob;

import java.math.BigInteger;

@ObfuscatedName("ds")
public class class119 extends class208 {

    @ObfuscatedName("ds.a")
    public byte[] field1981;

    @ObfuscatedName("ds.r")
    public int field1980;

    @ObfuscatedName("ds.f")
    public static int[] field1982 = new int[256];

    @ObfuscatedName("ds.y")
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
            field1982[var0] = var1;
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

    @ObfuscatedName("bd.a([BIII)I")
    public static int method1068(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1982[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ao.r([BII)I")
    public static int method710(byte[] arg0, int arg1) {
        return method1068(arg0, 0, arg1);
    }

    public class119(int arg0) {
        this.field1981 = class121.method2578(arg0);
        this.field1980 = 0;
    }

    public class119(byte[] arg0) {
        this.field1981 = arg0;
        this.field1980 = 0;
    }

    @ObfuscatedName("ds.f(II)V")
    public void method2330(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.s(IB)V")
    public void method2331(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.y(IB)V")
    public void method2332(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.e(IB)V")
    public void method2496(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.g(J)V")
    public void method2334(long arg0) {
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1981[++this.field1980 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ds.m(J)V")
    public void method2503(long arg0) {
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1981[++this.field1980 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1981[++this.field1980 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("q.j(Ljava/lang/String;I)I")
    public static int method571(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ds.n(Ljava/lang/String;I)V")
    public void method2336(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1980 += class165.method208(arg0, 0, arg0.length(), this.field1981, this.field1980);
        this.field1981[++this.field1980 - 1] = 0;
    }

    @ObfuscatedName("ds.l(Ljava/lang/String;I)V")
    public void method2337(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1981[++this.field1980 - 1] = 0;
        this.field1980 += class165.method208(arg0, 0, arg0.length(), this.field1981, this.field1980);
        this.field1981[++this.field1980 - 1] = 0;
    }

    @ObfuscatedName("ds.h(Ljava/lang/CharSequence;I)V")
    public void method2338(CharSequence arg0) {
        int var2 = class209.method127(arg0);
        this.field1981[++this.field1980 - 1] = 0;
        this.method2383(var2);
        int var3 = this.field1980;
        byte[] var4 = this.field1981;
        int var5 = this.field1980;
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
        this.field1980 = var10 + var3;
    }

    @ObfuscatedName("ds.i([BIIB)V")
    public void method2532(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1981[++this.field1980 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ds.v(II)V")
    public void method2340(int arg0) {
        this.field1981[this.field1980 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1981[this.field1980 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1981[this.field1980 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1981[this.field1980 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.z(II)V")
    public void method2341(int arg0) {
        this.field1981[this.field1980 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1981[this.field1980 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.u(II)V")
    public void method2342(int arg0) {
        this.field1981[this.field1980 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.t(IB)V")
    public void method2343(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2330(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2331(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.b(II)V")
    public void method2383(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2330(arg0 >>> 28 | 0x80);
                    }
                    this.method2330(arg0 >>> 21 | 0x80);
                }
                this.method2330(arg0 >>> 14 | 0x80);
            }
            this.method2330(arg0 >>> 7 | 0x80);
        }
        this.method2330(arg0 & 0x7F);
    }

    @ObfuscatedName("ds.c(I)I")
    public int method2412() {
        return this.field1981[++this.field1980 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.x(I)B")
    public byte method2540() {
        return this.field1981[++this.field1980 - 1];
    }

    @ObfuscatedName("ds.d(I)I")
    public int method2347() {
        this.field1980 += 2;
        return ((this.field1981[this.field1980 - 2] & 0xFF) << 8) + (this.field1981[this.field1980 - 1] & 0xFF);
    }

    @ObfuscatedName("ds.p(I)I")
    public int method2348() {
        this.field1980 += 2;
        int var1 = ((this.field1981[this.field1980 - 2] & 0xFF) << 8) + (this.field1981[this.field1980 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.q(B)I")
    public int method2349() {
        this.field1980 += 3;
        return (this.field1981[this.field1980 - 1] & 0xFF) + ((this.field1981[this.field1980 - 2] & 0xFF) << 8) + ((this.field1981[this.field1980 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.w(I)I")
    public int method2350() {
        this.field1980 += 4;
        return (this.field1981[this.field1980 - 1] & 0xFF) + ((this.field1981[this.field1980 - 2] & 0xFF) << 8) + ((this.field1981[this.field1980 - 4] & 0xFF) << 24) + ((this.field1981[this.field1980 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.k(S)J")
    public long method2351() {
        long var1 = (long) this.method2350() & 0xFFFFFFFFL;
        long var3 = (long) this.method2350() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ds.o(I)Ljava/lang/String;")
    public String method2352() {
        if (this.field1981[this.field1980] == 0) {
            this.field1980++;
            return null;
        } else {
            return this.method2353();
        }
    }

    @ObfuscatedName("ds.ad(I)Ljava/lang/String;")
    public String method2353() {
        int var1 = this.field1980;
        while (this.field1981[++this.field1980 - 1] != 0) {
        }
        int var2 = this.field1980 - var1 - 1;
        return var2 == 0 ? "" : class165.method984(this.field1981, var1, var2);
    }

    @ObfuscatedName("ds.at(I)Ljava/lang/String;")
    public String method2442() {
        byte var1 = this.field1981[++this.field1980 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1980;
        while (this.field1981[++this.field1980 - 1] != 0) {
        }
        int var3 = this.field1980 - var2 - 1;
        return var3 == 0 ? "" : class165.method984(this.field1981, var2, var3);
    }

    @ObfuscatedName("ds.aw(I)Ljava/lang/String;")
    public String method2355() {
        byte var1 = this.field1981[++this.field1980 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2450();
        if (this.field1980 + var2 > this.field1981.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1981;
        int var4 = this.field1980;
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
        this.field1980 += var2;
        return var12;
    }

    @ObfuscatedName("ds.ax([BIII)V")
    public void method2339(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1981[++this.field1980 - 1];
        }
    }

    @ObfuscatedName("ds.ak(I)I")
    public int method2357() {
        int var1 = this.field1981[this.field1980] & 0xFF;
        return var1 < 128 ? this.method2412() - 64 : this.method2347() - 49152;
    }

    @ObfuscatedName("ds.ah(B)I")
    public int method2492() {
        int var1 = this.field1981[this.field1980] & 0xFF;
        return var1 < 128 ? this.method2412() : this.method2347() - 32768;
    }

    @ObfuscatedName("ds.ac(I)I")
    public int method2359() {
        return this.field1981[this.field1980] < 0 ? this.method2350() & Integer.MAX_VALUE : this.method2347();
    }

    @ObfuscatedName("ds.as(B)I")
    public int method2450() {
        byte var1 = this.field1981[++this.field1980 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1981[++this.field1980 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ds.ao([II)V")
    public void method2361(int[] arg0) {
        int var2 = this.field1980 / 8;
        this.field1980 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2350();
            int var5 = this.method2350();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1980 -= 8;
            this.method2496(var4);
            this.method2496(var5);
        }
    }

    @ObfuscatedName("ds.am([II)V")
    public void method2362(int[] arg0) {
        int var2 = this.field1980 / 8;
        this.field1980 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2350();
            int var5 = this.method2350();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1980 -= 8;
            this.method2496(var4);
            this.method2496(var5);
        }
    }

    @ObfuscatedName("ds.ai([IIII)V")
    public void method2363(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1980;
        this.field1980 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2350();
            int var8 = this.method2350();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1980 -= 8;
            this.method2496(var7);
            this.method2496(var8);
        }
        this.field1980 = var4;
    }

    @ObfuscatedName("ds.ab([IIII)V")
    public void method2364(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1980;
        this.field1980 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2350();
            int var8 = this.method2350();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1980 -= 8;
            this.method2496(var7);
            this.method2496(var8);
        }
        this.field1980 = var4;
    }

    @ObfuscatedName("ds.al(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2384(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1980;
        this.field1980 = 0;
        byte[] var4 = new byte[var3];
        this.method2339(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1980 = 0;
        this.method2331(var7.length);
        this.method2532(var7, 0, var7.length);
    }

    @ObfuscatedName("ds.ar(IB)I")
    public int method2433(int arg0) {
        int var2 = method1068(this.field1981, arg0, this.field1980);
        this.method2496(var2);
        return var2;
    }

    @ObfuscatedName("ds.aa(B)Z")
    public boolean method2367() {
        this.field1980 -= 4;
        int var1 = method1068(this.field1981, 0, this.field1980);
        int var2 = this.method2350();
        return var1 == var2;
    }

    @ObfuscatedName("ds.ag(II)V")
    public void method2368(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.an(II)V")
    public void method2369(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ds.av(IB)V")
    public void method2481(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ds.aj(I)I")
    public int method2371() {
        return this.field1981[++this.field1980 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ds.ap(I)I")
    public int method2475() {
        return -this.field1981[++this.field1980 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.aq(I)I")
    public int method2373() {
        return 128 - this.field1981[++this.field1980 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.af(I)B")
    public byte method2372() {
        return (byte) (-this.field1981[++this.field1980 - 1]);
    }

    @ObfuscatedName("ds.ay(B)B")
    public byte method2375() {
        return (byte) (128 - this.field1981[++this.field1980 - 1]);
    }

    @ObfuscatedName("ds.au(IB)V")
    public void method2499(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) arg0;
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.az(II)V")
    public void method2377(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.ae(IB)V")
    public void method2378(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 + 128);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bd(B)I")
    public int method2379() {
        this.field1980 += 2;
        return ((this.field1981[this.field1980 - 1] & 0xFF) << 8) + (this.field1981[this.field1980 - 2] & 0xFF);
    }

    @ObfuscatedName("ds.br(B)I")
    public int method2380() {
        this.field1980 += 2;
        return ((this.field1981[this.field1980 - 2] & 0xFF) << 8) + (this.field1981[this.field1980 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.bt(I)I")
    public int method2523() {
        this.field1980 += 2;
        return ((this.field1981[this.field1980 - 1] & 0xFF) << 8) + (this.field1981[this.field1980 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.bp(I)I")
    public int method2382() {
        this.field1980 += 2;
        int var1 = ((this.field1981[this.field1980 - 2] & 0xFF) << 8) + (this.field1981[this.field1980 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.bq(II)V")
    public void method2490(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.bv(B)I")
    public int method2511() {
        this.field1980 += 3;
        return (this.field1981[this.field1980 - 2] & 0xFF) + ((this.field1981[this.field1980 - 1] & 0xFF) << 8) + ((this.field1981[this.field1980 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.by(II)V")
    public void method2385(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) arg0;
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ds.bu(II)V")
    public void method2485(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1980 - 1] = (byte) arg0;
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ds.bo(II)V")
    public void method2506(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1980 - 1] = (byte) arg0;
        this.field1981[++this.field1980 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bs(I)I")
    public int method2478() {
        this.field1980 += 4;
        return (this.field1981[this.field1980 - 4] & 0xFF) + ((this.field1981[this.field1980 - 3] & 0xFF) << 8) + ((this.field1981[this.field1980 - 1] & 0xFF) << 24) + ((this.field1981[this.field1980 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.bl(I)I")
    public int method2388() {
        this.field1980 += 4;
        return (this.field1981[this.field1980 - 3] & 0xFF) + ((this.field1981[this.field1980 - 4] & 0xFF) << 8) + ((this.field1981[this.field1980 - 2] & 0xFF) << 24) + ((this.field1981[this.field1980 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.bn(B)I")
    public int method2389() {
        this.field1980 += 4;
        return (this.field1981[this.field1980 - 2] & 0xFF) + ((this.field1981[this.field1980 - 1] & 0xFF) << 8) + ((this.field1981[this.field1980 - 4] & 0xFF) << 16) + ((this.field1981[this.field1980 - 3] & 0xFF) << 24);
    }
}
