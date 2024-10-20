package deob;

import java.math.BigInteger;

@ObfuscatedName("dc")
public class class111 extends class199 {

    @ObfuscatedName("dc.t")
    public byte[] field1869;

    @ObfuscatedName("dc.b")
    public int field1867;

    @ObfuscatedName("dc.p")
    public static int[] field1868 = new int[256];

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
            field1868[var0] = var1;
        }
    }

    @ObfuscatedName("k.t([BIII)I")
    public static int method180(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1868[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class111(int arg0) {
        this.field1869 = class113.method2415(arg0);
        this.field1867 = 0;
    }

    public class111(byte[] arg0) {
        this.field1869 = arg0;
        this.field1867 = 0;
    }

    @ObfuscatedName("dc.b(II)V")
    public void method2158(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.p(II)V")
    public void method2159(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
        this.field1869[++this.field1867 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.e(II)V")
    public void method2160(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 16);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
        this.field1869[++this.field1867 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.i(II)V")
    public void method2174(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 24);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 16);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
        this.field1869[++this.field1867 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.o(J)V")
    public void method2161(long arg0) {
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1869[++this.field1867 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dc.f(J)V")
    public void method2224(long arg0) {
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1869[++this.field1867 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1869[++this.field1867 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cc.d(Ljava/lang/String;I)I")
    public static int method1926(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dc.j(Ljava/lang/String;I)V")
    public void method2163(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1867 += class156.method145(arg0, 0, arg0.length(), this.field1869, this.field1867);
        this.field1869[++this.field1867 - 1] = 0;
    }

    @ObfuscatedName("dc.x(Ljava/lang/String;I)V")
    public void method2164(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1869[++this.field1867 - 1] = 0;
        this.field1867 += class156.method145(arg0, 0, arg0.length(), this.field1869, this.field1867);
        this.field1869[++this.field1867 - 1] = 0;
    }

    @ObfuscatedName("dc.v(Ljava/lang/CharSequence;B)V")
    public void method2268(CharSequence arg0) {
        int var2 = class200.method3047(arg0);
        this.field1869[++this.field1867 - 1] = 0;
        this.method2196(var2);
        int var3 = this.field1867;
        byte[] var4 = this.field1869;
        int var5 = this.field1867;
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
        this.field1867 = var10 + var3;
    }

    @ObfuscatedName("dc.a([BIII)V")
    public void method2166(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1869[++this.field1867 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dc.l(IB)V")
    public void method2171(int arg0) {
        this.field1869[this.field1867 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1869[this.field1867 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1869[this.field1867 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1869[this.field1867 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.h(II)V")
    public void method2240(int arg0) {
        this.field1869[this.field1867 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1869[this.field1867 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.c(II)V")
    public void method2169(int arg0) {
        this.field1869[this.field1867 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.u(IS)V")
    public void method2208(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2158(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2159(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.r(II)V")
    public void method2196(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2158(arg0 >>> 28 | 0x80);
                    }
                    this.method2158(arg0 >>> 21 | 0x80);
                }
                this.method2158(arg0 >>> 14 | 0x80);
            }
            this.method2158(arg0 >>> 7 | 0x80);
        }
        this.method2158(arg0 & 0x7F);
    }

    @ObfuscatedName("dc.k(I)I")
    public int method2172() {
        return this.field1869[++this.field1867 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.w(I)B")
    public byte method2358() {
        return this.field1869[++this.field1867 - 1];
    }

    @ObfuscatedName("dc.q(I)I")
    public int method2255() {
        this.field1867 += 2;
        return ((this.field1869[this.field1867 - 2] & 0xFF) << 8) + (this.field1869[this.field1867 - 1] & 0xFF);
    }

    @ObfuscatedName("dc.g(I)I")
    public int method2304() {
        this.field1867 += 2;
        int var1 = ((this.field1869[this.field1867 - 2] & 0xFF) << 8) + (this.field1869[this.field1867 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.z(B)I")
    public int method2307() {
        this.field1867 += 3;
        return (this.field1869[this.field1867 - 1] & 0xFF) + ((this.field1869[this.field1867 - 3] & 0xFF) << 16) + ((this.field1869[this.field1867 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dc.m(I)I")
    public int method2177() {
        this.field1867 += 4;
        return (this.field1869[this.field1867 - 1] & 0xFF) + ((this.field1869[this.field1867 - 2] & 0xFF) << 8) + ((this.field1869[this.field1867 - 4] & 0xFF) << 24) + ((this.field1869[this.field1867 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.y(S)J")
    public long method2248() {
        long var1 = (long) this.method2177() & 0xFFFFFFFFL;
        long var3 = (long) this.method2177() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dc.n(B)Ljava/lang/String;")
    public String method2179() {
        if (this.field1869[this.field1867] == 0) {
            this.field1867++;
            return null;
        } else {
            return this.method2180();
        }
    }

    @ObfuscatedName("dc.s(I)Ljava/lang/String;")
    public String method2180() {
        int var1 = this.field1867;
        while (this.field1869[++this.field1867 - 1] != 0) {
        }
        int var2 = this.field1867 - var1 - 1;
        return var2 == 0 ? "" : class156.method2785(this.field1869, var1, var2);
    }

    @ObfuscatedName("dc.ac(I)Ljava/lang/String;")
    public String method2181() {
        byte var1 = this.field1869[++this.field1867 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1867;
        while (this.field1869[++this.field1867 - 1] != 0) {
        }
        int var3 = this.field1867 - var2 - 1;
        return var3 == 0 ? "" : class156.method2785(this.field1869, var2, var3);
    }

    @ObfuscatedName("dc.au(B)Ljava/lang/String;")
    public String method2289() {
        byte var1 = this.field1869[++this.field1867 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2187();
        if (this.field1867 + var2 > this.field1869.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1869;
        int var4 = this.field1867;
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
        this.field1867 += var2;
        return var12;
    }

    @ObfuscatedName("dc.ap([BIII)V")
    public void method2281(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1869[++this.field1867 - 1];
        }
    }

    @ObfuscatedName("dc.ah(I)I")
    public int method2184() {
        int var1 = this.field1869[this.field1867] & 0xFF;
        return var1 < 128 ? this.method2172() - 64 : this.method2255() - 49152;
    }

    @ObfuscatedName("dc.ae(I)I")
    public int method2185() {
        int var1 = this.field1869[this.field1867] & 0xFF;
        return var1 < 128 ? this.method2172() : this.method2255() - 32768;
    }

    @ObfuscatedName("dc.ag(I)I")
    public int method2199() {
        return this.field1869[this.field1867] < 0 ? this.method2177() & Integer.MAX_VALUE : this.method2255();
    }

    @ObfuscatedName("dc.as(I)I")
    public int method2187() {
        byte var1 = this.field1869[++this.field1867 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1869[++this.field1867 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dc.at([II)V")
    public void method2188(int[] arg0) {
        int var2 = this.field1867 / 8;
        this.field1867 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2177();
            int var5 = this.method2177();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1867 -= 8;
            this.method2174(var4);
            this.method2174(var5);
        }
    }

    @ObfuscatedName("dc.aw([IB)V")
    public void method2189(int[] arg0) {
        int var2 = this.field1867 / 8;
        this.field1867 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2177();
            int var5 = this.method2177();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1867 -= 8;
            this.method2174(var4);
            this.method2174(var5);
        }
    }

    @ObfuscatedName("dc.ay([IIIS)V")
    public void method2190(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1867;
        this.field1867 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2177();
            int var8 = this.method2177();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1867 -= 8;
            this.method2174(var7);
            this.method2174(var8);
        }
        this.field1867 = var4;
    }

    @ObfuscatedName("dc.ao([IIII)V")
    public void method2317(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1867;
        this.field1867 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2177();
            int var8 = this.method2177();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1867 -= 8;
            this.method2174(var7);
            this.method2174(var8);
        }
        this.field1867 = var4;
    }

    @ObfuscatedName("dc.al(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2365(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1867;
        this.field1867 = 0;
        byte[] var4 = new byte[var3];
        this.method2281(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1867 = 0;
        this.method2159(var7.length);
        this.method2166(var7, 0, var7.length);
    }

    @ObfuscatedName("dc.ab(II)I")
    public int method2193(int arg0) {
        byte[] var2 = this.field1869;
        int var3 = this.field1867;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1868[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2174(var6);
        return var6;
    }

    @ObfuscatedName("dc.aj(S)Z")
    public boolean method2194() {
        this.field1867 -= 4;
        byte[] var1 = this.field1869;
        int var2 = this.field1867;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1868[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2177();
        return var5 == var8;
    }

    @ObfuscatedName("dc.ak(II)V")
    public void method2319(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.ar(II)V")
    public void method2333(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dc.ai(IS)V")
    public void method2197(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dc.ax(I)I")
    public int method2198() {
        return this.field1869[++this.field1867 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dc.az(I)I")
    public int method2236() {
        return -this.field1869[++this.field1867 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.aq(B)I")
    public int method2200() {
        return 128 - this.field1869[++this.field1867 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.ad(B)B")
    public byte method2201() {
        return (byte) (this.field1869[++this.field1867 - 1] - 128);
    }

    @ObfuscatedName("dc.af(I)B")
    public byte method2260() {
        return (byte) (128 - this.field1869[++this.field1867 - 1]);
    }

    @ObfuscatedName("dc.aa(II)V")
    public void method2203(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) arg0;
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.av(IB)V")
    public void method2238(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.an(II)V")
    public void method2205(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 + 128);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.am(I)I")
    public int method2211() {
        this.field1867 += 2;
        return ((this.field1869[this.field1867 - 1] & 0xFF) << 8) + (this.field1869[this.field1867 - 2] & 0xFF);
    }

    @ObfuscatedName("dc.bt(I)I")
    public int method2173() {
        this.field1867 += 2;
        return ((this.field1869[this.field1867 - 2] & 0xFF) << 8) + (this.field1869[this.field1867 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.br(S)I")
    public int method2204() {
        this.field1867 += 2;
        return ((this.field1869[this.field1867 - 1] & 0xFF) << 8) + (this.field1869[this.field1867 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bs(I)I")
    public int method2270() {
        this.field1867 += 2;
        int var1 = ((this.field1869[this.field1867 - 2] & 0xFF) << 8) + (this.field1869[this.field1867 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bn(S)I")
    public int method2209() {
        this.field1867 += 2;
        int var1 = ((this.field1869[this.field1867 - 1] & 0xFF) << 8) + (this.field1869[this.field1867 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bu(II)V")
    public void method2241(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) arg0;
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dc.bl(I)I")
    public int method2212() {
        this.field1867 += 3;
        return (this.field1869[this.field1867 - 1] & 0xFF) + ((this.field1869[this.field1867 - 2] & 0xFF) << 16) + ((this.field1869[this.field1867 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dc.by(II)V")
    public void method2213(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) arg0;
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 16);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dc.bi(II)V")
    public void method2214(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
        this.field1869[++this.field1867 - 1] = (byte) arg0;
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 24);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dc.bg(IB)V")
    public void method2215(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 16);
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 24);
        this.field1869[++this.field1867 - 1] = (byte) arg0;
        this.field1869[++this.field1867 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bw(I)I")
    public int method2315() {
        this.field1867 += 4;
        return (this.field1869[this.field1867 - 4] & 0xFF) + ((this.field1869[this.field1867 - 3] & 0xFF) << 8) + ((this.field1869[this.field1867 - 1] & 0xFF) << 24) + ((this.field1869[this.field1867 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.bf(I)I")
    public int method2217() {
        this.field1867 += 4;
        return (this.field1869[this.field1867 - 3] & 0xFF) + ((this.field1869[this.field1867 - 4] & 0xFF) << 8) + ((this.field1869[this.field1867 - 1] & 0xFF) << 16) + ((this.field1869[this.field1867 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bk(B)I")
    public int method2218() {
        this.field1867 += 4;
        return (this.field1869[this.field1867 - 2] & 0xFF) + ((this.field1869[this.field1867 - 1] & 0xFF) << 8) + ((this.field1869[this.field1867 - 3] & 0xFF) << 24) + ((this.field1869[this.field1867 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.ba([BIII)V")
    public void method2219(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1869[++this.field1867 - 1] - 128);
        }
    }
}
