package deob;

import java.math.BigInteger;

@ObfuscatedName("dg")
public class class110 extends class191 {

    @ObfuscatedName("dg.p")
    public byte[] field1844;

    @ObfuscatedName("dg.y")
    public int field1842;

    @ObfuscatedName("dg.d")
    public static int[] field1843 = new int[256];

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
            field1843[var0] = var1;
        }
    }

    @ObfuscatedName("am.p([BIII)I")
    public static int method597(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1843[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class110(int arg0) {
        this.field1844 = class112.method2361(arg0);
        this.field1842 = 0;
    }

    public class110(byte[] arg0) {
        this.field1844 = arg0;
        this.field1842 = 0;
    }

    @ObfuscatedName("dg.y(II)V")
    public void method2110(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.d(II)V")
    public void method2111(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1842 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.c(II)V")
    public void method2112(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1842 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.r(II)V")
    public void method2113(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1842 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.f(J)V")
    public void method2114(long arg0) {
        this.field1844[++this.field1842 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1844[++this.field1842 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1844[++this.field1842 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1844[++this.field1842 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1844[++this.field1842 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1844[++this.field1842 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1844[++this.field1842 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1844[++this.field1842 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("a.z(Ljava/lang/String;I)I")
    public static int method505(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dg.o(Ljava/lang/String;S)V")
    public void method2314(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1842 += class215.method2538(arg0, 0, arg0.length(), this.field1844, this.field1842);
        this.field1844[++this.field1842 - 1] = 0;
    }

    @ObfuscatedName("an.k(Ljava/lang/String;I)I")
    public static int method855(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dg.s(Ljava/lang/String;B)V")
    public void method2116(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1844[++this.field1842 - 1] = 0;
        this.field1842 += class215.method2538(arg0, 0, arg0.length(), this.field1844, this.field1842);
        this.field1844[++this.field1842 - 1] = 0;
    }

    @ObfuscatedName("dg.h(Ljava/lang/CharSequence;I)V")
    public void method2117(CharSequence arg0) {
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
        this.field1844[++this.field1842 - 1] = 0;
        this.method2160(var3);
        this.field1842 += class192.method3166(this.field1844, this.field1842, arg0);
    }

    @ObfuscatedName("dg.m([BIII)V")
    public void method2118(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1844[++this.field1842 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dg.w(II)V")
    public void method2119(int arg0) {
        this.field1844[this.field1842 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1844[this.field1842 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1844[this.field1842 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1844[this.field1842 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.q(II)V")
    public void method2120(int arg0) {
        this.field1844[this.field1842 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1844[this.field1842 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.u(II)V")
    public void method2121(int arg0) {
        this.field1844[this.field1842 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.e(II)V")
    public void method2122(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2110(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2111(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dg.b(IB)V")
    public void method2160(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2110(arg0 >>> 28 | 0x80);
                    }
                    this.method2110(arg0 >>> 21 | 0x80);
                }
                this.method2110(arg0 >>> 14 | 0x80);
            }
            this.method2110(arg0 >>> 7 | 0x80);
        }
        this.method2110(arg0 & 0x7F);
    }

    @ObfuscatedName("dg.g(I)I")
    public int method2309() {
        return this.field1844[++this.field1842 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.j(B)B")
    public byte method2125() {
        return this.field1844[++this.field1842 - 1];
    }

    @ObfuscatedName("dg.a(I)I")
    public int method2243() {
        this.field1842 += 2;
        return ((this.field1844[this.field1842 - 2] & 0xFF) << 8) + (this.field1844[this.field1842 - 1] & 0xFF);
    }

    @ObfuscatedName("dg.x(I)I")
    public int method2127() {
        this.field1842 += 2;
        int var1 = ((this.field1844[this.field1842 - 2] & 0xFF) << 8) + (this.field1844[this.field1842 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.n(I)I")
    public int method2128() {
        this.field1842 += 3;
        return (this.field1844[this.field1842 - 1] & 0xFF) + ((this.field1844[this.field1842 - 3] & 0xFF) << 16) + ((this.field1844[this.field1842 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dg.v(B)I")
    public int method2164() {
        this.field1842 += 4;
        return (this.field1844[this.field1842 - 1] & 0xFF) + ((this.field1844[this.field1842 - 2] & 0xFF) << 8) + ((this.field1844[this.field1842 - 3] & 0xFF) << 16) + ((this.field1844[this.field1842 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.l(B)J")
    public long method2263() {
        long var1 = (long) this.method2164() & 0xFFFFFFFFL;
        long var3 = (long) this.method2164() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dg.t(I)Ljava/lang/String;")
    public String method2131() {
        if (this.field1844[this.field1842] == 0) {
            this.field1842++;
            return null;
        } else {
            return this.method2132();
        }
    }

    @ObfuscatedName("dg.i(I)Ljava/lang/String;")
    public String method2132() {
        int var1 = this.field1842;
        while (this.field1844[++this.field1842 - 1] != 0) {
        }
        int var2 = this.field1842 - var1 - 1;
        return var2 == 0 ? "" : class215.method2727(this.field1844, var1, var2);
    }

    @ObfuscatedName("dg.aw(I)Ljava/lang/String;")
    public String method2133() {
        byte var1 = this.field1844[++this.field1842 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1842;
        while (this.field1844[++this.field1842 - 1] != 0) {
        }
        int var3 = this.field1842 - var2 - 1;
        return var3 == 0 ? "" : class215.method2727(this.field1844, var2, var3);
    }

    @ObfuscatedName("dg.ar(B)Ljava/lang/String;")
    public String method2156() {
        byte var1 = this.field1844[++this.field1842 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2320();
        if (this.field1842 + var2 > this.field1844.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1844;
        int var4 = this.field1842;
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
        this.field1842 += var2;
        return var12;
    }

    @ObfuscatedName("dg.af([BIII)V")
    public void method2225(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1844[++this.field1842 - 1];
        }
    }

    @ObfuscatedName("dg.am(I)I")
    public int method2192() {
        int var1 = this.field1844[this.field1842] & 0xFF;
        return var1 < 128 ? this.method2309() - 64 : this.method2243() - 49152;
    }

    @ObfuscatedName("dg.ax(I)I")
    public int method2137() {
        int var1 = this.field1844[this.field1842] & 0xFF;
        return var1 < 128 ? this.method2309() : this.method2243() - 32768;
    }

    @ObfuscatedName("dg.av(I)I")
    public int method2138() {
        return this.field1844[this.field1842] < 0 ? this.method2164() & Integer.MAX_VALUE : this.method2243();
    }

    @ObfuscatedName("dg.al(B)I")
    public int method2320() {
        byte var1 = this.field1844[++this.field1842 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1844[++this.field1842 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dg.ab([IIIS)V")
    public void method2251(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1842;
        this.field1842 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2164();
            int var8 = this.method2164();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1842 -= 8;
            this.method2113(var7);
            this.method2113(var8);
        }
        this.field1842 = var4;
    }

    @ObfuscatedName("dg.ac([IIII)V")
    public void method2141(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1842;
        this.field1842 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2164();
            int var8 = this.method2164();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1842 -= 8;
            this.method2113(var7);
            this.method2113(var8);
        }
        this.field1842 = var4;
    }

    @ObfuscatedName("dg.aq(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2142(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1842;
        this.field1842 = 0;
        byte[] var4 = new byte[var3];
        this.method2225(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1842 = 0;
        this.method2111(var7.length);
        this.method2118(var7, 0, var7.length);
    }

    @ObfuscatedName("dg.az(II)I")
    public int method2143(int arg0) {
        int var2 = method597(this.field1844, arg0, this.field1842);
        this.method2113(var2);
        return var2;
    }

    @ObfuscatedName("dg.ah(I)Z")
    public boolean method2144() {
        this.field1842 -= 4;
        int var1 = method597(this.field1844, 0, this.field1842);
        int var2 = this.method2164();
        return var1 == var2;
    }

    @ObfuscatedName("dg.at(IB)V")
    public void method2219(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dg.ap(II)V")
    public void method2146(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dg.as(IB)V")
    public void method2147(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dg.au(I)I")
    public int method2148() {
        return this.field1844[++this.field1842 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dg.ag(I)I")
    public int method2149() {
        return -this.field1844[++this.field1842 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.an(B)I")
    public int method2321() {
        return 128 - this.field1844[++this.field1842 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.ad(I)B")
    public byte method2151() {
        return (byte) (this.field1844[++this.field1842 - 1] - 128);
    }

    @ObfuscatedName("dg.ae(B)B")
    public byte method2216() {
        return (byte) (-this.field1844[++this.field1842 - 1]);
    }

    @ObfuscatedName("dg.ak(I)B")
    public byte method2323() {
        return (byte) (128 - this.field1844[++this.field1842 - 1]);
    }

    @ObfuscatedName("dg.ay(II)V")
    public void method2154(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) arg0;
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.ao(IB)V")
    public void method2129(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dg.ai(II)V")
    public void method2155(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 + 128);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.aa(I)I")
    public int method2202() {
        this.field1842 += 2;
        return ((this.field1844[this.field1842 - 1] & 0xFF) << 8) + (this.field1844[this.field1842 - 2] & 0xFF);
    }

    @ObfuscatedName("dg.aj(I)I")
    public int method2157() {
        this.field1842 += 2;
        return ((this.field1844[this.field1842 - 2] & 0xFF) << 8) + (this.field1844[this.field1842 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dg.be(I)I")
    public int method2158() {
        this.field1842 += 2;
        return ((this.field1844[this.field1842 - 1] & 0xFF) << 8) + (this.field1844[this.field1842 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dg.bi(B)I")
    public int method2159() {
        this.field1842 += 2;
        int var1 = ((this.field1844[this.field1842 - 1] & 0xFF) << 8) + (this.field1844[this.field1842 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.bn(I)I")
    public int method2287() {
        this.field1842 += 2;
        int var1 = ((this.field1844[this.field1842 - 1] & 0xFF) << 8) + (this.field1844[this.field1842 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.bt(IB)V")
    public void method2161(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1842 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.bk(B)I")
    public int method2162() {
        this.field1842 += 3;
        return (this.field1844[this.field1842 - 2] & 0xFF) + ((this.field1844[this.field1842 - 1] & 0xFF) << 8) + ((this.field1844[this.field1842 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dg.br(II)V")
    public void method2163(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) arg0;
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dg.bg(IB)V")
    public void method2195(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1842 - 1] = (byte) arg0;
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dg.bp(II)V")
    public void method2181(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1842 - 1] = (byte) arg0;
        this.field1844[++this.field1842 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.bw(I)I")
    public int method2189() {
        this.field1842 += 4;
        return (this.field1844[this.field1842 - 4] & 0xFF) + ((this.field1844[this.field1842 - 3] & 0xFF) << 8) + ((this.field1844[this.field1842 - 2] & 0xFF) << 16) + ((this.field1844[this.field1842 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.bu(I)I")
    public int method2167() {
        this.field1842 += 4;
        return (this.field1844[this.field1842 - 3] & 0xFF) + ((this.field1844[this.field1842 - 4] & 0xFF) << 8) + ((this.field1844[this.field1842 - 1] & 0xFF) << 16) + ((this.field1844[this.field1842 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.bb(I)I")
    public int method2168() {
        this.field1842 += 4;
        return (this.field1844[this.field1842 - 2] & 0xFF) + ((this.field1844[this.field1842 - 1] & 0xFF) << 8) + ((this.field1844[this.field1842 - 4] & 0xFF) << 16) + ((this.field1844[this.field1842 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.bj([BIIB)V")
    public void method2169(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1844[++this.field1842 - 1];
        }
    }

    @ObfuscatedName("dg.bc([BIII)V")
    public void method2170(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1844[++this.field1842 - 1] - 128);
        }
    }
}
