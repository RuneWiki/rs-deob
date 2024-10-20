package deob;

import java.math.BigInteger;

@ObfuscatedName("dx")
public class class120 extends class209 {

    @ObfuscatedName("dx.j")
    public byte[] field1974;

    @ObfuscatedName("dx.h")
    public int field1972;

    @ObfuscatedName("dx.m")
    public static int[] field1973 = new int[256];

    @ObfuscatedName("dx.x")
    public static long[] field1979;

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
            field1973[var0] = var1;
        }
        field1979 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1979[var3] = var4;
        }
    }

    @ObfuscatedName("c.j([BII)I")
    public static int method104(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1973[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class120(int arg0) {
        this.field1974 = class122.method2591(arg0);
        this.field1972 = 0;
    }

    public class120(byte[] arg0) {
        this.field1974 = arg0;
        this.field1972 = 0;
    }

    @ObfuscatedName("dx.h(II)V")
    public void method2364(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.m(II)V")
    public void method2347(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1972 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.z(II)V")
    public void method2348(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1972 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.x(IB)V")
    public void method2349(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 24);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1972 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.e(J)V")
    public void method2480(long arg0) {
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1974[++this.field1972 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dx.i(J)V")
    public void method2351(long arg0) {
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1974[++this.field1972 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1974[++this.field1972 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("db.c(Ljava/lang/String;I)I")
    public static int method2308(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dx.n(Ljava/lang/String;I)V")
    public void method2352(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1972 += class166.method102(arg0, 0, arg0.length(), this.field1974, this.field1972);
        this.field1974[++this.field1972 - 1] = 0;
    }

    @ObfuscatedName("dx.l(Ljava/lang/String;I)V")
    public void method2353(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1974[++this.field1972 - 1] = 0;
        this.field1972 += class166.method102(arg0, 0, arg0.length(), this.field1974, this.field1972);
        this.field1974[++this.field1972 - 1] = 0;
    }

    @ObfuscatedName("dx.u(Ljava/lang/CharSequence;I)V")
    public void method2430(CharSequence arg0) {
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
        this.field1974[++this.field1972 - 1] = 0;
        this.method2360(var3);
        int var8 = this.field1972;
        byte[] var9 = this.field1974;
        int var10 = this.field1972;
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
        this.field1972 = var15 + var8;
    }

    @ObfuscatedName("dx.r([BIII)V")
    public void method2355(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1974[++this.field1972 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dx.a(IB)V")
    public void method2356(int arg0) {
        this.field1974[this.field1972 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1974[this.field1972 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1974[this.field1972 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1974[this.field1972 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.d(II)V")
    public void method2357(int arg0) {
        this.field1974[this.field1972 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1974[this.field1972 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.p(II)V")
    public void method2358(int arg0) {
        this.field1974[this.field1972 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.q(IB)V")
    public void method2527(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2364(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2347(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.b(II)V")
    public void method2360(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2364(arg0 >>> 28 | 0x80);
                    }
                    this.method2364(arg0 >>> 21 | 0x80);
                }
                this.method2364(arg0 >>> 14 | 0x80);
            }
            this.method2364(arg0 >>> 7 | 0x80);
        }
        this.method2364(arg0 & 0x7F);
    }

    @ObfuscatedName("dx.t(I)I")
    public int method2361() {
        return this.field1974[++this.field1972 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.y(I)B")
    public byte method2531() {
        return this.field1974[++this.field1972 - 1];
    }

    @ObfuscatedName("dx.w(I)I")
    public int method2363() {
        this.field1972 += 2;
        return ((this.field1974[this.field1972 - 2] & 0xFF) << 8) + (this.field1974[this.field1972 - 1] & 0xFF);
    }

    @ObfuscatedName("dx.g(I)I")
    public int method2362() {
        this.field1972 += 2;
        int var1 = ((this.field1974[this.field1972 - 2] & 0xFF) << 8) + (this.field1974[this.field1972 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.s(B)I")
    public int method2523() {
        this.field1972 += 3;
        return (this.field1974[this.field1972 - 1] & 0xFF) + ((this.field1974[this.field1972 - 2] & 0xFF) << 8) + ((this.field1974[this.field1972 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.k(I)I")
    public int method2366() {
        this.field1972 += 4;
        return (this.field1974[this.field1972 - 1] & 0xFF) + ((this.field1974[this.field1972 - 2] & 0xFF) << 8) + ((this.field1974[this.field1972 - 4] & 0xFF) << 24) + ((this.field1974[this.field1972 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.o(I)J")
    public long method2367() {
        long var1 = (long) this.method2366() & 0xFFFFFFFFL;
        long var3 = (long) this.method2366() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dx.v(I)Ljava/lang/String;")
    public String method2368() {
        if (this.field1974[this.field1972] == 0) {
            this.field1972++;
            return null;
        } else {
            return this.method2369();
        }
    }

    @ObfuscatedName("dx.f(B)Ljava/lang/String;")
    public String method2369() {
        int var1 = this.field1972;
        while (this.field1974[++this.field1972 - 1] != 0) {
        }
        int var2 = this.field1972 - var1 - 1;
        return var2 == 0 ? "" : class166.method2767(this.field1974, var1, var2);
    }

    @ObfuscatedName("dx.au(B)Ljava/lang/String;")
    public String method2370() {
        byte var1 = this.field1974[++this.field1972 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1972;
        while (this.field1974[++this.field1972 - 1] != 0) {
        }
        int var3 = this.field1972 - var2 - 1;
        return var3 == 0 ? "" : class166.method2767(this.field1974, var2, var3);
    }

    @ObfuscatedName("dx.aq(I)Ljava/lang/String;")
    public String method2371() {
        byte var1 = this.field1974[++this.field1972 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2463();
        if (this.field1972 + var2 > this.field1974.length) {
            throw new IllegalStateException("");
        }
        String var3 = class210.method1965(this.field1974, this.field1972, var2);
        this.field1972 += var2;
        return var3;
    }

    @ObfuscatedName("dx.ab([BIIS)V")
    public void method2372(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1974[++this.field1972 - 1];
        }
    }

    @ObfuscatedName("dx.am(I)I")
    public int method2471() {
        int var1 = this.field1974[this.field1972] & 0xFF;
        return var1 < 128 ? this.method2361() - 64 : this.method2363() - 49152;
    }

    @ObfuscatedName("dx.an(B)I")
    public int method2373() {
        int var1 = this.field1974[this.field1972] & 0xFF;
        return var1 < 128 ? this.method2361() : this.method2363() - 32768;
    }

    @ObfuscatedName("dx.aj(I)I")
    public int method2374() {
        return this.field1974[this.field1972] < 0 ? this.method2366() & Integer.MAX_VALUE : this.method2363();
    }

    @ObfuscatedName("dx.ay(I)I")
    public int method2463() {
        byte var1 = this.field1974[++this.field1972 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1974[++this.field1972 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dx.ao([II)V")
    public void method2376(int[] arg0) {
        int var2 = this.field1972 / 8;
        this.field1972 = 0;
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
            this.field1972 -= 8;
            this.method2349(var4);
            this.method2349(var5);
        }
    }

    @ObfuscatedName("dx.ag([IB)V")
    public void method2350(int[] arg0) {
        int var2 = this.field1972 / 8;
        this.field1972 = 0;
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
            this.field1972 -= 8;
            this.method2349(var4);
            this.method2349(var5);
        }
    }

    @ObfuscatedName("dx.as([IIII)V")
    public void method2378(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1972;
        this.field1972 = arg1;
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
            this.field1972 -= 8;
            this.method2349(var7);
            this.method2349(var8);
        }
        this.field1972 = var4;
    }

    @ObfuscatedName("dx.az([IIII)V")
    public void method2533(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1972;
        this.field1972 = arg1;
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
            this.field1972 -= 8;
            this.method2349(var7);
            this.method2349(var8);
        }
        this.field1972 = var4;
    }

    @ObfuscatedName("dx.av(Ljava/math/BigInteger;Ljava/math/BigInteger;S)V")
    public void method2380(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1972;
        this.field1972 = 0;
        byte[] var4 = new byte[var3];
        this.method2372(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1972 = 0;
        this.method2347(var7.length);
        this.method2355(var7, 0, var7.length);
    }

    @ObfuscatedName("dx.ax(II)I")
    public int method2381(int arg0) {
        byte[] var2 = this.field1974;
        int var3 = this.field1972;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1973[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2349(var6);
        return var6;
    }

    @ObfuscatedName("dx.aa(I)Z")
    public boolean method2392() {
        this.field1972 -= 4;
        byte[] var1 = this.field1974;
        int var2 = this.field1972;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1973[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2366();
        return var5 == var8;
    }

    @ObfuscatedName("dx.ah(II)V")
    public void method2458(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ai(II)V")
    public void method2384(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dx.ae(II)V")
    public void method2462(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dx.at(I)I")
    public int method2524() {
        return this.field1974[++this.field1972 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dx.ar(I)I")
    public int method2387() {
        return -this.field1974[++this.field1972 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.aw(I)I")
    public int method2388() {
        return 128 - this.field1974[++this.field1972 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ac(I)B")
    public byte method2389() {
        return (byte) (this.field1974[++this.field1972 - 1] - 128);
    }

    @ObfuscatedName("dx.ap(B)B")
    public byte method2390() {
        return (byte) (-this.field1974[++this.field1972 - 1]);
    }

    @ObfuscatedName("dx.af(B)B")
    public byte method2382() {
        return (byte) (128 - this.field1974[++this.field1972 - 1]);
    }

    @ObfuscatedName("dx.al(II)V")
    public void method2464(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) arg0;
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.ad(II)V")
    public void method2503(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ak(II)V")
    public void method2394(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 + 128);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bb(I)I")
    public int method2395() {
        this.field1972 += 2;
        return ((this.field1974[this.field1972 - 1] & 0xFF) << 8) + (this.field1974[this.field1972 - 2] & 0xFF);
    }

    @ObfuscatedName("dx.bt(I)I")
    public int method2396() {
        this.field1972 += 2;
        return ((this.field1974[this.field1972 - 2] & 0xFF) << 8) + (this.field1974[this.field1972 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bd(I)I")
    public int method2397() {
        this.field1972 += 2;
        return ((this.field1974[this.field1972 - 1] & 0xFF) << 8) + (this.field1974[this.field1972 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bx(I)I")
    public int method2442() {
        this.field1972 += 2;
        int var1 = ((this.field1974[this.field1972 - 1] & 0xFF) << 8) + (this.field1974[this.field1972 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.be(S)I")
    public int method2399() {
        this.field1972 += 2;
        int var1 = ((this.field1974[this.field1972 - 2] & 0xFF) << 8) + (this.field1974[this.field1972 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bo(IB)V")
    public void method2400(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1972 - 1] = (byte) arg0;
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bn(II)V")
    public void method2401(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) arg0;
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dx.bm(II)V")
    public void method2402(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1972 - 1] = (byte) arg0;
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 24);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dx.ba(II)V")
    public void method2403(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 24);
        this.field1974[++this.field1972 - 1] = (byte) arg0;
        this.field1974[++this.field1972 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bq(I)I")
    public int method2404() {
        this.field1972 += 4;
        return (this.field1974[this.field1972 - 4] & 0xFF) + ((this.field1974[this.field1972 - 3] & 0xFF) << 8) + ((this.field1974[this.field1972 - 2] & 0xFF) << 16) + ((this.field1974[this.field1972 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.bc(I)I")
    public int method2405() {
        this.field1972 += 4;
        return (this.field1974[this.field1972 - 3] & 0xFF) + ((this.field1974[this.field1972 - 4] & 0xFF) << 8) + ((this.field1974[this.field1972 - 1] & 0xFF) << 16) + ((this.field1974[this.field1972 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.bs(B)I")
    public int method2406() {
        this.field1972 += 4;
        return (this.field1974[this.field1972 - 2] & 0xFF) + ((this.field1974[this.field1972 - 1] & 0xFF) << 8) + ((this.field1974[this.field1972 - 4] & 0xFF) << 16) + ((this.field1974[this.field1972 - 3] & 0xFF) << 24);
    }
}
