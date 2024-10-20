package deob;

import java.math.BigInteger;

@ObfuscatedName("dc")
public class class123 extends class212 {

    @ObfuscatedName("dc.l")
    public byte[] field2052;

    @ObfuscatedName("dc.g")
    public int field2051;

    @ObfuscatedName("dc.r")
    public static int[] field2058 = new int[256];

    @ObfuscatedName("dc.h")
    public static long[] field2054;

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
            field2058[var0] = var1;
        }
        field2054 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2054[var3] = var4;
        }
    }

    @ObfuscatedName("ap.l([BIIB)I")
    public static int method762(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2058[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ae.g([BII)I")
    public static int method860(byte[] arg0, int arg1) {
        return method762(arg0, 0, arg1);
    }

    public class123(int arg0) {
        this.field2052 = class125.method2751(arg0);
        this.field2051 = 0;
    }

    public class123(byte[] arg0) {
        this.field2052 = arg0;
        this.field2051 = 0;
    }

    @ObfuscatedName("dc.r(II)V")
    public void method2640(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.e(IB)V")
    public void method2476(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2052[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.h(IB)V")
    public void method2706(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2052[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.s(II)V")
    public void method2585(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 24);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2052[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.k(J)V")
    public void method2479(long arg0) {
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2052[++this.field2051 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dc.u(J)V")
    public void method2480(long arg0) {
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2052[++this.field2051 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2052[++this.field2051 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dc.b(Ljava/lang/String;I)V")
    public void method2560(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2051 += Statics.method2792(arg0, 0, arg0.length(), this.field2052, this.field2051);
        this.field2052[++this.field2051 - 1] = 0;
    }

    @ObfuscatedName("dc.m(Ljava/lang/String;I)V")
    public void method2482(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2052[++this.field2051 - 1] = 0;
        this.field2051 += Statics.method2792(arg0, 0, arg0.length(), this.field2052, this.field2051);
        this.field2052[++this.field2051 - 1] = 0;
    }

    @ObfuscatedName("dc.q(Ljava/lang/CharSequence;B)V")
    public void method2483(CharSequence arg0) {
        int var2 = class213.method2973(arg0);
        this.field2052[++this.field2051 - 1] = 0;
        this.method2687(var2);
        this.field2051 += class213.method134(this.field2052, this.field2051, arg0);
    }

    @ObfuscatedName("dc.p([BIII)V")
    public void method2484(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2052[++this.field2051 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dc.w(II)V")
    public void method2539(int arg0) {
        this.field2052[this.field2051 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2052[this.field2051 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2052[this.field2051 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2052[this.field2051 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.o(IB)V")
    public void method2486(int arg0) {
        this.field2052[this.field2051 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2052[this.field2051 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.d(II)V")
    public void method2528(int arg0) {
        this.field2052[this.field2051 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.f(IB)V")
    public void method2636(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2640(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2476(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.z(IB)V")
    public void method2687(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2640(arg0 >>> 28 | 0x80);
                    }
                    this.method2640(arg0 >>> 21 | 0x80);
                }
                this.method2640(arg0 >>> 14 | 0x80);
            }
            this.method2640(arg0 >>> 7 | 0x80);
        }
        this.method2640(arg0 & 0x7F);
    }

    @ObfuscatedName("dc.i(I)I")
    public int method2490() {
        return this.field2052[++this.field2051 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.v(I)B")
    public byte method2491() {
        return this.field2052[++this.field2051 - 1];
    }

    @ObfuscatedName("dc.j(I)I")
    public int method2492() {
        this.field2051 += 2;
        return ((this.field2052[this.field2051 - 2] & 0xFF) << 8) + (this.field2052[this.field2051 - 1] & 0xFF);
    }

    @ObfuscatedName("dc.x(I)I")
    public int method2493() {
        this.field2051 += 2;
        int var1 = ((this.field2052[this.field2051 - 2] & 0xFF) << 8) + (this.field2052[this.field2051 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.t(B)I")
    public int method2494() {
        this.field2051 += 3;
        return (this.field2052[this.field2051 - 1] & 0xFF) + ((this.field2052[this.field2051 - 3] & 0xFF) << 16) + ((this.field2052[this.field2051 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dc.y(I)I")
    public int method2477() {
        this.field2051 += 4;
        return (this.field2052[this.field2051 - 1] & 0xFF) + ((this.field2052[this.field2051 - 2] & 0xFF) << 8) + ((this.field2052[this.field2051 - 4] & 0xFF) << 24) + ((this.field2052[this.field2051 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.a(I)J")
    public long method2506() {
        long var1 = (long) this.method2477() & 0xFFFFFFFFL;
        long var3 = (long) this.method2477() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dc.c(B)Ljava/lang/String;")
    public String method2497() {
        if (this.field2052[this.field2051] == 0) {
            this.field2051++;
            return null;
        } else {
            return this.method2520();
        }
    }

    @ObfuscatedName("dc.ad(I)Ljava/lang/String;")
    public String method2520() {
        int var1 = this.field2051;
        while (this.field2052[++this.field2051 - 1] != 0) {
        }
        int var2 = this.field2051 - var1 - 1;
        return var2 == 0 ? "" : class169.method747(this.field2052, var1, var2);
    }

    @ObfuscatedName("dc.as(I)Ljava/lang/String;")
    public String method2499() {
        byte var1 = this.field2052[++this.field2051 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2051;
        while (this.field2052[++this.field2051 - 1] != 0) {
        }
        int var3 = this.field2051 - var2 - 1;
        return var3 == 0 ? "" : class169.method747(this.field2052, var2, var3);
    }

    @ObfuscatedName("dc.ac(B)Ljava/lang/String;")
    public String method2500() {
        byte var1 = this.field2052[++this.field2051 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2689();
        if (this.field2051 + var2 > this.field2052.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2052;
        int var4 = this.field2051;
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
        this.field2051 += var2;
        return var12;
    }

    @ObfuscatedName("dc.ah([BIII)V")
    public void method2611(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2052[++this.field2051 - 1];
        }
    }

    @ObfuscatedName("dc.am(I)I")
    public int method2502() {
        int var1 = this.field2052[this.field2051] & 0xFF;
        return var1 < 128 ? this.method2490() - 64 : this.method2492() - 49152;
    }

    @ObfuscatedName("dc.aq(B)I")
    public int method2503() {
        int var1 = this.field2052[this.field2051] & 0xFF;
        return var1 < 128 ? this.method2490() : this.method2492() - 32768;
    }

    @ObfuscatedName("dc.az(B)I")
    public int method2637() {
        return this.field2052[this.field2051] < 0 ? this.method2477() & Integer.MAX_VALUE : this.method2492();
    }

    @ObfuscatedName("dc.ak(B)I")
    public int method2555() {
        if (this.field2052[this.field2051] < 0) {
            return this.method2477() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2492();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("dc.ag(I)I")
    public int method2689() {
        byte var1 = this.field2052[++this.field2051 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2052[++this.field2051 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dc.af([II)V")
    public void method2507(int[] arg0) {
        int var2 = this.field2051 / 8;
        this.field2051 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2477();
            int var5 = this.method2477();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2051 -= 8;
            this.method2585(var4);
            this.method2585(var5);
        }
    }

    @ObfuscatedName("dc.ab([II)V")
    public void method2508(int[] arg0) {
        int var2 = this.field2051 / 8;
        this.field2051 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2477();
            int var5 = this.method2477();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2051 -= 8;
            this.method2585(var4);
            this.method2585(var5);
        }
    }

    @ObfuscatedName("dc.ap([IIIB)V")
    public void method2538(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2051;
        this.field2051 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2477();
            int var8 = this.method2477();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2051 -= 8;
            this.method2585(var7);
            this.method2585(var8);
        }
        this.field2051 = var4;
    }

    @ObfuscatedName("dc.ao([IIII)V")
    public void method2510(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2051;
        this.field2051 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2477();
            int var8 = this.method2477();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2051 -= 8;
            this.method2585(var7);
            this.method2585(var8);
        }
        this.field2051 = var4;
    }

    @ObfuscatedName("dc.ay(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2638(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2051;
        this.field2051 = 0;
        byte[] var4 = new byte[var3];
        this.method2611(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2051 = 0;
        this.method2476(var7.length);
        this.method2484(var7, 0, var7.length);
    }

    @ObfuscatedName("dc.ai(II)I")
    public int method2630(int arg0) {
        int var2 = method762(this.field2052, arg0, this.field2051);
        this.method2585(var2);
        return var2;
    }

    @ObfuscatedName("dc.aj(I)Z")
    public boolean method2513() {
        this.field2051 -= 4;
        int var1 = method762(this.field2052, 0, this.field2051);
        int var2 = this.method2477();
        return var1 == var2;
    }

    @ObfuscatedName("dc.ae(IB)V")
    public void method2514(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.ar(II)V")
    public void method2515(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dc.at(II)V")
    public void method2511(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dc.av(I)I")
    public int method2694() {
        return this.field2052[++this.field2051 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dc.aw(I)I")
    public int method2474() {
        return -this.field2052[++this.field2051 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.au(I)I")
    public int method2519() {
        return 128 - this.field2052[++this.field2051 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.ax(B)B")
    public byte method2489() {
        return (byte) (this.field2052[++this.field2051 - 1] - 128);
    }

    @ObfuscatedName("dc.al(I)B")
    public byte method2521() {
        return (byte) (-this.field2052[++this.field2051 - 1]);
    }

    @ObfuscatedName("dc.an(S)B")
    public byte method2516() {
        return (byte) (128 - this.field2052[++this.field2051 - 1]);
    }

    @ObfuscatedName("dc.aa(II)V")
    public void method2523(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) arg0;
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bc(IB)V")
    public void method2524(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.bq(IB)V")
    public void method2525(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 + 128);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bj(I)I")
    public int method2606() {
        this.field2051 += 2;
        return ((this.field2052[this.field2051 - 1] & 0xFF) << 8) + (this.field2052[this.field2051 - 2] & 0xFF);
    }

    @ObfuscatedName("dc.bt(B)I")
    public int method2527() {
        this.field2051 += 2;
        return ((this.field2052[this.field2051 - 2] & 0xFF) << 8) + (this.field2052[this.field2051 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bn(B)I")
    public int method2660() {
        this.field2051 += 2;
        return ((this.field2052[this.field2051 - 1] & 0xFF) << 8) + (this.field2052[this.field2051 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bo(I)I")
    public int method2531() {
        this.field2051 += 2;
        int var1 = ((this.field2052[this.field2051 - 1] & 0xFF) << 8) + (this.field2052[this.field2051 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bu(IB)V")
    public void method2653(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2052[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.bs(I)I")
    public int method2691() {
        this.field2051 += 3;
        return (this.field2052[this.field2051 - 1] & 0xFF) + ((this.field2052[this.field2051 - 2] & 0xFF) << 16) + ((this.field2052[this.field2051 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dc.be(II)V")
    public void method2532(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) arg0;
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dc.by(II)V")
    public void method2533(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2052[++this.field2051 - 1] = (byte) arg0;
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 24);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dc.bw(II)V")
    public void method2534(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 24);
        this.field2052[++this.field2051 - 1] = (byte) arg0;
        this.field2052[++this.field2051 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bm(B)I")
    public int method2535() {
        this.field2051 += 4;
        return (this.field2052[this.field2051 - 4] & 0xFF) + ((this.field2052[this.field2051 - 3] & 0xFF) << 8) + ((this.field2052[this.field2051 - 2] & 0xFF) << 16) + ((this.field2052[this.field2051 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bv(I)I")
    public int method2656() {
        this.field2051 += 4;
        return (this.field2052[this.field2051 - 3] & 0xFF) + ((this.field2052[this.field2051 - 4] & 0xFF) << 8) + ((this.field2052[this.field2051 - 1] & 0xFF) << 16) + ((this.field2052[this.field2051 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bz(S)I")
    public int method2537() {
        this.field2051 += 4;
        return (this.field2052[this.field2051 - 2] & 0xFF) + ((this.field2052[this.field2051 - 1] & 0xFF) << 8) + ((this.field2052[this.field2051 - 3] & 0xFF) << 24) + ((this.field2052[this.field2051 - 4] & 0xFF) << 16);
    }
}
