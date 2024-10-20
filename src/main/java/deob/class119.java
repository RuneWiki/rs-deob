package deob;

import java.math.BigInteger;

@ObfuscatedName("dl")
public class class119 extends class208 {

    @ObfuscatedName("dl.l")
    public byte[] field1986;

    @ObfuscatedName("dl.e")
    public int field1988;

    @ObfuscatedName("dl.q")
    public static int[] field1990 = new int[256];

    @ObfuscatedName("dl.g")
    public static long[] field1993;

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
            field1990[var0] = var1;
        }
        field1993 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1993[var3] = var4;
        }
    }

    @ObfuscatedName("ad.l([BIIB)I")
    public static int method642(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1990[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cd.e([BIB)I")
    public static int method1789(byte[] arg0, int arg1) {
        return method642(arg0, 0, arg1);
    }

    public class119(int arg0) {
        this.field1986 = class121.method2616(arg0);
        this.field1988 = 0;
    }

    public class119(byte[] arg0) {
        this.field1986 = arg0;
        this.field1988 = 0;
    }

    @ObfuscatedName("dl.q(II)V")
    public void method2503(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.o(II)V")
    public void method2374(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1988 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.g(II)V")
    public void method2507(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1988 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.m(IB)V")
    public void method2376(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 24);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1988 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.b(J)V")
    public void method2377(long arg0) {
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1986[++this.field1988 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dl.p(J)V")
    public void method2378(long arg0) {
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1986[++this.field1988 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1986[++this.field1988 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("v.t(Ljava/lang/String;B)I")
    public static int method156(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dl.w(Ljava/lang/String;I)V")
    public void method2379(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1988 += class165.method936(arg0, 0, arg0.length(), this.field1986, this.field1988);
        this.field1986[++this.field1988 - 1] = 0;
    }

    @ObfuscatedName("ab.x(Ljava/lang/String;I)I")
    public static int method792(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dl.k(Ljava/lang/String;I)V")
    public void method2492(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1986[++this.field1988 - 1] = 0;
        this.field1988 += class165.method936(arg0, 0, arg0.length(), this.field1986, this.field1988);
        this.field1986[++this.field1988 - 1] = 0;
    }

    @ObfuscatedName("dl.z(Ljava/lang/CharSequence;I)V")
    public void method2495(CharSequence arg0) {
        int var2 = class209.method2959(arg0);
        this.field1986[++this.field1988 - 1] = 0;
        this.method2387(var2);
        int var3 = this.field1988;
        byte[] var4 = this.field1986;
        int var5 = this.field1988;
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
        this.field1988 = var10 + var3;
    }

    @ObfuscatedName("dl.v([BIIB)V")
    public void method2420(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1986[++this.field1988 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dl.j(II)V")
    public void method2383(int arg0) {
        this.field1986[this.field1988 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1986[this.field1988 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1986[this.field1988 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1986[this.field1988 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.f(IS)V")
    public void method2384(int arg0) {
        this.field1986[this.field1988 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1986[this.field1988 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.c(IB)V")
    public void method2385(int arg0) {
        this.field1986[this.field1988 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.s(II)V")
    public void method2386(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2503(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2374(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.r(II)V")
    public void method2387(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2503(arg0 >>> 28 | 0x80);
                    }
                    this.method2503(arg0 >>> 21 | 0x80);
                }
                this.method2503(arg0 >>> 14 | 0x80);
            }
            this.method2503(arg0 >>> 7 | 0x80);
        }
        this.method2503(arg0 & 0x7F);
    }

    @ObfuscatedName("dl.u(I)I")
    public int method2388() {
        return this.field1986[++this.field1988 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.a(I)B")
    public byte method2389() {
        return this.field1986[++this.field1988 - 1];
    }

    @ObfuscatedName("dl.h(I)I")
    public int method2440() {
        this.field1988 += 2;
        return ((this.field1986[this.field1988 - 2] & 0xFF) << 8) + (this.field1986[this.field1988 - 1] & 0xFF);
    }

    @ObfuscatedName("dl.y(I)I")
    public int method2391() {
        this.field1988 += 2;
        int var1 = ((this.field1986[this.field1988 - 2] & 0xFF) << 8) + (this.field1986[this.field1988 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.d(I)I")
    public int method2460() {
        this.field1988 += 3;
        return (this.field1986[this.field1988 - 1] & 0xFF) + ((this.field1986[this.field1988 - 2] & 0xFF) << 8) + ((this.field1986[this.field1988 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.n(B)I")
    public int method2393() {
        this.field1988 += 4;
        return (this.field1986[this.field1988 - 1] & 0xFF) + ((this.field1986[this.field1988 - 2] & 0xFF) << 8) + ((this.field1986[this.field1988 - 3] & 0xFF) << 16) + ((this.field1986[this.field1988 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.i(B)J")
    public long method2394() {
        long var1 = (long) this.method2393() & 0xFFFFFFFFL;
        long var3 = (long) this.method2393() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dl.ad(I)Ljava/lang/String;")
    public String method2395() {
        if (this.field1986[this.field1988] == 0) {
            this.field1988++;
            return null;
        } else {
            return this.method2396();
        }
    }

    @ObfuscatedName("dl.aq(B)Ljava/lang/String;")
    public String method2396() {
        int var1 = this.field1988;
        while (this.field1986[++this.field1988 - 1] != 0) {
        }
        int var2 = this.field1988 - var1 - 1;
        return var2 == 0 ? "" : class165.method2928(this.field1986, var1, var2);
    }

    @ObfuscatedName("dl.ak(I)Ljava/lang/String;")
    public String method2535() {
        byte var1 = this.field1986[++this.field1988 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1988;
        while (this.field1986[++this.field1988 - 1] != 0) {
        }
        int var3 = this.field1988 - var2 - 1;
        return var3 == 0 ? "" : class165.method2928(this.field1986, var2, var3);
    }

    @ObfuscatedName("dl.au(I)Ljava/lang/String;")
    public String method2462() {
        byte var1 = this.field1986[++this.field1988 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2403();
        if (this.field1988 + var2 > this.field1986.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1986;
        int var4 = this.field1988;
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
        this.field1988 += var2;
        return var12;
    }

    @ObfuscatedName("dl.ao([BIIB)V")
    public void method2399(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1986[++this.field1988 - 1];
        }
    }

    @ObfuscatedName("dl.am(I)I")
    public int method2458() {
        int var1 = this.field1986[this.field1988] & 0xFF;
        return var1 < 128 ? this.method2388() - 64 : this.method2440() - 49152;
    }

    @ObfuscatedName("dl.ah(B)I")
    public int method2452() {
        int var1 = this.field1986[this.field1988] & 0xFF;
        return var1 < 128 ? this.method2388() : this.method2440() - 32768;
    }

    @ObfuscatedName("dl.aj(I)I")
    public int method2402() {
        return this.field1986[this.field1988] < 0 ? this.method2393() & Integer.MAX_VALUE : this.method2440();
    }

    @ObfuscatedName("dl.ar(I)I")
    public int method2403() {
        byte var1 = this.field1986[++this.field1988 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1986[++this.field1988 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dl.ae([IB)V")
    public void method2457(int[] arg0) {
        int var2 = this.field1988 / 8;
        this.field1988 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2393();
            int var5 = this.method2393();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1988 -= 8;
            this.method2376(var4);
            this.method2376(var5);
        }
    }

    @ObfuscatedName("dl.al([II)V")
    public void method2405(int[] arg0) {
        int var2 = this.field1988 / 8;
        this.field1988 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2393();
            int var5 = this.method2393();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1988 -= 8;
            this.method2376(var4);
            this.method2376(var5);
        }
    }

    @ObfuscatedName("dl.ay([IIII)V")
    public void method2406(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1988;
        this.field1988 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2393();
            int var8 = this.method2393();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1988 -= 8;
            this.method2376(var7);
            this.method2376(var8);
        }
        this.field1988 = var4;
    }

    @ObfuscatedName("dl.ag([IIIB)V")
    public void method2407(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1988;
        this.field1988 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2393();
            int var8 = this.method2393();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1988 -= 8;
            this.method2376(var7);
            this.method2376(var8);
        }
        this.field1988 = var4;
    }

    @ObfuscatedName("dl.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2408(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1988;
        this.field1988 = 0;
        byte[] var4 = new byte[var3];
        this.method2399(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1988 = 0;
        this.method2374(var7.length);
        this.method2420(var7, 0, var7.length);
    }

    @ObfuscatedName("dl.ac(II)I")
    public int method2428(int arg0) {
        int var2 = method642(this.field1986, arg0, this.field1988);
        this.method2376(var2);
        return var2;
    }

    @ObfuscatedName("dl.az(I)Z")
    public boolean method2410() {
        this.field1988 -= 4;
        int var1 = method642(this.field1986, 0, this.field1988);
        int var2 = this.method2393();
        return var1 == var2;
    }

    @ObfuscatedName("dl.as(IB)V")
    public void method2451(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.ai(IB)V")
    public void method2511(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dl.an(II)V")
    public void method2413(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dl.ap(B)I")
    public int method2513() {
        return this.field1986[++this.field1988 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dl.aa(I)I")
    public int method2415() {
        return -this.field1986[++this.field1988 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.ax(I)I")
    public int method2550() {
        return 128 - this.field1986[++this.field1988 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.av(I)B")
    public byte method2417() {
        return (byte) (this.field1986[++this.field1988 - 1] - 128);
    }

    @ObfuscatedName("dl.at(B)B")
    public byte method2418() {
        return (byte) (-this.field1986[++this.field1988 - 1]);
    }

    @ObfuscatedName("dl.aw(I)B")
    public byte method2546() {
        return (byte) (128 - this.field1986[++this.field1988 - 1]);
    }

    @ObfuscatedName("dl.af(II)V")
    public void method2401(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) arg0;
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bz(II)V")
    public void method2431(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.bb(II)V")
    public void method2422(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 + 128);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bf(I)I")
    public int method2390() {
        this.field1988 += 2;
        return ((this.field1986[this.field1988 - 1] & 0xFF) << 8) + (this.field1986[this.field1988 - 2] & 0xFF);
    }

    @ObfuscatedName("dl.bv(B)I")
    public int method2424() {
        this.field1988 += 2;
        return ((this.field1986[this.field1988 - 2] & 0xFF) << 8) + (this.field1986[this.field1988 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bs(I)I")
    public int method2425() {
        this.field1988 += 2;
        return ((this.field1986[this.field1988 - 1] & 0xFF) << 8) + (this.field1986[this.field1988 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.br(I)I")
    public int method2426() {
        this.field1988 += 2;
        int var1 = ((this.field1986[this.field1988 - 2] & 0xFF) << 8) + (this.field1986[this.field1988 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.bu(I)I")
    public int method2560() {
        this.field1988 += 3;
        return (this.field1986[this.field1988 - 3] & 0xFF) + ((this.field1986[this.field1988 - 1] & 0xFF) << 16) + ((this.field1986[this.field1988 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dl.bk(II)V")
    public void method2380(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) arg0;
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dl.bc(IB)V")
    public void method2429(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1988 - 1] = (byte) arg0;
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 24);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dl.bn(II)V")
    public void method2430(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 24);
        this.field1986[++this.field1988 - 1] = (byte) arg0;
        this.field1986[++this.field1988 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bl(I)I")
    public int method2500() {
        this.field1988 += 4;
        return (this.field1986[this.field1988 - 4] & 0xFF) + ((this.field1986[this.field1988 - 3] & 0xFF) << 8) + ((this.field1986[this.field1988 - 1] & 0xFF) << 24) + ((this.field1986[this.field1988 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.by(B)I")
    public int method2432() {
        this.field1988 += 4;
        return (this.field1986[this.field1988 - 3] & 0xFF) + ((this.field1986[this.field1988 - 4] & 0xFF) << 8) + ((this.field1986[this.field1988 - 1] & 0xFF) << 16) + ((this.field1986[this.field1988 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.bh(B)I")
    public int method2504() {
        this.field1988 += 4;
        return (this.field1986[this.field1988 - 2] & 0xFF) + ((this.field1986[this.field1988 - 1] & 0xFF) << 8) + ((this.field1986[this.field1988 - 4] & 0xFF) << 16) + ((this.field1986[this.field1988 - 3] & 0xFF) << 24);
    }
}
