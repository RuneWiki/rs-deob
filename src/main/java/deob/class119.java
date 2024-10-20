package deob;

import java.math.BigInteger;

@ObfuscatedName("dc")
public class class119 extends class208 {

    @ObfuscatedName("dc.j")
    public byte[] field1996;

    @ObfuscatedName("dc.l")
    public int field1999;

    @ObfuscatedName("dc.a")
    public static int[] field1994 = new int[256];

    @ObfuscatedName("dc.f")
    public static long[] field1992;

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
            field1994[var0] = var1;
        }
        field1992 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1992[var3] = var4;
        }
    }

    @ObfuscatedName("f.j([BII)I")
    public static int method39(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1994[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class119(int arg0) {
        this.field1996 = class121.method2541(arg0);
        this.field1999 = 0;
    }

    public class119(byte[] arg0) {
        this.field1996 = arg0;
        this.field1999 = 0;
    }

    @ObfuscatedName("dc.l(IB)V")
    public void method2301(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.a(IB)V")
    public void method2404(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field1996[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.i(II)V")
    public void method2320(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field1996[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.f(IB)V")
    public void method2304(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 24);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field1996[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.m(J)V")
    public void method2305(long arg0) {
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1996[++this.field1999 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dc.o(J)V")
    public void method2433(long arg0) {
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1996[++this.field1999 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1996[++this.field1999 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("as.h(Ljava/lang/String;B)I")
    public static int method730(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dc.n(Ljava/lang/String;B)V")
    public void method2307(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1999 += class165.method2913(arg0, 0, arg0.length(), this.field1996, this.field1999);
        this.field1996[++this.field1999 - 1] = 0;
    }

    @ObfuscatedName("df.k(Ljava/lang/String;I)I")
    public static int method2547(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dc.r(Ljava/lang/String;I)V")
    public void method2361(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1996[++this.field1999 - 1] = 0;
        this.field1999 += class165.method2913(arg0, 0, arg0.length(), this.field1996, this.field1999);
        this.field1996[++this.field1999 - 1] = 0;
    }

    @ObfuscatedName("dc.b(Ljava/lang/CharSequence;I)V")
    public void method2309(CharSequence arg0) {
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
        this.field1996[++this.field1999 - 1] = 0;
        this.method2315(var3);
        this.field1999 += class209.method2915(this.field1996, this.field1999, arg0);
    }

    @ObfuscatedName("dc.q([BIIB)V")
    public void method2310(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1996[++this.field1999 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dc.u(II)V")
    public void method2311(int arg0) {
        this.field1996[this.field1999 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1996[this.field1999 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1996[this.field1999 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1996[this.field1999 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.g(II)V")
    public void method2377(int arg0) {
        this.field1996[this.field1999 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1996[this.field1999 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.y(IB)V")
    public void method2313(int arg0) {
        this.field1996[this.field1999 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.s(IB)V")
    public void method2453(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2301(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2404(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.d(IB)V")
    public void method2315(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2301(arg0 >>> 28 | 0x80);
                    }
                    this.method2301(arg0 >>> 21 | 0x80);
                }
                this.method2301(arg0 >>> 14 | 0x80);
            }
            this.method2301(arg0 >>> 7 | 0x80);
        }
        this.method2301(arg0 & 0x7F);
    }

    @ObfuscatedName("dc.z(I)I")
    public int method2316() {
        return this.field1996[++this.field1999 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.p(I)B")
    public byte method2317() {
        return this.field1996[++this.field1999 - 1];
    }

    @ObfuscatedName("dc.w(I)I")
    public int method2318() {
        this.field1999 += 2;
        return ((this.field1996[this.field1999 - 2] & 0xFF) << 8) + (this.field1996[this.field1999 - 1] & 0xFF);
    }

    @ObfuscatedName("dc.t(B)I")
    public int method2421() {
        this.field1999 += 2;
        int var1 = ((this.field1996[this.field1999 - 2] & 0xFF) << 8) + (this.field1996[this.field1999 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.c(B)I")
    public int method2416() {
        this.field1999 += 3;
        return (this.field1996[this.field1999 - 1] & 0xFF) + ((this.field1996[this.field1999 - 3] & 0xFF) << 16) + ((this.field1996[this.field1999 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dc.x(B)I")
    public int method2321() {
        this.field1999 += 4;
        return (this.field1996[this.field1999 - 1] & 0xFF) + ((this.field1996[this.field1999 - 2] & 0xFF) << 8) + ((this.field1996[this.field1999 - 4] & 0xFF) << 24) + ((this.field1996[this.field1999 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.e(B)J")
    public long method2495() {
        long var1 = (long) this.method2321() & 0xFFFFFFFFL;
        long var3 = (long) this.method2321() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dc.v(B)Ljava/lang/String;")
    public String method2323() {
        if (this.field1996[this.field1999] == 0) {
            this.field1999++;
            return null;
        } else {
            return this.method2324();
        }
    }

    @ObfuscatedName("dc.ab(I)Ljava/lang/String;")
    public String method2324() {
        int var1 = this.field1999;
        while (this.field1996[++this.field1999 - 1] != 0) {
        }
        int var2 = this.field1999 - var1 - 1;
        return var2 == 0 ? "" : class165.method783(this.field1996, var1, var2);
    }

    @ObfuscatedName("dc.ak(I)Ljava/lang/String;")
    public String method2306() {
        byte var1 = this.field1996[++this.field1999 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1999;
        while (this.field1996[++this.field1999 - 1] != 0) {
        }
        int var3 = this.field1999 - var2 - 1;
        return var3 == 0 ? "" : class165.method783(this.field1996, var2, var3);
    }

    @ObfuscatedName("dc.am(B)Ljava/lang/String;")
    public String method2326() {
        byte var1 = this.field1996[++this.field1999 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2331();
        if (this.field1999 + var2 > this.field1996.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method3325(this.field1996, this.field1999, var2);
        this.field1999 += var2;
        return var3;
    }

    @ObfuscatedName("dc.aw([BIII)V")
    public void method2397(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1996[++this.field1999 - 1];
        }
    }

    @ObfuscatedName("dc.az(I)I")
    public int method2328() {
        int var1 = this.field1996[this.field1999] & 0xFF;
        return var1 < 128 ? this.method2316() - 64 : this.method2318() - 49152;
    }

    @ObfuscatedName("dc.ac(B)I")
    public int method2329() {
        int var1 = this.field1996[this.field1999] & 0xFF;
        return var1 < 128 ? this.method2316() : this.method2318() - 32768;
    }

    @ObfuscatedName("dc.ax(B)I")
    public int method2330() {
        return this.field1996[this.field1999] < 0 ? this.method2321() & Integer.MAX_VALUE : this.method2318();
    }

    @ObfuscatedName("dc.ai(I)I")
    public int method2331() {
        byte var1 = this.field1996[++this.field1999 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1996[++this.field1999 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dc.ar([II)V")
    public void method2332(int[] arg0) {
        int var2 = this.field1999 / 8;
        this.field1999 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2321();
            int var5 = this.method2321();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1999 -= 8;
            this.method2304(var4);
            this.method2304(var5);
        }
    }

    @ObfuscatedName("dc.aa([II)V")
    public void method2333(int[] arg0) {
        int var2 = this.field1999 / 8;
        this.field1999 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2321();
            int var5 = this.method2321();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1999 -= 8;
            this.method2304(var4);
            this.method2304(var5);
        }
    }

    @ObfuscatedName("dc.as([IIII)V")
    public void method2308(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1999;
        this.field1999 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2321();
            int var8 = this.method2321();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1999 -= 8;
            this.method2304(var7);
            this.method2304(var8);
        }
        this.field1999 = var4;
    }

    @ObfuscatedName("dc.ag([IIIB)V")
    public void method2335(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1999;
        this.field1999 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2321();
            int var8 = this.method2321();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1999 -= 8;
            this.method2304(var7);
            this.method2304(var8);
        }
        this.field1999 = var4;
    }

    @ObfuscatedName("dc.af(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2487(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1999;
        this.field1999 = 0;
        byte[] var4 = new byte[var3];
        this.method2397(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1999 = 0;
        this.method2404(var7.length);
        this.method2310(var7, 0, var7.length);
    }

    @ObfuscatedName("dc.ao(II)I")
    public int method2337(int arg0) {
        byte[] var2 = this.field1996;
        int var3 = this.field1999;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1994[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2304(var6);
        return var6;
    }

    @ObfuscatedName("dc.an(I)Z")
    public boolean method2338() {
        this.field1999 -= 4;
        byte[] var1 = this.field1996;
        int var2 = this.field1999;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1994[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2321();
        return var5 == var8;
    }

    @ObfuscatedName("dc.at(II)V")
    public void method2339(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.al(II)V")
    public void method2340(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dc.aq(II)V")
    public void method2485(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dc.ae(B)I")
    public int method2434() {
        return this.field1996[++this.field1999 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dc.ap(I)I")
    public int method2349() {
        return -this.field1996[++this.field1999 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.ad(S)I")
    public int method2344() {
        return 128 - this.field1996[++this.field1999 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.au(I)B")
    public byte method2345() {
        return (byte) (this.field1996[++this.field1999 - 1] - 128);
    }

    @ObfuscatedName("dc.ay(I)B")
    public byte method2439() {
        return (byte) (-this.field1996[++this.field1999 - 1]);
    }

    @ObfuscatedName("dc.av(II)V")
    public void method2347(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) arg0;
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.ah(II)V")
    public void method2427(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.aj(II)V")
    public void method2303(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 + 128);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bs(I)I")
    public int method2350() {
        this.field1999 += 2;
        return ((this.field1996[this.field1999 - 1] & 0xFF) << 8) + (this.field1996[this.field1999 - 2] & 0xFF);
    }

    @ObfuscatedName("dc.bv(B)I")
    public int method2351() {
        this.field1999 += 2;
        return ((this.field1996[this.field1999 - 2] & 0xFF) << 8) + (this.field1996[this.field1999 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bw(I)I")
    public int method2352() {
        this.field1999 += 2;
        return ((this.field1996[this.field1999 - 1] & 0xFF) << 8) + (this.field1996[this.field1999 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bg(I)I")
    public int method2353() {
        this.field1999 += 2;
        int var1 = ((this.field1996[this.field1999 - 2] & 0xFF) << 8) + (this.field1996[this.field1999 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bq(I)I")
    public int method2362() {
        this.field1999 += 2;
        int var1 = ((this.field1996[this.field1999 - 1] & 0xFF) << 8) + (this.field1996[this.field1999 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bl(II)V")
    public void method2341(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field1996[++this.field1999 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.br(S)I")
    public int method2356() {
        this.field1999 += 3;
        return (this.field1996[this.field1999 - 3] & 0xFF) + ((this.field1996[this.field1999 - 2] & 0xFF) << 8) + ((this.field1996[this.field1999 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.bk(IB)V")
    public void method2357(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) arg0;
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dc.be(II)V")
    public void method2470(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
        this.field1996[++this.field1999 - 1] = (byte) arg0;
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 24);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dc.bc(II)V")
    public void method2499(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 16);
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 24);
        this.field1996[++this.field1999 - 1] = (byte) arg0;
        this.field1996[++this.field1999 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bj(B)I")
    public int method2360() {
        this.field1999 += 4;
        return (this.field1996[this.field1999 - 4] & 0xFF) + ((this.field1996[this.field1999 - 3] & 0xFF) << 8) + ((this.field1996[this.field1999 - 1] & 0xFF) << 24) + ((this.field1996[this.field1999 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.bi(I)I")
    public int method2372() {
        this.field1999 += 4;
        return (this.field1996[this.field1999 - 3] & 0xFF) + ((this.field1996[this.field1999 - 4] & 0xFF) << 8) + ((this.field1996[this.field1999 - 1] & 0xFF) << 16) + ((this.field1996[this.field1999 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bd(B)I")
    public int method2402() {
        this.field1999 += 4;
        return (this.field1996[this.field1999 - 2] & 0xFF) + ((this.field1996[this.field1999 - 1] & 0xFF) << 8) + ((this.field1996[this.field1999 - 4] & 0xFF) << 16) + ((this.field1996[this.field1999 - 3] & 0xFF) << 24);
    }
}
