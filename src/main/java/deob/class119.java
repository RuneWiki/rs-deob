package deob;

import java.math.BigInteger;

@ObfuscatedName("df")
public class class119 extends class208 {

    @ObfuscatedName("df.d")
    public byte[] field1973;

    @ObfuscatedName("df.p")
    public int field1966;

    @ObfuscatedName("df.v")
    public static int[] field1967 = new int[256];

    @ObfuscatedName("df.y")
    public static long[] field1969;

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
            field1967[var0] = var1;
        }
        field1969 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1969[var3] = var4;
        }
    }

    public class119(int arg0) {
        this.field1973 = class121.method2609(arg0);
        this.field1966 = 0;
    }

    public class119(byte[] arg0) {
        this.field1973 = arg0;
        this.field1966 = 0;
    }

    @ObfuscatedName("df.p(II)V")
    public void method2388(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.v(II)V")
    public void method2343(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
        this.field1973[++this.field1966 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.l(IB)V")
    public void method2344(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 16);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
        this.field1973[++this.field1966 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.y(IB)V")
    public void method2345(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 24);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 16);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
        this.field1973[++this.field1966 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.w(J)V")
    public void method2346(long arg0) {
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1973[++this.field1966 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("df.u(J)V")
    public void method2347(long arg0) {
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1973[++this.field1966 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1973[++this.field1966 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cb.a(Ljava/lang/String;I)I")
    public static int method2041(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("df.e(Ljava/lang/String;I)V")
    public void method2348(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1966 += class165.method2286(arg0, 0, arg0.length(), this.field1973, this.field1966);
        this.field1973[++this.field1966 - 1] = 0;
    }

    @ObfuscatedName("df.b(Ljava/lang/String;I)V")
    public void method2432(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1973[++this.field1966 - 1] = 0;
        this.field1966 += class165.method2286(arg0, 0, arg0.length(), this.field1973, this.field1966);
        this.field1973[++this.field1966 - 1] = 0;
    }

    @ObfuscatedName("df.o(Ljava/lang/CharSequence;I)V")
    public void method2537(CharSequence arg0) {
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
        this.field1973[++this.field1966 - 1] = 0;
        this.method2356(var3);
        this.field1966 += class209.method1552(this.field1973, this.field1966, arg0);
    }

    @ObfuscatedName("df.m([BIII)V")
    public void method2463(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1973[++this.field1966 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("df.x(II)V")
    public void method2352(int arg0) {
        this.field1973[this.field1966 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1973[this.field1966 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1973[this.field1966 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1973[this.field1966 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.k(IB)V")
    public void method2353(int arg0) {
        this.field1973[this.field1966 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1973[this.field1966 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.n(II)V")
    public void method2505(int arg0) {
        this.field1973[this.field1966 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.j(II)V")
    public void method2355(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2388(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2343(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.t(II)V")
    public void method2356(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2388(arg0 >>> 28 | 0x80);
                    }
                    this.method2388(arg0 >>> 21 | 0x80);
                }
                this.method2388(arg0 >>> 14 | 0x80);
            }
            this.method2388(arg0 >>> 7 | 0x80);
        }
        this.method2388(arg0 & 0x7F);
    }

    @ObfuscatedName("df.z(I)I")
    public int method2357() {
        return this.field1973[++this.field1966 - 1] & 0xFF;
    }

    @ObfuscatedName("df.h(I)B")
    public byte method2477() {
        return this.field1973[++this.field1966 - 1];
    }

    @ObfuscatedName("df.i(I)I")
    public int method2359() {
        this.field1966 += 2;
        return ((this.field1973[this.field1966 - 2] & 0xFF) << 8) + (this.field1973[this.field1966 - 1] & 0xFF);
    }

    @ObfuscatedName("df.q(I)I")
    public int method2360() {
        this.field1966 += 2;
        int var1 = ((this.field1973[this.field1966 - 2] & 0xFF) << 8) + (this.field1973[this.field1966 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.r(B)I")
    public int method2361() {
        this.field1966 += 3;
        return (this.field1973[this.field1966 - 1] & 0xFF) + ((this.field1973[this.field1966 - 3] & 0xFF) << 16) + ((this.field1973[this.field1966 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("df.s(I)I")
    public int method2362() {
        this.field1966 += 4;
        return (this.field1973[this.field1966 - 1] & 0xFF) + ((this.field1973[this.field1966 - 2] & 0xFF) << 8) + ((this.field1973[this.field1966 - 4] & 0xFF) << 24) + ((this.field1973[this.field1966 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("df.g(B)J")
    public long method2363() {
        long var1 = (long) this.method2362() & 0xFFFFFFFFL;
        long var3 = (long) this.method2362() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("df.f(I)Ljava/lang/String;")
    public String method2364() {
        if (this.field1973[this.field1966] == 0) {
            this.field1966++;
            return null;
        } else {
            return this.method2365();
        }
    }

    @ObfuscatedName("df.c(I)Ljava/lang/String;")
    public String method2365() {
        int var1 = this.field1966;
        while (this.field1973[++this.field1966 - 1] != 0) {
        }
        int var2 = this.field1966 - var1 - 1;
        return var2 == 0 ? "" : class165.method2141(this.field1973, var1, var2);
    }

    @ObfuscatedName("df.ae(I)Ljava/lang/String;")
    public String method2567() {
        byte var1 = this.field1973[++this.field1966 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1966;
        while (this.field1973[++this.field1966 - 1] != 0) {
        }
        int var3 = this.field1966 - var2 - 1;
        return var3 == 0 ? "" : class165.method2141(this.field1973, var2, var3);
    }

    @ObfuscatedName("df.ao(I)Ljava/lang/String;")
    public String method2367() {
        byte var1 = this.field1973[++this.field1966 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2469();
        if (this.field1966 + var2 > this.field1973.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method2282(this.field1973, this.field1966, var2);
        this.field1966 += var2;
        return var3;
    }

    @ObfuscatedName("df.ak([BIII)V")
    public void method2400(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1973[++this.field1966 - 1];
        }
    }

    @ObfuscatedName("df.ah(I)I")
    public int method2391() {
        int var1 = this.field1973[this.field1966] & 0xFF;
        return var1 < 128 ? this.method2357() - 64 : this.method2359() - 49152;
    }

    @ObfuscatedName("df.al(I)I")
    public int method2370() {
        int var1 = this.field1973[this.field1966] & 0xFF;
        return var1 < 128 ? this.method2357() : this.method2359() - 32768;
    }

    @ObfuscatedName("df.ax(B)I")
    public int method2430() {
        return this.field1973[this.field1966] < 0 ? this.method2362() & Integer.MAX_VALUE : this.method2359();
    }

    @ObfuscatedName("df.az(B)I")
    public int method2469() {
        byte var1 = this.field1973[++this.field1966 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1973[++this.field1966 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("df.ad([IB)V")
    public void method2373(int[] arg0) {
        int var2 = this.field1966 / 8;
        this.field1966 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2362();
            int var5 = this.method2362();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1966 -= 8;
            this.method2345(var4);
            this.method2345(var5);
        }
    }

    @ObfuscatedName("df.aw([II)V")
    public void method2374(int[] arg0) {
        int var2 = this.field1966 / 8;
        this.field1966 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2362();
            int var5 = this.method2362();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1966 -= 8;
            this.method2345(var4);
            this.method2345(var5);
        }
    }

    @ObfuscatedName("df.as([IIII)V")
    public void method2375(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1966;
        this.field1966 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2362();
            int var8 = this.method2362();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1966 -= 8;
            this.method2345(var7);
            this.method2345(var8);
        }
        this.field1966 = var4;
    }

    @ObfuscatedName("df.ai([IIII)V")
    public void method2376(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1966;
        this.field1966 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2362();
            int var8 = this.method2362();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1966 -= 8;
            this.method2345(var7);
            this.method2345(var8);
        }
        this.field1966 = var4;
    }

    @ObfuscatedName("df.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2354(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1966;
        this.field1966 = 0;
        byte[] var4 = new byte[var3];
        this.method2400(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1966 = 0;
        this.method2343(var7.length);
        this.method2463(var7, 0, var7.length);
    }

    @ObfuscatedName("df.ap(II)I")
    public int method2378(int arg0) {
        int var2 = Statics.method2233(this.field1973, arg0, this.field1966);
        this.method2345(var2);
        return var2;
    }

    @ObfuscatedName("df.ar(B)Z")
    public boolean method2519() {
        this.field1966 -= 4;
        int var1 = Statics.method2233(this.field1973, 0, this.field1966);
        int var2 = this.method2362();
        return var1 == var2;
    }

    @ObfuscatedName("df.ac(II)V")
    public void method2562(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("df.aq(II)V")
    public void method2381(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("df.af(II)V")
    public void method2488(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("df.aa(B)I")
    public int method2383() {
        return this.field1973[++this.field1966 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("df.ab(I)I")
    public int method2384() {
        return -this.field1973[++this.field1966 - 1] & 0xFF;
    }

    @ObfuscatedName("df.av(B)I")
    public int method2385() {
        return 128 - this.field1973[++this.field1966 - 1] & 0xFF;
    }

    @ObfuscatedName("df.au(I)B")
    public byte method2496() {
        return (byte) (this.field1973[++this.field1966 - 1] - 128);
    }

    @ObfuscatedName("df.ay(I)B")
    public byte method2480() {
        return (byte) (128 - this.field1973[++this.field1966 - 1]);
    }

    @ObfuscatedName("df.ag(II)V")
    public void method2417(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) arg0;
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.an(II)V")
    public void method2455(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("df.am(II)V")
    public void method2545(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 + 128);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.at(B)I")
    public int method2481() {
        this.field1966 += 2;
        return ((this.field1973[this.field1966 - 1] & 0xFF) << 8) + (this.field1973[this.field1966 - 2] & 0xFF);
    }

    @ObfuscatedName("df.bi(I)I")
    public int method2542() {
        this.field1966 += 2;
        return ((this.field1973[this.field1966 - 2] & 0xFF) << 8) + (this.field1973[this.field1966 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("df.bl(I)I")
    public int method2393() {
        this.field1966 += 2;
        return ((this.field1973[this.field1966 - 1] & 0xFF) << 8) + (this.field1973[this.field1966 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("df.ba(S)I")
    public int method2394() {
        this.field1966 += 2;
        int var1 = ((this.field1973[this.field1966 - 1] & 0xFF) << 8) + (this.field1973[this.field1966 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.bk(B)I")
    public int method2422() {
        this.field1966 += 2;
        int var1 = ((this.field1973[this.field1966 - 2] & 0xFF) << 8) + (this.field1973[this.field1966 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.bd(I)I")
    public int method2428() {
        this.field1966 += 2;
        int var1 = ((this.field1973[this.field1966 - 1] & 0xFF) << 8) + (this.field1973[this.field1966 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.br(II)V")
    public void method2396(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 16);
        this.field1973[++this.field1966 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.bq(B)I")
    public int method2342() {
        this.field1966 += 3;
        return (this.field1973[this.field1966 - 1] & 0xFF) + ((this.field1973[this.field1966 - 2] & 0xFF) << 16) + ((this.field1973[this.field1966 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("df.bm(IB)V")
    public void method2453(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) arg0;
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 16);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("df.be(II)V")
    public void method2399(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
        this.field1973[++this.field1966 - 1] = (byte) arg0;
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 24);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("df.bb(II)V")
    public void method2440(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 16);
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 24);
        this.field1973[++this.field1966 - 1] = (byte) arg0;
        this.field1973[++this.field1966 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.bh(B)I")
    public int method2390() {
        this.field1966 += 4;
        return (this.field1973[this.field1966 - 4] & 0xFF) + ((this.field1973[this.field1966 - 3] & 0xFF) << 8) + ((this.field1973[this.field1966 - 2] & 0xFF) << 16) + ((this.field1973[this.field1966 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("df.bg(B)I")
    public int method2402() {
        this.field1966 += 4;
        return (this.field1973[this.field1966 - 3] & 0xFF) + ((this.field1973[this.field1966 - 4] & 0xFF) << 8) + ((this.field1973[this.field1966 - 2] & 0xFF) << 24) + ((this.field1973[this.field1966 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("df.bw(I)I")
    public int method2403() {
        this.field1966 += 4;
        return (this.field1973[this.field1966 - 2] & 0xFF) + ((this.field1973[this.field1966 - 1] & 0xFF) << 8) + ((this.field1973[this.field1966 - 3] & 0xFF) << 24) + ((this.field1973[this.field1966 - 4] & 0xFF) << 16);
    }
}
