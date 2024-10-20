package deob;

import java.math.BigInteger;

@ObfuscatedName("de")
public class class120 extends class209 {

    @ObfuscatedName("de.w")
    public byte[] field2013;

    @ObfuscatedName("de.x")
    public int field2012;

    @ObfuscatedName("de.t")
    public static int[] field2008 = new int[256];

    @ObfuscatedName("de.e")
    public static long[] field2007;

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
            field2008[var0] = var1;
        }
        field2007 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2007[var3] = var4;
        }
    }

    @ObfuscatedName("ag.x([BII)I")
    public static int method799(byte[] arg0, int arg1) {
        return Statics.method1761(arg0, 0, arg1);
    }

    public class120(int arg0) {
        this.field2013 = class122.method2601(arg0);
        this.field2012 = 0;
    }

    public class120(byte[] arg0) {
        this.field2013 = arg0;
        this.field2012 = 0;
    }

    @ObfuscatedName("de.t(II)V")
    public void method2430(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.p(II)V")
    public void method2349(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2012 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.e(IB)V")
    public void method2510(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 16);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2012 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.y(IB)V")
    public void method2351(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 24);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 16);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2012 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.m(J)V")
    public void method2352(long arg0) {
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2013[++this.field2012 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("de.c(J)V")
    public void method2353(long arg0) {
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2013[++this.field2012 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2013[++this.field2012 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("aw.v(Ljava/lang/String;I)I")
    public static int method973(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("de.l(Ljava/lang/String;I)V")
    public void method2518(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2012 += class166.method1781(arg0, 0, arg0.length(), this.field2013, this.field2012);
        this.field2013[++this.field2012 - 1] = 0;
    }

    @ObfuscatedName("z.z(Ljava/lang/String;B)I")
    public static int method131(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("de.s(Ljava/lang/String;I)V")
    public void method2426(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2013[++this.field2012 - 1] = 0;
        this.field2012 += class166.method1781(arg0, 0, arg0.length(), this.field2013, this.field2012);
        this.field2013[++this.field2012 - 1] = 0;
    }

    @ObfuscatedName("de.j(Ljava/lang/CharSequence;I)V")
    public void method2429(CharSequence arg0) {
        int var2 = class210.method722(arg0);
        this.field2013[++this.field2012 - 1] = 0;
        this.method2362(var2);
        this.field2012 += class210.method2940(this.field2013, this.field2012, arg0);
    }

    @ObfuscatedName("de.q([BIII)V")
    public void method2463(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2013[++this.field2012 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("de.a(IS)V")
    public void method2358(int arg0) {
        this.field2013[this.field2012 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2013[this.field2012 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2013[this.field2012 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2013[this.field2012 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.d(IB)V")
    public void method2446(int arg0) {
        this.field2013[this.field2012 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2013[this.field2012 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.u(IB)V")
    public void method2492(int arg0) {
        this.field2013[this.field2012 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.i(II)V")
    public void method2361(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2430(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2349(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.o(II)V")
    public void method2362(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2430(arg0 >>> 28 | 0x80);
                    }
                    this.method2430(arg0 >>> 21 | 0x80);
                }
                this.method2430(arg0 >>> 14 | 0x80);
            }
            this.method2430(arg0 >>> 7 | 0x80);
        }
        this.method2430(arg0 & 0x7F);
    }

    @ObfuscatedName("de.h(B)I")
    public int method2363() {
        return this.field2013[++this.field2012 - 1] & 0xFF;
    }

    @ObfuscatedName("de.k(I)B")
    public byte method2381() {
        return this.field2013[++this.field2012 - 1];
    }

    @ObfuscatedName("de.f(I)I")
    public int method2365() {
        this.field2012 += 2;
        return ((this.field2013[this.field2012 - 2] & 0xFF) << 8) + (this.field2013[this.field2012 - 1] & 0xFF);
    }

    @ObfuscatedName("de.r(I)I")
    public int method2366() {
        this.field2012 += 2;
        int var1 = ((this.field2013[this.field2012 - 2] & 0xFF) << 8) + (this.field2013[this.field2012 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.n(I)I")
    public int method2367() {
        this.field2012 += 3;
        return (this.field2013[this.field2012 - 1] & 0xFF) + ((this.field2013[this.field2012 - 2] & 0xFF) << 8) + ((this.field2013[this.field2012 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("de.g(I)I")
    public int method2368() {
        this.field2012 += 4;
        return (this.field2013[this.field2012 - 1] & 0xFF) + ((this.field2013[this.field2012 - 2] & 0xFF) << 8) + ((this.field2013[this.field2012 - 4] & 0xFF) << 24) + ((this.field2013[this.field2012 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("de.b(I)J")
    public long method2369() {
        long var1 = (long) this.method2368() & 0xFFFFFFFFL;
        long var3 = (long) this.method2368() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("de.af(I)Ljava/lang/String;")
    public String method2370() {
        if (this.field2013[this.field2012] == 0) {
            this.field2012++;
            return null;
        } else {
            return this.method2540();
        }
    }

    @ObfuscatedName("de.am(B)Ljava/lang/String;")
    public String method2540() {
        int var1 = this.field2012;
        while (this.field2013[++this.field2012 - 1] != 0) {
        }
        int var2 = this.field2012 - var1 - 1;
        return var2 == 0 ? "" : class166.method764(this.field2013, var1, var2);
    }

    @ObfuscatedName("de.ar(I)Ljava/lang/String;")
    public String method2372() {
        byte var1 = this.field2013[++this.field2012 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2012;
        while (this.field2013[++this.field2012 - 1] != 0) {
        }
        int var3 = this.field2012 - var2 - 1;
        return var3 == 0 ? "" : class166.method764(this.field2013, var2, var3);
    }

    @ObfuscatedName("de.ay(I)Ljava/lang/String;")
    public String method2373() {
        byte var1 = this.field2013[++this.field2012 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2378();
        if (this.field2012 + var2 > this.field2013.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2013;
        int var4 = this.field2012;
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
        this.field2012 += var2;
        return var12;
    }

    @ObfuscatedName("de.ai([BIII)V")
    public void method2388(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2013[++this.field2012 - 1];
        }
    }

    @ObfuscatedName("de.ab(I)I")
    public int method2375() {
        int var1 = this.field2013[this.field2012] & 0xFF;
        return var1 < 128 ? this.method2363() - 64 : this.method2365() - 49152;
    }

    @ObfuscatedName("de.av(I)I")
    public int method2428() {
        int var1 = this.field2013[this.field2012] & 0xFF;
        return var1 < 128 ? this.method2363() : this.method2365() - 32768;
    }

    @ObfuscatedName("de.ac(S)I")
    public int method2377() {
        return this.field2013[this.field2012] < 0 ? this.method2368() & Integer.MAX_VALUE : this.method2365();
    }

    @ObfuscatedName("de.ah(I)I")
    public int method2378() {
        byte var1 = this.field2013[++this.field2012 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2013[++this.field2012 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("de.ae([II)V")
    public void method2379(int[] arg0) {
        int var2 = this.field2012 / 8;
        this.field2012 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2368();
            int var5 = this.method2368();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2012 -= 8;
            this.method2351(var4);
            this.method2351(var5);
        }
    }

    @ObfuscatedName("de.aj([II)V")
    public void method2380(int[] arg0) {
        int var2 = this.field2012 / 8;
        this.field2012 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2368();
            int var5 = this.method2368();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2012 -= 8;
            this.method2351(var4);
            this.method2351(var5);
        }
    }

    @ObfuscatedName("de.az([IIII)V")
    public void method2501(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2012;
        this.field2012 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2368();
            int var8 = this.method2368();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2012 -= 8;
            this.method2351(var7);
            this.method2351(var8);
        }
        this.field2012 = var4;
    }

    @ObfuscatedName("de.al([IIII)V")
    public void method2382(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2012;
        this.field2012 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2368();
            int var8 = this.method2368();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2012 -= 8;
            this.method2351(var7);
            this.method2351(var8);
        }
        this.field2012 = var4;
    }

    @ObfuscatedName("de.ag(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2383(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2012;
        this.field2012 = 0;
        byte[] var4 = new byte[var3];
        this.method2388(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2012 = 0;
        this.method2349(var7.length);
        this.method2463(var7, 0, var7.length);
    }

    @ObfuscatedName("de.ad(II)I")
    public int method2384(int arg0) {
        int var2 = Statics.method1761(this.field2013, arg0, this.field2012);
        this.method2351(var2);
        return var2;
    }

    @ObfuscatedName("de.au(I)Z")
    public boolean method2385() {
        this.field2012 -= 4;
        int var1 = Statics.method1761(this.field2013, 0, this.field2012);
        int var2 = this.method2368();
        return var1 == var2;
    }

    @ObfuscatedName("de.ao(II)V")
    public void method2386(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.ak(II)V")
    public void method2387(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("de.at(II)V")
    public void method2475(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("de.aw(I)I")
    public int method2389() {
        return this.field2013[++this.field2012 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("de.as(B)I")
    public int method2390() {
        return -this.field2013[++this.field2012 - 1] & 0xFF;
    }

    @ObfuscatedName("de.aq(B)I")
    public int method2454() {
        return 128 - this.field2013[++this.field2012 - 1] & 0xFF;
    }

    @ObfuscatedName("de.ax(I)B")
    public byte method2496() {
        return (byte) (this.field2013[++this.field2012 - 1] - 128);
    }

    @ObfuscatedName("de.an(B)B")
    public byte method2393() {
        return (byte) (-this.field2013[++this.field2012 - 1]);
    }

    @ObfuscatedName("de.aa(I)B")
    public byte method2394() {
        return (byte) (128 - this.field2013[++this.field2012 - 1]);
    }

    @ObfuscatedName("de.ap(II)V")
    public void method2395(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) arg0;
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bd(II)V")
    public void method2396(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.bb(II)V")
    public void method2397(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 + 128);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bo(I)I")
    public int method2398() {
        this.field2012 += 2;
        return ((this.field2013[this.field2012 - 1] & 0xFF) << 8) + (this.field2013[this.field2012 - 2] & 0xFF);
    }

    @ObfuscatedName("de.bf(I)I")
    public int method2399() {
        this.field2012 += 2;
        return ((this.field2013[this.field2012 - 2] & 0xFF) << 8) + (this.field2013[this.field2012 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bp(I)I")
    public int method2457() {
        this.field2012 += 2;
        return ((this.field2013[this.field2012 - 1] & 0xFF) << 8) + (this.field2013[this.field2012 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bn(B)I")
    public int method2401() {
        this.field2012 += 2;
        int var1 = ((this.field2013[this.field2012 - 2] & 0xFF) << 8) + (this.field2013[this.field2012 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bg(I)I")
    public int method2402() {
        this.field2012 += 2;
        int var1 = ((this.field2013[this.field2012 - 1] & 0xFF) << 8) + (this.field2013[this.field2012 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bi(II)V")
    public void method2348(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) arg0;
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("de.bz(II)V")
    public void method2467(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) arg0;
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 16);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("de.bw(IB)V")
    public void method2477(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2012 - 1] = (byte) arg0;
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 24);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("de.bm(II)V")
    public void method2406(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 16);
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 24);
        this.field2013[++this.field2012 - 1] = (byte) arg0;
        this.field2013[++this.field2012 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bh(I)I")
    public int method2520() {
        this.field2012 += 4;
        return (this.field2013[this.field2012 - 4] & 0xFF) + ((this.field2013[this.field2012 - 3] & 0xFF) << 8) + ((this.field2013[this.field2012 - 1] & 0xFF) << 24) + ((this.field2013[this.field2012 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("de.bu(B)I")
    public int method2408() {
        this.field2012 += 4;
        return (this.field2013[this.field2012 - 3] & 0xFF) + ((this.field2013[this.field2012 - 4] & 0xFF) << 8) + ((this.field2013[this.field2012 - 1] & 0xFF) << 16) + ((this.field2013[this.field2012 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("de.bx(I)I")
    public int method2546() {
        this.field2012 += 4;
        return (this.field2013[this.field2012 - 2] & 0xFF) + ((this.field2013[this.field2012 - 1] & 0xFF) << 8) + ((this.field2013[this.field2012 - 4] & 0xFF) << 16) + ((this.field2013[this.field2012 - 3] & 0xFF) << 24);
    }
}
