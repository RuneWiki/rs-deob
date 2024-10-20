package deob;

import java.math.BigInteger;

@ObfuscatedName("dc")
public class class119 extends class208 {

    @ObfuscatedName("dc.n")
    public byte[] field1987;

    @ObfuscatedName("dc.q")
    public int field1982;

    @ObfuscatedName("dc.c")
    public static int[] field1989 = new int[256];

    @ObfuscatedName("dc.r")
    public static long[] field1985;

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
            field1989[var0] = var1;
        }
        field1985 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1985[var3] = var4;
        }
    }

    @ObfuscatedName("k.n([BIII)I")
    public static int method590(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1989[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1987 = class121.method2587(arg0);
        this.field1982 = 0;
    }

    public class119(byte[] arg0) {
        this.field1987 = arg0;
        this.field1982 = 0;
    }

    @ObfuscatedName("dc.q(II)V")
    public void method2345(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.c(IB)V")
    public void method2346(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.l(II)V")
    public void method2347(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.r(II)V")
    public void method2348(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 24);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.u(J)V")
    public void method2349(long arg0) {
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1987[++this.field1982 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dc.j(J)V")
    public void method2350(long arg0) {
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1987[++this.field1982 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1987[++this.field1982 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("az.w(Ljava/lang/String;B)I")
    public static int method763(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dc.y(Ljava/lang/String;B)V")
    public void method2509(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1982 += class165.method3149(arg0, 0, arg0.length(), this.field1987, this.field1982);
        this.field1987[++this.field1982 - 1] = 0;
    }

    @ObfuscatedName("am.o(Ljava/lang/String;I)I")
    public static int method1005(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dc.h(Ljava/lang/String;B)V")
    public void method2446(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1987[++this.field1982 - 1] = 0;
        this.field1982 += class165.method3149(arg0, 0, arg0.length(), this.field1987, this.field1982);
        this.field1987[++this.field1982 - 1] = 0;
    }

    @ObfuscatedName("dc.e(Ljava/lang/CharSequence;S)V")
    public void method2528(CharSequence arg0) {
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
        this.field1987[++this.field1982 - 1] = 0;
        this.method2495(var3);
        int var8 = this.field1982;
        byte[] var9 = this.field1987;
        int var10 = this.field1982;
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
        this.field1982 = var15 + var8;
    }

    @ObfuscatedName("dc.v([BIII)V")
    public void method2355(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1987[++this.field1982 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dc.p(II)V")
    public void method2463(int arg0) {
        this.field1987[this.field1982 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1987[this.field1982 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1987[this.field1982 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1987[this.field1982 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.m(II)V")
    public void method2356(int arg0) {
        this.field1987[this.field1982 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1987[this.field1982 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.b(II)V")
    public void method2527(int arg0) {
        this.field1987[this.field1982 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.s(IB)V")
    public void method2505(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2345(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2346(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.x(IB)V")
    public void method2495(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2345(arg0 >>> 28 | 0x80);
                    }
                    this.method2345(arg0 >>> 21 | 0x80);
                }
                this.method2345(arg0 >>> 14 | 0x80);
            }
            this.method2345(arg0 >>> 7 | 0x80);
        }
        this.method2345(arg0 & 0x7F);
    }

    @ObfuscatedName("dc.z(I)I")
    public int method2360() {
        return this.field1987[++this.field1982 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.d(B)B")
    public byte method2512() {
        return this.field1987[++this.field1982 - 1];
    }

    @ObfuscatedName("dc.a(I)I")
    public int method2430() {
        this.field1982 += 2;
        return ((this.field1987[this.field1982 - 2] & 0xFF) << 8) + (this.field1987[this.field1982 - 1] & 0xFF);
    }

    @ObfuscatedName("dc.t(I)I")
    public int method2449() {
        this.field1982 += 2;
        int var1 = ((this.field1987[this.field1982 - 2] & 0xFF) << 8) + (this.field1987[this.field1982 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.k(B)I")
    public int method2364() {
        this.field1982 += 3;
        return (this.field1987[this.field1982 - 1] & 0xFF) + ((this.field1987[this.field1982 - 2] & 0xFF) << 8) + ((this.field1987[this.field1982 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.f(I)I")
    public int method2365() {
        this.field1982 += 4;
        return (this.field1987[this.field1982 - 1] & 0xFF) + ((this.field1987[this.field1982 - 2] & 0xFF) << 8) + ((this.field1987[this.field1982 - 3] & 0xFF) << 16) + ((this.field1987[this.field1982 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.g(B)J")
    public long method2423() {
        long var1 = (long) this.method2365() & 0xFFFFFFFFL;
        long var3 = (long) this.method2365() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dc.i(I)Ljava/lang/String;")
    public String method2367() {
        if (this.field1987[this.field1982] == 0) {
            this.field1982++;
            return null;
        } else {
            return this.method2368();
        }
    }

    @ObfuscatedName("dc.ah(I)Ljava/lang/String;")
    public String method2368() {
        int var1 = this.field1982;
        while (this.field1987[++this.field1982 - 1] != 0) {
        }
        int var2 = this.field1982 - var1 - 1;
        return var2 == 0 ? "" : class165.method2069(this.field1987, var1, var2);
    }

    @ObfuscatedName("dc.ag(I)Ljava/lang/String;")
    public String method2428() {
        byte var1 = this.field1987[++this.field1982 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1982;
        while (this.field1987[++this.field1982 - 1] != 0) {
        }
        int var3 = this.field1982 - var2 - 1;
        return var3 == 0 ? "" : class165.method2069(this.field1987, var2, var3);
    }

    @ObfuscatedName("dc.ac(B)Ljava/lang/String;")
    public String method2379() {
        byte var1 = this.field1987[++this.field1982 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2468();
        if (this.field1982 + var2 > this.field1987.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1987;
        int var4 = this.field1982;
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
        this.field1982 += var2;
        return var12;
    }

    @ObfuscatedName("dc.al([BIIB)V")
    public void method2371(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1987[++this.field1982 - 1];
        }
    }

    @ObfuscatedName("dc.aj(B)I")
    public int method2489() {
        int var1 = this.field1987[this.field1982] & 0xFF;
        return var1 < 128 ? this.method2360() - 64 : this.method2430() - 49152;
    }

    @ObfuscatedName("dc.at(B)I")
    public int method2373() {
        int var1 = this.field1987[this.field1982] & 0xFF;
        return var1 < 128 ? this.method2360() : this.method2430() - 32768;
    }

    @ObfuscatedName("dc.ap(I)I")
    public int method2374() {
        return this.field1987[this.field1982] < 0 ? this.method2365() & Integer.MAX_VALUE : this.method2430();
    }

    @ObfuscatedName("dc.aa(B)I")
    public int method2468() {
        byte var1 = this.field1987[++this.field1982 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1987[++this.field1982 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dc.ak([IB)V")
    public void method2376(int[] arg0) {
        int var2 = this.field1982 / 8;
        this.field1982 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2365();
            int var5 = this.method2365();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1982 -= 8;
            this.method2348(var4);
            this.method2348(var5);
        }
    }

    @ObfuscatedName("dc.an([II)V")
    public void method2377(int[] arg0) {
        int var2 = this.field1982 / 8;
        this.field1982 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2365();
            int var5 = this.method2365();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1982 -= 8;
            this.method2348(var4);
            this.method2348(var5);
        }
    }

    @ObfuscatedName("dc.au([IIII)V")
    public void method2378(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1982;
        this.field1982 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2365();
            int var8 = this.method2365();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1982 -= 8;
            this.method2348(var7);
            this.method2348(var8);
        }
        this.field1982 = var4;
    }

    @ObfuscatedName("dc.ai([IIII)V")
    public void method2429(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1982;
        this.field1982 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2365();
            int var8 = this.method2365();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1982 -= 8;
            this.method2348(var7);
            this.method2348(var8);
        }
        this.field1982 = var4;
    }

    @ObfuscatedName("dc.az(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2380(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1982;
        this.field1982 = 0;
        byte[] var4 = new byte[var3];
        this.method2371(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1982 = 0;
        this.method2346(var7.length);
        this.method2355(var7, 0, var7.length);
    }

    @ObfuscatedName("dc.ao(IB)I")
    public int method2466(int arg0) {
        int var2 = method590(this.field1987, arg0, this.field1982);
        this.method2348(var2);
        return var2;
    }

    @ObfuscatedName("dc.av(B)Z")
    public boolean method2375() {
        this.field1982 -= 4;
        int var1 = method590(this.field1987, 0, this.field1982);
        int var2 = this.method2365();
        return var1 == var2;
    }

    @ObfuscatedName("dc.ad(IB)V")
    public void method2383(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.af(II)V")
    public void method2384(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dc.ax(IS)V")
    public void method2385(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dc.ae(I)I")
    public int method2431() {
        return this.field1987[++this.field1982 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dc.aw(I)I")
    public int method2389() {
        return -this.field1987[++this.field1982 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.ay(I)I")
    public int method2533() {
        return 128 - this.field1987[++this.field1982 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.ab(I)B")
    public byte method2400() {
        return (byte) (this.field1987[++this.field1982 - 1] - 128);
    }

    @ObfuscatedName("dc.ar(I)B")
    public byte method2473() {
        return (byte) (128 - this.field1987[++this.field1982 - 1]);
    }

    @ObfuscatedName("dc.am(II)V")
    public void method2391(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) arg0;
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.aq(II)V")
    public void method2392(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.as(II)V")
    public void method2393(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 + 128);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bn(I)I")
    public int method2394() {
        this.field1982 += 2;
        return ((this.field1987[this.field1982 - 1] & 0xFF) << 8) + (this.field1987[this.field1982 - 2] & 0xFF);
    }

    @ObfuscatedName("dc.bd(B)I")
    public int method2344() {
        this.field1982 += 2;
        return ((this.field1987[this.field1982 - 2] & 0xFF) << 8) + (this.field1987[this.field1982 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bt(B)I")
    public int method2351() {
        this.field1982 += 2;
        return ((this.field1987[this.field1982 - 1] & 0xFF) << 8) + (this.field1987[this.field1982 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bh(I)I")
    public int method2397() {
        this.field1982 += 2;
        int var1 = ((this.field1987[this.field1982 - 1] & 0xFF) << 8) + (this.field1987[this.field1982 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.ba(B)I")
    public int method2398() {
        this.field1982 += 2;
        int var1 = ((this.field1987[this.field1982 - 1] & 0xFF) << 8) + (this.field1987[this.field1982 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bc(II)V")
    public void method2399(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.bw(I)I")
    public int method2437() {
        this.field1982 += 3;
        return (this.field1987[this.field1982 - 1] & 0xFF) + ((this.field1987[this.field1982 - 2] & 0xFF) << 16) + ((this.field1987[this.field1982 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dc.bg(IB)V")
    public void method2401(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) arg0;
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dc.bo(II)V")
    public void method2402(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1982 - 1] = (byte) arg0;
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 24);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dc.bl(II)V")
    public void method2403(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 24);
        this.field1987[++this.field1982 - 1] = (byte) arg0;
        this.field1987[++this.field1982 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bk(B)I")
    public int method2482() {
        this.field1982 += 4;
        return (this.field1987[this.field1982 - 4] & 0xFF) + ((this.field1987[this.field1982 - 3] & 0xFF) << 8) + ((this.field1987[this.field1982 - 2] & 0xFF) << 16) + ((this.field1987[this.field1982 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bs(I)I")
    public int method2405() {
        this.field1982 += 4;
        return (this.field1987[this.field1982 - 3] & 0xFF) + ((this.field1987[this.field1982 - 4] & 0xFF) << 8) + ((this.field1987[this.field1982 - 1] & 0xFF) << 16) + ((this.field1987[this.field1982 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.br(I)I")
    public int method2407() {
        this.field1982 += 4;
        return (this.field1987[this.field1982 - 2] & 0xFF) + ((this.field1987[this.field1982 - 1] & 0xFF) << 8) + ((this.field1987[this.field1982 - 3] & 0xFF) << 24) + ((this.field1987[this.field1982 - 4] & 0xFF) << 16);
    }
}
