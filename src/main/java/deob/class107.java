package deob;

import java.math.BigInteger;

@ObfuscatedName("de")
public class class107 extends class187 {

    @ObfuscatedName("de.g")
    public byte[] field1854;

    @ObfuscatedName("de.s")
    public int field1851;

    @ObfuscatedName("de.v")
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

    @ObfuscatedName("e.g([BIIB)I")
    public static int method489(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1852[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class107(int arg0) {
        this.field1854 = class109.method2299(arg0);
        this.field1851 = 0;
    }

    public class107(byte[] arg0) {
        this.field1854 = arg0;
        this.field1851 = 0;
    }

    @ObfuscatedName("de.s(II)V")
    public void method2079(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.v(II)V")
    public void method2177(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1851 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.o(IS)V")
    public void method2261(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1851 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.k(IB)V")
    public void method2082(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 24);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1851 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.m(J)V")
    public void method2083(long arg0) {
        this.field1854[++this.field1851 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1854[++this.field1851 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1854[++this.field1851 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1854[++this.field1851 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1854[++this.field1851 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1854[++this.field1851 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1854[++this.field1851 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1854[++this.field1851 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("a.i(Ljava/lang/String;I)I")
    public static int method492(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("de.t(Ljava/lang/String;I)V")
    public void method2256(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1851 += class202.method1287(arg0, 0, arg0.length(), this.field1854, this.field1851);
        this.field1854[++this.field1851 - 1] = 0;
    }

    @ObfuscatedName("r.l(Ljava/lang/String;S)I")
    public static int method121(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("de.p(Ljava/lang/String;I)V")
    public void method2085(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1854[++this.field1851 - 1] = 0;
        this.field1851 += class202.method1287(arg0, 0, arg0.length(), this.field1854, this.field1851);
        this.field1854[++this.field1851 - 1] = 0;
    }

    @ObfuscatedName("de.r(Ljava/lang/CharSequence;B)V")
    public void method2120(CharSequence arg0) {
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
        this.field1854[++this.field1851 - 1] = 0;
        this.method2092(var3);
        int var8 = this.field1851;
        byte[] var9 = this.field1854;
        int var10 = this.field1851;
        int var11 = arg0.length();
        int var12 = var10;
        for (int var13 = 0; var13 < var11; var13++) {
            char var14 = arg0.charAt(var13);
            if (var14 <= 127) {
                var9[var12++] = (byte) var14;
            } else if (var14 <= 2047) {
                var9[var12++] = (byte) (0xC0 | var14 >> 6);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            } else {
                var9[var12++] = (byte) (0xE0 | var14 >> 12);
                var9[var12++] = (byte) (0x80 | var14 >> 6 & 0x3F);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            }
        }
        int var15 = var12 - var10;
        this.field1851 = var15 + var8;
    }

    @ObfuscatedName("de.j([BIIB)V")
    public void method2187(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1854[++this.field1851 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("de.c(II)V")
    public void method2088(int arg0) {
        this.field1854[this.field1851 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1854[this.field1851 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1854[this.field1851 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1854[this.field1851 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.q(II)V")
    public void method2077(int arg0) {
        this.field1854[this.field1851 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1854[this.field1851 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.n(II)V")
    public void method2146(int arg0) {
        this.field1854[this.field1851 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.h(IB)V")
    public void method2091(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2079(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2177(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.d(IB)V")
    public void method2092(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2079(arg0 >>> 28 | 0x80);
                    }
                    this.method2079(arg0 >>> 21 | 0x80);
                }
                this.method2079(arg0 >>> 14 | 0x80);
            }
            this.method2079(arg0 >>> 7 | 0x80);
        }
        this.method2079(arg0 & 0x7F);
    }

    @ObfuscatedName("de.b(S)I")
    public int method2116() {
        return this.field1854[++this.field1851 - 1] & 0xFF;
    }

    @ObfuscatedName("de.w(B)B")
    public byte method2093() {
        return this.field1854[++this.field1851 - 1];
    }

    @ObfuscatedName("de.z(I)I")
    public int method2094() {
        this.field1851 += 2;
        return ((this.field1854[this.field1851 - 2] & 0xFF) << 8) + (this.field1854[this.field1851 - 1] & 0xFF);
    }

    @ObfuscatedName("de.x(I)I")
    public int method2095() {
        this.field1851 += 2;
        int var1 = ((this.field1854[this.field1851 - 2] & 0xFF) << 8) + (this.field1854[this.field1851 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.e(I)I")
    public int method2096() {
        this.field1851 += 3;
        return (this.field1854[this.field1851 - 1] & 0xFF) + ((this.field1854[this.field1851 - 3] & 0xFF) << 16) + ((this.field1854[this.field1851 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("de.a(I)I")
    public int method2097() {
        this.field1851 += 4;
        return (this.field1854[this.field1851 - 1] & 0xFF) + ((this.field1854[this.field1851 - 2] & 0xFF) << 8) + ((this.field1854[this.field1851 - 4] & 0xFF) << 24) + ((this.field1854[this.field1851 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("de.y(B)J")
    public long method2086() {
        long var1 = (long) this.method2097() & 0xFFFFFFFFL;
        long var3 = (long) this.method2097() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("de.f(B)Ljava/lang/String;")
    public String method2127() {
        if (this.field1854[this.field1851] == 0) {
            this.field1851++;
            return null;
        } else {
            return this.method2100();
        }
    }

    @ObfuscatedName("de.u(I)Ljava/lang/String;")
    public String method2100() {
        int var1 = this.field1851;
        while (this.field1854[++this.field1851 - 1] != 0) {
        }
        int var2 = this.field1851 - var1 - 1;
        return var2 == 0 ? "" : class202.method3292(this.field1854, var1, var2);
    }

    @ObfuscatedName("de.ab(I)Ljava/lang/String;")
    public String method2101() {
        byte var1 = this.field1854[++this.field1851 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1851;
        while (this.field1854[++this.field1851 - 1] != 0) {
        }
        int var3 = this.field1851 - var2 - 1;
        return var3 == 0 ? "" : class202.method3292(this.field1854, var2, var3);
    }

    @ObfuscatedName("de.ai(I)Ljava/lang/String;")
    public String method2080() {
        byte var1 = this.field1854[++this.field1851 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2107();
        if (this.field1851 + var2 > this.field1854.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1854;
        int var4 = this.field1851;
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
        this.field1851 += var2;
        return var12;
    }

    @ObfuscatedName("de.aj([BIII)V")
    public void method2103(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1854[++this.field1851 - 1];
        }
    }

    @ObfuscatedName("de.as(B)I")
    public int method2236() {
        int var1 = this.field1854[this.field1851] & 0xFF;
        return var1 < 128 ? this.method2116() - 64 : this.method2094() - 49152;
    }

    @ObfuscatedName("de.ax(I)I")
    public int method2112() {
        int var1 = this.field1854[this.field1851] & 0xFF;
        return var1 < 128 ? this.method2116() : this.method2094() - 32768;
    }

    @ObfuscatedName("de.ac(I)I")
    public int method2106() {
        return this.field1854[this.field1851] < 0 ? this.method2097() & Integer.MAX_VALUE : this.method2094();
    }

    @ObfuscatedName("de.az(I)I")
    public int method2107() {
        byte var1 = this.field1854[++this.field1851 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1854[++this.field1851 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("de.au([IIII)V")
    public void method2108(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1851;
        this.field1851 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2097();
            int var8 = this.method2097();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1851 -= 8;
            this.method2082(var7);
            this.method2082(var8);
        }
        this.field1851 = var4;
    }

    @ObfuscatedName("de.av([IIII)V")
    public void method2141(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1851;
        this.field1851 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2097();
            int var8 = this.method2097();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1851 -= 8;
            this.method2082(var7);
            this.method2082(var8);
        }
        this.field1851 = var4;
    }

    @ObfuscatedName("de.am(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2110(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1851;
        this.field1851 = 0;
        byte[] var4 = new byte[var3];
        this.method2103(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1851 = 0;
        this.method2177(var7.length);
        this.method2187(var7, 0, var7.length);
    }

    @ObfuscatedName("de.ao(II)I")
    public int method2111(int arg0) {
        int var2 = method489(this.field1854, arg0, this.field1851);
        this.method2082(var2);
        return var2;
    }

    @ObfuscatedName("de.aq(I)Z")
    public boolean method2203() {
        this.field1851 -= 4;
        int var1 = method489(this.field1854, 0, this.field1851);
        int var2 = this.method2097();
        return var1 == var2;
    }

    @ObfuscatedName("de.ay(II)V")
    public void method2113(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.an(IB)V")
    public void method2081(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("de.ak(IB)V")
    public void method2115(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("de.ae(I)I")
    public int method2194() {
        return this.field1854[++this.field1851 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("de.ad(I)I")
    public int method2117() {
        return -this.field1854[++this.field1851 - 1] & 0xFF;
    }

    @ObfuscatedName("de.aw(S)I")
    public int method2253() {
        return 128 - this.field1854[++this.field1851 - 1] & 0xFF;
    }

    @ObfuscatedName("de.ah(B)B")
    public byte method2118() {
        return (byte) (this.field1854[++this.field1851 - 1] - 128);
    }

    @ObfuscatedName("de.at(S)B")
    public byte method2220() {
        return (byte) (128 - this.field1854[++this.field1851 - 1]);
    }

    @ObfuscatedName("de.aa(II)V")
    public void method2172(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) arg0;
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ar(IB)V")
    public void method2121(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.ap(II)V")
    public void method2122(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 + 128);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ag(B)I")
    public int method2123() {
        this.field1851 += 2;
        return ((this.field1854[this.field1851 - 1] & 0xFF) << 8) + (this.field1854[this.field1851 - 2] & 0xFF);
    }

    @ObfuscatedName("de.af(I)I")
    public int method2258() {
        this.field1851 += 2;
        return ((this.field1854[this.field1851 - 2] & 0xFF) << 8) + (this.field1854[this.field1851 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("de.al(I)I")
    public int method2125() {
        this.field1851 += 2;
        return ((this.field1854[this.field1851 - 1] & 0xFF) << 8) + (this.field1854[this.field1851 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bq(I)I")
    public int method2209() {
        this.field1851 += 2;
        int var1 = ((this.field1854[this.field1851 - 1] & 0xFF) << 8) + (this.field1854[this.field1851 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bc(B)I")
    public int method2144() {
        this.field1851 += 2;
        int var1 = ((this.field1854[this.field1851 - 1] & 0xFF) << 8) + (this.field1854[this.field1851 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bf(II)V")
    public void method2216(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) arg0;
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("de.bk(II)V")
    public void method2157(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1851 - 1] = (byte) arg0;
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 24);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("de.bn(IB)V")
    public void method2130(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 24);
        this.field1854[++this.field1851 - 1] = (byte) arg0;
        this.field1854[++this.field1851 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bp(I)I")
    public int method2131() {
        this.field1851 += 4;
        return (this.field1854[this.field1851 - 4] & 0xFF) + ((this.field1854[this.field1851 - 3] & 0xFF) << 8) + ((this.field1854[this.field1851 - 1] & 0xFF) << 24) + ((this.field1854[this.field1851 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("de.bx(I)I")
    public int method2132() {
        this.field1851 += 4;
        return (this.field1854[this.field1851 - 3] & 0xFF) + ((this.field1854[this.field1851 - 4] & 0xFF) << 8) + ((this.field1854[this.field1851 - 2] & 0xFF) << 24) + ((this.field1854[this.field1851 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("de.bm(S)I")
    public int method2119() {
        this.field1851 += 4;
        return (this.field1854[this.field1851 - 2] & 0xFF) + ((this.field1854[this.field1851 - 1] & 0xFF) << 8) + ((this.field1854[this.field1851 - 3] & 0xFF) << 24) + ((this.field1854[this.field1851 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("de.ba([BIIB)V")
    public void method2155(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1854[++this.field1851 - 1] - 128);
        }
    }

    @ObfuscatedName("de.be([BIII)V")
    public void method2135(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1854[++this.field1851 - 1] - 128);
        }
    }
}
