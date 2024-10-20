package deob;

import java.math.BigInteger;

@ObfuscatedName("db")
public class class123 extends class212 {

    @ObfuscatedName("db.a")
    public byte[] field2076;

    @ObfuscatedName("db.d")
    public int field2071;

    @ObfuscatedName("db.v")
    public static int[] field2072 = new int[256];

    @ObfuscatedName("db.z")
    public static long[] field2070;

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
            field2072[var0] = var1;
        }
        field2070 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2070[var3] = var4;
        }
    }

    @ObfuscatedName("dv.a([BIII)I")
    public static int method2276(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2072[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class123(int arg0) {
        this.field2076 = class125.method2645(arg0);
        this.field2071 = 0;
    }

    public class123(byte[] arg0) {
        this.field2076 = arg0;
        this.field2071 = 0;
    }

    @ObfuscatedName("db.d(II)V")
    public void method2380(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.v(II)V")
    public void method2381(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
        this.field2076[++this.field2071 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.r(IB)V")
    public void method2610(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 16);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
        this.field2076[++this.field2071 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.z(II)V")
    public void method2467(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 24);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 16);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
        this.field2076[++this.field2071 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.t(J)V")
    public void method2384(long arg0) {
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2076[++this.field2071 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("db.n(J)V")
    public void method2394(long arg0) {
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2076[++this.field2071 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2076[++this.field2071 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("y.i(Ljava/lang/String;I)I")
    public static int method224(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("db.g(Ljava/lang/String;I)V")
    public void method2386(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2071 += class169.method2280(arg0, 0, arg0.length(), this.field2076, this.field2071);
        this.field2076[++this.field2071 - 1] = 0;
    }

    @ObfuscatedName("ad.m(Ljava/lang/String;S)I")
    public static int method813(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("db.k(Ljava/lang/String;I)V")
    public void method2387(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2076[++this.field2071 - 1] = 0;
        this.field2071 += class169.method2280(arg0, 0, arg0.length(), this.field2076, this.field2071);
        this.field2076[++this.field2071 - 1] = 0;
    }

    @ObfuscatedName("db.x(Ljava/lang/CharSequence;B)V")
    public void method2388(CharSequence arg0) {
        int var2 = class213.method193(arg0);
        this.field2076[++this.field2071 - 1] = 0;
        this.method2490(var2);
        int var3 = this.field2071;
        byte[] var4 = this.field2076;
        int var5 = this.field2071;
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
        this.field2071 = var10 + var3;
    }

    @ObfuscatedName("db.u([BIIB)V")
    public void method2534(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2076[++this.field2071 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("db.j(IB)V")
    public void method2458(int arg0) {
        this.field2076[this.field2071 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2076[this.field2071 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2076[this.field2071 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2076[this.field2071 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.q(II)V")
    public void method2445(int arg0) {
        this.field2076[this.field2071 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2076[this.field2071 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.w(II)V")
    public void method2390(int arg0) {
        this.field2076[this.field2071 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.b(II)V")
    public void method2470(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2380(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2381(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("db.p(II)V")
    public void method2490(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2380(arg0 >>> 28 | 0x80);
                    }
                    this.method2380(arg0 >>> 21 | 0x80);
                }
                this.method2380(arg0 >>> 14 | 0x80);
            }
            this.method2380(arg0 >>> 7 | 0x80);
        }
        this.method2380(arg0 & 0x7F);
    }

    @ObfuscatedName("db.o(I)I")
    public int method2395() {
        return this.field2076[++this.field2071 - 1] & 0xFF;
    }

    @ObfuscatedName("db.y(B)B")
    public byte method2396() {
        return this.field2076[++this.field2071 - 1];
    }

    @ObfuscatedName("db.s(I)I")
    public int method2584() {
        this.field2071 += 2;
        return ((this.field2076[this.field2071 - 2] & 0xFF) << 8) + (this.field2076[this.field2071 - 1] & 0xFF);
    }

    @ObfuscatedName("db.e(S)I")
    public int method2485() {
        this.field2071 += 2;
        int var1 = ((this.field2076[this.field2071 - 2] & 0xFF) << 8) + (this.field2076[this.field2071 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("db.h(B)I")
    public int method2399() {
        this.field2071 += 3;
        return (this.field2076[this.field2071 - 1] & 0xFF) + ((this.field2076[this.field2071 - 2] & 0xFF) << 8) + ((this.field2076[this.field2071 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("db.l(B)I")
    public int method2400() {
        this.field2071 += 4;
        return (this.field2076[this.field2071 - 1] & 0xFF) + ((this.field2076[this.field2071 - 2] & 0xFF) << 8) + ((this.field2076[this.field2071 - 4] & 0xFF) << 24) + ((this.field2076[this.field2071 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("db.c(B)J")
    public long method2401() {
        long var1 = (long) this.method2400() & 0xFFFFFFFFL;
        long var3 = (long) this.method2400() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("db.f(S)Ljava/lang/String;")
    public String method2402() {
        if (this.field2076[this.field2071] == 0) {
            this.field2071++;
            return null;
        } else {
            return this.method2397();
        }
    }

    @ObfuscatedName("db.ac(I)Ljava/lang/String;")
    public String method2397() {
        int var1 = this.field2071;
        while (this.field2076[++this.field2071 - 1] != 0) {
        }
        int var2 = this.field2071 - var1 - 1;
        return var2 == 0 ? "" : class169.method3091(this.field2076, var1, var2);
    }

    @ObfuscatedName("db.as(I)Ljava/lang/String;")
    public String method2398() {
        byte var1 = this.field2076[++this.field2071 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2071;
        while (this.field2076[++this.field2071 - 1] != 0) {
        }
        int var3 = this.field2071 - var2 - 1;
        return var3 == 0 ? "" : class169.method3091(this.field2076, var2, var3);
    }

    @ObfuscatedName("db.af(B)Ljava/lang/String;")
    public String method2426() {
        byte var1 = this.field2076[++this.field2071 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2556();
        if (this.field2071 + var2 > this.field2076.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2076;
        int var4 = this.field2071;
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
        this.field2071 += var2;
        return var12;
    }

    @ObfuscatedName("db.am([BIII)V")
    public void method2593(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2076[++this.field2071 - 1];
        }
    }

    @ObfuscatedName("db.ap(I)I")
    public int method2407() {
        int var1 = this.field2076[this.field2071] & 0xFF;
        return var1 < 128 ? this.method2395() - 64 : this.method2584() - 49152;
    }

    @ObfuscatedName("db.aa(I)I")
    public int method2577() {
        int var1 = this.field2076[this.field2071] & 0xFF;
        return var1 < 128 ? this.method2395() : this.method2584() - 32768;
    }

    @ObfuscatedName("db.ar(B)I")
    public int method2409() {
        return this.field2076[this.field2071] < 0 ? this.method2400() & Integer.MAX_VALUE : this.method2584();
    }

    @ObfuscatedName("db.av(B)I")
    public int method2410() {
        if (this.field2076[this.field2071] < 0) {
            return this.method2400() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2584();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("db.ao(B)I")
    public int method2556() {
        byte var1 = this.field2076[++this.field2071 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2076[++this.field2071 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("db.aq([IB)V")
    public void method2412(int[] arg0) {
        int var2 = this.field2071 / 8;
        this.field2071 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2400();
            int var5 = this.method2400();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2071 -= 8;
            this.method2467(var4);
            this.method2467(var5);
        }
    }

    @ObfuscatedName("db.ax([II)V")
    public void method2383(int[] arg0) {
        int var2 = this.field2071 / 8;
        this.field2071 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2400();
            int var5 = this.method2400();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2071 -= 8;
            this.method2467(var4);
            this.method2467(var5);
        }
    }

    @ObfuscatedName("db.at([IIII)V")
    public void method2414(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2071;
        this.field2071 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2400();
            int var8 = this.method2400();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2071 -= 8;
            this.method2467(var7);
            this.method2467(var8);
        }
        this.field2071 = var4;
    }

    @ObfuscatedName("db.aw([IIII)V")
    public void method2415(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2071;
        this.field2071 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2400();
            int var8 = this.method2400();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2071 -= 8;
            this.method2467(var7);
            this.method2467(var8);
        }
        this.field2071 = var4;
    }

    @ObfuscatedName("db.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2479(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2071;
        this.field2071 = 0;
        byte[] var4 = new byte[var3];
        this.method2593(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2071 = 0;
        this.method2381(var7.length);
        this.method2534(var7, 0, var7.length);
    }

    @ObfuscatedName("db.al(II)I")
    public int method2417(int arg0) {
        int var2 = method2276(this.field2076, arg0, this.field2071);
        this.method2467(var2);
        return var2;
    }

    @ObfuscatedName("db.ad(I)Z")
    public boolean method2492() {
        this.field2071 -= 4;
        int var1 = method2276(this.field2076, 0, this.field2071);
        int var2 = this.method2400();
        return var1 == var2;
    }

    @ObfuscatedName("db.ah(II)V")
    public void method2419(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("db.ak(IB)V")
    public void method2425(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("db.ai(IB)V")
    public void method2421(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("db.az(B)I")
    public int method2422() {
        return this.field2076[++this.field2071 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("db.au(I)I")
    public int method2423() {
        return -this.field2076[++this.field2071 - 1] & 0xFF;
    }

    @ObfuscatedName("db.ay(B)I")
    public int method2424() {
        return 128 - this.field2076[++this.field2071 - 1] & 0xFF;
    }

    @ObfuscatedName("db.ag(I)B")
    public byte method2491() {
        return (byte) (this.field2076[++this.field2071 - 1] - 128);
    }

    @ObfuscatedName("db.ae(I)B")
    public byte method2552() {
        return (byte) (-this.field2076[++this.field2071 - 1]);
    }

    @ObfuscatedName("db.an(B)B")
    public byte method2517() {
        return (byte) (128 - this.field2076[++this.field2071 - 1]);
    }

    @ObfuscatedName("db.aj(II)V")
    public void method2578(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) arg0;
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("db.bg(II)V")
    public void method2429(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("db.bf(II)V")
    public void method2430(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 + 128);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("db.bl(I)I")
    public int method2598() {
        this.field2071 += 2;
        return ((this.field2076[this.field2071 - 1] & 0xFF) << 8) + (this.field2076[this.field2071 - 2] & 0xFF);
    }

    @ObfuscatedName("db.bn(I)I")
    public int method2432() {
        this.field2071 += 2;
        return ((this.field2076[this.field2071 - 2] & 0xFF) << 8) + (this.field2076[this.field2071 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("db.bs(I)I")
    public int method2433() {
        this.field2071 += 2;
        return ((this.field2076[this.field2071 - 1] & 0xFF) << 8) + (this.field2076[this.field2071 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("db.bc(I)I")
    public int method2434() {
        this.field2071 += 2;
        int var1 = ((this.field2076[this.field2071 - 2] & 0xFF) << 8) + (this.field2076[this.field2071 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("db.bq(I)I")
    public int method2435() {
        this.field2071 += 2;
        int var1 = ((this.field2076[this.field2071 - 1] & 0xFF) << 8) + (this.field2076[this.field2071 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("db.bp(IB)V")
    public void method2403(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 16);
        this.field2076[++this.field2071 - 1] = (byte) arg0;
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("db.bo(I)I")
    public int method2437() {
        this.field2071 += 3;
        return (this.field2076[this.field2071 - 3] & 0xFF) + ((this.field2076[this.field2071 - 2] & 0xFF) << 8) + ((this.field2076[this.field2071 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("db.bd(II)V")
    public void method2408(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) arg0;
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 16);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("db.bj(II)V")
    public void method2439(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
        this.field2076[++this.field2071 - 1] = (byte) arg0;
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 24);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("db.bh(II)V")
    public void method2431(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 16);
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 24);
        this.field2076[++this.field2071 - 1] = (byte) arg0;
        this.field2076[++this.field2071 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("db.bt(I)I")
    public int method2441() {
        this.field2071 += 4;
        return (this.field2076[this.field2071 - 4] & 0xFF) + ((this.field2076[this.field2071 - 3] & 0xFF) << 8) + ((this.field2076[this.field2071 - 1] & 0xFF) << 24) + ((this.field2076[this.field2071 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("db.bx(I)I")
    public int method2393() {
        this.field2071 += 4;
        return (this.field2076[this.field2071 - 3] & 0xFF) + ((this.field2076[this.field2071 - 4] & 0xFF) << 8) + ((this.field2076[this.field2071 - 1] & 0xFF) << 16) + ((this.field2076[this.field2071 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("db.bv(B)I")
    public int method2443() {
        this.field2071 += 4;
        return (this.field2076[this.field2071 - 2] & 0xFF) + ((this.field2076[this.field2071 - 1] & 0xFF) << 8) + ((this.field2076[this.field2071 - 4] & 0xFF) << 16) + ((this.field2076[this.field2071 - 3] & 0xFF) << 24);
    }
}
