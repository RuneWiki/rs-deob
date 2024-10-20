package deob;

import java.math.BigInteger;

@ObfuscatedName("de")
public class class111 extends class199 {

    @ObfuscatedName("de.p")
    public byte[] field1889;

    @ObfuscatedName("de.k")
    public int field1885;

    @ObfuscatedName("de.e")
    public static int[] field1886 = new int[256];

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
            field1886[var0] = var1;
        }
    }

    @ObfuscatedName("at.p([BIIB)I")
    public static int method939(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1886[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class111(int arg0) {
        this.field1889 = class113.method2408(arg0);
        this.field1885 = 0;
    }

    public class111(byte[] arg0) {
        this.field1889 = arg0;
        this.field1885 = 0;
    }

    @ObfuscatedName("de.k(II)V")
    public void method2160(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.e(IB)V")
    public void method2365(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1885 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.f(II)V")
    public void method2260(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1885 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.w(II)V")
    public void method2161(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 24);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1885 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.t(J)V")
    public void method2164(long arg0) {
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1889[++this.field1885 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("de.s(J)V")
    public void method2279(long arg0) {
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1889[++this.field1885 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1889[++this.field1885 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("bz.c(Ljava/lang/String;I)I")
    public static int method1406(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("de.d(Ljava/lang/String;B)V")
    public void method2186(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1885 += class156.method1913(arg0, 0, arg0.length(), this.field1889, this.field1885);
        this.field1889[++this.field1885 - 1] = 0;
    }

    @ObfuscatedName("bn.v(Ljava/lang/String;I)I")
    public static int method1100(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("de.m(Ljava/lang/String;B)V")
    public void method2255(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1889[++this.field1885 - 1] = 0;
        this.field1885 += class156.method1913(arg0, 0, arg0.length(), this.field1889, this.field1885);
        this.field1889[++this.field1885 - 1] = 0;
    }

    @ObfuscatedName("de.h(Ljava/lang/CharSequence;I)V")
    public void method2352(CharSequence arg0) {
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
        this.field1889[++this.field1885 - 1] = 0;
        this.method2300(var3);
        this.field1885 += class200.method831(this.field1889, this.field1885, arg0);
    }

    @ObfuscatedName("de.n([BIIB)V")
    public void method2227(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1889[++this.field1885 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("de.x(II)V")
    public void method2175(int arg0) {
        this.field1889[this.field1885 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1889[this.field1885 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1889[this.field1885 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1889[this.field1885 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.o(II)V")
    public void method2171(int arg0) {
        this.field1889[this.field1885 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1889[this.field1885 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.r(II)V")
    public void method2172(int arg0) {
        this.field1889[this.field1885 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.y(IB)V")
    public void method2173(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2160(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2365(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.i(II)V")
    public void method2300(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2160(arg0 >>> 28 | 0x80);
                    }
                    this.method2160(arg0 >>> 21 | 0x80);
                }
                this.method2160(arg0 >>> 14 | 0x80);
            }
            this.method2160(arg0 >>> 7 | 0x80);
        }
        this.method2160(arg0 & 0x7F);
    }

    @ObfuscatedName("de.q(B)I")
    public int method2314() {
        return this.field1889[++this.field1885 - 1] & 0xFF;
    }

    @ObfuscatedName("de.g(B)B")
    public byte method2176() {
        return this.field1889[++this.field1885 - 1];
    }

    @ObfuscatedName("de.l(B)I")
    public int method2177() {
        this.field1885 += 2;
        return ((this.field1889[this.field1885 - 2] & 0xFF) << 8) + (this.field1889[this.field1885 - 1] & 0xFF);
    }

    @ObfuscatedName("de.u(I)I")
    public int method2319() {
        this.field1885 += 2;
        int var1 = ((this.field1889[this.field1885 - 2] & 0xFF) << 8) + (this.field1889[this.field1885 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.j(B)I")
    public int method2179() {
        this.field1885 += 3;
        return (this.field1889[this.field1885 - 1] & 0xFF) + ((this.field1889[this.field1885 - 3] & 0xFF) << 16) + ((this.field1889[this.field1885 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("de.z(B)I")
    public int method2350() {
        this.field1885 += 4;
        return (this.field1889[this.field1885 - 1] & 0xFF) + ((this.field1889[this.field1885 - 2] & 0xFF) << 8) + ((this.field1889[this.field1885 - 4] & 0xFF) << 24) + ((this.field1889[this.field1885 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("de.b(B)J")
    public long method2181() {
        long var1 = (long) this.method2350() & 0xFFFFFFFFL;
        long var3 = (long) this.method2350() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("de.a(B)Ljava/lang/String;")
    public String method2182() {
        if (this.field1889[this.field1885] == 0) {
            this.field1885++;
            return null;
        } else {
            return this.method2265();
        }
    }

    @ObfuscatedName("de.ag(S)Ljava/lang/String;")
    public String method2265() {
        int var1 = this.field1885;
        while (this.field1889[++this.field1885 - 1] != 0) {
        }
        int var2 = this.field1885 - var1 - 1;
        return var2 == 0 ? "" : class156.method2463(this.field1889, var1, var2);
    }

    @ObfuscatedName("de.am(I)Ljava/lang/String;")
    public String method2184() {
        byte var1 = this.field1889[++this.field1885 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1885;
        while (this.field1889[++this.field1885 - 1] != 0) {
        }
        int var3 = this.field1885 - var2 - 1;
        return var3 == 0 ? "" : class156.method2463(this.field1889, var2, var3);
    }

    @ObfuscatedName("de.aa(I)Ljava/lang/String;")
    public String method2185() {
        byte var1 = this.field1889[++this.field1885 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2215();
        if (this.field1885 + var2 > this.field1889.length) {
            throw new IllegalStateException("");
        }
        String var3 = class200.method488(this.field1889, this.field1885, var2);
        this.field1885 += var2;
        return var3;
    }

    @ObfuscatedName("de.az([BIIB)V")
    public void method2355(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1889[++this.field1885 - 1];
        }
    }

    @ObfuscatedName("de.aq(B)I")
    public int method2183() {
        int var1 = this.field1889[this.field1885] & 0xFF;
        return var1 < 128 ? this.method2314() - 64 : this.method2177() - 49152;
    }

    @ObfuscatedName("de.ak(S)I")
    public int method2188() {
        int var1 = this.field1889[this.field1885] & 0xFF;
        return var1 < 128 ? this.method2314() : this.method2177() - 32768;
    }

    @ObfuscatedName("de.ar(I)I")
    public int method2189() {
        return this.field1889[this.field1885] < 0 ? this.method2350() & Integer.MAX_VALUE : this.method2177();
    }

    @ObfuscatedName("de.al(I)I")
    public int method2215() {
        byte var1 = this.field1889[++this.field1885 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1889[++this.field1885 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("de.au([II)V")
    public void method2249(int[] arg0) {
        int var2 = this.field1885 / 8;
        this.field1885 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2350();
            int var5 = this.method2350();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1885 -= 8;
            this.method2161(var4);
            this.method2161(var5);
        }
    }

    @ObfuscatedName("de.ao([II)V")
    public void method2198(int[] arg0) {
        int var2 = this.field1885 / 8;
        this.field1885 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2350();
            int var5 = this.method2350();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1885 -= 8;
            this.method2161(var4);
            this.method2161(var5);
        }
    }

    @ObfuscatedName("de.af([IIII)V")
    public void method2193(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1885;
        this.field1885 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2350();
            int var8 = this.method2350();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1885 -= 8;
            this.method2161(var7);
            this.method2161(var8);
        }
        this.field1885 = var4;
    }

    @ObfuscatedName("de.ai([IIII)V")
    public void method2194(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1885;
        this.field1885 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2350();
            int var8 = this.method2350();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1885 -= 8;
            this.method2161(var7);
            this.method2161(var8);
        }
        this.field1885 = var4;
    }

    @ObfuscatedName("de.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2195(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1885;
        this.field1885 = 0;
        byte[] var4 = new byte[var3];
        this.method2355(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1885 = 0;
        this.method2365(var7.length);
        this.method2227(var7, 0, var7.length);
    }

    @ObfuscatedName("de.aw(II)I")
    public int method2196(int arg0) {
        int var2 = method939(this.field1889, arg0, this.field1885);
        this.method2161(var2);
        return var2;
    }

    @ObfuscatedName("de.ab(I)Z")
    public boolean method2294() {
        this.field1885 -= 4;
        int var1 = method939(this.field1889, 0, this.field1885);
        int var2 = this.method2350();
        return var1 == var2;
    }

    @ObfuscatedName("de.ad(II)V")
    public void method2178(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.ae(II)V")
    public void method2245(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("de.ay(II)V")
    public void method2321(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("de.ap(B)I")
    public int method2200() {
        return this.field1889[++this.field1885 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("de.av(I)I")
    public int method2201() {
        return -this.field1889[++this.field1885 - 1] & 0xFF;
    }

    @ObfuscatedName("de.ah(I)I")
    public int method2202() {
        return 128 - this.field1889[++this.field1885 - 1] & 0xFF;
    }

    @ObfuscatedName("de.at(I)B")
    public byte method2203() {
        return (byte) (this.field1889[++this.field1885 - 1] - 128);
    }

    @ObfuscatedName("de.an(II)V")
    public void method2204(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) arg0;
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ac(IB)V")
    public void method2205(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.as(II)V")
    public void method2206(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 + 128);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ax(I)I")
    public int method2207() {
        this.field1885 += 2;
        return ((this.field1889[this.field1885 - 1] & 0xFF) << 8) + (this.field1889[this.field1885 - 2] & 0xFF);
    }

    @ObfuscatedName("de.bg(S)I")
    public int method2346() {
        this.field1885 += 2;
        return ((this.field1889[this.field1885 - 2] & 0xFF) << 8) + (this.field1889[this.field1885 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bw(B)I")
    public int method2209() {
        this.field1885 += 2;
        return ((this.field1889[this.field1885 - 1] & 0xFF) << 8) + (this.field1889[this.field1885 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("de.bn(I)I")
    public int method2210() {
        this.field1885 += 3;
        return (this.field1889[this.field1885 - 1] & 0xFF) + ((this.field1889[this.field1885 - 2] & 0xFF) << 16) + ((this.field1889[this.field1885 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("de.by(II)V")
    public void method2211(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) arg0;
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("de.bb(IB)V")
    public void method2311(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1885 - 1] = (byte) arg0;
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 24);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("de.bp(II)V")
    public void method2213(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 24);
        this.field1889[++this.field1885 - 1] = (byte) arg0;
        this.field1889[++this.field1885 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bc(I)I")
    public int method2312() {
        this.field1885 += 4;
        return (this.field1889[this.field1885 - 4] & 0xFF) + ((this.field1889[this.field1885 - 3] & 0xFF) << 8) + ((this.field1889[this.field1885 - 1] & 0xFF) << 24) + ((this.field1889[this.field1885 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("de.bx(I)I")
    public int method2336() {
        this.field1885 += 4;
        return (this.field1889[this.field1885 - 3] & 0xFF) + ((this.field1889[this.field1885 - 4] & 0xFF) << 8) + ((this.field1889[this.field1885 - 1] & 0xFF) << 16) + ((this.field1889[this.field1885 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("de.bt(B)I")
    public int method2216() {
        this.field1885 += 4;
        return (this.field1889[this.field1885 - 2] & 0xFF) + ((this.field1889[this.field1885 - 1] & 0xFF) << 8) + ((this.field1889[this.field1885 - 3] & 0xFF) << 24) + ((this.field1889[this.field1885 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("de.bv([BIIB)V")
    public void method2217(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1889[++this.field1885 - 1] - 128);
        }
    }
}
