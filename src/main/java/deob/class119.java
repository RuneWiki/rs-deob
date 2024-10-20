package deob;

import java.math.BigInteger;

@ObfuscatedName("dc")
public class class119 extends class208 {

    @ObfuscatedName("dc.o")
    public byte[] field1989;

    @ObfuscatedName("dc.f")
    public int field1984;

    @ObfuscatedName("dc.i")
    public static int[] field1980 = new int[256];

    @ObfuscatedName("dc.q")
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
            field1980[var0] = var1;
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

    @ObfuscatedName("ec.o([BIII)I")
    public static int method2698(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1980[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cv.f([BIB)I")
    public static int method1893(byte[] arg0, int arg1) {
        return method2698(arg0, 0, arg1);
    }

    public class119(int arg0) {
        this.field1989 = class121.method2530(arg0);
        this.field1984 = 0;
    }

    public class119(byte[] arg0) {
        this.field1989 = arg0;
        this.field1984 = 0;
    }

    @ObfuscatedName("dc.i(II)V")
    public void method2347(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.h(II)V")
    public void method2318(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.q(II)V")
    public void method2277(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.u(II)V")
    public void method2278(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.m(J)V")
    public void method2279(long arg0) {
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1989[++this.field1984 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dc.y(J)V")
    public void method2415(long arg0) {
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1989[++this.field1984 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1989[++this.field1984 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dg.p(Ljava/lang/String;I)I")
    public static int method2219(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dc.t(Ljava/lang/String;I)V")
    public void method2281(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1984 += class165.method893(arg0, 0, arg0.length(), this.field1989, this.field1984);
        this.field1989[++this.field1984 - 1] = 0;
    }

    @ObfuscatedName("x.g(Ljava/lang/String;B)I")
    public static int method587(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dc.v(Ljava/lang/String;I)V")
    public void method2282(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1989[++this.field1984 - 1] = 0;
        this.field1984 += class165.method893(arg0, 0, arg0.length(), this.field1989, this.field1984);
        this.field1989[++this.field1984 - 1] = 0;
    }

    @ObfuscatedName("dc.l(Ljava/lang/CharSequence;I)V")
    public void method2449(CharSequence arg0) {
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
        this.field1989[++this.field1984 - 1] = 0;
        this.method2289(var3);
        int var8 = this.field1984;
        byte[] var9 = this.field1989;
        int var10 = this.field1984;
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
        this.field1984 = var15 + var8;
    }

    @ObfuscatedName("dc.e([BIII)V")
    public void method2392(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1989[++this.field1984 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dc.a(II)V")
    public void method2285(int arg0) {
        this.field1989[this.field1984 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1989[this.field1984 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1989[this.field1984 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1989[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.w(IB)V")
    public void method2286(int arg0) {
        this.field1989[this.field1984 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1989[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.d(II)V")
    public void method2287(int arg0) {
        this.field1989[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.z(II)V")
    public void method2288(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2347(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2318(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.s(IB)V")
    public void method2289(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2347(arg0 >>> 28 | 0x80);
                    }
                    this.method2347(arg0 >>> 21 | 0x80);
                }
                this.method2347(arg0 >>> 14 | 0x80);
            }
            this.method2347(arg0 >>> 7 | 0x80);
        }
        this.method2347(arg0 & 0x7F);
    }

    @ObfuscatedName("dc.j(I)I")
    public int method2290() {
        return this.field1989[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.b(I)B")
    public byte method2435() {
        return this.field1989[++this.field1984 - 1];
    }

    @ObfuscatedName("dc.r(I)I")
    public int method2292() {
        this.field1984 += 2;
        return ((this.field1989[this.field1984 - 2] & 0xFF) << 8) + (this.field1989[this.field1984 - 1] & 0xFF);
    }

    @ObfuscatedName("dc.n(I)I")
    public int method2293() {
        this.field1984 += 2;
        int var1 = ((this.field1989[this.field1984 - 2] & 0xFF) << 8) + (this.field1989[this.field1984 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.c(S)I")
    public int method2477() {
        this.field1984 += 3;
        return (this.field1989[this.field1984 - 1] & 0xFF) + ((this.field1989[this.field1984 - 2] & 0xFF) << 8) + ((this.field1989[this.field1984 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.k(I)I")
    public int method2295() {
        this.field1984 += 4;
        return (this.field1989[this.field1984 - 1] & 0xFF) + ((this.field1989[this.field1984 - 2] & 0xFF) << 8) + ((this.field1989[this.field1984 - 3] & 0xFF) << 16) + ((this.field1989[this.field1984 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.x(I)J")
    public long method2422() {
        long var1 = (long) this.method2295() & 0xFFFFFFFFL;
        long var3 = (long) this.method2295() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dc.ar(I)Ljava/lang/String;")
    public String method2297() {
        if (this.field1989[this.field1984] == 0) {
            this.field1984++;
            return null;
        } else {
            return this.method2344();
        }
    }

    @ObfuscatedName("dc.as(B)Ljava/lang/String;")
    public String method2344() {
        int var1 = this.field1984;
        while (this.field1989[++this.field1984 - 1] != 0) {
        }
        int var2 = this.field1984 - var1 - 1;
        return var2 == 0 ? "" : class165.method106(this.field1989, var1, var2);
    }

    @ObfuscatedName("dc.ac(I)Ljava/lang/String;")
    public String method2361() {
        byte var1 = this.field1989[++this.field1984 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1984;
        while (this.field1989[++this.field1984 - 1] != 0) {
        }
        int var3 = this.field1984 - var2 - 1;
        return var3 == 0 ? "" : class165.method106(this.field1989, var2, var3);
    }

    @ObfuscatedName("dc.ah(I)Ljava/lang/String;")
    public String method2411() {
        byte var1 = this.field1989[++this.field1984 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2305();
        if (this.field1984 + var2 > this.field1989.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method2873(this.field1989, this.field1984, var2);
        this.field1984 += var2;
        return var3;
    }

    @ObfuscatedName("dc.al([BIII)V")
    public void method2301(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1989[++this.field1984 - 1];
        }
    }

    @ObfuscatedName("dc.am(I)I")
    public int method2302() {
        int var1 = this.field1989[this.field1984] & 0xFF;
        return var1 < 128 ? this.method2290() - 64 : this.method2292() - 49152;
    }

    @ObfuscatedName("dc.ae(I)I")
    public int method2303() {
        int var1 = this.field1989[this.field1984] & 0xFF;
        return var1 < 128 ? this.method2290() : this.method2292() - 32768;
    }

    @ObfuscatedName("dc.ai(I)I")
    public int method2304() {
        return this.field1989[this.field1984] < 0 ? this.method2295() & Integer.MAX_VALUE : this.method2292();
    }

    @ObfuscatedName("dc.aa(I)I")
    public int method2305() {
        byte var1 = this.field1989[++this.field1984 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1989[++this.field1984 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dc.ag([IB)V")
    public void method2306(int[] arg0) {
        int var2 = this.field1984 / 8;
        this.field1984 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2295();
            int var5 = this.method2295();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1984 -= 8;
            this.method2278(var4);
            this.method2278(var5);
        }
    }

    @ObfuscatedName("dc.an([II)V")
    public void method2307(int[] arg0) {
        int var2 = this.field1984 / 8;
        this.field1984 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2295();
            int var5 = this.method2295();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1984 -= 8;
            this.method2278(var4);
            this.method2278(var5);
        }
    }

    @ObfuscatedName("dc.ap([IIII)V")
    public void method2328(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1984;
        this.field1984 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2295();
            int var8 = this.method2295();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1984 -= 8;
            this.method2278(var7);
            this.method2278(var8);
        }
        this.field1984 = var4;
    }

    @ObfuscatedName("dc.ay([IIIB)V")
    public void method2309(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1984;
        this.field1984 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2295();
            int var8 = this.method2295();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1984 -= 8;
            this.method2278(var7);
            this.method2278(var8);
        }
        this.field1984 = var4;
    }

    @ObfuscatedName("dc.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2310(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1984;
        this.field1984 = 0;
        byte[] var4 = new byte[var3];
        this.method2301(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1984 = 0;
        this.method2318(var7.length);
        this.method2392(var7, 0, var7.length);
    }

    @ObfuscatedName("dc.af(II)I")
    public int method2311(int arg0) {
        int var2 = method2698(this.field1989, arg0, this.field1984);
        this.method2278(var2);
        return var2;
    }

    @ObfuscatedName("dc.av(B)Z")
    public boolean method2312() {
        this.field1984 -= 4;
        int var1 = method2698(this.field1989, 0, this.field1984);
        int var2 = this.method2295();
        return var1 == var2;
    }

    @ObfuscatedName("dc.au(II)V")
    public void method2313(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.ad(IB)V")
    public void method2445(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dc.ab(IB)V")
    public void method2315(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dc.ao(I)I")
    public int method2316() {
        return this.field1989[++this.field1984 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dc.az(I)I")
    public int method2317() {
        return -this.field1989[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.aj(I)I")
    public int method2377() {
        return 128 - this.field1989[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.ak(I)B")
    public byte method2319() {
        return (byte) (this.field1989[++this.field1984 - 1] - 128);
    }

    @ObfuscatedName("dc.aw(I)B")
    public byte method2298() {
        return (byte) (-this.field1989[++this.field1984 - 1]);
    }

    @ObfuscatedName("dc.at(I)B")
    public byte method2321() {
        return (byte) (128 - this.field1989[++this.field1984 - 1]);
    }

    @ObfuscatedName("dc.aq(II)V")
    public void method2322(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) arg0;
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bo(IS)V")
    public void method2323(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.bf(IB)V")
    public void method2476(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 + 128);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bb(B)I")
    public int method2325() {
        this.field1984 += 2;
        return ((this.field1989[this.field1984 - 1] & 0xFF) << 8) + (this.field1989[this.field1984 - 2] & 0xFF);
    }

    @ObfuscatedName("dc.bj(B)I")
    public int method2326() {
        this.field1984 += 2;
        return ((this.field1989[this.field1984 - 2] & 0xFF) << 8) + (this.field1989[this.field1984 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bp(B)I")
    public int method2362() {
        this.field1984 += 2;
        return ((this.field1989[this.field1984 - 1] & 0xFF) << 8) + (this.field1989[this.field1984 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bh(I)I")
    public int method2467() {
        this.field1984 += 2;
        int var1 = ((this.field1989[this.field1984 - 1] & 0xFF) << 8) + (this.field1989[this.field1984 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bz(II)V")
    public void method2482(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1984 - 1] = (byte) arg0;
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bw(I)I")
    public int method2481() {
        this.field1984 += 3;
        return (this.field1989[this.field1984 - 2] & 0xFF) + ((this.field1989[this.field1984 - 3] & 0xFF) << 16) + ((this.field1989[this.field1984 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dc.bm(IB)V")
    public void method2331(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) arg0;
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dc.bn(II)V")
    public void method2421(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1984 - 1] = (byte) arg0;
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dc.bt(II)V")
    public void method2333(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1989[++this.field1984 - 1] = (byte) arg0;
        this.field1989[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.ba(I)I")
    public int method2334() {
        this.field1984 += 4;
        return (this.field1989[this.field1984 - 4] & 0xFF) + ((this.field1989[this.field1984 - 3] & 0xFF) << 8) + ((this.field1989[this.field1984 - 2] & 0xFF) << 16) + ((this.field1989[this.field1984 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bv(I)I")
    public int method2453() {
        this.field1984 += 4;
        return (this.field1989[this.field1984 - 3] & 0xFF) + ((this.field1989[this.field1984 - 4] & 0xFF) << 8) + ((this.field1989[this.field1984 - 1] & 0xFF) << 16) + ((this.field1989[this.field1984 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bd(I)I")
    public int method2336() {
        this.field1984 += 4;
        return (this.field1989[this.field1984 - 2] & 0xFF) + ((this.field1989[this.field1984 - 1] & 0xFF) << 8) + ((this.field1989[this.field1984 - 3] & 0xFF) << 24) + ((this.field1989[this.field1984 - 4] & 0xFF) << 16);
    }
}
