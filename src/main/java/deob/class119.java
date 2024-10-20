package deob;

import java.math.BigInteger;

@ObfuscatedName("dn")
public class class119 extends class208 {

    @ObfuscatedName("dn.f")
    public byte[] field2000;

    @ObfuscatedName("dn.s")
    public int field1994;

    @ObfuscatedName("dn.q")
    public static int[] field1995 = new int[256];

    @ObfuscatedName("dn.m")
    public static long[] field1996;

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
            field1995[var0] = var1;
        }
        field1996 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1996[var3] = var4;
        }
    }

    @ObfuscatedName("am.f([BIIB)I")
    public static int method817(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1995[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field2000 = class121.method2596(arg0);
        this.field1994 = 0;
    }

    public class119(byte[] arg0) {
        this.field2000 = arg0;
        this.field1994 = 0;
    }

    @ObfuscatedName("dn.s(II)V")
    public void method2426(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.q(IB)V")
    public void method2349(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
        this.field2000[++this.field1994 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.g(II)V")
    public void method2496(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 16);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
        this.field2000[++this.field1994 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.m(IB)V")
    public void method2351(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 24);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 16);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
        this.field2000[++this.field1994 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.t(J)V")
    public void method2352(long arg0) {
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2000[++this.field1994 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dn.j(J)V")
    public void method2442(long arg0) {
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2000[++this.field1994 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2000[++this.field1994 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("bv.n(Ljava/lang/String;B)I")
    public static int method1572(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dn.l(Ljava/lang/String;B)V")
    public void method2354(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1994 += class165.method742(arg0, 0, arg0.length(), this.field2000, this.field1994);
        this.field2000[++this.field1994 - 1] = 0;
    }

    @ObfuscatedName("n.i(Ljava/lang/String;I)I")
    public static int method102(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dn.w(Ljava/lang/String;B)V")
    public void method2355(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2000[++this.field1994 - 1] = 0;
        this.field1994 += class165.method742(arg0, 0, arg0.length(), this.field2000, this.field1994);
        this.field2000[++this.field1994 - 1] = 0;
    }

    @ObfuscatedName("dn.v(Ljava/lang/CharSequence;I)V")
    public void method2360(CharSequence arg0) {
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
        this.field2000[++this.field1994 - 1] = 0;
        this.method2388(var3);
        this.field1994 += class209.method2919(this.field2000, this.field1994, arg0);
    }

    @ObfuscatedName("dn.o([BIII)V")
    public void method2357(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2000[++this.field1994 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dn.p(IB)V")
    public void method2358(int arg0) {
        this.field2000[this.field1994 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2000[this.field1994 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2000[this.field1994 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2000[this.field1994 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.b(II)V")
    public void method2521(int arg0) {
        this.field2000[this.field1994 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2000[this.field1994 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.z(II)V")
    public void method2401(int arg0) {
        this.field2000[this.field1994 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.k(II)V")
    public void method2362(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2426(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2349(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dn.r(II)V")
    public void method2388(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2426(arg0 >>> 28 | 0x80);
                    }
                    this.method2426(arg0 >>> 21 | 0x80);
                }
                this.method2426(arg0 >>> 14 | 0x80);
            }
            this.method2426(arg0 >>> 7 | 0x80);
        }
        this.method2426(arg0 & 0x7F);
    }

    @ObfuscatedName("dn.d(I)I")
    public int method2363() {
        return this.field2000[++this.field1994 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.u(S)B")
    public byte method2364() {
        return this.field2000[++this.field1994 - 1];
    }

    @ObfuscatedName("dn.a(I)I")
    public int method2353() {
        this.field1994 += 2;
        return ((this.field2000[this.field1994 - 2] & 0xFF) << 8) + (this.field2000[this.field1994 - 1] & 0xFF);
    }

    @ObfuscatedName("dn.x(S)I")
    public int method2507() {
        this.field1994 += 2;
        int var1 = ((this.field2000[this.field1994 - 2] & 0xFF) << 8) + (this.field2000[this.field1994 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.y(B)I")
    public int method2414() {
        this.field1994 += 3;
        return (this.field2000[this.field1994 - 1] & 0xFF) + ((this.field2000[this.field1994 - 2] & 0xFF) << 8) + ((this.field2000[this.field1994 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dn.c(S)I")
    public int method2368() {
        this.field1994 += 4;
        return (this.field2000[this.field1994 - 1] & 0xFF) + ((this.field2000[this.field1994 - 2] & 0xFF) << 8) + ((this.field2000[this.field1994 - 3] & 0xFF) << 16) + ((this.field2000[this.field1994 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dn.h(B)J")
    public long method2398() {
        long var1 = (long) this.method2368() & 0xFFFFFFFFL;
        long var3 = (long) this.method2368() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dn.e(I)Ljava/lang/String;")
    public String method2370() {
        if (this.field2000[this.field1994] == 0) {
            this.field1994++;
            return null;
        } else {
            return this.method2365();
        }
    }

    @ObfuscatedName("dn.ab(I)Ljava/lang/String;")
    public String method2365() {
        int var1 = this.field1994;
        while (this.field2000[++this.field1994 - 1] != 0) {
        }
        int var2 = this.field1994 - var1 - 1;
        return var2 == 0 ? "" : Statics.method2934(this.field2000, var1, var2);
    }

    @ObfuscatedName("dn.af(I)Ljava/lang/String;")
    public String method2372() {
        byte var1 = this.field2000[++this.field1994 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1994;
        while (this.field2000[++this.field1994 - 1] != 0) {
        }
        int var3 = this.field1994 - var2 - 1;
        return var3 == 0 ? "" : Statics.method2934(this.field2000, var2, var3);
    }

    @ObfuscatedName("dn.au(I)Ljava/lang/String;")
    public String method2428() {
        byte var1 = this.field2000[++this.field1994 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2378();
        if (this.field1994 + var2 > this.field2000.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method882(this.field2000, this.field1994, var2);
        this.field1994 += var2;
        return var3;
    }

    @ObfuscatedName("dn.ae([BIII)V")
    public void method2477(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2000[++this.field1994 - 1];
        }
    }

    @ObfuscatedName("dn.ax(B)I")
    public int method2375() {
        int var1 = this.field2000[this.field1994] & 0xFF;
        return var1 < 128 ? this.method2363() - 64 : this.method2353() - 49152;
    }

    @ObfuscatedName("dn.az(B)I")
    public int method2376() {
        int var1 = this.field2000[this.field1994] & 0xFF;
        return var1 < 128 ? this.method2363() : this.method2353() - 32768;
    }

    @ObfuscatedName("dn.aa(B)I")
    public int method2377() {
        return this.field2000[this.field1994] < 0 ? this.method2368() & Integer.MAX_VALUE : this.method2353();
    }

    @ObfuscatedName("dn.ak(I)I")
    public int method2378() {
        byte var1 = this.field2000[++this.field1994 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2000[++this.field1994 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dn.ac([II)V")
    public void method2379(int[] arg0) {
        int var2 = this.field1994 / 8;
        this.field1994 = 0;
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
            this.field1994 -= 8;
            this.method2351(var4);
            this.method2351(var5);
        }
    }

    @ObfuscatedName("dn.ar([II)V")
    public void method2516(int[] arg0) {
        int var2 = this.field1994 / 8;
        this.field1994 = 0;
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
            this.field1994 -= 8;
            this.method2351(var4);
            this.method2351(var5);
        }
    }

    @ObfuscatedName("dn.ah([IIIB)V")
    public void method2381(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1994;
        this.field1994 = arg1;
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
            this.field1994 -= 8;
            this.method2351(var7);
            this.method2351(var8);
        }
        this.field1994 = var4;
    }

    @ObfuscatedName("dn.an([IIIB)V")
    public void method2382(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1994;
        this.field1994 = arg1;
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
            this.field1994 -= 8;
            this.method2351(var7);
            this.method2351(var8);
        }
        this.field1994 = var4;
    }

    @ObfuscatedName("dn.aq(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2383(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1994;
        this.field1994 = 0;
        byte[] var4 = new byte[var3];
        this.method2477(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1994 = 0;
        this.method2349(var7.length);
        this.method2357(var7, 0, var7.length);
    }

    @ObfuscatedName("dn.at(IB)I")
    public int method2474(int arg0) {
        int var2 = method817(this.field2000, arg0, this.field1994);
        this.method2351(var2);
        return var2;
    }

    @ObfuscatedName("dn.am(I)Z")
    public boolean method2393() {
        this.field1994 -= 4;
        int var1 = method817(this.field2000, 0, this.field1994);
        int var2 = this.method2368();
        return var1 == var2;
    }

    @ObfuscatedName("dn.av(II)V")
    public void method2386(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dn.ai(IB)V")
    public void method2392(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dn.ay(II)V")
    public void method2402(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dn.aw(I)I")
    public int method2445() {
        return this.field2000[++this.field1994 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dn.ap(B)I")
    public int method2390() {
        return -this.field2000[++this.field1994 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.aj(I)I")
    public int method2366() {
        return 128 - this.field2000[++this.field1994 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.ao(I)B")
    public byte method2371() {
        return (byte) (this.field2000[++this.field1994 - 1] - 128);
    }

    @ObfuscatedName("dn.ad(I)B")
    public byte method2481() {
        return (byte) (128 - this.field2000[++this.field1994 - 1]);
    }

    @ObfuscatedName("dn.ag(II)V")
    public void method2394(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) arg0;
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.al(II)V")
    public void method2395(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dn.as(IB)V")
    public void method2406(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 + 128);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.bi(B)I")
    public int method2397() {
        this.field1994 += 2;
        return ((this.field2000[this.field1994 - 1] & 0xFF) << 8) + (this.field2000[this.field1994 - 2] & 0xFF);
    }

    @ObfuscatedName("dn.be(I)I")
    public int method2499() {
        this.field1994 += 2;
        return ((this.field2000[this.field1994 - 2] & 0xFF) << 8) + (this.field2000[this.field1994 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dn.bg(I)I")
    public int method2409() {
        this.field1994 += 2;
        return ((this.field2000[this.field1994 - 1] & 0xFF) << 8) + (this.field2000[this.field1994 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dn.br(I)I")
    public int method2400() {
        this.field1994 += 2;
        int var1 = ((this.field2000[this.field1994 - 1] & 0xFF) << 8) + (this.field2000[this.field1994 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.bk(II)V")
    public void method2407(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 16);
        this.field2000[++this.field1994 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.bp(I)I")
    public int method2526() {
        this.field1994 += 3;
        return (this.field2000[this.field1994 - 3] & 0xFF) + ((this.field2000[this.field1994 - 1] & 0xFF) << 16) + ((this.field2000[this.field1994 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dn.bx(II)V")
    public void method2403(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) arg0;
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 16);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dn.bl(II)V")
    public void method2404(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
        this.field2000[++this.field1994 - 1] = (byte) arg0;
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 24);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dn.bu(II)V")
    public void method2514(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 16);
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 24);
        this.field2000[++this.field1994 - 1] = (byte) arg0;
        this.field2000[++this.field1994 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.bq(I)I")
    public int method2510() {
        this.field1994 += 4;
        return (this.field2000[this.field1994 - 4] & 0xFF) + ((this.field2000[this.field1994 - 3] & 0xFF) << 8) + ((this.field2000[this.field1994 - 2] & 0xFF) << 16) + ((this.field2000[this.field1994 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dn.bf(I)I")
    public int method2543() {
        this.field1994 += 4;
        return (this.field2000[this.field1994 - 3] & 0xFF) + ((this.field2000[this.field1994 - 4] & 0xFF) << 8) + ((this.field2000[this.field1994 - 1] & 0xFF) << 16) + ((this.field2000[this.field1994 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dn.bn(I)I")
    public int method2348() {
        this.field1994 += 4;
        return (this.field2000[this.field1994 - 2] & 0xFF) + ((this.field2000[this.field1994 - 1] & 0xFF) << 8) + ((this.field2000[this.field1994 - 4] & 0xFF) << 16) + ((this.field2000[this.field1994 - 3] & 0xFF) << 24);
    }
}
