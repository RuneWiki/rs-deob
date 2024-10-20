package deob;

import java.math.BigInteger;

@ObfuscatedName("dx")
public class class120 extends class209 {

    @ObfuscatedName("dx.a")
    public byte[] field1994;

    @ObfuscatedName("dx.w")
    public int field1993;

    @ObfuscatedName("dx.d")
    public static int[] field1992 = new int[256];

    @ObfuscatedName("dx.y")
    public static long[] field1998;

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
            field1992[var0] = var1;
        }
        field1998 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1998[var3] = var4;
        }
    }

    @ObfuscatedName("r.a([BIIB)I")
    public static int method120(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1992[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("au.w([BIB)I")
    public static int method924(byte[] arg0, int arg1) {
        return method120(arg0, 0, arg1);
    }

    public class120(int arg0) {
        this.field1994 = class122.method2706(arg0);
        this.field1993 = 0;
    }

    public class120(byte[] arg0) {
        this.field1994 = arg0;
        this.field1993 = 0;
    }

    @ObfuscatedName("dx.d(II)V")
    public void method2452(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.c(II)V")
    public void method2448(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
        this.field1994[++this.field1993 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.y(IB)V")
    public void method2524(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 16);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
        this.field1994[++this.field1993 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.k(IB)V")
    public void method2635(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 24);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 16);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
        this.field1994[++this.field1993 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.r(J)V")
    public void method2534(long arg0) {
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1994[++this.field1993 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dx.p(J)V")
    public void method2565(long arg0) {
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1994[++this.field1993 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1994[++this.field1993 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("di.q(Ljava/lang/String;I)I")
    public static int method2241(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dx.m(Ljava/lang/String;B)V")
    public void method2543(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1993 += class166.method3312(arg0, 0, arg0.length(), this.field1994, this.field1993);
        this.field1994[++this.field1993 - 1] = 0;
    }

    @ObfuscatedName("dx.e(Ljava/lang/String;I)V")
    public void method2454(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1994[++this.field1993 - 1] = 0;
        this.field1993 += class166.method3312(arg0, 0, arg0.length(), this.field1994, this.field1993);
        this.field1994[++this.field1993 - 1] = 0;
    }

    @ObfuscatedName("dx.x(Ljava/lang/CharSequence;I)V")
    public void method2642(CharSequence arg0) {
        int var2 = class210.method3106(arg0);
        this.field1994[++this.field1993 - 1] = 0;
        this.method2458(var2);
        this.field1993 += class210.method725(this.field1994, this.field1993, arg0);
    }

    @ObfuscatedName("dx.z([BIIB)V")
    public void method2456(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1994[++this.field1993 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dx.i(II)V")
    public void method2654(int arg0) {
        this.field1994[this.field1993 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1994[this.field1993 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1994[this.field1993 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1994[this.field1993 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.t(II)V")
    public void method2660(int arg0) {
        this.field1994[this.field1993 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1994[this.field1993 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.n(IB)V")
    public void method2459(int arg0) {
        this.field1994[this.field1993 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.u(II)V")
    public void method2566(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2452(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2448(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.g(II)V")
    public void method2458(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2452(arg0 >>> 28 | 0x80);
                    }
                    this.method2452(arg0 >>> 21 | 0x80);
                }
                this.method2452(arg0 >>> 14 | 0x80);
            }
            this.method2452(arg0 >>> 7 | 0x80);
        }
        this.method2452(arg0 & 0x7F);
    }

    @ObfuscatedName("dx.j(B)I")
    public int method2462() {
        return this.field1994[++this.field1993 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.h(I)B")
    public byte method2548() {
        return this.field1994[++this.field1993 - 1];
    }

    @ObfuscatedName("dx.s(B)I")
    public int method2464() {
        this.field1993 += 2;
        return ((this.field1994[this.field1993 - 2] & 0xFF) << 8) + (this.field1994[this.field1993 - 1] & 0xFF);
    }

    @ObfuscatedName("dx.f(I)I")
    public int method2513() {
        this.field1993 += 2;
        int var1 = ((this.field1994[this.field1993 - 2] & 0xFF) << 8) + (this.field1994[this.field1993 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.b(I)I")
    public int method2466() {
        this.field1993 += 3;
        return (this.field1994[this.field1993 - 1] & 0xFF) + ((this.field1994[this.field1993 - 2] & 0xFF) << 8) + ((this.field1994[this.field1993 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.l(I)I")
    public int method2467() {
        this.field1993 += 4;
        return (this.field1994[this.field1993 - 1] & 0xFF) + ((this.field1994[this.field1993 - 2] & 0xFF) << 8) + ((this.field1994[this.field1993 - 3] & 0xFF) << 16) + ((this.field1994[this.field1993 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.o(I)J")
    public long method2468() {
        long var1 = (long) this.method2467() & 0xFFFFFFFFL;
        long var3 = (long) this.method2467() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dx.v(B)Ljava/lang/String;")
    public String method2550() {
        if (this.field1994[this.field1993] == 0) {
            this.field1993++;
            return null;
        } else {
            return this.method2470();
        }
    }

    @ObfuscatedName("dx.ad(I)Ljava/lang/String;")
    public String method2470() {
        int var1 = this.field1993;
        while (this.field1994[++this.field1993 - 1] != 0) {
        }
        int var2 = this.field1993 - var1 - 1;
        return var2 == 0 ? "" : class166.method1062(this.field1994, var1, var2);
    }

    @ObfuscatedName("dx.ar(S)Ljava/lang/String;")
    public String method2471() {
        byte var1 = this.field1994[++this.field1993 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1993;
        while (this.field1994[++this.field1993 - 1] != 0) {
        }
        int var3 = this.field1993 - var2 - 1;
        return var3 == 0 ? "" : class166.method1062(this.field1994, var2, var3);
    }

    @ObfuscatedName("dx.ah(B)Ljava/lang/String;")
    public String method2472() {
        byte var1 = this.field1994[++this.field1993 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2477();
        if (this.field1993 + var2 > this.field1994.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1994;
        int var4 = this.field1993;
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
        this.field1993 += var2;
        return var12;
    }

    @ObfuscatedName("dx.ay([BIII)V")
    public void method2589(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1994[++this.field1993 - 1];
        }
    }

    @ObfuscatedName("dx.af(I)I")
    public int method2491() {
        int var1 = this.field1994[this.field1993] & 0xFF;
        return var1 < 128 ? this.method2462() - 64 : this.method2464() - 49152;
    }

    @ObfuscatedName("dx.al(B)I")
    public int method2661() {
        int var1 = this.field1994[this.field1993] & 0xFF;
        return var1 < 128 ? this.method2462() : this.method2464() - 32768;
    }

    @ObfuscatedName("dx.ai(I)I")
    public int method2583() {
        return this.field1994[this.field1993] < 0 ? this.method2467() & Integer.MAX_VALUE : this.method2464();
    }

    @ObfuscatedName("dx.an(I)I")
    public int method2477() {
        byte var1 = this.field1994[++this.field1993 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1994[++this.field1993 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dx.az([II)V")
    public void method2655(int[] arg0) {
        int var2 = this.field1993 / 8;
        this.field1993 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2467();
            int var5 = this.method2467();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1993 -= 8;
            this.method2635(var4);
            this.method2635(var5);
        }
    }

    @ObfuscatedName("dx.ac([IB)V")
    public void method2503(int[] arg0) {
        int var2 = this.field1993 / 8;
        this.field1993 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2467();
            int var5 = this.method2467();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1993 -= 8;
            this.method2635(var4);
            this.method2635(var5);
        }
    }

    @ObfuscatedName("dx.ao([IIII)V")
    public void method2451(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1993;
        this.field1993 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2467();
            int var8 = this.method2467();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1993 -= 8;
            this.method2635(var7);
            this.method2635(var8);
        }
        this.field1993 = var4;
    }

    @ObfuscatedName("dx.ax([IIII)V")
    public void method2493(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1993;
        this.field1993 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2467();
            int var8 = this.method2467();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1993 -= 8;
            this.method2635(var7);
            this.method2635(var8);
        }
        this.field1993 = var4;
    }

    @ObfuscatedName("dx.at(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2482(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1993;
        this.field1993 = 0;
        byte[] var4 = new byte[var3];
        this.method2589(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1993 = 0;
        this.method2448(var7.length);
        this.method2456(var7, 0, var7.length);
    }

    @ObfuscatedName("dx.ab(II)I")
    public int method2453(int arg0) {
        int var2 = method120(this.field1994, arg0, this.field1993);
        this.method2635(var2);
        return var2;
    }

    @ObfuscatedName("dx.ae(I)Z")
    public boolean method2484() {
        this.field1993 -= 4;
        byte[] var1 = this.field1994;
        int var2 = this.field1993;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1992[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2467();
        return var5 == var8;
    }

    @ObfuscatedName("dx.au(IB)V")
    public void method2592(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.am(IB)V")
    public void method2486(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dx.aj(IB)V")
    public void method2487(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dx.aq(I)I")
    public int method2488() {
        return this.field1994[++this.field1993 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dx.ag(B)I")
    public int method2489() {
        return -this.field1994[++this.field1993 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ap(I)I")
    public int method2490() {
        return 128 - this.field1994[++this.field1993 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ak(I)B")
    public byte method2640() {
        return (byte) (this.field1994[++this.field1993 - 1] - 128);
    }

    @ObfuscatedName("dx.as(B)B")
    public byte method2492() {
        return (byte) (128 - this.field1994[++this.field1993 - 1]);
    }

    @ObfuscatedName("dx.aa(IB)V")
    public void method2483(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) arg0;
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.av(II)V")
    public void method2494(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.aw(II)V")
    public void method2594(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 + 128);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bb(I)I")
    public int method2480() {
        this.field1993 += 2;
        return ((this.field1994[this.field1993 - 1] & 0xFF) << 8) + (this.field1994[this.field1993 - 2] & 0xFF);
    }

    @ObfuscatedName("dx.bh(B)I")
    public int method2446() {
        this.field1993 += 2;
        return ((this.field1994[this.field1993 - 2] & 0xFF) << 8) + (this.field1994[this.field1993 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bg(B)I")
    public int method2497() {
        this.field1993 += 2;
        return ((this.field1994[this.field1993 - 1] & 0xFF) << 8) + (this.field1994[this.field1993 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bm(I)I")
    public int method2498() {
        this.field1993 += 2;
        int var1 = ((this.field1994[this.field1993 - 1] & 0xFF) << 8) + (this.field1994[this.field1993 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bl(I)I")
    public int method2499() {
        this.field1993 += 2;
        int var1 = ((this.field1994[this.field1993 - 2] & 0xFF) << 8) + (this.field1994[this.field1993 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bk(II)V")
    public void method2500(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 16);
        this.field1994[++this.field1993 - 1] = (byte) arg0;
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bi(I)I")
    public int method2601() {
        this.field1993 += 3;
        return (this.field1994[this.field1993 - 1] & 0xFF) + ((this.field1994[this.field1993 - 3] & 0xFF) << 8) + ((this.field1994[this.field1993 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.by(II)V")
    public void method2502(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) arg0;
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 16);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dx.bc(II)V")
    public void method2455(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
        this.field1994[++this.field1993 - 1] = (byte) arg0;
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 24);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dx.bu(II)V")
    public void method2504(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 16);
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 24);
        this.field1994[++this.field1993 - 1] = (byte) arg0;
        this.field1994[++this.field1993 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.ba(B)I")
    public int method2505() {
        this.field1993 += 4;
        return (this.field1994[this.field1993 - 4] & 0xFF) + ((this.field1994[this.field1993 - 3] & 0xFF) << 8) + ((this.field1994[this.field1993 - 1] & 0xFF) << 24) + ((this.field1994[this.field1993 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bd(I)I")
    public int method2506() {
        this.field1993 += 4;
        return (this.field1994[this.field1993 - 3] & 0xFF) + ((this.field1994[this.field1993 - 4] & 0xFF) << 8) + ((this.field1994[this.field1993 - 2] & 0xFF) << 24) + ((this.field1994[this.field1993 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bp(B)I")
    public int method2595() {
        this.field1993 += 4;
        return (this.field1994[this.field1993 - 2] & 0xFF) + ((this.field1994[this.field1993 - 1] & 0xFF) << 8) + ((this.field1994[this.field1993 - 4] & 0xFF) << 16) + ((this.field1994[this.field1993 - 3] & 0xFF) << 24);
    }
}
