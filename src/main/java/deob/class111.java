package deob;

import java.math.BigInteger;

@ObfuscatedName("dk")
public class class111 extends class199 {

    @ObfuscatedName("dk.o")
    public byte[] field1860;

    @ObfuscatedName("dk.l")
    public int field1861;

    @ObfuscatedName("dk.g")
    public static int[] field1858 = new int[256];

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
            field1858[var0] = var1;
        }
    }

    @ObfuscatedName("bq.o([BIII)I")
    public static int method1401(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1858[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("x.l([BIB)I")
    public static int method173(byte[] arg0, int arg1) {
        return method1401(arg0, 0, arg1);
    }

    public class111(int arg0) {
        this.field1860 = class113.method2473(arg0);
        this.field1861 = 0;
    }

    public class111(byte[] arg0) {
        this.field1860 = arg0;
        this.field1861 = 0;
    }

    @ObfuscatedName("dk.g(II)V")
    public void method2204(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.u(II)V")
    public void method2205(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1860[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.q(IB)V")
    public void method2206(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1860[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.r(IB)V")
    public void method2369(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 24);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1860[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.v(J)V")
    public void method2431(long arg0) {
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1860[++this.field1861 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dk.y(J)V")
    public void method2209(long arg0) {
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1860[++this.field1861 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1860[++this.field1861 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dm.k(Ljava/lang/String;I)I")
    public static int method2151(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dk.c(Ljava/lang/String;B)V")
    public void method2269(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1861 += class156.method1933(arg0, 0, arg0.length(), this.field1860, this.field1861);
        this.field1860[++this.field1861 - 1] = 0;
    }

    @ObfuscatedName("dk.j(Ljava/lang/String;I)V")
    public void method2211(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1860[++this.field1861 - 1] = 0;
        this.field1861 += class156.method1933(arg0, 0, arg0.length(), this.field1860, this.field1861);
        this.field1860[++this.field1861 - 1] = 0;
    }

    @ObfuscatedName("dk.m(Ljava/lang/CharSequence;I)V")
    public void method2399(CharSequence arg0) {
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
        this.field1860[++this.field1861 - 1] = 0;
        this.method2301(var3);
        int var8 = this.field1861;
        byte[] var9 = this.field1860;
        int var10 = this.field1861;
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
        this.field1861 = var15 + var8;
    }

    @ObfuscatedName("dk.a([BIII)V")
    public void method2213(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1860[++this.field1861 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dk.f(II)V")
    public void method2214(int arg0) {
        this.field1860[this.field1861 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1860[this.field1861 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1860[this.field1861 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1860[this.field1861 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.i(II)V")
    public void method2396(int arg0) {
        this.field1860[this.field1861 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1860[this.field1861 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.n(II)V")
    public void method2203(int arg0) {
        this.field1860[this.field1861 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.x(II)V")
    public void method2268(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2204(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2205(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dk.h(II)V")
    public void method2301(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2204(arg0 >>> 28 | 0x80);
                    }
                    this.method2204(arg0 >>> 21 | 0x80);
                }
                this.method2204(arg0 >>> 14 | 0x80);
            }
            this.method2204(arg0 >>> 7 | 0x80);
        }
        this.method2204(arg0 & 0x7F);
    }

    @ObfuscatedName("dk.t(I)I")
    public int method2219() {
        return this.field1860[++this.field1861 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.w(B)B")
    public byte method2220() {
        return this.field1860[++this.field1861 - 1];
    }

    @ObfuscatedName("dk.p(B)I")
    public int method2397() {
        this.field1861 += 2;
        return ((this.field1860[this.field1861 - 2] & 0xFF) << 8) + (this.field1860[this.field1861 - 1] & 0xFF);
    }

    @ObfuscatedName("dk.z(I)I")
    public int method2222() {
        this.field1861 += 2;
        int var1 = ((this.field1860[this.field1861 - 2] & 0xFF) << 8) + (this.field1860[this.field1861 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.s(I)I")
    public int method2258() {
        this.field1861 += 3;
        return (this.field1860[this.field1861 - 1] & 0xFF) + ((this.field1860[this.field1861 - 2] & 0xFF) << 8) + ((this.field1860[this.field1861 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.d(I)I")
    public int method2273() {
        this.field1861 += 4;
        return (this.field1860[this.field1861 - 1] & 0xFF) + ((this.field1860[this.field1861 - 2] & 0xFF) << 8) + ((this.field1860[this.field1861 - 3] & 0xFF) << 16) + ((this.field1860[this.field1861 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.b(I)J")
    public long method2292() {
        long var1 = (long) this.method2273() & 0xFFFFFFFFL;
        long var3 = (long) this.method2273() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dk.e(B)Ljava/lang/String;")
    public String method2226() {
        if (this.field1860[this.field1861] == 0) {
            this.field1861++;
            return null;
        } else {
            return this.method2339();
        }
    }

    @ObfuscatedName("dk.ar(B)Ljava/lang/String;")
    public String method2339() {
        int var1 = this.field1861;
        while (this.field1860[++this.field1861 - 1] != 0) {
        }
        int var2 = this.field1861 - var1 - 1;
        return var2 == 0 ? "" : class156.method2161(this.field1860, var1, var2);
    }

    @ObfuscatedName("dk.av(B)Ljava/lang/String;")
    public String method2371() {
        byte var1 = this.field1860[++this.field1861 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1861;
        while (this.field1860[++this.field1861 - 1] != 0) {
        }
        int var3 = this.field1861 - var2 - 1;
        return var3 == 0 ? "" : class156.method2161(this.field1860, var2, var3);
    }

    @ObfuscatedName("dk.ae(B)Ljava/lang/String;")
    public String method2224() {
        byte var1 = this.field1860[++this.field1861 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2234();
        if (this.field1861 + var2 > this.field1860.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1860;
        int var4 = this.field1861;
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
        this.field1861 += var2;
        return var12;
    }

    @ObfuscatedName("dk.aq([BIIB)V")
    public void method2230(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1860[++this.field1861 - 1];
        }
    }

    @ObfuscatedName("dk.ay(I)I")
    public int method2231() {
        int var1 = this.field1860[this.field1861] & 0xFF;
        return var1 < 128 ? this.method2219() - 64 : this.method2397() - 49152;
    }

    @ObfuscatedName("dk.ac(B)I")
    public int method2368() {
        int var1 = this.field1860[this.field1861] & 0xFF;
        return var1 < 128 ? this.method2219() : this.method2397() - 32768;
    }

    @ObfuscatedName("dk.ao(I)I")
    public int method2233() {
        return this.field1860[this.field1861] < 0 ? this.method2273() & Integer.MAX_VALUE : this.method2397();
    }

    @ObfuscatedName("dk.ab(B)I")
    public int method2234() {
        byte var1 = this.field1860[++this.field1861 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1860[++this.field1861 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dk.at([II)V")
    public void method2235(int[] arg0) {
        int var2 = this.field1861 / 8;
        this.field1861 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2273();
            int var5 = this.method2273();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1861 -= 8;
            this.method2369(var4);
            this.method2369(var5);
        }
    }

    @ObfuscatedName("dk.ai([II)V")
    public void method2236(int[] arg0) {
        int var2 = this.field1861 / 8;
        this.field1861 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2273();
            int var5 = this.method2273();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1861 -= 8;
            this.method2369(var4);
            this.method2369(var5);
        }
    }

    @ObfuscatedName("dk.aa([IIII)V")
    public void method2237(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1861;
        this.field1861 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2273();
            int var8 = this.method2273();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1861 -= 8;
            this.method2369(var7);
            this.method2369(var8);
        }
        this.field1861 = var4;
    }

    @ObfuscatedName("dk.ap([IIII)V")
    public void method2238(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1861;
        this.field1861 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2273();
            int var8 = this.method2273();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1861 -= 8;
            this.method2369(var7);
            this.method2369(var8);
        }
        this.field1861 = var4;
    }

    @ObfuscatedName("dk.ad(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2239(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1861;
        this.field1861 = 0;
        byte[] var4 = new byte[var3];
        this.method2230(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1861 = 0;
        this.method2205(var7.length);
        this.method2213(var7, 0, var7.length);
    }

    @ObfuscatedName("dk.aw(II)I")
    public int method2240(int arg0) {
        int var2 = method1401(this.field1860, arg0, this.field1861);
        this.method2369(var2);
        return var2;
    }

    @ObfuscatedName("dk.ax(I)Z")
    public boolean method2241() {
        this.field1861 -= 4;
        int var1 = method1401(this.field1860, 0, this.field1861);
        int var2 = this.method2273();
        return var1 == var2;
    }

    @ObfuscatedName("dk.az(II)V")
    public void method2324(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.af(II)V")
    public void method2346(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dk.al(II)V")
    public void method2244(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dk.ak(B)I")
    public int method2245() {
        return this.field1860[++this.field1861 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dk.as(I)I")
    public int method2246() {
        return -this.field1860[++this.field1861 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.ag(I)I")
    public int method2247() {
        return 128 - this.field1860[++this.field1861 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.an(I)B")
    public byte method2208() {
        return (byte) (this.field1860[++this.field1861 - 1] - 128);
    }

    @ObfuscatedName("dk.au(I)B")
    public byte method2249() {
        return (byte) (-this.field1860[++this.field1861 - 1]);
    }

    @ObfuscatedName("dk.am(B)B")
    public byte method2250() {
        return (byte) (128 - this.field1860[++this.field1861 - 1]);
    }

    @ObfuscatedName("dk.aj(IB)V")
    public void method2251(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) arg0;
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.ah(IB)V")
    public void method2252(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.ba(II)V")
    public void method2424(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 + 128);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.bm(B)I")
    public int method2254() {
        this.field1861 += 2;
        return ((this.field1860[this.field1861 - 1] & 0xFF) << 8) + (this.field1860[this.field1861 - 2] & 0xFF);
    }

    @ObfuscatedName("dk.bx(I)I")
    public int method2255() {
        this.field1861 += 2;
        return ((this.field1860[this.field1861 - 2] & 0xFF) << 8) + (this.field1860[this.field1861 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.bb(I)I")
    public int method2256() {
        this.field1861 += 2;
        return ((this.field1860[this.field1861 - 1] & 0xFF) << 8) + (this.field1860[this.field1861 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.bd(S)I")
    public int method2385() {
        this.field1861 += 2;
        int var1 = ((this.field1860[this.field1861 - 1] & 0xFF) << 8) + (this.field1860[this.field1861 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.bz(S)I")
    public int method2352() {
        this.field1861 += 2;
        int var1 = ((this.field1860[this.field1861 - 2] & 0xFF) << 8) + (this.field1860[this.field1861 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.br(I)I")
    public int method2259() {
        this.field1861 += 2;
        int var1 = ((this.field1860[this.field1861 - 1] & 0xFF) << 8) + (this.field1860[this.field1861 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.bl(B)I")
    public int method2260() {
        this.field1861 += 3;
        return (this.field1860[this.field1861 - 1] & 0xFF) + ((this.field1860[this.field1861 - 3] & 0xFF) << 8) + ((this.field1860[this.field1861 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.bf(II)V")
    public void method2261(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) arg0;
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dk.bo(II)V")
    public void method2266(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1860[++this.field1861 - 1] = (byte) arg0;
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 24);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dk.bv(II)V")
    public void method2314(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 24);
        this.field1860[++this.field1861 - 1] = (byte) arg0;
        this.field1860[++this.field1861 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.bh(I)I")
    public int method2366() {
        this.field1861 += 4;
        return (this.field1860[this.field1861 - 4] & 0xFF) + ((this.field1860[this.field1861 - 3] & 0xFF) << 8) + ((this.field1860[this.field1861 - 2] & 0xFF) << 16) + ((this.field1860[this.field1861 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.bg(I)I")
    public int method2265() {
        this.field1861 += 4;
        return (this.field1860[this.field1861 - 3] & 0xFF) + ((this.field1860[this.field1861 - 4] & 0xFF) << 8) + ((this.field1860[this.field1861 - 1] & 0xFF) << 16) + ((this.field1860[this.field1861 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.bn(B)I")
    public int method2367() {
        this.field1861 += 4;
        return (this.field1860[this.field1861 - 2] & 0xFF) + ((this.field1860[this.field1861 - 1] & 0xFF) << 8) + ((this.field1860[this.field1861 - 4] & 0xFF) << 16) + ((this.field1860[this.field1861 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.bi([BIII)V")
    public void method2267(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1860[++this.field1861 - 1] - 128);
        }
    }
}
