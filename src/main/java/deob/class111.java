package deob;

import java.math.BigInteger;

@ObfuscatedName("dp")
public class class111 extends class199 {

    @ObfuscatedName("dp.n")
    public byte[] field1904;

    @ObfuscatedName("dp.g")
    public int field1896;

    @ObfuscatedName("dp.a")
    public static int[] field1898 = new int[256];

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
            field1898[var0] = var1;
        }
    }

    @ObfuscatedName("k.n([BIIB)I")
    public static int method128(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1898[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class111(int arg0) {
        this.field1904 = class113.method2439(arg0);
        this.field1896 = 0;
    }

    public class111(byte[] arg0) {
        this.field1904 = arg0;
        this.field1896 = 0;
    }

    @ObfuscatedName("dp.g(II)V")
    public void method2326(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.a(IB)V")
    public void method2202(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
        this.field1904[++this.field1896 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.m(II)V")
    public void method2323(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 16);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
        this.field1904[++this.field1896 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.s(IB)V")
    public void method2204(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 24);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 16);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
        this.field1904[++this.field1896 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.j(J)V")
    public void method2205(long arg0) {
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1904[++this.field1896 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dp.f(J)V")
    public void method2400(long arg0) {
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1904[++this.field1896 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1904[++this.field1896 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("eb.b(Ljava/lang/String;S)I")
    public static int method2667(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dp.t(Ljava/lang/String;I)V")
    public void method2362(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1896 += class156.method2442(arg0, 0, arg0.length(), this.field1904, this.field1896);
        this.field1904[++this.field1896 - 1] = 0;
    }

    @ObfuscatedName("dp.i(Ljava/lang/String;B)V")
    public void method2208(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1904[++this.field1896 - 1] = 0;
        this.field1896 += class156.method2442(arg0, 0, arg0.length(), this.field1904, this.field1896);
        this.field1904[++this.field1896 - 1] = 0;
    }

    @ObfuscatedName("dp.c(Ljava/lang/CharSequence;I)V")
    public void method2337(CharSequence arg0) {
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
        this.field1904[++this.field1896 - 1] = 0;
        this.method2215(var3);
        int var8 = this.field1896;
        byte[] var9 = this.field1904;
        int var10 = this.field1896;
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
        this.field1896 = var15 + var8;
    }

    @ObfuscatedName("dp.k([BIII)V")
    public void method2248(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1904[++this.field1896 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dp.x(II)V")
    public void method2333(int arg0) {
        this.field1904[this.field1896 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1904[this.field1896 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1904[this.field1896 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1904[this.field1896 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.e(II)V")
    public void method2212(int arg0) {
        this.field1904[this.field1896 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1904[this.field1896 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.q(II)V")
    public void method2294(int arg0) {
        this.field1904[this.field1896 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.o(II)V")
    public void method2236(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2326(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2202(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.r(IB)V")
    public void method2215(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2326(arg0 >>> 28 | 0x80);
                    }
                    this.method2326(arg0 >>> 21 | 0x80);
                }
                this.method2326(arg0 >>> 14 | 0x80);
            }
            this.method2326(arg0 >>> 7 | 0x80);
        }
        this.method2326(arg0 & 0x7F);
    }

    @ObfuscatedName("dp.v(B)I")
    public int method2211() {
        return this.field1904[++this.field1896 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.h(I)B")
    public byte method2217() {
        return this.field1904[++this.field1896 - 1];
    }

    @ObfuscatedName("dp.p(I)I")
    public int method2395() {
        this.field1896 += 2;
        return ((this.field1904[this.field1896 - 2] & 0xFF) << 8) + (this.field1904[this.field1896 - 1] & 0xFF);
    }

    @ObfuscatedName("dp.y(I)I")
    public int method2389() {
        this.field1896 += 2;
        int var1 = ((this.field1904[this.field1896 - 2] & 0xFF) << 8) + (this.field1904[this.field1896 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.z(I)I")
    public int method2228() {
        this.field1896 += 3;
        return (this.field1904[this.field1896 - 1] & 0xFF) + ((this.field1904[this.field1896 - 3] & 0xFF) << 16) + ((this.field1904[this.field1896 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dp.u(I)I")
    public int method2366() {
        this.field1896 += 4;
        return (this.field1904[this.field1896 - 1] & 0xFF) + ((this.field1904[this.field1896 - 2] & 0xFF) << 8) + ((this.field1904[this.field1896 - 4] & 0xFF) << 24) + ((this.field1904[this.field1896 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.w(B)J")
    public long method2221() {
        long var1 = (long) this.method2366() & 0xFFFFFFFFL;
        long var3 = (long) this.method2366() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dp.d(I)Ljava/lang/String;")
    public String method2222() {
        if (this.field1904[this.field1896] == 0) {
            this.field1896++;
            return null;
        } else {
            return this.method2223();
        }
    }

    @ObfuscatedName("dp.l(B)Ljava/lang/String;")
    public String method2223() {
        int var1 = this.field1896;
        while (this.field1904[++this.field1896 - 1] != 0) {
        }
        int var2 = this.field1896 - var1 - 1;
        return var2 == 0 ? "" : class156.method3118(this.field1904, var1, var2);
    }

    @ObfuscatedName("dp.aj(I)Ljava/lang/String;")
    public String method2224() {
        byte var1 = this.field1904[++this.field1896 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1896;
        while (this.field1904[++this.field1896 - 1] != 0) {
        }
        int var3 = this.field1896 - var2 - 1;
        return var3 == 0 ? "" : class156.method3118(this.field1904, var2, var3);
    }

    @ObfuscatedName("dp.aq(I)Ljava/lang/String;")
    public String method2206() {
        byte var1 = this.field1904[++this.field1896 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2245();
        if (this.field1896 + var2 > this.field1904.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1904;
        int var4 = this.field1896;
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
        this.field1896 += var2;
        return var12;
    }

    @ObfuscatedName("dp.al([BIIB)V")
    public void method2226(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1904[++this.field1896 - 1];
        }
    }

    @ObfuscatedName("dp.az(B)I")
    public int method2207() {
        int var1 = this.field1904[this.field1896] & 0xFF;
        return var1 < 128 ? this.method2211() - 64 : this.method2395() - 49152;
    }

    @ObfuscatedName("dp.ah(B)I")
    public int method2378() {
        int var1 = this.field1904[this.field1896] & 0xFF;
        return var1 < 128 ? this.method2211() : this.method2395() - 32768;
    }

    @ObfuscatedName("dp.ag(B)I")
    public int method2232() {
        return this.field1904[this.field1896] < 0 ? this.method2366() & Integer.MAX_VALUE : this.method2395();
    }

    @ObfuscatedName("dp.ad(I)I")
    public int method2245() {
        byte var1 = this.field1904[++this.field1896 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1904[++this.field1896 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dp.ao([II)V")
    public void method2231(int[] arg0) {
        int var2 = this.field1896 / 8;
        this.field1896 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2366();
            int var5 = this.method2366();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1896 -= 8;
            this.method2204(var4);
            this.method2204(var5);
        }
    }

    @ObfuscatedName("dp.am([IB)V")
    public void method2347(int[] arg0) {
        int var2 = this.field1896 / 8;
        this.field1896 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2366();
            int var5 = this.method2366();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1896 -= 8;
            this.method2204(var4);
            this.method2204(var5);
        }
    }

    @ObfuscatedName("dp.ax([IIIB)V")
    public void method2233(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1896;
        this.field1896 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2366();
            int var8 = this.method2366();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1896 -= 8;
            this.method2204(var7);
            this.method2204(var8);
        }
        this.field1896 = var4;
    }

    @ObfuscatedName("dp.at([IIII)V")
    public void method2306(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1896;
        this.field1896 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2366();
            int var8 = this.method2366();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1896 -= 8;
            this.method2204(var7);
            this.method2204(var8);
        }
        this.field1896 = var4;
    }

    @ObfuscatedName("dp.ar(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2235(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1896;
        this.field1896 = 0;
        byte[] var4 = new byte[var3];
        this.method2226(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1896 = 0;
        this.method2202(var7.length);
        this.method2248(var7, 0, var7.length);
    }

    @ObfuscatedName("dp.ai(II)I")
    public int method2338(int arg0) {
        int var2 = method128(this.field1904, arg0, this.field1896);
        this.method2204(var2);
        return var2;
    }

    @ObfuscatedName("dp.aw(I)Z")
    public boolean method2237() {
        this.field1896 -= 4;
        int var1 = method128(this.field1904, 0, this.field1896);
        int var2 = this.method2366();
        return var1 == var2;
    }

    @ObfuscatedName("dp.ak(II)V")
    public void method2238(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.an(IB)V")
    public void method2239(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dp.av(II)V")
    public void method2240(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dp.af(I)I")
    public int method2241() {
        return this.field1904[++this.field1896 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dp.ae(I)I")
    public int method2242() {
        return -this.field1904[++this.field1896 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.au(B)I")
    public int method2360() {
        return 128 - this.field1904[++this.field1896 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.aa(I)B")
    public byte method2244() {
        return (byte) (-this.field1904[++this.field1896 - 1]);
    }

    @ObfuscatedName("dp.ay(B)B")
    public byte method2263() {
        return (byte) (128 - this.field1904[++this.field1896 - 1]);
    }

    @ObfuscatedName("dp.ac(II)V")
    public void method2246(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) arg0;
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.ab(II)V")
    public void method2203(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.ap(II)V")
    public void method2227(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 + 128);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.as(B)I")
    public int method2249() {
        this.field1896 += 2;
        return ((this.field1904[this.field1896 - 1] & 0xFF) << 8) + (this.field1904[this.field1896 - 2] & 0xFF);
    }

    @ObfuscatedName("dp.bi(I)I")
    public int method2250() {
        this.field1896 += 2;
        return ((this.field1904[this.field1896 - 2] & 0xFF) << 8) + (this.field1904[this.field1896 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bv(I)I")
    public int method2251() {
        this.field1896 += 2;
        return ((this.field1904[this.field1896 - 1] & 0xFF) << 8) + (this.field1904[this.field1896 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bl(I)I")
    public int method2252() {
        this.field1896 += 2;
        int var1 = ((this.field1904[this.field1896 - 2] & 0xFF) << 8) + (this.field1904[this.field1896 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.by(B)I")
    public int method2229() {
        this.field1896 += 2;
        int var1 = ((this.field1904[this.field1896 - 1] & 0xFF) << 8) + (this.field1904[this.field1896 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bm(IS)V")
    public void method2254(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 16);
        this.field1904[++this.field1896 - 1] = (byte) arg0;
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.br(I)I")
    public int method2255() {
        this.field1896 += 3;
        return (this.field1904[this.field1896 - 2] & 0xFF) + ((this.field1904[this.field1896 - 1] & 0xFF) << 8) + ((this.field1904[this.field1896 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.bo(II)V")
    public void method2256(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) arg0;
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 16);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dp.bt(IB)V")
    public void method2257(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
        this.field1904[++this.field1896 - 1] = (byte) arg0;
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 24);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.be(IB)V")
    public void method2258(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 16);
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 24);
        this.field1904[++this.field1896 - 1] = (byte) arg0;
        this.field1904[++this.field1896 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bh(I)I")
    public int method2259() {
        this.field1896 += 4;
        return (this.field1904[this.field1896 - 4] & 0xFF) + ((this.field1904[this.field1896 - 3] & 0xFF) << 8) + ((this.field1904[this.field1896 - 1] & 0xFF) << 24) + ((this.field1904[this.field1896 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.bb(B)I")
    public int method2260() {
        this.field1896 += 4;
        return (this.field1904[this.field1896 - 3] & 0xFF) + ((this.field1904[this.field1896 - 4] & 0xFF) << 8) + ((this.field1904[this.field1896 - 1] & 0xFF) << 16) + ((this.field1904[this.field1896 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bd(I)I")
    public int method2321() {
        this.field1896 += 4;
        return (this.field1904[this.field1896 - 2] & 0xFF) + ((this.field1904[this.field1896 - 1] & 0xFF) << 8) + ((this.field1904[this.field1896 - 4] & 0xFF) << 16) + ((this.field1904[this.field1896 - 3] & 0xFF) << 24);
    }
}
