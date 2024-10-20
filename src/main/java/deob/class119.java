package deob;

import java.math.BigInteger;

@ObfuscatedName("dm")
public class class119 extends class208 {

    @ObfuscatedName("dm.g")
    public byte[] field1986;

    @ObfuscatedName("dm.b")
    public int field1977;

    @ObfuscatedName("dm.w")
    public static int[] field1984 = new int[256];

    @ObfuscatedName("dm.z")
    public static long[] field1980;

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
            field1984[var0] = var1;
        }
        field1980 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1980[var3] = var4;
        }
    }

    @ObfuscatedName("i.g([BIII)I")
    public static int method608(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1984[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cm.b([BII)I")
    public static int method2071(byte[] arg0, int arg1) {
        return method608(arg0, 0, arg1);
    }

    public class119(int arg0) {
        this.field1986 = Statics.method2608(arg0);
        this.field1977 = 0;
    }

    public class119(byte[] arg0) {
        this.field1986 = arg0;
        this.field1977 = 0;
    }

    @ObfuscatedName("dm.w(II)V")
    public void method2476(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.d(II)V")
    public void method2349(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.z(II)V")
    public void method2537(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.l(IS)V")
    public void method2351(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.m(J)V")
    public void method2352(long arg0) {
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1986[++this.field1977 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dm.p(J)V")
    public void method2353(long arg0) {
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1986[++this.field1977 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1986[++this.field1977 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("z.u(Ljava/lang/String;B)I")
    public static int method50(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dm.c(Ljava/lang/String;B)V")
    public void method2354(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1977 += class165.method576(arg0, 0, arg0.length(), this.field1986, this.field1977);
        this.field1986[++this.field1977 - 1] = 0;
    }

    @ObfuscatedName("dm.v(Ljava/lang/String;I)V")
    public void method2409(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1986[++this.field1977 - 1] = 0;
        this.field1977 += class165.method576(arg0, 0, arg0.length(), this.field1986, this.field1977);
        this.field1986[++this.field1977 - 1] = 0;
    }

    @ObfuscatedName("dm.o(Ljava/lang/CharSequence;I)V")
    public void method2356(CharSequence arg0) {
        int var2 = class209.method2703(arg0);
        this.field1986[++this.field1977 - 1] = 0;
        this.method2361(var2);
        this.field1977 += class209.method762(this.field1986, this.field1977, arg0);
    }

    @ObfuscatedName("dm.n([BIIB)V")
    public void method2382(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1986[++this.field1977 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dm.k(II)V")
    public void method2357(int arg0) {
        this.field1986[this.field1977 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1986[this.field1977 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1986[this.field1977 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1986[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.f(IB)V")
    public void method2418(int arg0) {
        this.field1986[this.field1977 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1986[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.x(II)V")
    public void method2359(int arg0) {
        this.field1986[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.j(IB)V")
    public void method2360(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2476(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2349(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dm.r(IB)V")
    public void method2361(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2476(arg0 >>> 28 | 0x80);
                    }
                    this.method2476(arg0 >>> 21 | 0x80);
                }
                this.method2476(arg0 >>> 14 | 0x80);
            }
            this.method2476(arg0 >>> 7 | 0x80);
        }
        this.method2476(arg0 & 0x7F);
    }

    @ObfuscatedName("dm.y(S)I")
    public int method2362() {
        return this.field1986[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.t(I)B")
    public byte method2391() {
        return this.field1986[++this.field1977 - 1];
    }

    @ObfuscatedName("dm.a(B)I")
    public int method2376() {
        this.field1977 += 2;
        return ((this.field1986[this.field1977 - 2] & 0xFF) << 8) + (this.field1986[this.field1977 - 1] & 0xFF);
    }

    @ObfuscatedName("dm.s(I)I")
    public int method2365() {
        this.field1977 += 2;
        int var1 = ((this.field1986[this.field1977 - 2] & 0xFF) << 8) + (this.field1986[this.field1977 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.e(B)I")
    public int method2366() {
        this.field1977 += 3;
        return (this.field1986[this.field1977 - 1] & 0xFF) + ((this.field1986[this.field1977 - 2] & 0xFF) << 8) + ((this.field1986[this.field1977 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.q(I)I")
    public int method2367() {
        this.field1977 += 4;
        return (this.field1986[this.field1977 - 1] & 0xFF) + ((this.field1986[this.field1977 - 2] & 0xFF) << 8) + ((this.field1986[this.field1977 - 3] & 0xFF) << 16) + ((this.field1986[this.field1977 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.i(I)J")
    public long method2564() {
        long var1 = (long) this.method2367() & 0xFFFFFFFFL;
        long var3 = (long) this.method2367() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dm.h(I)Ljava/lang/String;")
    public String method2369() {
        if (this.field1986[this.field1977] == 0) {
            this.field1977++;
            return null;
        } else {
            return this.method2370();
        }
    }

    @ObfuscatedName("dm.ay(I)Ljava/lang/String;")
    public String method2370() {
        int var1 = this.field1977;
        while (this.field1986[++this.field1977 - 1] != 0) {
        }
        int var2 = this.field1977 - var1 - 1;
        return var2 == 0 ? "" : class165.method1605(this.field1986, var1, var2);
    }

    @ObfuscatedName("dm.ak(I)Ljava/lang/String;")
    public String method2517() {
        byte var1 = this.field1986[++this.field1977 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1977;
        while (this.field1986[++this.field1977 - 1] != 0) {
        }
        int var3 = this.field1977 - var2 - 1;
        return var3 == 0 ? "" : class165.method1605(this.field1986, var2, var3);
    }

    @ObfuscatedName("dm.ai(S)Ljava/lang/String;")
    public String method2372() {
        byte var1 = this.field1986[++this.field1977 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2443();
        if (this.field1977 + var2 > this.field1986.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1986;
        int var4 = this.field1977;
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
        this.field1977 += var2;
        return var12;
    }

    @ObfuscatedName("dm.ag([BIIB)V")
    public void method2477(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1986[++this.field1977 - 1];
        }
    }

    @ObfuscatedName("dm.ab(I)I")
    public int method2374() {
        int var1 = this.field1986[this.field1977] & 0xFF;
        return var1 < 128 ? this.method2362() - 64 : this.method2376() - 49152;
    }

    @ObfuscatedName("dm.aa(I)I")
    public int method2506() {
        int var1 = this.field1986[this.field1977] & 0xFF;
        return var1 < 128 ? this.method2362() : this.method2376() - 32768;
    }

    @ObfuscatedName("dm.af(I)I")
    public int method2515() {
        return this.field1986[this.field1977] < 0 ? this.method2367() & Integer.MAX_VALUE : this.method2376();
    }

    @ObfuscatedName("dm.al(I)I")
    public int method2443() {
        byte var1 = this.field1986[++this.field1977 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1986[++this.field1977 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dm.ad([II)V")
    public void method2430(int[] arg0) {
        int var2 = this.field1977 / 8;
        this.field1977 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2367();
            int var5 = this.method2367();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1977 -= 8;
            this.method2351(var4);
            this.method2351(var5);
        }
    }

    @ObfuscatedName("dm.aw([II)V")
    public void method2495(int[] arg0) {
        int var2 = this.field1977 / 8;
        this.field1977 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2367();
            int var5 = this.method2367();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1977 -= 8;
            this.method2351(var4);
            this.method2351(var5);
        }
    }

    @ObfuscatedName("dm.an([IIII)V")
    public void method2499(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        this.field1977 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2367();
            int var8 = this.method2367();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1977 -= 8;
            this.method2351(var7);
            this.method2351(var8);
        }
        this.field1977 = var4;
    }

    @ObfuscatedName("dm.ax([IIII)V")
    public void method2381(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        this.field1977 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2367();
            int var8 = this.method2367();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1977 -= 8;
            this.method2351(var7);
            this.method2351(var8);
        }
        this.field1977 = var4;
    }

    @ObfuscatedName("dm.aq(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2416(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1977;
        this.field1977 = 0;
        byte[] var4 = new byte[var3];
        this.method2477(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1977 = 0;
        this.method2349(var7.length);
        this.method2382(var7, 0, var7.length);
    }

    @ObfuscatedName("dm.ae(IB)I")
    public int method2383(int arg0) {
        int var2 = method608(this.field1986, arg0, this.field1977);
        this.method2351(var2);
        return var2;
    }

    @ObfuscatedName("dm.au(I)Z")
    public boolean method2384() {
        this.field1977 -= 4;
        int var1 = method608(this.field1986, 0, this.field1977);
        int var2 = this.method2367();
        return var1 == var2;
    }

    @ObfuscatedName("dm.ao(II)V")
    public void method2385(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.aj(II)V")
    public void method2386(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dm.am(II)V")
    public void method2387(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dm.av(I)I")
    public int method2388() {
        return this.field1986[++this.field1977 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dm.ap(B)I")
    public int method2389() {
        return -this.field1986[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.ah(I)I")
    public int method2390() {
        return 128 - this.field1986[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.ar(S)B")
    public byte method2556() {
        return (byte) (this.field1986[++this.field1977 - 1] - 128);
    }

    @ObfuscatedName("dm.az(I)B")
    public byte method2392() {
        return (byte) (-this.field1986[++this.field1977 - 1]);
    }

    @ObfuscatedName("dm.ac(I)B")
    public byte method2393() {
        return (byte) (128 - this.field1986[++this.field1977 - 1]);
    }

    @ObfuscatedName("dm.as(II)V")
    public void method2453(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) arg0;
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.at(II)V")
    public void method2490(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.bt(II)V")
    public void method2503(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 + 128);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bl(I)I")
    public int method2508() {
        this.field1977 += 2;
        return ((this.field1986[this.field1977 - 1] & 0xFF) << 8) + (this.field1986[this.field1977 - 2] & 0xFF);
    }

    @ObfuscatedName("dm.bo(S)I")
    public int method2368() {
        this.field1977 += 2;
        return ((this.field1986[this.field1977 - 2] & 0xFF) << 8) + (this.field1986[this.field1977 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.bu(I)I")
    public int method2399() {
        this.field1977 += 2;
        return ((this.field1986[this.field1977 - 1] & 0xFF) << 8) + (this.field1986[this.field1977 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.bh(I)I")
    public int method2396() {
        this.field1977 += 2;
        int var1 = ((this.field1986[this.field1977 - 1] & 0xFF) << 8) + (this.field1986[this.field1977 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.bc(I)I")
    public int method2401() {
        this.field1977 += 2;
        int var1 = ((this.field1986[this.field1977 - 1] & 0xFF) << 8) + (this.field1986[this.field1977 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.br(II)V")
    public void method2513(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1977 - 1] = (byte) arg0;
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bm(II)V")
    public void method2403(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) arg0;
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dm.be(IB)V")
    public void method2404(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1986[++this.field1977 - 1] = (byte) arg0;
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.bb(II)V")
    public void method2405(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1986[++this.field1977 - 1] = (byte) arg0;
        this.field1986[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bd(I)I")
    public int method2549() {
        this.field1977 += 4;
        return (this.field1986[this.field1977 - 4] & 0xFF) + ((this.field1986[this.field1977 - 3] & 0xFF) << 8) + ((this.field1986[this.field1977 - 2] & 0xFF) << 16) + ((this.field1986[this.field1977 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.bw(B)I")
    public int method2464() {
        this.field1977 += 4;
        return (this.field1986[this.field1977 - 3] & 0xFF) + ((this.field1986[this.field1977 - 4] & 0xFF) << 8) + ((this.field1986[this.field1977 - 2] & 0xFF) << 24) + ((this.field1986[this.field1977 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.bq(B)I")
    public int method2408() {
        this.field1977 += 4;
        return (this.field1986[this.field1977 - 2] & 0xFF) + ((this.field1986[this.field1977 - 1] & 0xFF) << 8) + ((this.field1986[this.field1977 - 4] & 0xFF) << 16) + ((this.field1986[this.field1977 - 3] & 0xFF) << 24);
    }
}
