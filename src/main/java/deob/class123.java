package deob;

import java.math.BigInteger;

@ObfuscatedName("dj")
public class class123 extends class212 {

    @ObfuscatedName("dj.m")
    public byte[] field2048;

    @ObfuscatedName("dj.w")
    public int field2046;

    @ObfuscatedName("dj.e")
    public static int[] field2047 = new int[256];

    @ObfuscatedName("dj.g")
    public static long[] field2045;

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
            field2047[var0] = var1;
        }
        field2045 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2045[var3] = var4;
        }
    }

    @ObfuscatedName("dq.m([BIIB)I")
    public static int method2703(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2047[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cx.w([BII)I")
    public static int method1668(byte[] arg0, int arg1) {
        return method2703(arg0, 0, arg1);
    }

    public class123(int arg0) {
        this.field2048 = class125.method2635(arg0);
        this.field2046 = 0;
    }

    public class123(byte[] arg0) {
        this.field2048 = arg0;
        this.field2046 = 0;
    }

    @ObfuscatedName("dj.e(II)V")
    public void method2399(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.o(IS)V")
    public void method2400(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2048[++this.field2046 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.g(II)V")
    public void method2401(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 16);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2048[++this.field2046 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.l(IS)V")
    public void method2402(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 24);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 16);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2048[++this.field2046 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.j(J)V")
    public void method2403(long arg0) {
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2048[++this.field2046 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dj.r(J)V")
    public void method2404(long arg0) {
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2048[++this.field2046 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2048[++this.field2046 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("bw.x(Ljava/lang/String;I)I")
    public static int method1584(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dj.k(Ljava/lang/String;I)V")
    public void method2405(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2046 += class169.method755(arg0, 0, arg0.length(), this.field2048, this.field2046);
        this.field2048[++this.field2046 - 1] = 0;
    }

    @ObfuscatedName("dj.v(Ljava/lang/String;B)V")
    public void method2501(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2048[++this.field2046 - 1] = 0;
        this.field2046 += class169.method755(arg0, 0, arg0.length(), this.field2048, this.field2046);
        this.field2048[++this.field2046 - 1] = 0;
    }

    @ObfuscatedName("dj.h(Ljava/lang/CharSequence;B)V")
    public void method2407(CharSequence arg0) {
        int var2 = class213.method2746(arg0);
        this.field2048[++this.field2046 - 1] = 0;
        this.method2413(var2);
        this.field2046 += class213.method2833(this.field2048, this.field2046, arg0);
    }

    @ObfuscatedName("dj.u([BIII)V")
    public void method2584(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2048[++this.field2046 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dj.y(II)V")
    public void method2587(int arg0) {
        this.field2048[this.field2046 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2048[this.field2046 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2048[this.field2046 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2048[this.field2046 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.p(II)V")
    public void method2410(int arg0) {
        this.field2048[this.field2046 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2048[this.field2046 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.s(IB)V")
    public void method2543(int arg0) {
        this.field2048[this.field2046 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.f(II)V")
    public void method2412(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2399(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2400(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dj.i(IB)V")
    public void method2413(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2399(arg0 >>> 28 | 0x80);
                    }
                    this.method2399(arg0 >>> 21 | 0x80);
                }
                this.method2399(arg0 >>> 14 | 0x80);
            }
            this.method2399(arg0 >>> 7 | 0x80);
        }
        this.method2399(arg0 & 0x7F);
    }

    @ObfuscatedName("dj.d(I)I")
    public int method2398() {
        return this.field2048[++this.field2046 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.t(I)B")
    public byte method2415() {
        return this.field2048[++this.field2046 - 1];
    }

    @ObfuscatedName("dj.c(B)I")
    public int method2548() {
        this.field2046 += 2;
        return ((this.field2048[this.field2046 - 2] & 0xFF) << 8) + (this.field2048[this.field2046 - 1] & 0xFF);
    }

    @ObfuscatedName("dj.z(I)I")
    public int method2417() {
        this.field2046 += 2;
        int var1 = ((this.field2048[this.field2046 - 2] & 0xFF) << 8) + (this.field2048[this.field2046 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.n(B)I")
    public int method2418() {
        this.field2046 += 3;
        return (this.field2048[this.field2046 - 1] & 0xFF) + ((this.field2048[this.field2046 - 2] & 0xFF) << 8) + ((this.field2048[this.field2046 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.q(I)I")
    public int method2419() {
        this.field2046 += 4;
        return (this.field2048[this.field2046 - 1] & 0xFF) + ((this.field2048[this.field2046 - 2] & 0xFF) << 8) + ((this.field2048[this.field2046 - 4] & 0xFF) << 24) + ((this.field2048[this.field2046 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.a(I)J")
    public long method2420() {
        long var1 = (long) this.method2419() & 0xFFFFFFFFL;
        long var3 = (long) this.method2419() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dj.b(I)Ljava/lang/String;")
    public String method2469() {
        if (this.field2048[this.field2046] == 0) {
            this.field2046++;
            return null;
        } else {
            return this.method2422();
        }
    }

    @ObfuscatedName("dj.aj(B)Ljava/lang/String;")
    public String method2422() {
        int var1 = this.field2046;
        while (this.field2048[++this.field2046 - 1] != 0) {
        }
        int var2 = this.field2046 - var1 - 1;
        return var2 == 0 ? "" : class169.method102(this.field2048, var1, var2);
    }

    @ObfuscatedName("dj.an(I)Ljava/lang/String;")
    public String method2423() {
        byte var1 = this.field2048[++this.field2046 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2046;
        while (this.field2048[++this.field2046 - 1] != 0) {
        }
        int var3 = this.field2046 - var2 - 1;
        return var3 == 0 ? "" : class169.method102(this.field2048, var2, var3);
    }

    @ObfuscatedName("dj.ap(I)Ljava/lang/String;")
    public String method2424() {
        byte var1 = this.field2048[++this.field2046 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2529();
        if (this.field2046 + var2 > this.field2048.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2048;
        int var4 = this.field2046;
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
        this.field2046 += var2;
        return var12;
    }

    @ObfuscatedName("dj.ar([BIII)V")
    public void method2425(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2048[++this.field2046 - 1];
        }
    }

    @ObfuscatedName("dj.ab(I)I")
    public int method2426() {
        int var1 = this.field2048[this.field2046] & 0xFF;
        return var1 < 128 ? this.method2398() - 64 : this.method2548() - 49152;
    }

    @ObfuscatedName("dj.ai(I)I")
    public int method2427() {
        int var1 = this.field2048[this.field2046] & 0xFF;
        return var1 < 128 ? this.method2398() : this.method2548() - 32768;
    }

    @ObfuscatedName("dj.aa(I)I")
    public int method2579() {
        return this.field2048[this.field2046] < 0 ? this.method2419() & Integer.MAX_VALUE : this.method2548();
    }

    @ObfuscatedName("dj.ax(I)I")
    public int method2428() {
        if (this.field2048[this.field2046] < 0) {
            return this.method2419() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2548();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("dj.ad(I)I")
    public int method2529() {
        byte var1 = this.field2048[++this.field2046 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2048[++this.field2046 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dj.av([II)V")
    public void method2430(int[] arg0) {
        int var2 = this.field2046 / 8;
        this.field2046 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2419();
            int var5 = this.method2419();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2046 -= 8;
            this.method2402(var4);
            this.method2402(var5);
        }
    }

    @ObfuscatedName("dj.aq([II)V")
    public void method2512(int[] arg0) {
        int var2 = this.field2046 / 8;
        this.field2046 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2419();
            int var5 = this.method2419();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2046 -= 8;
            this.method2402(var4);
            this.method2402(var5);
        }
    }

    @ObfuscatedName("dj.af([IIIS)V")
    public void method2432(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2046;
        this.field2046 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2419();
            int var8 = this.method2419();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2046 -= 8;
            this.method2402(var7);
            this.method2402(var8);
        }
        this.field2046 = var4;
    }

    @ObfuscatedName("dj.at([IIII)V")
    public void method2433(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2046;
        this.field2046 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2419();
            int var8 = this.method2419();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2046 -= 8;
            this.method2402(var7);
            this.method2402(var8);
        }
        this.field2046 = var4;
    }

    @ObfuscatedName("dj.aw(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2515(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2046;
        this.field2046 = 0;
        byte[] var4 = new byte[var3];
        this.method2425(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2046 = 0;
        this.method2400(var7.length);
        this.method2584(var7, 0, var7.length);
    }

    @ObfuscatedName("dj.ay(II)I")
    public int method2578(int arg0) {
        int var2 = method2703(this.field2048, arg0, this.field2046);
        this.method2402(var2);
        return var2;
    }

    @ObfuscatedName("dj.ah(S)Z")
    public boolean method2436() {
        this.field2046 -= 4;
        int var1 = method2703(this.field2048, 0, this.field2046);
        int var2 = this.method2419();
        return var1 == var2;
    }

    @ObfuscatedName("dj.al(II)V")
    public void method2437(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.as(IB)V")
    public void method2438(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dj.ac(IB)V")
    public void method2439(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dj.ao(I)I")
    public int method2440() {
        return this.field2048[++this.field2046 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dj.au(S)I")
    public int method2596() {
        return -this.field2048[++this.field2046 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.am(I)I")
    public int method2560() {
        return 128 - this.field2048[++this.field2046 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.ag(B)B")
    public byte method2443() {
        return (byte) (this.field2048[++this.field2046 - 1] - 128);
    }

    @ObfuscatedName("dj.az(I)B")
    public byte method2444() {
        return (byte) (-this.field2048[++this.field2046 - 1]);
    }

    @ObfuscatedName("dj.ak(II)V")
    public void method2445(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) arg0;
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.ae(IB)V")
    public void method2409(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.br(IB)V")
    public void method2447(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 + 128);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bi(I)I")
    public int method2448() {
        this.field2046 += 2;
        return ((this.field2048[this.field2046 - 1] & 0xFF) << 8) + (this.field2048[this.field2046 - 2] & 0xFF);
    }

    @ObfuscatedName("dj.bx(I)I")
    public int method2497() {
        this.field2046 += 2;
        return ((this.field2048[this.field2046 - 2] & 0xFF) << 8) + (this.field2048[this.field2046 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bs(I)I")
    public int method2450() {
        this.field2046 += 2;
        return ((this.field2048[this.field2046 - 1] & 0xFF) << 8) + (this.field2048[this.field2046 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bt(II)V")
    public void method2429(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) arg0;
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dj.bh(I)I")
    public int method2452() {
        this.field2046 += 3;
        return (this.field2048[this.field2046 - 2] & 0xFF) + ((this.field2048[this.field2046 - 3] & 0xFF) << 16) + ((this.field2048[this.field2046 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dj.be(II)V")
    public void method2571(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) arg0;
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 16);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dj.bq(IB)V")
    public void method2565(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2048[++this.field2046 - 1] = (byte) arg0;
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 24);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dj.bo(II)V")
    public void method2461(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 16);
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 24);
        this.field2048[++this.field2046 - 1] = (byte) arg0;
        this.field2048[++this.field2046 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bm(I)I")
    public int method2488() {
        this.field2046 += 4;
        return (this.field2048[this.field2046 - 4] & 0xFF) + ((this.field2048[this.field2046 - 3] & 0xFF) << 8) + ((this.field2048[this.field2046 - 2] & 0xFF) << 16) + ((this.field2048[this.field2046 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.by(I)I")
    public int method2544() {
        this.field2046 += 4;
        return (this.field2048[this.field2046 - 3] & 0xFF) + ((this.field2048[this.field2046 - 4] & 0xFF) << 8) + ((this.field2048[this.field2046 - 2] & 0xFF) << 24) + ((this.field2048[this.field2046 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.ba(I)I")
    public int method2458() {
        this.field2046 += 4;
        return (this.field2048[this.field2046 - 2] & 0xFF) + ((this.field2048[this.field2046 - 1] & 0xFF) << 8) + ((this.field2048[this.field2046 - 3] & 0xFF) << 24) + ((this.field2048[this.field2046 - 4] & 0xFF) << 16);
    }
}
