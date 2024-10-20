package deob;

import java.math.BigInteger;

@ObfuscatedName("dx")
public class class119 extends class208 {

    @ObfuscatedName("dx.m")
    public byte[] field1959;

    @ObfuscatedName("dx.l")
    public int field1955;

    @ObfuscatedName("dx.y")
    public static int[] field1954 = new int[256];

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
            field1954[var0] = var1;
        }
    }

    @ObfuscatedName("ei.m([BIIB)I")
    public static int method2988(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1954[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1959 = class121.method2626(arg0);
        this.field1955 = 0;
    }

    public class119(byte[] arg0) {
        this.field1959 = arg0;
        this.field1955 = 0;
    }

    @ObfuscatedName("dx.l(II)V")
    public void method2366(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.y(II)V")
    public void method2466(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1959[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.u(II)V")
    public void method2381(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1959[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.k(II)V")
    public void method2514(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 24);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1959[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.j(J)V")
    public void method2370(long arg0) {
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1959[++this.field1955 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dx.i(J)V")
    public void method2371(long arg0) {
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1959[++this.field1955 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1959[++this.field1955 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ej.x(Ljava/lang/String;I)I")
    public static int method2753(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dx.g(Ljava/lang/String;I)V")
    public void method2372(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1955 += class165.method2782(arg0, 0, arg0.length(), this.field1959, this.field1955);
        this.field1959[++this.field1955 - 1] = 0;
    }

    @ObfuscatedName("dx.e(Ljava/lang/String;I)V")
    public void method2373(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1959[++this.field1955 - 1] = 0;
        this.field1955 += class165.method2782(arg0, 0, arg0.length(), this.field1959, this.field1955);
        this.field1959[++this.field1955 - 1] = 0;
    }

    @ObfuscatedName("dx.p(Ljava/lang/CharSequence;I)V")
    public void method2374(CharSequence arg0) {
        int var2 = class209.method1031(arg0);
        this.field1959[++this.field1955 - 1] = 0;
        this.method2380(var2);
        int var3 = this.field1955;
        byte[] var4 = this.field1959;
        int var5 = this.field1955;
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
        this.field1955 = var10 + var3;
    }

    @ObfuscatedName("dx.a([BIII)V")
    public void method2375(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1959[++this.field1955 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dx.v(II)V")
    public void method2376(int arg0) {
        this.field1959[this.field1955 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1959[this.field1955 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1959[this.field1955 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1959[this.field1955 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.c(II)V")
    public void method2377(int arg0) {
        this.field1959[this.field1955 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1959[this.field1955 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.s(IS)V")
    public void method2533(int arg0) {
        this.field1959[this.field1955 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.r(II)V")
    public void method2379(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2366(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2466(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.h(II)V")
    public void method2380(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2366(arg0 >>> 28 | 0x80);
                    }
                    this.method2366(arg0 >>> 21 | 0x80);
                }
                this.method2366(arg0 >>> 14 | 0x80);
            }
            this.method2366(arg0 >>> 7 | 0x80);
        }
        this.method2366(arg0 & 0x7F);
    }

    @ObfuscatedName("dx.n(I)I")
    public int method2562() {
        return this.field1959[++this.field1955 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.b(I)B")
    public byte method2382() {
        return this.field1959[++this.field1955 - 1];
    }

    @ObfuscatedName("dx.f(I)I")
    public int method2541() {
        this.field1955 += 2;
        return ((this.field1959[this.field1955 - 2] & 0xFF) << 8) + (this.field1959[this.field1955 - 1] & 0xFF);
    }

    @ObfuscatedName("dx.d(B)I")
    public int method2384() {
        this.field1955 += 2;
        int var1 = ((this.field1959[this.field1955 - 2] & 0xFF) << 8) + (this.field1959[this.field1955 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.q(I)I")
    public int method2385() {
        this.field1955 += 3;
        return (this.field1959[this.field1955 - 1] & 0xFF) + ((this.field1959[this.field1955 - 2] & 0xFF) << 8) + ((this.field1959[this.field1955 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.o(I)I")
    public int method2386() {
        this.field1955 += 4;
        return (this.field1959[this.field1955 - 1] & 0xFF) + ((this.field1959[this.field1955 - 2] & 0xFF) << 8) + ((this.field1959[this.field1955 - 4] & 0xFF) << 24) + ((this.field1959[this.field1955 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.w(I)J")
    public long method2387() {
        long var1 = (long) this.method2386() & 0xFFFFFFFFL;
        long var3 = (long) this.method2386() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dx.z(I)Ljava/lang/String;")
    public String method2388() {
        if (this.field1959[this.field1955] == 0) {
            this.field1955++;
            return null;
        } else {
            return this.method2389();
        }
    }

    @ObfuscatedName("dx.t(I)Ljava/lang/String;")
    public String method2389() {
        int var1 = this.field1955;
        while (this.field1959[++this.field1955 - 1] != 0) {
        }
        int var2 = this.field1955 - var1 - 1;
        return var2 == 0 ? "" : class165.method49(this.field1959, var1, var2);
    }

    @ObfuscatedName("dx.aq(B)Ljava/lang/String;")
    public String method2390() {
        byte var1 = this.field1959[++this.field1955 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1955;
        while (this.field1959[++this.field1955 - 1] != 0) {
        }
        int var3 = this.field1955 - var2 - 1;
        return var3 == 0 ? "" : class165.method49(this.field1959, var2, var3);
    }

    @ObfuscatedName("dx.an(I)Ljava/lang/String;")
    public String method2412() {
        byte var1 = this.field1959[++this.field1955 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2396();
        if (this.field1955 + var2 > this.field1959.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method3020(this.field1959, this.field1955, var2);
        this.field1955 += var2;
        return var3;
    }

    @ObfuscatedName("dx.av([BIIS)V")
    public void method2392(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1959[++this.field1955 - 1];
        }
    }

    @ObfuscatedName("dx.ac(B)I")
    public int method2393() {
        int var1 = this.field1959[this.field1955] & 0xFF;
        return var1 < 128 ? this.method2562() - 64 : this.method2541() - 49152;
    }

    @ObfuscatedName("dx.ar(I)I")
    public int method2394() {
        int var1 = this.field1959[this.field1955] & 0xFF;
        return var1 < 128 ? this.method2562() : this.method2541() - 32768;
    }

    @ObfuscatedName("dx.ah(B)I")
    public int method2568() {
        return this.field1959[this.field1955] < 0 ? this.method2386() & Integer.MAX_VALUE : this.method2541();
    }

    @ObfuscatedName("dx.ab(I)I")
    public int method2396() {
        byte var1 = this.field1959[++this.field1955 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1959[++this.field1955 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dx.au([II)V")
    public void method2445(int[] arg0) {
        int var2 = this.field1955 / 8;
        this.field1955 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2386();
            int var5 = this.method2386();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1955 -= 8;
            this.method2514(var4);
            this.method2514(var5);
        }
    }

    @ObfuscatedName("dx.ao([II)V")
    public void method2398(int[] arg0) {
        int var2 = this.field1955 / 8;
        this.field1955 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2386();
            int var5 = this.method2386();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1955 -= 8;
            this.method2514(var4);
            this.method2514(var5);
        }
    }

    @ObfuscatedName("dx.am([IIIB)V")
    public void method2399(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1955;
        this.field1955 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2386();
            int var8 = this.method2386();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1955 -= 8;
            this.method2514(var7);
            this.method2514(var8);
        }
        this.field1955 = var4;
    }

    @ObfuscatedName("dx.aa([IIII)V")
    public void method2531(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1955;
        this.field1955 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2386();
            int var8 = this.method2386();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1955 -= 8;
            this.method2514(var7);
            this.method2514(var8);
        }
        this.field1955 = var4;
    }

    @ObfuscatedName("dx.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2419(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1955;
        this.field1955 = 0;
        byte[] var4 = new byte[var3];
        this.method2392(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1955 = 0;
        this.method2466(var7.length);
        this.method2375(var7, 0, var7.length);
    }

    @ObfuscatedName("dx.ap(IB)I")
    public int method2503(int arg0) {
        int var2 = method2988(this.field1959, arg0, this.field1955);
        this.method2514(var2);
        return var2;
    }

    @ObfuscatedName("dx.at(I)Z")
    public boolean method2403() {
        this.field1955 -= 4;
        int var1 = method2988(this.field1959, 0, this.field1955);
        int var2 = this.method2386();
        return var1 == var2;
    }

    @ObfuscatedName("dx.az(IB)V")
    public void method2404(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ai(II)V")
    public void method2405(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dx.af(IB)V")
    public void method2406(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dx.aw(I)I")
    public int method2395() {
        return this.field1959[++this.field1955 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dx.al(S)I")
    public int method2408() {
        return -this.field1959[++this.field1955 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ax(B)I")
    public int method2409() {
        return 128 - this.field1959[++this.field1955 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ag(I)B")
    public byte method2425() {
        return (byte) (this.field1959[++this.field1955 - 1] - 128);
    }

    @ObfuscatedName("dx.ak(I)B")
    public byte method2411() {
        return (byte) (-this.field1959[++this.field1955 - 1]);
    }

    @ObfuscatedName("dx.ad(B)B")
    public byte method2444() {
        return (byte) (128 - this.field1959[++this.field1955 - 1]);
    }

    @ObfuscatedName("dx.ae(II)V")
    public void method2440(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) arg0;
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.as(II)V")
    public void method2496(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ay(II)V")
    public void method2415(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 + 128);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bz(I)I")
    public int method2416() {
        this.field1955 += 2;
        return ((this.field1959[this.field1955 - 1] & 0xFF) << 8) + (this.field1959[this.field1955 - 2] & 0xFF);
    }

    @ObfuscatedName("dx.bx(I)I")
    public int method2572() {
        this.field1955 += 2;
        return ((this.field1959[this.field1955 - 2] & 0xFF) << 8) + (this.field1959[this.field1955 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bq(I)I")
    public int method2418() {
        this.field1955 += 2;
        return ((this.field1959[this.field1955 - 1] & 0xFF) << 8) + (this.field1959[this.field1955 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bg(I)I")
    public int method2438() {
        this.field1955 += 2;
        int var1 = ((this.field1959[this.field1955 - 1] & 0xFF) << 8) + (this.field1959[this.field1955 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bi(I)I")
    public int method2420() {
        this.field1955 += 2;
        int var1 = ((this.field1959[this.field1955 - 2] & 0xFF) << 8) + (this.field1959[this.field1955 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bd(B)I")
    public int method2421() {
        this.field1955 += 2;
        int var1 = ((this.field1959[this.field1955 - 1] & 0xFF) << 8) + (this.field1959[this.field1955 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bw(II)V")
    public void method2580(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1959[++this.field1955 - 1] = (byte) arg0;
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.br(II)V")
    public void method2423(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) arg0;
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dx.bb(II)V")
    public void method2432(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1959[++this.field1955 - 1] = (byte) arg0;
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 24);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dx.ba(IB)V")
    public void method2487(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 24);
        this.field1959[++this.field1955 - 1] = (byte) arg0;
        this.field1959[++this.field1955 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bt(I)I")
    public int method2491() {
        this.field1955 += 4;
        return (this.field1959[this.field1955 - 4] & 0xFF) + ((this.field1959[this.field1955 - 3] & 0xFF) << 8) + ((this.field1959[this.field1955 - 1] & 0xFF) << 24) + ((this.field1959[this.field1955 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bk(I)I")
    public int method2365() {
        this.field1955 += 4;
        return (this.field1959[this.field1955 - 3] & 0xFF) + ((this.field1959[this.field1955 - 4] & 0xFF) << 8) + ((this.field1959[this.field1955 - 2] & 0xFF) << 24) + ((this.field1959[this.field1955 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bo(I)I")
    public int method2428() {
        this.field1955 += 4;
        return (this.field1959[this.field1955 - 2] & 0xFF) + ((this.field1959[this.field1955 - 1] & 0xFF) << 8) + ((this.field1959[this.field1955 - 3] & 0xFF) << 24) + ((this.field1959[this.field1955 - 4] & 0xFF) << 16);
    }
}
