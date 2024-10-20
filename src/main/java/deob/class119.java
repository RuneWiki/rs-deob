package deob;

import java.math.BigInteger;

@ObfuscatedName("dx")
public class class119 extends class208 {

    @ObfuscatedName("dx.v")
    public byte[] field1988;

    @ObfuscatedName("dx.f")
    public int field1984;

    @ObfuscatedName("dx.i")
    public static int[] field1986 = new int[256];

    @ObfuscatedName("dx.o")
    public static long[] field1983;

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
            field1986[var0] = var1;
        }
        field1983 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1983[var3] = var4;
        }
    }

    @ObfuscatedName("dn.v([BIII)I")
    public static int method2670(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1986[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("be.f([BII)I")
    public static int method1504(byte[] arg0, int arg1) {
        return method2670(arg0, 0, arg1);
    }

    public class119(int arg0) {
        this.field1988 = class121.method2596(arg0);
        this.field1984 = 0;
    }

    public class119(byte[] arg0) {
        this.field1988 = arg0;
        this.field1984 = 0;
    }

    @ObfuscatedName("dx.i(II)V")
    public void method2398(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.d(II)V")
    public void method2336(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.o(II)V")
    public void method2451(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.c(II)V")
    public void method2338(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.p(J)V")
    public void method2339(long arg0) {
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1988[++this.field1984 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dx.j(J)V")
    public void method2340(long arg0) {
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1988[++this.field1984 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1988[++this.field1984 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fn.a(Ljava/lang/String;B)I")
    public static int method2931(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dx.y(Ljava/lang/String;I)V")
    public void method2440(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1984 += class165.method834(arg0, 0, arg0.length(), this.field1988, this.field1984);
        this.field1988[++this.field1984 - 1] = 0;
    }

    @ObfuscatedName("dx.h(Ljava/lang/String;B)V")
    public void method2342(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1988[++this.field1984 - 1] = 0;
        this.field1984 += class165.method834(arg0, 0, arg0.length(), this.field1988, this.field1984);
        this.field1988[++this.field1984 - 1] = 0;
    }

    @ObfuscatedName("dx.z(Ljava/lang/CharSequence;B)V")
    public void method2343(CharSequence arg0) {
        int var2 = class209.method3361(arg0);
        this.field1988[++this.field1984 - 1] = 0;
        this.method2349(var2);
        this.field1984 += class209.method2709(this.field1988, this.field1984, arg0);
    }

    @ObfuscatedName("dx.w([BIII)V")
    public void method2344(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1988[++this.field1984 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dx.l(II)V")
    public void method2345(int arg0) {
        this.field1988[this.field1984 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1988[this.field1984 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1988[this.field1984 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1988[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.q(IB)V")
    public void method2346(int arg0) {
        this.field1988[this.field1984 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1988[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.x(II)V")
    public void method2347(int arg0) {
        this.field1988[this.field1984 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.s(II)V")
    public void method2348(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2398(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2336(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.n(II)V")
    public void method2349(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2398(arg0 >>> 28 | 0x80);
                    }
                    this.method2398(arg0 >>> 21 | 0x80);
                }
                this.method2398(arg0 >>> 14 | 0x80);
            }
            this.method2398(arg0 >>> 7 | 0x80);
        }
        this.method2398(arg0 & 0x7F);
    }

    @ObfuscatedName("dx.u(I)I")
    public int method2400() {
        return this.field1988[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.m(I)B")
    public byte method2350() {
        return this.field1988[++this.field1984 - 1];
    }

    @ObfuscatedName("dx.e(I)I")
    public int method2334() {
        this.field1984 += 2;
        return ((this.field1988[this.field1984 - 2] & 0xFF) << 8) + (this.field1988[this.field1984 - 1] & 0xFF);
    }

    @ObfuscatedName("dx.k(I)I")
    public int method2538() {
        this.field1984 += 2;
        int var1 = ((this.field1988[this.field1984 - 2] & 0xFF) << 8) + (this.field1988[this.field1984 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.r(I)I")
    public int method2353() {
        this.field1984 += 3;
        return (this.field1988[this.field1984 - 1] & 0xFF) + ((this.field1988[this.field1984 - 3] & 0xFF) << 16) + ((this.field1988[this.field1984 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dx.b(I)I")
    public int method2354() {
        this.field1984 += 4;
        return (this.field1988[this.field1984 - 1] & 0xFF) + ((this.field1988[this.field1984 - 2] & 0xFF) << 8) + ((this.field1988[this.field1984 - 4] & 0xFF) << 24) + ((this.field1988[this.field1984 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.t(B)J")
    public long method2452() {
        long var1 = (long) this.method2354() & 0xFFFFFFFFL;
        long var3 = (long) this.method2354() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dx.g(B)Ljava/lang/String;")
    public String method2413() {
        if (this.field1988[this.field1984] == 0) {
            this.field1984++;
            return null;
        } else {
            return this.method2357();
        }
    }

    @ObfuscatedName("dx.af(I)Ljava/lang/String;")
    public String method2357() {
        int var1 = this.field1984;
        while (this.field1988[++this.field1984 - 1] != 0) {
        }
        int var2 = this.field1984 - var1 - 1;
        return var2 == 0 ? "" : class165.method922(this.field1988, var1, var2);
    }

    @ObfuscatedName("dx.ad(I)Ljava/lang/String;")
    public String method2366() {
        byte var1 = this.field1988[++this.field1984 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1984;
        while (this.field1988[++this.field1984 - 1] != 0) {
        }
        int var3 = this.field1984 - var2 - 1;
        return var3 == 0 ? "" : class165.method922(this.field1988, var2, var3);
    }

    @ObfuscatedName("dx.ak(I)Ljava/lang/String;")
    public String method2359() {
        byte var1 = this.field1988[++this.field1984 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2418();
        if (this.field1984 + var2 > this.field1988.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method709(this.field1988, this.field1984, var2);
        this.field1984 += var2;
        return var3;
    }

    @ObfuscatedName("dx.ai([BIII)V")
    public void method2360(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1988[++this.field1984 - 1];
        }
    }

    @ObfuscatedName("dx.au(B)I")
    public int method2361() {
        int var1 = this.field1988[this.field1984] & 0xFF;
        return var1 < 128 ? this.method2400() - 64 : this.method2334() - 49152;
    }

    @ObfuscatedName("dx.ar(B)I")
    public int method2362() {
        int var1 = this.field1988[this.field1984] & 0xFF;
        return var1 < 128 ? this.method2400() : this.method2334() - 32768;
    }

    @ObfuscatedName("dx.aw(I)I")
    public int method2363() {
        return this.field1988[this.field1984] < 0 ? this.method2354() & Integer.MAX_VALUE : this.method2334();
    }

    @ObfuscatedName("dx.at(S)I")
    public int method2418() {
        byte var1 = this.field1988[++this.field1984 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1988[++this.field1984 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dx.al([II)V")
    public void method2365(int[] arg0) {
        int var2 = this.field1984 / 8;
        this.field1984 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2354();
            int var5 = this.method2354();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1984 -= 8;
            this.method2338(var4);
            this.method2338(var5);
        }
    }

    @ObfuscatedName("dx.aj([IB)V")
    public void method2469(int[] arg0) {
        int var2 = this.field1984 / 8;
        this.field1984 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2354();
            int var5 = this.method2354();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1984 -= 8;
            this.method2338(var4);
            this.method2338(var5);
        }
    }

    @ObfuscatedName("dx.ag([IIII)V")
    public void method2367(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1984;
        this.field1984 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2354();
            int var8 = this.method2354();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1984 -= 8;
            this.method2338(var7);
            this.method2338(var8);
        }
        this.field1984 = var4;
    }

    @ObfuscatedName("dx.ay([IIII)V")
    public void method2368(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1984;
        this.field1984 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2354();
            int var8 = this.method2354();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1984 -= 8;
            this.method2338(var7);
            this.method2338(var8);
        }
        this.field1984 = var4;
    }

    @ObfuscatedName("dx.az(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2428(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1984;
        this.field1984 = 0;
        byte[] var4 = new byte[var3];
        this.method2360(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1984 = 0;
        this.method2336(var7.length);
        this.method2344(var7, 0, var7.length);
    }

    @ObfuscatedName("dx.ac(IB)I")
    public int method2505(int arg0) {
        int var2 = method2670(this.field1988, arg0, this.field1984);
        this.method2338(var2);
        return var2;
    }

    @ObfuscatedName("dx.aa(I)Z")
    public boolean method2371() {
        this.field1984 -= 4;
        int var1 = method2670(this.field1988, 0, this.field1984);
        int var2 = this.method2354();
        return var1 == var2;
    }

    @ObfuscatedName("dx.ao(II)V")
    public void method2372(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.av(IB)V")
    public void method2373(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dx.am(II)V")
    public void method2374(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dx.an(I)I")
    public int method2507() {
        return this.field1988[++this.field1984 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dx.ae(I)I")
    public int method2447() {
        return -this.field1988[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ap(I)I")
    public int method2377() {
        return 128 - this.field1988[++this.field1984 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ax(I)B")
    public byte method2378() {
        return (byte) (-this.field1988[++this.field1984 - 1]);
    }

    @ObfuscatedName("dx.ab(I)B")
    public byte method2379() {
        return (byte) (128 - this.field1988[++this.field1984 - 1]);
    }

    @ObfuscatedName("dx.as(II)V")
    public void method2380(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.ah(IB)V")
    public void method2381(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.aq(II)V")
    public void method2382(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 + 128);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bw(I)I")
    public int method2383() {
        this.field1984 += 2;
        return ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + (this.field1988[this.field1984 - 2] & 0xFF);
    }

    @ObfuscatedName("dx.bt(I)I")
    public int method2384() {
        this.field1984 += 2;
        return ((this.field1988[this.field1984 - 2] & 0xFF) << 8) + (this.field1988[this.field1984 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bn(I)I")
    public int method2385() {
        this.field1984 += 2;
        return ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + (this.field1988[this.field1984 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.br(B)I")
    public int method2386() {
        this.field1984 += 2;
        int var1 = ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + (this.field1988[this.field1984 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bc(B)I")
    public int method2422() {
        this.field1984 += 2;
        int var1 = ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + (this.field1988[this.field1984 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bp(IB)V")
    public void method2463(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.bd(I)I")
    public int method2389() {
        this.field1984 += 3;
        return (this.field1988[this.field1984 - 3] & 0xFF) + ((this.field1988[this.field1984 - 1] & 0xFF) << 16) + ((this.field1988[this.field1984 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dx.bm(II)V")
    public void method2429(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dx.ba(II)V")
    public void method2351(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dx.bg(II)V")
    public void method2458(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 16);
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 24);
        this.field1988[++this.field1984 - 1] = (byte) arg0;
        this.field1988[++this.field1984 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bu(B)I")
    public int method2393() {
        this.field1984 += 4;
        return (this.field1988[this.field1984 - 4] & 0xFF) + ((this.field1988[this.field1984 - 3] & 0xFF) << 8) + ((this.field1988[this.field1984 - 1] & 0xFF) << 24) + ((this.field1988[this.field1984 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bz(B)I")
    public int method2394() {
        this.field1984 += 4;
        return (this.field1988[this.field1984 - 3] & 0xFF) + ((this.field1988[this.field1984 - 4] & 0xFF) << 8) + ((this.field1988[this.field1984 - 2] & 0xFF) << 24) + ((this.field1988[this.field1984 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bx(I)I")
    public int method2395() {
        this.field1984 += 4;
        return (this.field1988[this.field1984 - 2] & 0xFF) + ((this.field1988[this.field1984 - 1] & 0xFF) << 8) + ((this.field1988[this.field1984 - 3] & 0xFF) << 24) + ((this.field1988[this.field1984 - 4] & 0xFF) << 16);
    }
}
