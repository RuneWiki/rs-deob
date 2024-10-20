package deob;

import java.math.BigInteger;

@ObfuscatedName("df")
public class class119 extends class208 {

    @ObfuscatedName("df.c")
    public byte[] field1956;

    @ObfuscatedName("df.h")
    public int field1955;

    @ObfuscatedName("df.k")
    public static int[] field1963 = new int[256];

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
            field1963[var0] = var1;
        }
    }

    @ObfuscatedName("r.c([BIII)I")
    public static int method127(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1963[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1956 = class121.method2522(arg0);
        this.field1955 = 0;
    }

    public class119(byte[] arg0) {
        this.field1956 = arg0;
        this.field1955 = 0;
    }

    @ObfuscatedName("df.h(II)V")
    public void method2276(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.k(IS)V")
    public void method2451(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1956[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.t(II)V")
    public void method2278(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1956[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.g(IB)V")
    public void method2484(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 24);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1956[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.o(J)V")
    public void method2365(long arg0) {
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1956[++this.field1955 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("df.i(J)V")
    public void method2281(long arg0) {
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1956[++this.field1955 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1956[++this.field1955 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("b.w(Ljava/lang/String;I)I")
    public static int method224(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("df.m(Ljava/lang/String;I)V")
    public void method2282(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1955 += class165.method2710(arg0, 0, arg0.length(), this.field1956, this.field1955);
        this.field1956[++this.field1955 - 1] = 0;
    }

    @ObfuscatedName("df.r(Ljava/lang/String;B)V")
    public void method2283(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1956[++this.field1955 - 1] = 0;
        this.field1955 += class165.method2710(arg0, 0, arg0.length(), this.field1956, this.field1955);
        this.field1956[++this.field1955 - 1] = 0;
    }

    @ObfuscatedName("df.y(Ljava/lang/CharSequence;I)V")
    public void method2288(CharSequence arg0) {
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
        this.field1956[++this.field1955 - 1] = 0;
        this.method2290(var3);
        this.field1955 += class209.method2915(this.field1956, this.field1955, arg0);
    }

    @ObfuscatedName("df.q([BIII)V")
    public void method2285(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1956[++this.field1955 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("df.f(IB)V")
    public void method2286(int arg0) {
        this.field1956[this.field1955 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1956[this.field1955 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1956[this.field1955 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1956[this.field1955 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.x(II)V")
    public void method2328(int arg0) {
        this.field1956[this.field1955 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1956[this.field1955 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.d(II)V")
    public void method2450(int arg0) {
        this.field1956[this.field1955 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.e(II)V")
    public void method2289(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2276(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2451(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.l(II)V")
    public void method2290(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2276(arg0 >>> 28 | 0x80);
                    }
                    this.method2276(arg0 >>> 21 | 0x80);
                }
                this.method2276(arg0 >>> 14 | 0x80);
            }
            this.method2276(arg0 >>> 7 | 0x80);
        }
        this.method2276(arg0 & 0x7F);
    }

    @ObfuscatedName("df.u(I)I")
    public int method2291() {
        return this.field1956[++this.field1955 - 1] & 0xFF;
    }

    @ObfuscatedName("df.a(I)B")
    public byte method2292() {
        return this.field1956[++this.field1955 - 1];
    }

    @ObfuscatedName("df.b(S)I")
    public int method2293() {
        this.field1955 += 2;
        return ((this.field1956[this.field1955 - 2] & 0xFF) << 8) + (this.field1956[this.field1955 - 1] & 0xFF);
    }

    @ObfuscatedName("df.s(I)I")
    public int method2439() {
        this.field1955 += 2;
        int var1 = ((this.field1956[this.field1955 - 2] & 0xFF) << 8) + (this.field1956[this.field1955 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.v(I)I")
    public int method2402() {
        this.field1955 += 3;
        return (this.field1956[this.field1955 - 1] & 0xFF) + ((this.field1956[this.field1955 - 2] & 0xFF) << 8) + ((this.field1956[this.field1955 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("df.j(I)I")
    public int method2296() {
        this.field1955 += 4;
        return (this.field1956[this.field1955 - 1] & 0xFF) + ((this.field1956[this.field1955 - 2] & 0xFF) << 8) + ((this.field1956[this.field1955 - 4] & 0xFF) << 24) + ((this.field1956[this.field1955 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("df.z(B)J")
    public long method2297() {
        long var1 = (long) this.method2296() & 0xFFFFFFFFL;
        long var3 = (long) this.method2296() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("df.n(I)Ljava/lang/String;")
    public String method2298() {
        if (this.field1956[this.field1955] == 0) {
            this.field1955++;
            return null;
        } else {
            return this.method2299();
        }
    }

    @ObfuscatedName("df.p(I)Ljava/lang/String;")
    public String method2299() {
        int var1 = this.field1955;
        while (this.field1956[++this.field1955 - 1] != 0) {
        }
        int var2 = this.field1955 - var1 - 1;
        return var2 == 0 ? "" : class165.method92(this.field1956, var1, var2);
    }

    @ObfuscatedName("df.aj(I)Ljava/lang/String;")
    public String method2300() {
        byte var1 = this.field1956[++this.field1955 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1955;
        while (this.field1956[++this.field1955 - 1] != 0) {
        }
        int var3 = this.field1955 - var2 - 1;
        return var3 == 0 ? "" : class165.method92(this.field1956, var2, var3);
    }

    @ObfuscatedName("df.aq(I)Ljava/lang/String;")
    public String method2410() {
        byte var1 = this.field1956[++this.field1955 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2479();
        if (this.field1955 + var2 > this.field1956.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1956;
        int var4 = this.field1955;
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
        this.field1955 += var2;
        return var12;
    }

    @ObfuscatedName("df.aw([BIIB)V")
    public void method2302(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1956[++this.field1955 - 1];
        }
    }

    @ObfuscatedName("df.az(B)I")
    public int method2280() {
        int var1 = this.field1956[this.field1955] & 0xFF;
        return var1 < 128 ? this.method2291() - 64 : this.method2293() - 49152;
    }

    @ObfuscatedName("df.at(I)I")
    public int method2301() {
        int var1 = this.field1956[this.field1955] & 0xFF;
        return var1 < 128 ? this.method2291() : this.method2293() - 32768;
    }

    @ObfuscatedName("df.af(B)I")
    public int method2305() {
        return this.field1956[this.field1955] < 0 ? this.method2296() & Integer.MAX_VALUE : this.method2293();
    }

    @ObfuscatedName("df.ax(I)I")
    public int method2479() {
        byte var1 = this.field1956[++this.field1955 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1956[++this.field1955 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("df.ac([II)V")
    public void method2307(int[] arg0) {
        int var2 = this.field1955 / 8;
        this.field1955 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2296();
            int var5 = this.method2296();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1955 -= 8;
            this.method2484(var4);
            this.method2484(var5);
        }
    }

    @ObfuscatedName("df.am([IB)V")
    public void method2308(int[] arg0) {
        int var2 = this.field1955 / 8;
        this.field1955 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2296();
            int var5 = this.method2296();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1955 -= 8;
            this.method2484(var4);
            this.method2484(var5);
        }
    }

    @ObfuscatedName("df.ao([IIII)V")
    public void method2309(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1955;
        this.field1955 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2296();
            int var8 = this.method2296();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1955 -= 8;
            this.method2484(var7);
            this.method2484(var8);
        }
        this.field1955 = var4;
    }

    @ObfuscatedName("df.ad([IIIS)V")
    public void method2464(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1955;
        this.field1955 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2296();
            int var8 = this.method2296();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1955 -= 8;
            this.method2484(var7);
            this.method2484(var8);
        }
        this.field1955 = var4;
    }

    @ObfuscatedName("df.ak(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2311(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1955;
        this.field1955 = 0;
        byte[] var4 = new byte[var3];
        this.method2302(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1955 = 0;
        this.method2451(var7.length);
        this.method2285(var7, 0, var7.length);
    }

    @ObfuscatedName("df.au(II)I")
    public int method2312(int arg0) {
        int var2 = method127(this.field1956, arg0, this.field1955);
        this.method2484(var2);
        return var2;
    }

    @ObfuscatedName("df.aa(I)Z")
    public boolean method2420() {
        this.field1955 -= 4;
        int var1 = method127(this.field1956, 0, this.field1955);
        int var2 = this.method2296();
        return var1 == var2;
    }

    @ObfuscatedName("df.ai(II)V")
    public void method2400(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("df.av(II)V")
    public void method2315(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("df.ar(II)V")
    public void method2316(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("df.as(I)I")
    public int method2350() {
        return this.field1956[++this.field1955 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("df.ap(I)I")
    public int method2423() {
        return -this.field1956[++this.field1955 - 1] & 0xFF;
    }

    @ObfuscatedName("df.ag(I)I")
    public int method2319() {
        return 128 - this.field1956[++this.field1955 - 1] & 0xFF;
    }

    @ObfuscatedName("df.ab(I)B")
    public byte method2320() {
        return (byte) (this.field1956[++this.field1955 - 1] - 128);
    }

    @ObfuscatedName("df.al(B)B")
    public byte method2381() {
        return (byte) (-this.field1956[++this.field1955 - 1]);
    }

    @ObfuscatedName("df.ae(I)B")
    public byte method2321() {
        return (byte) (128 - this.field1956[++this.field1955 - 1]);
    }

    @ObfuscatedName("df.ay(IB)V")
    public void method2323(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) arg0;
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.an(II)V")
    public void method2416(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("df.ah(II)V")
    public void method2325(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 + 128);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.be(B)I")
    public int method2326() {
        this.field1955 += 2;
        return ((this.field1956[this.field1955 - 1] & 0xFF) << 8) + (this.field1956[this.field1955 - 2] & 0xFF);
    }

    @ObfuscatedName("df.bb(I)I")
    public int method2327() {
        this.field1955 += 2;
        return ((this.field1956[this.field1955 - 2] & 0xFF) << 8) + (this.field1956[this.field1955 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("df.bx(I)I")
    public int method2427() {
        this.field1955 += 2;
        return ((this.field1956[this.field1955 - 1] & 0xFF) << 8) + (this.field1956[this.field1955 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("df.bk(I)I")
    public int method2303() {
        this.field1955 += 2;
        int var1 = ((this.field1956[this.field1955 - 1] & 0xFF) << 8) + (this.field1956[this.field1955 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.bo(II)V")
    public void method2330(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1956[++this.field1955 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.bi(I)I")
    public int method2336() {
        this.field1955 += 3;
        return (this.field1956[this.field1955 - 2] & 0xFF) + ((this.field1956[this.field1955 - 3] & 0xFF) << 16) + ((this.field1956[this.field1955 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("df.bj(IB)V")
    public void method2405(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) arg0;
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("df.bc(II)V")
    public void method2333(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
        this.field1956[++this.field1955 - 1] = (byte) arg0;
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 24);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("df.bt(II)V")
    public void method2334(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 16);
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 24);
        this.field1956[++this.field1955 - 1] = (byte) arg0;
        this.field1956[++this.field1955 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.bm(I)I")
    public int method2335() {
        this.field1955 += 4;
        return (this.field1956[this.field1955 - 4] & 0xFF) + ((this.field1956[this.field1955 - 3] & 0xFF) << 8) + ((this.field1956[this.field1955 - 2] & 0xFF) << 16) + ((this.field1956[this.field1955 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("df.bn(B)I")
    public int method2418() {
        this.field1955 += 4;
        return (this.field1956[this.field1955 - 3] & 0xFF) + ((this.field1956[this.field1955 - 4] & 0xFF) << 8) + ((this.field1956[this.field1955 - 1] & 0xFF) << 16) + ((this.field1956[this.field1955 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("df.by(I)I")
    public int method2386() {
        this.field1955 += 4;
        return (this.field1956[this.field1955 - 2] & 0xFF) + ((this.field1956[this.field1955 - 1] & 0xFF) << 8) + ((this.field1956[this.field1955 - 4] & 0xFF) << 16) + ((this.field1956[this.field1955 - 3] & 0xFF) << 24);
    }
}
