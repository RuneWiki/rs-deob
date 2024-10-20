package deob;

import java.math.BigInteger;

@ObfuscatedName("dy")
public class class123 extends class212 {

    @ObfuscatedName("dy.s")
    public byte[] field2033;

    @ObfuscatedName("dy.z")
    public int field2028;

    @ObfuscatedName("dy.t")
    public static int[] field2029 = new int[256];

    @ObfuscatedName("dy.p")
    public static long[] field2031;

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
            field2029[var0] = var1;
        }
        field2031 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2031[var3] = var4;
        }
    }

    @ObfuscatedName("hy.s([BIIB)I")
    public static int method3722(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2029[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("do.z([BIB)I")
    public static int method2161(byte[] arg0, int arg1) {
        return method3722(arg0, 0, arg1);
    }

    public class123(int arg0) {
        this.field2033 = class125.method2622(arg0);
        this.field2028 = 0;
    }

    public class123(byte[] arg0) {
        this.field2033 = arg0;
        this.field2028 = 0;
    }

    @ObfuscatedName("dy.t(IB)V")
    public void method2349(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.y(II)V")
    public void method2350(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2028 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.p(IB)V")
    public void method2405(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2028 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.g(II)V")
    public void method2524(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 24);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2028 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.m(J)V")
    public void method2471(long arg0) {
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2033[++this.field2028 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dy.f(J)V")
    public void method2489(long arg0) {
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2033[++this.field2028 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2033[++this.field2028 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("da.k(Ljava/lang/String;B)I")
    public static int method2281(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dy.h(Ljava/lang/String;B)V")
    public void method2354(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2028 += class169.method2296(arg0, 0, arg0.length(), this.field2033, this.field2028);
        this.field2033[++this.field2028 - 1] = 0;
    }

    @ObfuscatedName("dy.w(Ljava/lang/String;B)V")
    public void method2351(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2033[++this.field2028 - 1] = 0;
        this.field2028 += class169.method2296(arg0, 0, arg0.length(), this.field2033, this.field2028);
        this.field2033[++this.field2028 - 1] = 0;
    }

    @ObfuscatedName("dy.u(Ljava/lang/CharSequence;I)V")
    public void method2475(CharSequence arg0) {
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
        this.field2033[++this.field2028 - 1] = 0;
        this.method2362(var3);
        int var8 = this.field2028;
        byte[] var9 = this.field2033;
        int var10 = this.field2028;
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
        this.field2028 = var15 + var8;
    }

    @ObfuscatedName("dy.n([BIII)V")
    public void method2357(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2033[++this.field2028 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dy.d(IS)V")
    public void method2358(int arg0) {
        this.field2033[this.field2028 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2033[this.field2028 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2033[this.field2028 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2033[this.field2028 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.a(IS)V")
    public void method2514(int arg0) {
        this.field2033[this.field2028 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2033[this.field2028 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.b(IB)V")
    public void method2360(int arg0) {
        this.field2033[this.field2028 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.q(IB)V")
    public void method2361(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2349(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2350(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dy.o(II)V")
    public void method2362(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2349(arg0 >>> 28 | 0x80);
                    }
                    this.method2349(arg0 >>> 21 | 0x80);
                }
                this.method2349(arg0 >>> 14 | 0x80);
            }
            this.method2349(arg0 >>> 7 | 0x80);
        }
        this.method2349(arg0 & 0x7F);
    }

    @ObfuscatedName("dy.c(I)I")
    public int method2363() {
        return this.field2033[++this.field2028 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.i(B)B")
    public byte method2483() {
        return this.field2033[++this.field2028 - 1];
    }

    @ObfuscatedName("dy.x(B)I")
    public int method2550() {
        this.field2028 += 2;
        return ((this.field2033[this.field2028 - 2] & 0xFF) << 8) + (this.field2033[this.field2028 - 1] & 0xFF);
    }

    @ObfuscatedName("dy.v(B)I")
    public int method2356() {
        this.field2028 += 2;
        int var1 = ((this.field2033[this.field2028 - 2] & 0xFF) << 8) + (this.field2033[this.field2028 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.l(B)I")
    public int method2367() {
        this.field2028 += 3;
        return (this.field2033[this.field2028 - 1] & 0xFF) + ((this.field2033[this.field2028 - 2] & 0xFF) << 8) + ((this.field2033[this.field2028 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.e(I)I")
    public int method2408() {
        this.field2028 += 4;
        return (this.field2033[this.field2028 - 1] & 0xFF) + ((this.field2033[this.field2028 - 2] & 0xFF) << 8) + ((this.field2033[this.field2028 - 4] & 0xFF) << 24) + ((this.field2033[this.field2028 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.j(I)J")
    public long method2369() {
        long var1 = (long) this.method2408() & 0xFFFFFFFFL;
        long var3 = (long) this.method2408() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dy.ae(I)Ljava/lang/String;")
    public String method2370() {
        if (this.field2033[this.field2028] == 0) {
            this.field2028++;
            return null;
        } else {
            return this.method2385();
        }
    }

    @ObfuscatedName("dy.ah(I)Ljava/lang/String;")
    public String method2385() {
        int var1 = this.field2028;
        while (this.field2033[++this.field2028 - 1] != 0) {
        }
        int var2 = this.field2028 - var1 - 1;
        return var2 == 0 ? "" : class169.method2058(this.field2033, var1, var2);
    }

    @ObfuscatedName("dy.am(B)Ljava/lang/String;")
    public String method2372() {
        byte var1 = this.field2033[++this.field2028 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2028;
        while (this.field2033[++this.field2028 - 1] != 0) {
        }
        int var3 = this.field2028 - var2 - 1;
        return var3 == 0 ? "" : class169.method2058(this.field2033, var2, var3);
    }

    @ObfuscatedName("dy.aa(I)Ljava/lang/String;")
    public String method2373() {
        byte var1 = this.field2033[++this.field2028 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2379();
        if (this.field2028 + var2 > this.field2033.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2033;
        int var4 = this.field2028;
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
        this.field2028 += var2;
        return var12;
    }

    @ObfuscatedName("dy.ax([BIIB)V")
    public void method2374(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2033[++this.field2028 - 1];
        }
    }

    @ObfuscatedName("dy.ac(B)I")
    public int method2552() {
        int var1 = this.field2033[this.field2028] & 0xFF;
        return var1 < 128 ? this.method2363() - 64 : this.method2550() - 49152;
    }

    @ObfuscatedName("dy.ar(B)I")
    public int method2536() {
        int var1 = this.field2033[this.field2028] & 0xFF;
        return var1 < 128 ? this.method2363() : this.method2550() - 32768;
    }

    @ObfuscatedName("dy.an(I)I")
    public int method2377() {
        return this.field2033[this.field2028] < 0 ? this.method2408() & Integer.MAX_VALUE : this.method2550();
    }

    @ObfuscatedName("dy.ag(I)I")
    public int method2378() {
        if (this.field2033[this.field2028] < 0) {
            return this.method2408() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2550();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("dy.ab(B)I")
    public int method2379() {
        byte var1 = this.field2033[++this.field2028 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2033[++this.field2028 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dy.ao([IB)V")
    public void method2380(int[] arg0) {
        int var2 = this.field2028 / 8;
        this.field2028 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2408();
            int var5 = this.method2408();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2028 -= 8;
            this.method2524(var4);
            this.method2524(var5);
        }
    }

    @ObfuscatedName("dy.av([IB)V")
    public void method2381(int[] arg0) {
        int var2 = this.field2028 / 8;
        this.field2028 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2408();
            int var5 = this.method2408();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2028 -= 8;
            this.method2524(var4);
            this.method2524(var5);
        }
    }

    @ObfuscatedName("dy.ap([IIII)V")
    public void method2382(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2028;
        this.field2028 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2408();
            int var8 = this.method2408();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2028 -= 8;
            this.method2524(var7);
            this.method2524(var8);
        }
        this.field2028 = var4;
    }

    @ObfuscatedName("dy.au([IIIB)V")
    public void method2383(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2028;
        this.field2028 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2408();
            int var8 = this.method2408();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2028 -= 8;
            this.method2524(var7);
            this.method2524(var8);
        }
        this.field2028 = var4;
    }

    @ObfuscatedName("dy.ad(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2407(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2028;
        this.field2028 = 0;
        byte[] var4 = new byte[var3];
        this.method2374(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2028 = 0;
        this.method2350(var7.length);
        this.method2357(var7, 0, var7.length);
    }

    @ObfuscatedName("dy.aj(II)I")
    public int method2371(int arg0) {
        int var2 = method3722(this.field2033, arg0, this.field2028);
        this.method2524(var2);
        return var2;
    }

    @ObfuscatedName("dy.ai(B)Z")
    public boolean method2384() {
        this.field2028 -= 4;
        int var1 = method3722(this.field2033, 0, this.field2028);
        int var2 = this.method2408();
        return var1 == var2;
    }

    @ObfuscatedName("dy.az(II)V")
    public void method2387(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dy.ay(II)V")
    public void method2348(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dy.at(IB)V")
    public void method2493(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dy.al(I)I")
    public int method2390() {
        return this.field2033[++this.field2028 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dy.aw(I)I")
    public int method2436() {
        return -this.field2033[++this.field2028 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.ak(B)I")
    public int method2392() {
        return 128 - this.field2033[++this.field2028 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.as(B)B")
    public byte method2393() {
        return (byte) (-this.field2033[++this.field2028 - 1]);
    }

    @ObfuscatedName("dy.aq(B)B")
    public byte method2557() {
        return (byte) (128 - this.field2033[++this.field2028 - 1]);
    }

    @ObfuscatedName("dy.af(IB)V")
    public void method2395(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) arg0;
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.bp(II)V")
    public void method2396(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dy.bh(II)V")
    public void method2537(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 + 128);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.bo(B)I")
    public int method2398() {
        this.field2028 += 2;
        return ((this.field2033[this.field2028 - 1] & 0xFF) << 8) + (this.field2033[this.field2028 - 2] & 0xFF);
    }

    @ObfuscatedName("dy.bg(B)I")
    public int method2399() {
        this.field2028 += 2;
        return ((this.field2033[this.field2028 - 2] & 0xFF) << 8) + (this.field2033[this.field2028 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dy.bk(I)I")
    public int method2540() {
        this.field2028 += 2;
        return ((this.field2033[this.field2028 - 1] & 0xFF) << 8) + (this.field2033[this.field2028 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dy.bw(I)I")
    public int method2401() {
        this.field2028 += 2;
        int var1 = ((this.field2033[this.field2028 - 1] & 0xFF) << 8) + (this.field2033[this.field2028 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.bj(B)I")
    public int method2402() {
        this.field2028 += 2;
        int var1 = ((this.field2033[this.field2028 - 2] & 0xFF) << 8) + (this.field2033[this.field2028 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.be(IB)V")
    public void method2403(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2028 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.br(I)I")
    public int method2455() {
        this.field2028 += 3;
        return (this.field2033[this.field2028 - 1] & 0xFF) + ((this.field2033[this.field2028 - 2] & 0xFF) << 16) + ((this.field2033[this.field2028 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dy.bx(II)V")
    public void method2439(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) arg0;
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dy.bm(II)V")
    public void method2406(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2028 - 1] = (byte) arg0;
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 24);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dy.bb(II)V")
    public void method2447(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 24);
        this.field2033[++this.field2028 - 1] = (byte) arg0;
        this.field2033[++this.field2028 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.bv(I)I")
    public int method2526() {
        this.field2028 += 4;
        return (this.field2033[this.field2028 - 4] & 0xFF) + ((this.field2033[this.field2028 - 3] & 0xFF) << 8) + ((this.field2033[this.field2028 - 1] & 0xFF) << 24) + ((this.field2033[this.field2028 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.bs(B)I")
    public int method2559() {
        this.field2028 += 4;
        return (this.field2033[this.field2028 - 3] & 0xFF) + ((this.field2033[this.field2028 - 4] & 0xFF) << 8) + ((this.field2033[this.field2028 - 1] & 0xFF) << 16) + ((this.field2033[this.field2028 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dy.bn(B)I")
    public int method2410() {
        this.field2028 += 4;
        return (this.field2033[this.field2028 - 2] & 0xFF) + ((this.field2033[this.field2028 - 1] & 0xFF) << 8) + ((this.field2033[this.field2028 - 4] & 0xFF) << 16) + ((this.field2033[this.field2028 - 3] & 0xFF) << 24);
    }
}
