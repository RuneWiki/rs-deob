package deob;

import java.math.BigInteger;

@ObfuscatedName("dk")
public class class107 extends class186 {

    @ObfuscatedName("dk.e")
    public byte[] field1849;

    @ObfuscatedName("dk.v")
    public int field1844;

    @ObfuscatedName("dk.i")
    public static int[] field1845 = new int[256];

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
            field1845[var0] = var1;
        }
    }

    @ObfuscatedName("bh.e([BIII)I")
    public static int method1299(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1845[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("x.v([BII)I")
    public static int method35(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1845[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class107(int arg0) {
        this.field1849 = class109.method2354(arg0);
        this.field1844 = 0;
    }

    public class107(byte[] arg0) {
        this.field1849 = arg0;
        this.field1844 = 0;
    }

    @ObfuscatedName("dk.i(IB)V")
    public void method2102(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.g(IB)V")
    public void method2223(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.x(II)V")
    public void method2217(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.b(IB)V")
    public void method2137(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 24);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.q(J)V")
    public void method2106(long arg0) {
        this.field1849[++this.field1844 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1849[++this.field1844 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1849[++this.field1844 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1849[++this.field1844 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1849[++this.field1844 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1849[++this.field1844 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1849[++this.field1844 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1849[++this.field1844 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ai.l(Ljava/lang/String;I)I")
    public static int method853(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dk.m(Ljava/lang/String;I)V")
    public void method2107(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1844 += class201.method14(arg0, 0, arg0.length(), this.field1849, this.field1844);
        this.field1849[++this.field1844 - 1] = 0;
    }

    @ObfuscatedName("cl.u(Ljava/lang/String;I)I")
    public static int method2058(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dk.s(Ljava/lang/String;B)V")
    public void method2108(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1849[++this.field1844 - 1] = 0;
        this.field1844 += class201.method14(arg0, 0, arg0.length(), this.field1849, this.field1844);
        this.field1849[++this.field1844 - 1] = 0;
    }

    @ObfuscatedName("dk.f(Ljava/lang/CharSequence;B)V")
    public void method2109(CharSequence arg0) {
        int var2 = class187.method2047(arg0);
        this.field1849[++this.field1844 - 1] = 0;
        this.method2115(var2);
        int var3 = this.field1844;
        byte[] var4 = this.field1849;
        int var5 = this.field1844;
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
        this.field1844 = var10 + var3;
    }

    @ObfuscatedName("dk.p([BIII)V")
    public void method2241(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1849[++this.field1844 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dk.w(II)V")
    public void method2111(int arg0) {
        this.field1849[this.field1844 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1849[this.field1844 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1849[this.field1844 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1849[this.field1844 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.y(IB)V")
    public void method2252(int arg0) {
        this.field1849[this.field1844 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1849[this.field1844 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.h(II)V")
    public void method2301(int arg0) {
        this.field1849[this.field1844 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.j(II)V")
    public void method2114(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2102(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2223(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dk.c(IB)V")
    public void method2115(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2102(arg0 >>> 28 | 0x80);
                    }
                    this.method2102(arg0 >>> 21 | 0x80);
                }
                this.method2102(arg0 >>> 14 | 0x80);
            }
            this.method2102(arg0 >>> 7 | 0x80);
        }
        this.method2102(arg0 & 0x7F);
    }

    @ObfuscatedName("dk.d(I)I")
    public int method2226() {
        return this.field1849[++this.field1844 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.a(B)B")
    public byte method2292() {
        return this.field1849[++this.field1844 - 1];
    }

    @ObfuscatedName("dk.o(B)I")
    public int method2152() {
        this.field1844 += 2;
        return ((this.field1849[this.field1844 - 2] & 0xFF) << 8) + (this.field1849[this.field1844 - 1] & 0xFF);
    }

    @ObfuscatedName("dk.r(I)I")
    public int method2204() {
        this.field1844 += 2;
        int var1 = ((this.field1849[this.field1844 - 2] & 0xFF) << 8) + (this.field1849[this.field1844 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.t(I)I")
    public int method2112() {
        this.field1844 += 3;
        return (this.field1849[this.field1844 - 1] & 0xFF) + ((this.field1849[this.field1844 - 2] & 0xFF) << 8) + ((this.field1849[this.field1844 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.k(I)I")
    public int method2121() {
        this.field1844 += 4;
        return (this.field1849[this.field1844 - 1] & 0xFF) + ((this.field1849[this.field1844 - 2] & 0xFF) << 8) + ((this.field1849[this.field1844 - 3] & 0xFF) << 16) + ((this.field1849[this.field1844 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.n(I)J")
    public long method2118() {
        long var1 = (long) this.method2121() & 0xFFFFFFFFL;
        long var3 = (long) this.method2121() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dk.z(I)Ljava/lang/String;")
    public String method2250() {
        if (this.field1849[this.field1844] == 0) {
            this.field1844++;
            return null;
        } else {
            return this.method2124();
        }
    }

    @ObfuscatedName("dk.av(I)Ljava/lang/String;")
    public String method2124() {
        int var1 = this.field1844;
        while (this.field1849[++this.field1844 - 1] != 0) {
        }
        int var2 = this.field1844 - var1 - 1;
        return var2 == 0 ? "" : class201.method2358(this.field1849, var1, var2);
    }

    @ObfuscatedName("dk.ao(I)Ljava/lang/String;")
    public String method2125() {
        byte var1 = this.field1849[++this.field1844 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1844;
        while (this.field1849[++this.field1844 - 1] != 0) {
        }
        int var3 = this.field1844 - var2 - 1;
        return var3 == 0 ? "" : class201.method2358(this.field1849, var2, var3);
    }

    @ObfuscatedName("dk.am(B)Ljava/lang/String;")
    public String method2126() {
        byte var1 = this.field1849[++this.field1844 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2131();
        if (this.field1844 + var2 > this.field1849.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1849;
        int var4 = this.field1844;
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
        this.field1844 += var2;
        return var12;
    }

    @ObfuscatedName("dk.ac([BIII)V")
    public void method2127(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1849[++this.field1844 - 1];
        }
    }

    @ObfuscatedName("dk.ak(I)I")
    public int method2128() {
        int var1 = this.field1849[this.field1844] & 0xFF;
        return var1 < 128 ? this.method2226() - 64 : this.method2152() - 49152;
    }

    @ObfuscatedName("dk.ag(B)I")
    public int method2129() {
        int var1 = this.field1849[this.field1844] & 0xFF;
        return var1 < 128 ? this.method2226() : this.method2152() - 32768;
    }

    @ObfuscatedName("dk.ap(S)I")
    public int method2130() {
        return this.field1849[this.field1844] < 0 ? this.method2121() & Integer.MAX_VALUE : this.method2152();
    }

    @ObfuscatedName("dk.ah(I)I")
    public int method2131() {
        byte var1 = this.field1849[++this.field1844 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1849[++this.field1844 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dk.an([IIII)V")
    public void method2132(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1844;
        this.field1844 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2121();
            int var8 = this.method2121();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1844 -= 8;
            this.method2137(var7);
            this.method2137(var8);
        }
        this.field1844 = var4;
    }

    @ObfuscatedName("dk.ay([IIII)V")
    public void method2133(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1844;
        this.field1844 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2121();
            int var8 = this.method2121();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1844 -= 8;
            this.method2137(var7);
            this.method2137(var8);
        }
        this.field1844 = var4;
    }

    @ObfuscatedName("dk.af(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2148(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1844;
        this.field1844 = 0;
        byte[] var4 = new byte[var3];
        this.method2127(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1844 = 0;
        this.method2223(var7.length);
        this.method2241(var7, 0, var7.length);
    }

    @ObfuscatedName("dk.aq(II)I")
    public int method2123(int arg0) {
        byte[] var2 = this.field1849;
        int var3 = this.field1844;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1845[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2137(var6);
        return var6;
    }

    @ObfuscatedName("dk.aj(I)Z")
    public boolean method2136() {
        this.field1844 -= 4;
        int var1 = method1299(this.field1849, 0, this.field1844);
        int var2 = this.method2121();
        return var1 == var2;
    }

    @ObfuscatedName("dk.at(IB)V")
    public void method2197(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.aw(II)V")
    public void method2113(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dk.ar(II)V")
    public void method2144(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dk.az(I)I")
    public int method2101() {
        return this.field1849[++this.field1844 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dk.au(I)I")
    public int method2140() {
        return -this.field1849[++this.field1844 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.ai(I)I")
    public int method2141() {
        return 128 - this.field1849[++this.field1844 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.ad(I)B")
    public byte method2267() {
        return (byte) (this.field1849[++this.field1844 - 1] - 128);
    }

    @ObfuscatedName("dk.al(II)V")
    public void method2153(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) arg0;
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.ae(IB)V")
    public void method2135(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.as(II)V")
    public void method2207(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 + 128);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.ax(I)I")
    public int method2146() {
        this.field1844 += 2;
        return ((this.field1849[this.field1844 - 1] & 0xFF) << 8) + (this.field1849[this.field1844 - 2] & 0xFF);
    }

    @ObfuscatedName("dk.aa(B)I")
    public int method2147() {
        this.field1844 += 2;
        return ((this.field1849[this.field1844 - 2] & 0xFF) << 8) + (this.field1849[this.field1844 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.ab(B)I")
    public int method2224() {
        this.field1844 += 2;
        return ((this.field1849[this.field1844 - 1] & 0xFF) << 8) + (this.field1849[this.field1844 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.bc(I)I")
    public int method2149() {
        this.field1844 += 2;
        int var1 = ((this.field1849[this.field1844 - 2] & 0xFF) << 8) + (this.field1849[this.field1844 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.bb(I)I")
    public int method2208() {
        this.field1844 += 2;
        int var1 = ((this.field1849[this.field1844 - 1] & 0xFF) << 8) + (this.field1849[this.field1844 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.bo(IS)V")
    public void method2134(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) arg0;
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dk.bg(I)I")
    public int method2117() {
        this.field1844 += 3;
        return (this.field1849[this.field1844 - 2] & 0xFF) + ((this.field1849[this.field1844 - 1] & 0xFF) << 8) + ((this.field1849[this.field1844 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.bf(II)V")
    public void method2281(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) arg0;
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dk.bv(II)V")
    public void method2154(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1844 - 1] = (byte) arg0;
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 24);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dk.bd(IB)V")
    public void method2189(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 24);
        this.field1849[++this.field1844 - 1] = (byte) arg0;
        this.field1849[++this.field1844 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.bl(I)I")
    public int method2156() {
        this.field1844 += 4;
        return (this.field1849[this.field1844 - 4] & 0xFF) + ((this.field1849[this.field1844 - 3] & 0xFF) << 8) + ((this.field1849[this.field1844 - 1] & 0xFF) << 24) + ((this.field1849[this.field1844 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.bp(B)I")
    public int method2157() {
        this.field1844 += 4;
        return (this.field1849[this.field1844 - 3] & 0xFF) + ((this.field1849[this.field1844 - 4] & 0xFF) << 8) + ((this.field1849[this.field1844 - 2] & 0xFF) << 24) + ((this.field1849[this.field1844 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.bw(B)I")
    public int method2158() {
        this.field1844 += 4;
        return (this.field1849[this.field1844 - 2] & 0xFF) + ((this.field1849[this.field1844 - 1] & 0xFF) << 8) + ((this.field1849[this.field1844 - 4] & 0xFF) << 16) + ((this.field1849[this.field1844 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.bs([BIII)V")
    public void method2159(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1849[++this.field1844 - 1] - 128);
        }
    }
}
