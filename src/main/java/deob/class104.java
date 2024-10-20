package deob;

import java.math.BigInteger;

@ObfuscatedName("cj")
public class class104 extends class176 {

    @ObfuscatedName("cj.z")
    public byte[] field1819;

    @ObfuscatedName("cj.n")
    public int field1815;

    @ObfuscatedName("cj.u")
    public static int[] field1814 = new int[256];

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
            field1814[var0] = var1;
        }
    }

    @ObfuscatedName("g.z([BIII)I")
    public static int method148(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1814[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("y.n([BII)I")
    public static int method537(byte[] arg0, int arg1) {
        return method148(arg0, 0, arg1);
    }

    public class104(int arg0) {
        this.field1819 = class106.method2363(arg0);
        this.field1815 = 0;
    }

    public class104(byte[] arg0) {
        this.field1819 = arg0;
        this.field1815 = 0;
    }

    @ObfuscatedName("cj.u(II)V")
    public void method2113(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cj.t(IB)V")
    public void method2114(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
        this.field1819[++this.field1815 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cj.e(II)V")
    public void method2115(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 16);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
        this.field1819[++this.field1815 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cj.a(II)V")
    public void method2144(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 24);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 16);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
        this.field1819[++this.field1815 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cj.l(J)V")
    public void method2117(long arg0) {
        this.field1819[++this.field1815 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1819[++this.field1815 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1819[++this.field1815 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1819[++this.field1815 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1819[++this.field1815 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1819[++this.field1815 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1819[++this.field1815 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1819[++this.field1815 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cj.v(Ljava/lang/String;I)V")
    public void method2118(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1815 += class191.method3501(arg0, 0, arg0.length(), this.field1819, this.field1815);
        this.field1819[++this.field1815 - 1] = 0;
    }

    @ObfuscatedName("cj.k(Ljava/lang/String;B)V")
    public void method2119(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1819[++this.field1815 - 1] = 0;
        this.field1815 += class191.method3501(arg0, 0, arg0.length(), this.field1819, this.field1815);
        this.field1819[++this.field1815 - 1] = 0;
    }

    @ObfuscatedName("cj.g(Ljava/lang/CharSequence;I)V")
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
        this.field1819[++this.field1815 - 1] = 0;
        this.method2195(var3);
        int var8 = this.field1815;
        byte[] var9 = this.field1819;
        int var10 = this.field1815;
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
        this.field1815 = var15 + var8;
    }

    @ObfuscatedName("cj.d([BIIB)V")
    public void method2276(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1819[++this.field1815 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("cj.b(II)V")
    public void method2298(int arg0) {
        this.field1819[this.field1815 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1819[this.field1815 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1819[this.field1815 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1819[this.field1815 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cj.i(II)V")
    public void method2244(int arg0) {
        this.field1819[this.field1815 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1819[this.field1815 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cj.o(IB)V")
    public void method2124(int arg0) {
        this.field1819[this.field1815 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cj.x(II)V")
    public void method2125(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2113(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2114(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cj.m(II)V")
    public void method2195(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2113(arg0 >>> 28 | 0x80);
                    }
                    this.method2113(arg0 >>> 21 | 0x80);
                }
                this.method2113(arg0 >>> 14 | 0x80);
            }
            this.method2113(arg0 >>> 7 | 0x80);
        }
        this.method2113(arg0 & 0x7F);
    }

    @ObfuscatedName("cj.f(B)I")
    public int method2257() {
        return this.field1819[++this.field1815 - 1] & 0xFF;
    }

    @ObfuscatedName("cj.q(B)B")
    public byte method2237() {
        return this.field1819[++this.field1815 - 1];
    }

    @ObfuscatedName("cj.c(I)I")
    public int method2206() {
        this.field1815 += 2;
        return ((this.field1819[this.field1815 - 2] & 0xFF) << 8) + (this.field1819[this.field1815 - 1] & 0xFF);
    }

    @ObfuscatedName("cj.h(I)I")
    public int method2254() {
        this.field1815 += 2;
        int var1 = ((this.field1819[this.field1815 - 2] & 0xFF) << 8) + (this.field1819[this.field1815 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("cj.y(I)I")
    public int method2167() {
        this.field1815 += 3;
        return (this.field1819[this.field1815 - 1] & 0xFF) + ((this.field1819[this.field1815 - 2] & 0xFF) << 8) + ((this.field1819[this.field1815 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("cj.r(I)I")
    public int method2130() {
        this.field1815 += 4;
        return (this.field1819[this.field1815 - 1] & 0xFF) + ((this.field1819[this.field1815 - 2] & 0xFF) << 8) + ((this.field1819[this.field1815 - 4] & 0xFF) << 24) + ((this.field1819[this.field1815 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("cj.w(I)J")
    public long method2133() {
        long var1 = (long) this.method2130() & 0xFFFFFFFFL;
        long var3 = (long) this.method2130() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("cj.p(B)Ljava/lang/String;")
    public String method2134() {
        if (this.field1819[this.field1815] == 0) {
            this.field1815++;
            return null;
        } else {
            return this.method2187();
        }
    }

    @ObfuscatedName("cj.s(I)Ljava/lang/String;")
    public String method2187() {
        int var1 = this.field1815;
        while (this.field1819[++this.field1815 - 1] != 0) {
        }
        int var2 = this.field1815 - var1 - 1;
        return var2 == 0 ? "" : class191.method37(this.field1819, var1, var2);
    }

    @ObfuscatedName("cj.ag(B)Ljava/lang/String;")
    public String method2112() {
        byte var1 = this.field1819[++this.field1815 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1815;
        while (this.field1819[++this.field1815 - 1] != 0) {
        }
        int var3 = this.field1815 - var2 - 1;
        return var3 == 0 ? "" : class191.method37(this.field1819, var2, var3);
    }

    @ObfuscatedName("cj.ad(I)Ljava/lang/String;")
    public String method2181() {
        byte var1 = this.field1819[++this.field1815 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2142();
        if (this.field1815 + var2 > this.field1819.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1819;
        int var4 = this.field1815;
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
        this.field1815 += var2;
        return var12;
    }

    @ObfuscatedName("cj.ak([BIII)V")
    public void method2146(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1819[++this.field1815 - 1];
        }
    }

    @ObfuscatedName("cj.ai(B)I")
    public int method2139() {
        int var1 = this.field1819[this.field1815] & 0xFF;
        return var1 < 128 ? this.method2257() - 64 : this.method2206() - 49152;
    }

    @ObfuscatedName("cj.ac(S)I")
    public int method2204() {
        int var1 = this.field1819[this.field1815] & 0xFF;
        return var1 < 128 ? this.method2257() : this.method2206() - 32768;
    }

    @ObfuscatedName("cj.as(I)I")
    public int method2286() {
        return this.field1819[this.field1815] < 0 ? this.method2130() & Integer.MAX_VALUE : this.method2206();
    }

    @ObfuscatedName("cj.ar(B)I")
    public int method2142() {
        byte var1 = this.field1819[++this.field1815 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1819[++this.field1815 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("cj.an([IIII)V")
    public void method2143(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1815;
        this.field1815 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2130();
            int var8 = this.method2130();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1815 -= 8;
            this.method2144(var7);
            this.method2144(var8);
        }
        this.field1815 = var4;
    }

    @ObfuscatedName("cj.ah([IIII)V")
    public void method2284(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1815;
        this.field1815 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2130();
            int var8 = this.method2130();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1815 -= 8;
            this.method2144(var7);
            this.method2144(var8);
        }
        this.field1815 = var4;
    }

    @ObfuscatedName("cj.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2228(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1815;
        this.field1815 = 0;
        byte[] var4 = new byte[var3];
        this.method2146(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1815 = 0;
        this.method2114(var7.length);
        this.method2276(var7, 0, var7.length);
    }

    @ObfuscatedName("cj.ae(II)I")
    public int method2256(int arg0) {
        int var2 = method148(this.field1819, arg0, this.field1815);
        this.method2144(var2);
        return var2;
    }

    @ObfuscatedName("cj.ao(B)Z")
    public boolean method2147() {
        this.field1815 -= 4;
        int var1 = method148(this.field1819, 0, this.field1815);
        int var2 = this.method2130();
        return var1 == var2;
    }

    @ObfuscatedName("cj.aj(IB)V")
    public void method2323(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("cj.ap(IB)V")
    public void method2189(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("cj.am(IB)V")
    public void method2150(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("cj.az(B)I")
    public int method2151() {
        return this.field1819[++this.field1815 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("cj.aa(B)I")
    public int method2152() {
        return -this.field1819[++this.field1815 - 1] & 0xFF;
    }

    @ObfuscatedName("cj.ab(B)I")
    public int method2153() {
        return 128 - this.field1819[++this.field1815 - 1] & 0xFF;
    }

    @ObfuscatedName("cj.aw(I)B")
    public byte method2268() {
        return (byte) (-this.field1819[++this.field1815 - 1]);
    }

    @ObfuscatedName("cj.av(B)B")
    public byte method2155() {
        return (byte) (128 - this.field1819[++this.field1815 - 1]);
    }

    @ObfuscatedName("cj.al(II)V")
    public void method2156(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) arg0;
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("cj.aq(IS)V")
    public void method2157(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("cj.au(II)V")
    public void method2158(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 + 128);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("cj.ay(I)I")
    public int method2159() {
        this.field1815 += 2;
        return ((this.field1819[this.field1815 - 1] & 0xFF) << 8) + (this.field1819[this.field1815 - 2] & 0xFF);
    }

    @ObfuscatedName("cj.at(I)I")
    public int method2160() {
        this.field1815 += 2;
        return ((this.field1819[this.field1815 - 2] & 0xFF) << 8) + (this.field1819[this.field1815 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("cj.af(I)I")
    public int method2161() {
        this.field1815 += 2;
        return ((this.field1819[this.field1815 - 1] & 0xFF) << 8) + (this.field1819[this.field1815 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("cj.bp(B)I")
    public int method2165() {
        this.field1815 += 2;
        int var1 = ((this.field1819[this.field1815 - 2] & 0xFF) << 8) + (this.field1819[this.field1815 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("cj.bx(I)I")
    public int method2163() {
        this.field1815 += 2;
        int var1 = ((this.field1819[this.field1815 - 1] & 0xFF) << 8) + (this.field1819[this.field1815 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("cj.by(IB)V")
    public void method2164(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 16);
        this.field1819[++this.field1815 - 1] = (byte) arg0;
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("cj.bq(I)I")
    public int method2162() {
        this.field1815 += 3;
        return (this.field1819[this.field1815 - 1] & 0xFF) + ((this.field1819[this.field1815 - 3] & 0xFF) << 8) + ((this.field1819[this.field1815 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("cj.bt(IB)V")
    public void method2177(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) arg0;
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 16);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("cj.br(IB)V")
    public void method2138(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
        this.field1819[++this.field1815 - 1] = (byte) arg0;
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 24);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("cj.bi(II)V")
    public void method2222(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 16);
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 24);
        this.field1819[++this.field1815 - 1] = (byte) arg0;
        this.field1819[++this.field1815 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("cj.ba(S)I")
    public int method2169() {
        this.field1815 += 4;
        return (this.field1819[this.field1815 - 4] & 0xFF) + ((this.field1819[this.field1815 - 3] & 0xFF) << 8) + ((this.field1819[this.field1815 - 2] & 0xFF) << 16) + ((this.field1819[this.field1815 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("cj.bf(I)I")
    public int method2170() {
        this.field1815 += 4;
        return (this.field1819[this.field1815 - 3] & 0xFF) + ((this.field1819[this.field1815 - 4] & 0xFF) << 8) + ((this.field1819[this.field1815 - 1] & 0xFF) << 16) + ((this.field1819[this.field1815 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("cj.bh(I)I")
    public int method2171() {
        this.field1815 += 4;
        return (this.field1819[this.field1815 - 2] & 0xFF) + ((this.field1819[this.field1815 - 1] & 0xFF) << 8) + ((this.field1819[this.field1815 - 3] & 0xFF) << 24) + ((this.field1819[this.field1815 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("cj.bo([BIII)V")
    public void method2217(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1819[++this.field1815 - 1] - 128);
        }
    }

    @ObfuscatedName("cj.bn([BIII)V")
    public void method2311(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1819[++this.field1815 - 1] - 128);
        }
    }
}
