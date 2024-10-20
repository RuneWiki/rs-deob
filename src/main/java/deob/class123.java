package deob;

import java.math.BigInteger;

@ObfuscatedName("dn")
public class class123 extends class212 {

    @ObfuscatedName("dn.i")
    public byte[] field2049;

    @ObfuscatedName("dn.h")
    public int field2046;

    @ObfuscatedName("dn.e")
    public static int[] field2045 = new int[256];

    @ObfuscatedName("dn.n")
    public static long[] field2047;

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
            field2045[var0] = var1;
        }
        field2047 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2047[var3] = var4;
        }
    }

    @ObfuscatedName("bh.i([BIII)I")
    public static int method1526(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2045[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class123(int arg0) {
        this.field2049 = class125.method2640(arg0);
        this.field2046 = 0;
    }

    public class123(byte[] arg0) {
        this.field2049 = arg0;
        this.field2046 = 0;
    }

    @ObfuscatedName("dn.h(II)V")
    public void method2389(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.e(II)V")
    public void method2561(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2046 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.g(II)V")
    public void method2391(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 16);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2046 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.n(II)V")
    public void method2569(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 24);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 16);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2046 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.u(J)V")
    public void method2393(long arg0) {
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2049[++this.field2046 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dn.d(J)V")
    public void method2538(long arg0) {
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2049[++this.field2046 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2049[++this.field2046 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("o.l(Ljava/lang/String;B)I")
    public static int method538(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dn.m(Ljava/lang/String;B)V")
    public void method2395(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2046 += Statics.method932(arg0, 0, arg0.length(), this.field2049, this.field2046);
        this.field2049[++this.field2046 - 1] = 0;
    }

    @ObfuscatedName("dn.j(Ljava/lang/String;I)V")
    public void method2396(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2049[++this.field2046 - 1] = 0;
        this.field2046 += Statics.method932(arg0, 0, arg0.length(), this.field2049, this.field2046);
        this.field2049[++this.field2046 - 1] = 0;
    }

    @ObfuscatedName("dn.y(Ljava/lang/CharSequence;I)V")
    public void method2397(CharSequence arg0) {
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
        this.field2049[++this.field2046 - 1] = 0;
        this.method2403(var3);
        int var8 = this.field2046;
        byte[] var9 = this.field2049;
        int var10 = this.field2046;
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
        this.field2046 = var15 + var8;
    }

    @ObfuscatedName("dn.s([BIII)V")
    public void method2441(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2049[++this.field2046 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dn.p(IB)V")
    public void method2554(int arg0) {
        this.field2049[this.field2046 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2049[this.field2046 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2049[this.field2046 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2049[this.field2046 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.v(II)V")
    public void method2496(int arg0) {
        this.field2049[this.field2046 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2049[this.field2046 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.r(II)V")
    public void method2423(int arg0) {
        this.field2049[this.field2046 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.c(II)V")
    public void method2402(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2389(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2561(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dn.w(II)V")
    public void method2403(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2389(arg0 >>> 28 | 0x80);
                    }
                    this.method2389(arg0 >>> 21 | 0x80);
                }
                this.method2389(arg0 >>> 14 | 0x80);
            }
            this.method2389(arg0 >>> 7 | 0x80);
        }
        this.method2389(arg0 & 0x7F);
    }

    @ObfuscatedName("dn.x(B)I")
    public int method2404() {
        return this.field2049[++this.field2046 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.k(I)B")
    public byte method2405() {
        return this.field2049[++this.field2046 - 1];
    }

    @ObfuscatedName("dn.z(S)I")
    public int method2406() {
        this.field2046 += 2;
        return ((this.field2049[this.field2046 - 2] & 0xFF) << 8) + (this.field2049[this.field2046 - 1] & 0xFF);
    }

    @ObfuscatedName("dn.q(S)I")
    public int method2407() {
        this.field2046 += 2;
        int var1 = ((this.field2049[this.field2046 - 2] & 0xFF) << 8) + (this.field2049[this.field2046 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.o(I)I")
    public int method2408() {
        this.field2046 += 3;
        return (this.field2049[this.field2046 - 1] & 0xFF) + ((this.field2049[this.field2046 - 3] & 0xFF) << 16) + ((this.field2049[this.field2046 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dn.f(B)I")
    public int method2409() {
        this.field2046 += 4;
        return (this.field2049[this.field2046 - 1] & 0xFF) + ((this.field2049[this.field2046 - 2] & 0xFF) << 8) + ((this.field2049[this.field2046 - 3] & 0xFF) << 16) + ((this.field2049[this.field2046 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dn.b(I)J")
    public long method2426() {
        long var1 = (long) this.method2409() & 0xFFFFFFFFL;
        long var3 = (long) this.method2409() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dn.t(B)Ljava/lang/String;")
    public String method2392() {
        if (this.field2049[this.field2046] == 0) {
            this.field2046++;
            return null;
        } else {
            return this.method2412();
        }
    }

    @ObfuscatedName("dn.a(I)Ljava/lang/String;")
    public String method2412() {
        int var1 = this.field2046;
        while (this.field2049[++this.field2046 - 1] != 0) {
        }
        int var2 = this.field2046 - var1 - 1;
        return var2 == 0 ? "" : class169.method2828(this.field2049, var1, var2);
    }

    @ObfuscatedName("dn.am(I)Ljava/lang/String;")
    public String method2413() {
        byte var1 = this.field2049[++this.field2046 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2046;
        while (this.field2049[++this.field2046 - 1] != 0) {
        }
        int var3 = this.field2046 - var2 - 1;
        return var3 == 0 ? "" : class169.method2828(this.field2049, var2, var3);
    }

    @ObfuscatedName("dn.as(B)Ljava/lang/String;")
    public String method2414() {
        byte var1 = this.field2049[++this.field2046 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2476();
        if (this.field2046 + var2 > this.field2049.length) {
            throw new IllegalStateException("");
        }
        String var3 = class213.method203(this.field2049, this.field2046, var2);
        this.field2046 += var2;
        return var3;
    }

    @ObfuscatedName("dn.ad([BIII)V")
    public void method2415(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2049[++this.field2046 - 1];
        }
    }

    @ObfuscatedName("dn.af(I)I")
    public int method2416() {
        int var1 = this.field2049[this.field2046] & 0xFF;
        return var1 < 128 ? this.method2404() - 64 : this.method2406() - 49152;
    }

    @ObfuscatedName("dn.ak(I)I")
    public int method2433() {
        int var1 = this.field2049[this.field2046] & 0xFF;
        return var1 < 128 ? this.method2404() : this.method2406() - 32768;
    }

    @ObfuscatedName("dn.aq(B)I")
    public int method2418() {
        return this.field2049[this.field2046] < 0 ? this.method2409() & Integer.MAX_VALUE : this.method2406();
    }

    @ObfuscatedName("dn.an(B)I")
    public int method2477() {
        if (this.field2049[this.field2046] < 0) {
            return this.method2409() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2406();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("dn.ag(B)I")
    public int method2476() {
        byte var1 = this.field2049[++this.field2046 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2049[++this.field2046 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dn.al([II)V")
    public void method2578(int[] arg0) {
        int var2 = this.field2046 / 8;
        this.field2046 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2409();
            int var5 = this.method2409();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2046 -= 8;
            this.method2569(var4);
            this.method2569(var5);
        }
    }

    @ObfuscatedName("dn.au([IS)V")
    public void method2422(int[] arg0) {
        int var2 = this.field2046 / 8;
        this.field2046 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2409();
            int var5 = this.method2409();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2046 -= 8;
            this.method2569(var4);
            this.method2569(var5);
        }
    }

    @ObfuscatedName("dn.ar([IIII)V")
    public void method2489(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2046;
        this.field2046 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2409();
            int var8 = this.method2409();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2046 -= 8;
            this.method2569(var7);
            this.method2569(var8);
        }
        this.field2046 = var4;
    }

    @ObfuscatedName("dn.aw([IIII)V")
    public void method2424(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2046;
        this.field2046 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2409();
            int var8 = this.method2409();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2046 -= 8;
            this.method2569(var7);
            this.method2569(var8);
        }
        this.field2046 = var4;
    }

    @ObfuscatedName("dn.ah(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2425(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2046;
        this.field2046 = 0;
        byte[] var4 = new byte[var3];
        this.method2415(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2046 = 0;
        this.method2561(var7.length);
        this.method2441(var7, 0, var7.length);
    }

    @ObfuscatedName("dn.ao(IS)I")
    public int method2438(int arg0) {
        int var2 = method1526(this.field2049, arg0, this.field2046);
        this.method2569(var2);
        return var2;
    }

    @ObfuscatedName("dn.ax(B)Z")
    public boolean method2427() {
        this.field2046 -= 4;
        int var1 = method1526(this.field2049, 0, this.field2046);
        int var2 = this.method2409();
        return var1 == var2;
    }

    @ObfuscatedName("dn.ac(IS)V")
    public void method2428(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dn.ai(II)V")
    public void method2429(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dn.ap(IS)V")
    public void method2526(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dn.aa(I)I")
    public int method2431() {
        return this.field2049[++this.field2046 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dn.ay(I)I")
    public int method2480() {
        return -this.field2049[++this.field2046 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.ab(I)I")
    public int method2513() {
        return 128 - this.field2049[++this.field2046 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.aj(I)B")
    public byte method2599() {
        return (byte) (-this.field2049[++this.field2046 - 1]);
    }

    @ObfuscatedName("dn.az(I)B")
    public byte method2434() {
        return (byte) (128 - this.field2049[++this.field2046 - 1]);
    }

    @ObfuscatedName("dn.av(IB)V")
    public void method2560(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) arg0;
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.ae(II)V")
    public void method2437(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dn.at(II)V")
    public void method2532(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 + 128);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.bc(B)I")
    public int method2388() {
        this.field2046 += 2;
        return ((this.field2049[this.field2046 - 1] & 0xFF) << 8) + (this.field2049[this.field2046 - 2] & 0xFF);
    }

    @ObfuscatedName("dn.bv(B)I")
    public int method2432() {
        this.field2046 += 2;
        return ((this.field2049[this.field2046 - 2] & 0xFF) << 8) + (this.field2049[this.field2046 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dn.bi(I)I")
    public int method2585() {
        this.field2046 += 2;
        return ((this.field2049[this.field2046 - 1] & 0xFF) << 8) + (this.field2049[this.field2046 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dn.by(S)I")
    public int method2442() {
        this.field2046 += 2;
        int var1 = ((this.field2049[this.field2046 - 1] & 0xFF) << 8) + (this.field2049[this.field2046 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.bu(I)I")
    public int method2430() {
        this.field2046 += 2;
        int var1 = ((this.field2049[this.field2046 - 1] & 0xFF) << 8) + (this.field2049[this.field2046 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.bb(II)V")
    public void method2444(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) arg0;
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dn.bx(IB)V")
    public void method2591(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) arg0;
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 16);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dn.ba(II)V")
    public void method2470(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2046 - 1] = (byte) arg0;
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 24);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dn.bq(II)V")
    public void method2516(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 16);
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 24);
        this.field2049[++this.field2046 - 1] = (byte) arg0;
        this.field2049[++this.field2046 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.bs(I)I")
    public int method2575() {
        this.field2046 += 4;
        return (this.field2049[this.field2046 - 4] & 0xFF) + ((this.field2049[this.field2046 - 3] & 0xFF) << 8) + ((this.field2049[this.field2046 - 1] & 0xFF) << 24) + ((this.field2049[this.field2046 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dn.bn(I)I")
    public int method2449() {
        this.field2046 += 4;
        return (this.field2049[this.field2046 - 3] & 0xFF) + ((this.field2049[this.field2046 - 4] & 0xFF) << 8) + ((this.field2049[this.field2046 - 2] & 0xFF) << 24) + ((this.field2049[this.field2046 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dn.bj(I)I")
    public int method2450() {
        this.field2046 += 4;
        return (this.field2049[this.field2046 - 2] & 0xFF) + ((this.field2049[this.field2046 - 1] & 0xFF) << 8) + ((this.field2049[this.field2046 - 4] & 0xFF) << 16) + ((this.field2049[this.field2046 - 3] & 0xFF) << 24);
    }
}
