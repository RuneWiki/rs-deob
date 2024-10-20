package deob;

import java.math.BigInteger;

@ObfuscatedName("de")
public class class123 extends class212 {

    @ObfuscatedName("de.k")
    public byte[] field2054;

    @ObfuscatedName("de.q")
    public int field2060;

    @ObfuscatedName("de.f")
    public static int[] field2059 = new int[256];

    @ObfuscatedName("de.v")
    public static long[] field2056;

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
            field2059[var0] = var1;
        }
        field2056 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2056[var3] = var4;
        }
    }

    @ObfuscatedName("dt.k([BIII)I")
    public static int method2689(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2059[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class123(int arg0) {
        this.field2054 = class125.method2657(arg0);
        this.field2060 = 0;
    }

    public class123(byte[] arg0) {
        this.field2054 = arg0;
        this.field2060 = 0;
    }

    @ObfuscatedName("de.q(II)V")
    public void method2412(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.f(II)V")
    public void method2494(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
        this.field2054[++this.field2060 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.c(II)V")
    public void method2414(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 16);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
        this.field2054[++this.field2060 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.v(II)V")
    public void method2415(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 24);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 16);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
        this.field2054[++this.field2060 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.j(J)V")
    public void method2490(long arg0) {
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2054[++this.field2060 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("de.m(J)V")
    public void method2523(long arg0) {
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2054[++this.field2060 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2054[++this.field2060 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("aj.y(Ljava/lang/String;I)I")
    public static int method667(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("de.u(Ljava/lang/String;I)V")
    public void method2418(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2060 += class169.method1049(arg0, 0, arg0.length(), this.field2054, this.field2060);
        this.field2054[++this.field2060 - 1] = 0;
    }

    @ObfuscatedName("n.h(Ljava/lang/String;S)I")
    public static int method563(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("de.l(Ljava/lang/String;B)V")
    public void method2419(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2054[++this.field2060 - 1] = 0;
        this.field2060 += class169.method1049(arg0, 0, arg0.length(), this.field2054, this.field2060);
        this.field2054[++this.field2060 - 1] = 0;
    }

    @ObfuscatedName("de.b(Ljava/lang/CharSequence;B)V")
    public void method2420(CharSequence arg0) {
        int var2 = class213.method2967(arg0);
        this.field2054[++this.field2060 - 1] = 0;
        this.method2426(var2);
        this.field2060 += class213.method701(this.field2054, this.field2060, arg0);
    }

    @ObfuscatedName("de.g([BIII)V")
    public void method2421(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2054[++this.field2060 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("de.e(II)V")
    public void method2440(int arg0) {
        this.field2054[this.field2060 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2054[this.field2060 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2054[this.field2060 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2054[this.field2060 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.p(II)V")
    public void method2610(int arg0) {
        this.field2054[this.field2060 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2054[this.field2060 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.s(IB)V")
    public void method2424(int arg0) {
        this.field2054[this.field2060 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.w(II)V")
    public void method2425(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2412(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2494(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.i(II)V")
    public void method2426(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2412(arg0 >>> 28 | 0x80);
                    }
                    this.method2412(arg0 >>> 21 | 0x80);
                }
                this.method2412(arg0 >>> 14 | 0x80);
            }
            this.method2412(arg0 >>> 7 | 0x80);
        }
        this.method2412(arg0 & 0x7F);
    }

    @ObfuscatedName("de.r(I)I")
    public int method2427() {
        return this.field2054[++this.field2060 - 1] & 0xFF;
    }

    @ObfuscatedName("de.a(I)B")
    public byte method2428() {
        return this.field2054[++this.field2060 - 1];
    }

    @ObfuscatedName("de.n(I)I")
    public int method2547() {
        this.field2060 += 2;
        return ((this.field2054[this.field2060 - 2] & 0xFF) << 8) + (this.field2054[this.field2060 - 1] & 0xFF);
    }

    @ObfuscatedName("de.z(B)I")
    public int method2430() {
        this.field2060 += 2;
        int var1 = ((this.field2054[this.field2060 - 2] & 0xFF) << 8) + (this.field2054[this.field2060 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.x(B)I")
    public int method2431() {
        this.field2060 += 3;
        return (this.field2054[this.field2060 - 1] & 0xFF) + ((this.field2054[this.field2060 - 2] & 0xFF) << 8) + ((this.field2054[this.field2060 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("de.d(I)I")
    public int method2432() {
        this.field2060 += 4;
        return (this.field2054[this.field2060 - 1] & 0xFF) + ((this.field2054[this.field2060 - 2] & 0xFF) << 8) + ((this.field2054[this.field2060 - 4] & 0xFF) << 24) + ((this.field2054[this.field2060 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("de.t(I)J")
    public long method2560() {
        long var1 = (long) this.method2432() & 0xFFFFFFFFL;
        long var3 = (long) this.method2432() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("de.o(I)Ljava/lang/String;")
    public String method2493() {
        if (this.field2054[this.field2060] == 0) {
            this.field2060++;
            return null;
        } else {
            return this.method2435();
        }
    }

    @ObfuscatedName("de.aq(S)Ljava/lang/String;")
    public String method2435() {
        int var1 = this.field2060;
        while (this.field2054[++this.field2060 - 1] != 0) {
        }
        int var2 = this.field2060 - var1 - 1;
        return var2 == 0 ? "" : class169.method2853(this.field2054, var1, var2);
    }

    @ObfuscatedName("de.al(B)Ljava/lang/String;")
    public String method2436() {
        byte var1 = this.field2054[++this.field2060 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2060;
        while (this.field2054[++this.field2060 - 1] != 0) {
        }
        int var3 = this.field2060 - var2 - 1;
        return var3 == 0 ? "" : class169.method2853(this.field2054, var2, var3);
    }

    @ObfuscatedName("de.av(B)Ljava/lang/String;")
    public String method2422() {
        byte var1 = this.field2054[++this.field2060 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2443();
        if (this.field2060 + var2 > this.field2054.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2054;
        int var4 = this.field2060;
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
        this.field2060 += var2;
        return var12;
    }

    @ObfuscatedName("de.ad([BIII)V")
    public void method2438(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2054[++this.field2060 - 1];
        }
    }

    @ObfuscatedName("de.at(I)I")
    public int method2439() {
        int var1 = this.field2054[this.field2060] & 0xFF;
        return var1 < 128 ? this.method2427() - 64 : this.method2547() - 49152;
    }

    @ObfuscatedName("de.aj(B)I")
    public int method2410() {
        int var1 = this.field2054[this.field2060] & 0xFF;
        return var1 < 128 ? this.method2427() : this.method2547() - 32768;
    }

    @ObfuscatedName("de.am(I)I")
    public int method2441() {
        return this.field2054[this.field2060] < 0 ? this.method2432() & Integer.MAX_VALUE : this.method2547();
    }

    @ObfuscatedName("de.ay(I)I")
    public int method2423() {
        if (this.field2054[this.field2060] < 0) {
            return this.method2432() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2547();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("de.ag(B)I")
    public int method2443() {
        byte var1 = this.field2054[++this.field2060 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2054[++this.field2060 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("de.aa([II)V")
    public void method2444(int[] arg0) {
        int var2 = this.field2060 / 8;
        this.field2060 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2432();
            int var5 = this.method2432();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2060 -= 8;
            this.method2415(var4);
            this.method2415(var5);
        }
    }

    @ObfuscatedName("de.ak([IB)V")
    public void method2445(int[] arg0) {
        int var2 = this.field2060 / 8;
        this.field2060 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2432();
            int var5 = this.method2432();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2060 -= 8;
            this.method2415(var4);
            this.method2415(var5);
        }
    }

    @ObfuscatedName("de.ar([IIIB)V")
    public void method2446(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2060;
        this.field2060 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2432();
            int var8 = this.method2432();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2060 -= 8;
            this.method2415(var7);
            this.method2415(var8);
        }
        this.field2060 = var4;
    }

    @ObfuscatedName("de.ax([IIII)V")
    public void method2447(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2060;
        this.field2060 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2432();
            int var8 = this.method2432();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2060 -= 8;
            this.method2415(var7);
            this.method2415(var8);
        }
        this.field2060 = var4;
    }

    @ObfuscatedName("de.ap(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2448(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2060;
        this.field2060 = 0;
        byte[] var4 = new byte[var3];
        this.method2438(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2060 = 0;
        this.method2494(var7.length);
        this.method2421(var7, 0, var7.length);
    }

    @ObfuscatedName("de.ao(IB)I")
    public int method2546(int arg0) {
        int var2 = method2689(this.field2054, arg0, this.field2060);
        this.method2415(var2);
        return var2;
    }

    @ObfuscatedName("de.aw(I)Z")
    public boolean method2450() {
        this.field2060 -= 4;
        int var1 = method2689(this.field2054, 0, this.field2060);
        int var2 = this.method2432();
        return var1 == var2;
    }

    @ObfuscatedName("de.ai(IB)V")
    public void method2429(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.af(IB)V")
    public void method2452(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("de.an(IB)V")
    public void method2556(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("de.au(I)I")
    public int method2454() {
        return this.field2054[++this.field2060 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("de.ac(B)I")
    public int method2455() {
        return -this.field2054[++this.field2060 - 1] & 0xFF;
    }

    @ObfuscatedName("de.ae(B)I")
    public int method2475() {
        return 128 - this.field2054[++this.field2060 - 1] & 0xFF;
    }

    @ObfuscatedName("de.az(B)B")
    public byte method2618() {
        return (byte) (this.field2054[++this.field2060 - 1] - 128);
    }

    @ObfuscatedName("de.ah(I)B")
    public byte method2458() {
        return (byte) (-this.field2054[++this.field2060 - 1]);
    }

    @ObfuscatedName("de.as(IB)V")
    public void method2459(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) arg0;
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ab(II)V")
    public void method2612(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.bn(II)V")
    public void method2461(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 + 128);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bl(I)I")
    public int method2462() {
        this.field2060 += 2;
        return ((this.field2054[this.field2060 - 1] & 0xFF) << 8) + (this.field2054[this.field2060 - 2] & 0xFF);
    }

    @ObfuscatedName("de.bq(I)I")
    public int method2442() {
        this.field2060 += 2;
        return ((this.field2054[this.field2060 - 2] & 0xFF) << 8) + (this.field2054[this.field2060 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bg(B)I")
    public int method2464() {
        this.field2060 += 2;
        return ((this.field2054[this.field2060 - 1] & 0xFF) << 8) + (this.field2054[this.field2060 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bk(B)I")
    public int method2465() {
        this.field2060 += 2;
        int var1 = ((this.field2054[this.field2060 - 1] & 0xFF) << 8) + (this.field2054[this.field2060 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bz(I)I")
    public int method2451() {
        this.field2060 += 2;
        int var1 = ((this.field2054[this.field2060 - 2] & 0xFF) << 8) + (this.field2054[this.field2060 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bm(I)I")
    public int method2467() {
        this.field2060 += 2;
        int var1 = ((this.field2054[this.field2060 - 1] & 0xFF) << 8) + (this.field2054[this.field2060 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bi(B)I")
    public int method2501() {
        this.field2060 += 3;
        return (this.field2054[this.field2060 - 1] & 0xFF) + ((this.field2054[this.field2060 - 2] & 0xFF) << 16) + ((this.field2054[this.field2060 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("de.bt(II)V")
    public void method2469(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) arg0;
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 16);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("de.bu(II)V")
    public void method2470(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
        this.field2054[++this.field2060 - 1] = (byte) arg0;
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 24);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("de.bc(II)V")
    public void method2471(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 16);
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 24);
        this.field2054[++this.field2060 - 1] = (byte) arg0;
        this.field2054[++this.field2060 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bw(I)I")
    public int method2472() {
        this.field2060 += 4;
        return (this.field2054[this.field2060 - 4] & 0xFF) + ((this.field2054[this.field2060 - 3] & 0xFF) << 8) + ((this.field2054[this.field2060 - 1] & 0xFF) << 24) + ((this.field2054[this.field2060 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("de.br(I)I")
    public int method2473() {
        this.field2060 += 4;
        return (this.field2054[this.field2060 - 3] & 0xFF) + ((this.field2054[this.field2060 - 4] & 0xFF) << 8) + ((this.field2054[this.field2060 - 1] & 0xFF) << 16) + ((this.field2054[this.field2060 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("de.be(B)I")
    public int method2474() {
        this.field2060 += 4;
        return (this.field2054[this.field2060 - 2] & 0xFF) + ((this.field2054[this.field2060 - 1] & 0xFF) << 8) + ((this.field2054[this.field2060 - 4] & 0xFF) << 16) + ((this.field2054[this.field2060 - 3] & 0xFF) << 24);
    }
}
