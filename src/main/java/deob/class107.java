package deob;

import java.math.BigInteger;

@ObfuscatedName("do")
public class class107 extends class183 {

    @ObfuscatedName("do.y")
    public byte[] field1856;

    @ObfuscatedName("do.u")
    public int field1854;

    @ObfuscatedName("do.k")
    public static int[] field1852 = new int[256];

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
            field1852[var0] = var1;
        }
    }

    public class107(int arg0) {
        this.field1856 = class109.method2328(arg0);
        this.field1854 = 0;
    }

    public class107(byte[] arg0) {
        this.field1856 = arg0;
        this.field1854 = 0;
    }

    @ObfuscatedName("do.u(IB)V")
    public void method2278(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.k(II)V")
    public void method2096(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
        this.field1856[++this.field1854 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.v(II)V")
    public void method2097(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 16);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
        this.field1856[++this.field1854 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.l(II)V")
    public void method2232(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 24);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 16);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
        this.field1856[++this.field1854 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.g(J)V")
    public void method2099(long arg0) {
        this.field1856[++this.field1854 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1856[++this.field1854 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1856[++this.field1854 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1856[++this.field1854 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1856[++this.field1854 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1856[++this.field1854 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1856[++this.field1854 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1856[++this.field1854 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("g.a(Ljava/lang/String;I)I")
    public static int method71(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("do.x(Ljava/lang/String;I)V")
    public void method2275(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1854 += class198.method161(arg0, 0, arg0.length(), this.field1856, this.field1854);
        this.field1856[++this.field1854 - 1] = 0;
    }

    @ObfuscatedName("f.r(Ljava/lang/String;I)I")
    public static int method128(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("do.w(Ljava/lang/String;I)V")
    public void method2101(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1856[++this.field1854 - 1] = 0;
        this.field1854 += class198.method161(arg0, 0, arg0.length(), this.field1856, this.field1854);
        this.field1856[++this.field1854 - 1] = 0;
    }

    @ObfuscatedName("do.c(Ljava/lang/CharSequence;I)V")
    public void method2102(CharSequence arg0) {
        int var2 = class184.method80(arg0);
        this.field1856[++this.field1854 - 1] = 0;
        this.method2108(var2);
        int var3 = this.field1854;
        byte[] var4 = this.field1856;
        int var5 = this.field1854;
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
        this.field1854 = var10 + var3;
    }

    @ObfuscatedName("do.f([BIII)V")
    public void method2098(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1856[++this.field1854 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("do.o(II)V")
    public void method2104(int arg0) {
        this.field1856[this.field1854 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1856[this.field1854 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1856[this.field1854 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1856[this.field1854 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.p(IB)V")
    public void method2105(int arg0) {
        this.field1856[this.field1854 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1856[this.field1854 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.n(II)V")
    public void method2106(int arg0) {
        this.field1856[this.field1854 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.m(II)V")
    public void method2107(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2278(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2096(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.s(II)V")
    public void method2108(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2278(arg0 >>> 28 | 0x80);
                    }
                    this.method2278(arg0 >>> 21 | 0x80);
                }
                this.method2278(arg0 >>> 14 | 0x80);
            }
            this.method2278(arg0 >>> 7 | 0x80);
        }
        this.method2278(arg0 & 0x7F);
    }

    @ObfuscatedName("do.t(B)I")
    public int method2109() {
        return this.field1856[++this.field1854 - 1] & 0xFF;
    }

    @ObfuscatedName("do.j(B)B")
    public byte method2110() {
        return this.field1856[++this.field1854 - 1];
    }

    @ObfuscatedName("do.b(B)I")
    public int method2111() {
        this.field1854 += 2;
        return ((this.field1856[this.field1854 - 2] & 0xFF) << 8) + (this.field1856[this.field1854 - 1] & 0xFF);
    }

    @ObfuscatedName("do.i(B)I")
    public int method2112() {
        this.field1854 += 2;
        int var1 = ((this.field1856[this.field1854 - 2] & 0xFF) << 8) + (this.field1856[this.field1854 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.h(B)I")
    public int method2113() {
        this.field1854 += 3;
        return (this.field1856[this.field1854 - 1] & 0xFF) + ((this.field1856[this.field1854 - 2] & 0xFF) << 8) + ((this.field1856[this.field1854 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("do.q(I)I")
    public int method2114() {
        this.field1854 += 4;
        return (this.field1856[this.field1854 - 1] & 0xFF) + ((this.field1856[this.field1854 - 2] & 0xFF) << 8) + ((this.field1856[this.field1854 - 3] & 0xFF) << 16) + ((this.field1856[this.field1854 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("do.d(I)J")
    public long method2115() {
        long var1 = (long) this.method2114() & 0xFFFFFFFFL;
        long var3 = (long) this.method2114() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("do.z(I)Ljava/lang/String;")
    public String method2116() {
        if (this.field1856[this.field1854] == 0) {
            this.field1854++;
            return null;
        } else {
            return this.method2126();
        }
    }

    @ObfuscatedName("do.e(I)Ljava/lang/String;")
    public String method2126() {
        int var1 = this.field1854;
        while (this.field1856[++this.field1854 - 1] != 0) {
        }
        int var2 = this.field1854 - var1 - 1;
        return var2 == 0 ? "" : class198.method3280(this.field1856, var1, var2);
    }

    @ObfuscatedName("do.av(I)Ljava/lang/String;")
    public String method2118() {
        byte var1 = this.field1856[++this.field1854 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1854;
        while (this.field1856[++this.field1854 - 1] != 0) {
        }
        int var3 = this.field1854 - var2 - 1;
        return var3 == 0 ? "" : class198.method3280(this.field1856, var2, var3);
    }

    @ObfuscatedName("do.al(B)Ljava/lang/String;")
    public String method2218() {
        byte var1 = this.field1856[++this.field1854 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2124();
        if (this.field1854 + var2 > this.field1856.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1856;
        int var4 = this.field1854;
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
        this.field1854 += var2;
        return var12;
    }

    @ObfuscatedName("do.aq([BIIB)V")
    public void method2120(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1856[++this.field1854 - 1];
        }
    }

    @ObfuscatedName("do.aa(I)I")
    public int method2187() {
        int var1 = this.field1856[this.field1854] & 0xFF;
        return var1 < 128 ? this.method2109() - 64 : this.method2111() - 49152;
    }

    @ObfuscatedName("do.ah(I)I")
    public int method2122() {
        int var1 = this.field1856[this.field1854] & 0xFF;
        return var1 < 128 ? this.method2109() : this.method2111() - 32768;
    }

    @ObfuscatedName("do.au(I)I")
    public int method2132() {
        return this.field1856[this.field1854] < 0 ? this.method2114() & Integer.MAX_VALUE : this.method2111();
    }

    @ObfuscatedName("do.ai(B)I")
    public int method2124() {
        byte var1 = this.field1856[++this.field1854 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1856[++this.field1854 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("do.ab([IIII)V")
    public void method2125(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1854;
        this.field1854 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2114();
            int var8 = this.method2114();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1854 -= 8;
            this.method2232(var7);
            this.method2232(var8);
        }
        this.field1854 = var4;
    }

    @ObfuscatedName("do.ag([IIII)V")
    public void method2169(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1854;
        this.field1854 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2114();
            int var8 = this.method2114();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1854 -= 8;
            this.method2232(var7);
            this.method2232(var8);
        }
        this.field1854 = var4;
    }

    @ObfuscatedName("do.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;S)V")
    public void method2277(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1854;
        this.field1854 = 0;
        byte[] var4 = new byte[var3];
        this.method2120(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1854 = 0;
        this.method2096(var7.length);
        this.method2098(var7, 0, var7.length);
    }

    @ObfuscatedName("do.af(II)I")
    public int method2128(int arg0) {
        int var2 = Statics.method1299(this.field1856, arg0, this.field1854);
        this.method2232(var2);
        return var2;
    }

    @ObfuscatedName("do.ao(B)Z")
    public boolean method2123() {
        this.field1854 -= 4;
        int var1 = Statics.method1299(this.field1856, 0, this.field1854);
        int var2 = this.method2114();
        return var1 == var2;
    }

    @ObfuscatedName("do.ac(II)V")
    public void method2100(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.aj(II)V")
    public void method2131(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("do.ap(IB)V")
    public void method2276(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("do.ae(B)I")
    public int method2133() {
        return this.field1856[++this.field1854 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("do.at(I)I")
    public int method2157() {
        return -this.field1856[++this.field1854 - 1] & 0xFF;
    }

    @ObfuscatedName("do.as(I)I")
    public int method2135() {
        return 128 - this.field1856[++this.field1854 - 1] & 0xFF;
    }

    @ObfuscatedName("do.aw(B)B")
    public byte method2136() {
        return (byte) (128 - this.field1856[++this.field1854 - 1]);
    }

    @ObfuscatedName("do.ak(IB)V")
    public void method2137(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) arg0;
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.az(IB)V")
    public void method2170(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.ay(IB)V")
    public void method2139(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 + 128);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.ad(I)I")
    public int method2140() {
        this.field1854 += 2;
        return ((this.field1856[this.field1854 - 1] & 0xFF) << 8) + (this.field1856[this.field1854 - 2] & 0xFF);
    }

    @ObfuscatedName("do.ar(I)I")
    public int method2141() {
        this.field1854 += 2;
        return ((this.field1856[this.field1854 - 2] & 0xFF) << 8) + (this.field1856[this.field1854 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("do.an(B)I")
    public int method2094() {
        this.field1854 += 2;
        return ((this.field1856[this.field1854 - 1] & 0xFF) << 8) + (this.field1856[this.field1854 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("do.am(B)I")
    public int method2143() {
        this.field1854 += 2;
        int var1 = ((this.field1856[this.field1854 - 1] & 0xFF) << 8) + (this.field1856[this.field1854 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.bw(I)I")
    public int method2144() {
        this.field1854 += 2;
        int var1 = ((this.field1856[this.field1854 - 1] & 0xFF) << 8) + (this.field1856[this.field1854 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.bq(I)I")
    public int method2290() {
        this.field1854 += 3;
        return (this.field1856[this.field1854 - 1] & 0xFF) + ((this.field1856[this.field1854 - 2] & 0xFF) << 16) + ((this.field1856[this.field1854 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("do.bl(II)V")
    public void method2146(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) arg0;
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 16);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("do.bh(II)V")
    public void method2147(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
        this.field1856[++this.field1854 - 1] = (byte) arg0;
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 24);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("do.bd(II)V")
    public void method2148(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 16);
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 24);
        this.field1856[++this.field1854 - 1] = (byte) arg0;
        this.field1856[++this.field1854 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.bn(B)I")
    public int method2149() {
        this.field1854 += 4;
        return (this.field1856[this.field1854 - 4] & 0xFF) + ((this.field1856[this.field1854 - 3] & 0xFF) << 8) + ((this.field1856[this.field1854 - 1] & 0xFF) << 24) + ((this.field1856[this.field1854 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("do.bm(B)I")
    public int method2150() {
        this.field1854 += 4;
        return (this.field1856[this.field1854 - 3] & 0xFF) + ((this.field1856[this.field1854 - 4] & 0xFF) << 8) + ((this.field1856[this.field1854 - 1] & 0xFF) << 16) + ((this.field1856[this.field1854 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("do.ba(I)I")
    public int method2151() {
        this.field1854 += 4;
        return (this.field1856[this.field1854 - 2] & 0xFF) + ((this.field1856[this.field1854 - 1] & 0xFF) << 8) + ((this.field1856[this.field1854 - 3] & 0xFF) << 24) + ((this.field1856[this.field1854 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("do.bp([BIII)V")
    public void method2152(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1856[++this.field1854 - 1];
        }
    }

    @ObfuscatedName("do.bt([BIIB)V")
    public void method2153(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1856[++this.field1854 - 1] - 128);
        }
    }
}
