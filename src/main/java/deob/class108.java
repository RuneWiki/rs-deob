package deob;

import java.math.BigInteger;

@ObfuscatedName("dd")
public class class108 extends class189 {

    @ObfuscatedName("dd.e")
    public byte[] field1842;

    @ObfuscatedName("dd.v")
    public int field1841;

    @ObfuscatedName("dd.k")
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

    @ObfuscatedName("ay.e([BIIB)I")
    public static int method811(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1845[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cj.v([BIB)I")
    public static int method1773(byte[] arg0, int arg1) {
        return method811(arg0, 0, arg1);
    }

    public class108(int arg0) {
        this.field1842 = class110.method2350(arg0);
        this.field1841 = 0;
    }

    public class108(byte[] arg0) {
        this.field1842 = arg0;
        this.field1841 = 0;
    }

    @ObfuscatedName("dd.k(II)V")
    public void method2123(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.g(II)V")
    public void method2109(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1842[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.q(IB)V")
    public void method2110(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1842[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.l(II)V")
    public void method2134(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1842[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.a(J)V")
    public void method2277(long arg0) {
        this.field1842[++this.field1841 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1842[++this.field1841 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1842[++this.field1841 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1842[++this.field1841 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1842[++this.field1841 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1842[++this.field1841 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1842[++this.field1841 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1842[++this.field1841 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ef.b(Ljava/lang/String;I)I")
    public static int method2832(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dd.z(Ljava/lang/String;B)V")
    public void method2304(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1841 += class213.method29(arg0, 0, arg0.length(), this.field1842, this.field1841);
        this.field1842[++this.field1841 - 1] = 0;
    }

    @ObfuscatedName("z.w(Ljava/lang/String;B)I")
    public static int method91(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dd.j(Ljava/lang/String;B)V")
    public void method2114(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1842[++this.field1841 - 1] = 0;
        this.field1841 += class213.method29(arg0, 0, arg0.length(), this.field1842, this.field1841);
        this.field1842[++this.field1841 - 1] = 0;
    }

    @ObfuscatedName("dd.p(Ljava/lang/CharSequence;B)V")
    public void method2115(CharSequence arg0) {
        int var2 = class190.method2468(arg0);
        this.field1842[++this.field1841 - 1] = 0;
        this.method2121(var2);
        int var3 = this.field1841;
        byte[] var4 = this.field1842;
        int var5 = this.field1841;
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
        this.field1841 = var10 + var3;
    }

    @ObfuscatedName("dd.n([BIIS)V")
    public void method2116(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1842[++this.field1841 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dd.r(II)V")
    public void method2117(int arg0) {
        this.field1842[this.field1841 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1842[this.field1841 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1842[this.field1841 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1842[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.s(IB)V")
    public void method2118(int arg0) {
        this.field1842[this.field1841 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1842[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.f(IB)V")
    public void method2119(int arg0) {
        this.field1842[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.c(II)V")
    public void method2120(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2123(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2109(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dd.t(II)V")
    public void method2121(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2123(arg0 >>> 28 | 0x80);
                    }
                    this.method2123(arg0 >>> 21 | 0x80);
                }
                this.method2123(arg0 >>> 14 | 0x80);
            }
            this.method2123(arg0 >>> 7 | 0x80);
        }
        this.method2123(arg0 & 0x7F);
    }

    @ObfuscatedName("dd.i(I)I")
    public int method2122() {
        return this.field1842[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dd.u(I)B")
    public byte method2190() {
        return this.field1842[++this.field1841 - 1];
    }

    @ObfuscatedName("dd.y(B)I")
    public int method2124() {
        this.field1841 += 2;
        return ((this.field1842[this.field1841 - 2] & 0xFF) << 8) + (this.field1842[this.field1841 - 1] & 0xFF);
    }

    @ObfuscatedName("dd.o(I)I")
    public int method2125() {
        this.field1841 += 2;
        int var1 = ((this.field1842[this.field1841 - 2] & 0xFF) << 8) + (this.field1842[this.field1841 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dd.m(I)I")
    public int method2126() {
        this.field1841 += 3;
        return (this.field1842[this.field1841 - 1] & 0xFF) + ((this.field1842[this.field1841 - 2] & 0xFF) << 8) + ((this.field1842[this.field1841 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dd.h(I)I")
    public int method2127() {
        this.field1841 += 4;
        return (this.field1842[this.field1841 - 1] & 0xFF) + ((this.field1842[this.field1841 - 2] & 0xFF) << 8) + ((this.field1842[this.field1841 - 4] & 0xFF) << 24) + ((this.field1842[this.field1841 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dd.x(B)J")
    public long method2192() {
        long var1 = (long) this.method2127() & 0xFFFFFFFFL;
        long var3 = (long) this.method2127() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dd.d(I)Ljava/lang/String;")
    public String method2129() {
        if (this.field1842[this.field1841] == 0) {
            this.field1841++;
            return null;
        } else {
            return this.method2130();
        }
    }

    @ObfuscatedName("dd.ac(B)Ljava/lang/String;")
    public String method2130() {
        int var1 = this.field1841;
        while (this.field1842[++this.field1841 - 1] != 0) {
        }
        int var2 = this.field1841 - var1 - 1;
        return var2 == 0 ? "" : class213.method3347(this.field1842, var1, var2);
    }

    @ObfuscatedName("dd.ax(I)Ljava/lang/String;")
    public String method2131() {
        byte var1 = this.field1842[++this.field1841 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1841;
        while (this.field1842[++this.field1841 - 1] != 0) {
        }
        int var3 = this.field1841 - var2 - 1;
        return var3 == 0 ? "" : class213.method3347(this.field1842, var2, var3);
    }

    @ObfuscatedName("dd.af(I)Ljava/lang/String;")
    public String method2132() {
        byte var1 = this.field1842[++this.field1841 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2137();
        if (this.field1841 + var2 > this.field1842.length) {
            throw new IllegalStateException("");
        }
        String var3 = class190.method483(this.field1842, this.field1841, var2);
        this.field1841 += var2;
        return var3;
    }

    @ObfuscatedName("dd.am([BIII)V")
    public void method2189(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1842[++this.field1841 - 1];
        }
    }

    @ObfuscatedName("dd.ah(I)I")
    public int method2210() {
        int var1 = this.field1842[this.field1841] & 0xFF;
        return var1 < 128 ? this.method2122() - 64 : this.method2124() - 49152;
    }

    @ObfuscatedName("dd.ar(I)I")
    public int method2135() {
        int var1 = this.field1842[this.field1841] & 0xFF;
        return var1 < 128 ? this.method2122() : this.method2124() - 32768;
    }

    @ObfuscatedName("dd.ad(I)I")
    public int method2136() {
        return this.field1842[this.field1841] < 0 ? this.method2127() & Integer.MAX_VALUE : this.method2124();
    }

    @ObfuscatedName("dd.ao(I)I")
    public int method2137() {
        byte var1 = this.field1842[++this.field1841 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1842[++this.field1841 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dd.ae([IIIB)V")
    public void method2138(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1841;
        this.field1841 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2127();
            int var8 = this.method2127();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1841 -= 8;
            this.method2134(var7);
            this.method2134(var8);
        }
        this.field1841 = var4;
    }

    @ObfuscatedName("dd.ab([IIII)V")
    public void method2292(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1841;
        this.field1841 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2127();
            int var8 = this.method2127();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1841 -= 8;
            this.method2134(var7);
            this.method2134(var8);
        }
        this.field1841 = var4;
    }

    @ObfuscatedName("dd.ai(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2314(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1841;
        this.field1841 = 0;
        byte[] var4 = new byte[var3];
        this.method2189(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1841 = 0;
        this.method2109(var7.length);
        this.method2116(var7, 0, var7.length);
    }

    @ObfuscatedName("dd.ag(IB)I")
    public int method2133(int arg0) {
        int var2 = method811(this.field1842, arg0, this.field1841);
        this.method2134(var2);
        return var2;
    }

    @ObfuscatedName("dd.ap(I)Z")
    public boolean method2142() {
        this.field1841 -= 4;
        int var1 = method811(this.field1842, 0, this.field1841);
        int var2 = this.method2127();
        return var1 == var2;
    }

    @ObfuscatedName("dd.at(II)V")
    public void method2268(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dd.az(II)V")
    public void method2144(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dd.an(IB)V")
    public void method2145(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dd.ay(S)I")
    public int method2172() {
        return this.field1842[++this.field1841 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dd.aw(I)I")
    public int method2154() {
        return -this.field1842[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dd.ak(B)I")
    public int method2148() {
        return 128 - this.field1842[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dd.aq(I)B")
    public byte method2149() {
        return (byte) (this.field1842[++this.field1841 - 1] - 128);
    }

    @ObfuscatedName("dd.aa(I)B")
    public byte method2244() {
        return (byte) (-this.field1842[++this.field1841 - 1]);
    }

    @ObfuscatedName("dd.aj(II)V")
    public void method2151(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) arg0;
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dd.au(II)V")
    public void method2152(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dd.al(II)V")
    public void method2153(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 + 128);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dd.as(I)I")
    public int method2150() {
        this.field1841 += 2;
        return ((this.field1842[this.field1841 - 1] & 0xFF) << 8) + (this.field1842[this.field1841 - 2] & 0xFF);
    }

    @ObfuscatedName("dd.av(I)I")
    public int method2155() {
        this.field1841 += 2;
        return ((this.field1842[this.field1841 - 2] & 0xFF) << 8) + (this.field1842[this.field1841 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dd.bw(I)I")
    public int method2156() {
        this.field1841 += 2;
        return ((this.field1842[this.field1841 - 1] & 0xFF) << 8) + (this.field1842[this.field1841 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dd.bq(I)I")
    public int method2238() {
        this.field1841 += 2;
        int var1 = ((this.field1842[this.field1841 - 2] & 0xFF) << 8) + (this.field1842[this.field1841 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dd.bk(I)I")
    public int method2289() {
        this.field1841 += 2;
        int var1 = ((this.field1842[this.field1841 - 1] & 0xFF) << 8) + (this.field1842[this.field1841 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dd.bv(II)V")
    public void method2141(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1842[++this.field1841 - 1] = (byte) arg0;
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dd.br(S)I")
    public int method2158() {
        this.field1841 += 3;
        return (this.field1842[this.field1841 - 2] & 0xFF) + ((this.field1842[this.field1841 - 1] & 0xFF) << 8) + ((this.field1842[this.field1841 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dd.bn(II)V")
    public void method2316(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) arg0;
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dd.bc(II)V")
    public void method2265(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1842[++this.field1841 - 1] = (byte) arg0;
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dd.bt(II)V")
    public void method2161(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1842[++this.field1841 - 1] = (byte) arg0;
        this.field1842[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dd.bz(I)I")
    public int method2162() {
        this.field1841 += 4;
        return (this.field1842[this.field1841 - 4] & 0xFF) + ((this.field1842[this.field1841 - 3] & 0xFF) << 8) + ((this.field1842[this.field1841 - 2] & 0xFF) << 16) + ((this.field1842[this.field1841 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dd.bb(I)I")
    public int method2201() {
        this.field1841 += 4;
        return (this.field1842[this.field1841 - 3] & 0xFF) + ((this.field1842[this.field1841 - 4] & 0xFF) << 8) + ((this.field1842[this.field1841 - 2] & 0xFF) << 24) + ((this.field1842[this.field1841 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dd.bu(B)I")
    public int method2196() {
        this.field1841 += 4;
        return (this.field1842[this.field1841 - 2] & 0xFF) + ((this.field1842[this.field1841 - 1] & 0xFF) << 8) + ((this.field1842[this.field1841 - 4] & 0xFF) << 16) + ((this.field1842[this.field1841 - 3] & 0xFF) << 24);
    }
}
