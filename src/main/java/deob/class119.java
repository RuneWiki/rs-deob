package deob;

import java.math.BigInteger;

@ObfuscatedName("dk")
public class class119 extends class208 {

    @ObfuscatedName("dk.k")
    public byte[] field1960;

    @ObfuscatedName("dk.h")
    public int field1949;

    @ObfuscatedName("dk.o")
    public static int[] field1950 = new int[256];

    @ObfuscatedName("dk.c")
    public static long[] field1958;

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
            field1950[var0] = var1;
        }
        field1958 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1958[var3] = var4;
        }
    }

    @ObfuscatedName("fd.k([BIII)I")
    public static int method3151(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1950[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1960 = class121.method2560(arg0);
        this.field1949 = 0;
    }

    public class119(byte[] arg0) {
        this.field1960 = arg0;
        this.field1949 = 0;
    }

    @ObfuscatedName("dk.h(II)V")
    public void method2315(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.o(II)V")
    public void method2316(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
        this.field1960[++this.field1949 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.z(II)V")
    public void method2317(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 16);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
        this.field1960[++this.field1949 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.c(II)V")
    public void method2318(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 24);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 16);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
        this.field1960[++this.field1949 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.d(J)V")
    public void method2319(long arg0) {
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1960[++this.field1949 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dk.l(J)V")
    public void method2313(long arg0) {
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1960[++this.field1949 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1960[++this.field1949 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cr.b(Ljava/lang/String;I)I")
    public static int method1950(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dk.j(Ljava/lang/String;I)V")
    public void method2321(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1949 += class165.method707(arg0, 0, arg0.length(), this.field1960, this.field1949);
        this.field1960[++this.field1949 - 1] = 0;
    }

    @ObfuscatedName("dk.f(Ljava/lang/String;S)V")
    public void method2322(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1960[++this.field1949 - 1] = 0;
        this.field1949 += class165.method707(arg0, 0, arg0.length(), this.field1960, this.field1949);
        this.field1960[++this.field1949 - 1] = 0;
    }

    @ObfuscatedName("dk.i(Ljava/lang/CharSequence;I)V")
    public void method2323(CharSequence arg0) {
        int var2 = class209.method616(arg0);
        this.field1960[++this.field1949 - 1] = 0;
        this.method2482(var2);
        int var3 = this.field1949;
        byte[] var4 = this.field1960;
        int var5 = this.field1949;
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
        this.field1949 = var10 + var3;
    }

    @ObfuscatedName("dk.g([BIIS)V")
    public void method2320(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1960[++this.field1949 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dk.t(II)V")
    public void method2325(int arg0) {
        this.field1960[this.field1949 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1960[this.field1949 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1960[this.field1949 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1960[this.field1949 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.e(II)V")
    public void method2326(int arg0) {
        this.field1960[this.field1949 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1960[this.field1949 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.q(II)V")
    public void method2327(int arg0) {
        this.field1960[this.field1949 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.u(II)V")
    public void method2328(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2315(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2316(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dk.r(IB)V")
    public void method2482(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2315(arg0 >>> 28 | 0x80);
                    }
                    this.method2315(arg0 >>> 21 | 0x80);
                }
                this.method2315(arg0 >>> 14 | 0x80);
            }
            this.method2315(arg0 >>> 7 | 0x80);
        }
        this.method2315(arg0 & 0x7F);
    }

    @ObfuscatedName("dk.a(B)I")
    public int method2330() {
        return this.field1960[++this.field1949 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.m(I)B")
    public byte method2413() {
        return this.field1960[++this.field1949 - 1];
    }

    @ObfuscatedName("dk.y(I)I")
    public int method2332() {
        this.field1949 += 2;
        return ((this.field1960[this.field1949 - 2] & 0xFF) << 8) + (this.field1960[this.field1949 - 1] & 0xFF);
    }

    @ObfuscatedName("dk.x(I)I")
    public int method2333() {
        this.field1949 += 2;
        int var1 = ((this.field1960[this.field1949 - 2] & 0xFF) << 8) + (this.field1960[this.field1949 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.n(I)I")
    public int method2420() {
        this.field1949 += 3;
        return (this.field1960[this.field1949 - 1] & 0xFF) + ((this.field1960[this.field1949 - 3] & 0xFF) << 16) + ((this.field1960[this.field1949 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dk.v(I)I")
    public int method2415() {
        this.field1949 += 4;
        return (this.field1960[this.field1949 - 1] & 0xFF) + ((this.field1960[this.field1949 - 2] & 0xFF) << 8) + ((this.field1960[this.field1949 - 4] & 0xFF) << 24) + ((this.field1960[this.field1949 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.s(I)J")
    public long method2483() {
        long var1 = (long) this.method2415() & 0xFFFFFFFFL;
        long var3 = (long) this.method2415() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dk.w(B)Ljava/lang/String;")
    public String method2494() {
        if (this.field1960[this.field1949] == 0) {
            this.field1949++;
            return null;
        } else {
            return this.method2337();
        }
    }

    @ObfuscatedName("dk.p(B)Ljava/lang/String;")
    public String method2337() {
        int var1 = this.field1949;
        while (this.field1960[++this.field1949 - 1] != 0) {
        }
        int var2 = this.field1949 - var1 - 1;
        return var2 == 0 ? "" : class165.method2(this.field1960, var1, var2);
    }

    @ObfuscatedName("dk.ao(S)Ljava/lang/String;")
    public String method2338() {
        byte var1 = this.field1960[++this.field1949 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1949;
        while (this.field1960[++this.field1949 - 1] != 0) {
        }
        int var3 = this.field1949 - var2 - 1;
        return var3 == 0 ? "" : class165.method2(this.field1960, var2, var3);
    }

    @ObfuscatedName("dk.ae(B)Ljava/lang/String;")
    public String method2339() {
        byte var1 = this.field1960[++this.field1949 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2344();
        if (this.field1949 + var2 > this.field1960.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method908(this.field1960, this.field1949, var2);
        this.field1949 += var2;
        return var3;
    }

    @ObfuscatedName("dk.ay([BIIB)V")
    public void method2340(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1960[++this.field1949 - 1];
        }
    }

    @ObfuscatedName("dk.ad(I)I")
    public int method2341() {
        int var1 = this.field1960[this.field1949] & 0xFF;
        return var1 < 128 ? this.method2330() - 64 : this.method2332() - 49152;
    }

    @ObfuscatedName("dk.as(I)I")
    public int method2314() {
        int var1 = this.field1960[this.field1949] & 0xFF;
        return var1 < 128 ? this.method2330() : this.method2332() - 32768;
    }

    @ObfuscatedName("dk.ag(I)I")
    public int method2343() {
        return this.field1960[this.field1949] < 0 ? this.method2415() & Integer.MAX_VALUE : this.method2332();
    }

    @ObfuscatedName("dk.au(I)I")
    public int method2344() {
        byte var1 = this.field1960[++this.field1949 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1960[++this.field1949 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dk.ar([II)V")
    public void method2345(int[] arg0) {
        int var2 = this.field1949 / 8;
        this.field1949 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2415();
            int var5 = this.method2415();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1949 -= 8;
            this.method2318(var4);
            this.method2318(var5);
        }
    }

    @ObfuscatedName("dk.az([II)V")
    public void method2466(int[] arg0) {
        int var2 = this.field1949 / 8;
        this.field1949 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2415();
            int var5 = this.method2415();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1949 -= 8;
            this.method2318(var4);
            this.method2318(var5);
        }
    }

    @ObfuscatedName("dk.aw([IIII)V")
    public void method2347(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1949;
        this.field1949 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2415();
            int var8 = this.method2415();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1949 -= 8;
            this.method2318(var7);
            this.method2318(var8);
        }
        this.field1949 = var4;
    }

    @ObfuscatedName("dk.at([IIII)V")
    public void method2348(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1949;
        this.field1949 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2415();
            int var8 = this.method2415();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1949 -= 8;
            this.method2318(var7);
            this.method2318(var8);
        }
        this.field1949 = var4;
    }

    @ObfuscatedName("dk.ap(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2492(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1949;
        this.field1949 = 0;
        byte[] var4 = new byte[var3];
        this.method2340(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1949 = 0;
        this.method2316(var7.length);
        this.method2320(var7, 0, var7.length);
    }

    @ObfuscatedName("dk.al(II)I")
    public int method2365(int arg0) {
        int var2 = method3151(this.field1960, arg0, this.field1949);
        this.method2318(var2);
        return var2;
    }

    @ObfuscatedName("dk.aq(B)Z")
    public boolean method2350() {
        this.field1949 -= 4;
        int var1 = method3151(this.field1960, 0, this.field1949);
        int var2 = this.method2415();
        return var1 == var2;
    }

    @ObfuscatedName("dk.aa(II)V")
    public void method2439(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.ax(II)V")
    public void method2352(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dk.ah(II)V")
    public void method2469(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dk.av(I)I")
    public int method2461() {
        return this.field1960[++this.field1949 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dk.af(I)I")
    public int method2355() {
        return -this.field1960[++this.field1949 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.ai(I)I")
    public int method2356() {
        return 128 - this.field1960[++this.field1949 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.ak(I)B")
    public byte method2357() {
        return (byte) (this.field1960[++this.field1949 - 1] - 128);
    }

    @ObfuscatedName("dk.ab(B)B")
    public byte method2369() {
        return (byte) (-this.field1960[++this.field1949 - 1]);
    }

    @ObfuscatedName("dk.aj(II)V")
    public void method2354(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) arg0;
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.ac(IB)V")
    public void method2459(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.am(II)V")
    public void method2371(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 + 128);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.an(I)I")
    public int method2362() {
        this.field1949 += 2;
        return ((this.field1960[this.field1949 - 1] & 0xFF) << 8) + (this.field1960[this.field1949 - 2] & 0xFF);
    }

    @ObfuscatedName("dk.ba(I)I")
    public int method2363() {
        this.field1949 += 2;
        return ((this.field1960[this.field1949 - 2] & 0xFF) << 8) + (this.field1960[this.field1949 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.bf(I)I")
    public int method2364() {
        this.field1949 += 2;
        return ((this.field1960[this.field1949 - 1] & 0xFF) << 8) + (this.field1960[this.field1949 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.bm(I)I")
    public int method2452() {
        this.field1949 += 2;
        int var1 = ((this.field1960[this.field1949 - 1] & 0xFF) << 8) + (this.field1960[this.field1949 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.bp(B)I")
    public int method2366() {
        this.field1949 += 2;
        int var1 = ((this.field1960[this.field1949 - 2] & 0xFF) << 8) + (this.field1960[this.field1949 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.by(II)V")
    public void method2367(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) arg0;
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dk.bc(I)I")
    public int method2368() {
        this.field1949 += 3;
        return (this.field1960[this.field1949 - 2] & 0xFF) + ((this.field1960[this.field1949 - 1] & 0xFF) << 8) + ((this.field1960[this.field1949 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.be(II)V")
    public void method2435(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) arg0;
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 16);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dk.bw(II)V")
    public void method2370(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
        this.field1960[++this.field1949 - 1] = (byte) arg0;
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 24);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dk.bh(II)V")
    public void method2324(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 16);
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 24);
        this.field1960[++this.field1949 - 1] = (byte) arg0;
        this.field1960[++this.field1949 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.bn(I)I")
    public int method2372() {
        this.field1949 += 4;
        return (this.field1960[this.field1949 - 4] & 0xFF) + ((this.field1960[this.field1949 - 3] & 0xFF) << 8) + ((this.field1960[this.field1949 - 1] & 0xFF) << 24) + ((this.field1960[this.field1949 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.bx(B)I")
    public int method2498() {
        this.field1949 += 4;
        return (this.field1960[this.field1949 - 3] & 0xFF) + ((this.field1960[this.field1949 - 4] & 0xFF) << 8) + ((this.field1960[this.field1949 - 1] & 0xFF) << 16) + ((this.field1960[this.field1949 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.bs(B)I")
    public int method2374() {
        this.field1949 += 4;
        return (this.field1960[this.field1949 - 2] & 0xFF) + ((this.field1960[this.field1949 - 1] & 0xFF) << 8) + ((this.field1960[this.field1949 - 3] & 0xFF) << 24) + ((this.field1960[this.field1949 - 4] & 0xFF) << 16);
    }
}
