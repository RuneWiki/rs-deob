package deob;

import java.math.BigInteger;

@ObfuscatedName("dk")
public class class107 extends class187 {

    @ObfuscatedName("dk.g")
    public byte[] field1843;

    @ObfuscatedName("dk.i")
    public int field1844;

    @ObfuscatedName("dk.k")
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

    @ObfuscatedName("cj.g([BIII)I")
    public static int method1945(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1845[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ck.i([BII)I")
    public static int method1858(byte[] arg0, int arg1) {
        return method1945(arg0, 0, arg1);
    }

    public class107(int arg0) {
        this.field1843 = class109.method2327(arg0);
        this.field1844 = 0;
    }

    public class107(byte[] arg0) {
        this.field1843 = arg0;
        this.field1844 = 0;
    }

    @ObfuscatedName("dk.k(IB)V")
    public void method2079(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.e(IB)V")
    public void method2100(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1843[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.w(II)V")
    public void method2080(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1843[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.m(II)V")
    public void method2247(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 24);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1843[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.u(J)V")
    public void method2082(long arg0) {
        this.field1843[++this.field1844 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1843[++this.field1844 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1843[++this.field1844 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1843[++this.field1844 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1843[++this.field1844 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1843[++this.field1844 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1843[++this.field1844 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1843[++this.field1844 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dk.j(Ljava/lang/String;I)V")
    public void method2193(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1844 += class202.method1564(arg0, 0, arg0.length(), this.field1843, this.field1844);
        this.field1843[++this.field1844 - 1] = 0;
    }

    @ObfuscatedName("p.o(Ljava/lang/String;I)I")
    public static int method493(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dk.h(Ljava/lang/String;I)V")
    public void method2084(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1843[++this.field1844 - 1] = 0;
        this.field1844 += class202.method1564(arg0, 0, arg0.length(), this.field1843, this.field1844);
        this.field1843[++this.field1844 - 1] = 0;
    }

    @ObfuscatedName("dk.b(Ljava/lang/CharSequence;B)V")
    public void method2085(CharSequence arg0) {
        int var2 = class188.method2893(arg0);
        this.field1843[++this.field1844 - 1] = 0;
        this.method2091(var2);
        int var3 = this.field1844;
        byte[] var4 = this.field1843;
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

    @ObfuscatedName("dk.r([BIII)V")
    public void method2086(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1843[++this.field1844 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dk.l(II)V")
    public void method2087(int arg0) {
        this.field1843[this.field1844 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1843[this.field1844 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1843[this.field1844 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1843[this.field1844 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.x(II)V")
    public void method2088(int arg0) {
        this.field1843[this.field1844 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1843[this.field1844 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.q(II)V")
    public void method2089(int arg0) {
        this.field1843[this.field1844 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.t(II)V")
    public void method2090(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2079(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2100(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dk.y(IB)V")
    public void method2091(int arg0) {
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

    @ObfuscatedName("dk.d(B)I")
    public int method2092() {
        return this.field1843[++this.field1844 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.z(I)B")
    public byte method2117() {
        return this.field1843[++this.field1844 - 1];
    }

    @ObfuscatedName("dk.n(I)I")
    public int method2094() {
        this.field1844 += 2;
        return ((this.field1843[this.field1844 - 2] & 0xFF) << 8) + (this.field1843[this.field1844 - 1] & 0xFF);
    }

    @ObfuscatedName("dk.v(B)I")
    public int method2099() {
        this.field1844 += 2;
        int var1 = ((this.field1843[this.field1844 - 2] & 0xFF) << 8) + (this.field1843[this.field1844 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.f(I)I")
    public int method2096() {
        this.field1844 += 3;
        return (this.field1843[this.field1844 - 1] & 0xFF) + ((this.field1843[this.field1844 - 2] & 0xFF) << 8) + ((this.field1843[this.field1844 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.a(I)I")
    public int method2112() {
        this.field1844 += 4;
        return (this.field1843[this.field1844 - 1] & 0xFF) + ((this.field1843[this.field1844 - 2] & 0xFF) << 8) + ((this.field1843[this.field1844 - 4] & 0xFF) << 24) + ((this.field1843[this.field1844 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.p(I)J")
    public long method2098() {
        long var1 = (long) this.method2112() & 0xFFFFFFFFL;
        long var3 = (long) this.method2112() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dk.s(I)Ljava/lang/String;")
    public String method2279() {
        if (this.field1843[this.field1844] == 0) {
            this.field1844++;
            return null;
        } else {
            return this.method2251();
        }
    }

    @ObfuscatedName("dk.c(B)Ljava/lang/String;")
    public String method2251() {
        int var1 = this.field1844;
        while (this.field1843[++this.field1844 - 1] != 0) {
        }
        int var2 = this.field1844 - var1 - 1;
        return var2 == 0 ? "" : class202.method848(this.field1843, var1, var2);
    }

    @ObfuscatedName("dk.ar(B)Ljava/lang/String;")
    public String method2241() {
        byte var1 = this.field1843[++this.field1844 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1844;
        while (this.field1843[++this.field1844 - 1] != 0) {
        }
        int var3 = this.field1844 - var2 - 1;
        return var3 == 0 ? "" : class202.method848(this.field1843, var2, var3);
    }

    @ObfuscatedName("dk.ac(B)Ljava/lang/String;")
    public String method2174() {
        byte var1 = this.field1843[++this.field1844 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2107();
        if (this.field1844 + var2 > this.field1843.length) {
            throw new IllegalStateException("");
        }
        String var3 = class188.method649(this.field1843, this.field1844, var2);
        this.field1844 += var2;
        return var3;
    }

    @ObfuscatedName("dk.ah([BIII)V")
    public void method2283(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1843[++this.field1844 - 1];
        }
    }

    @ObfuscatedName("dk.ap(I)I")
    public int method2104() {
        int var1 = this.field1843[this.field1844] & 0xFF;
        return var1 < 128 ? this.method2092() - 64 : this.method2094() - 49152;
    }

    @ObfuscatedName("dk.aj(I)I")
    public int method2105() {
        int var1 = this.field1843[this.field1844] & 0xFF;
        return var1 < 128 ? this.method2092() : this.method2094() - 32768;
    }

    @ObfuscatedName("dk.as(I)I")
    public int method2159() {
        return this.field1843[this.field1844] < 0 ? this.method2112() & Integer.MAX_VALUE : this.method2094();
    }

    @ObfuscatedName("dk.aa(I)I")
    public int method2107() {
        byte var1 = this.field1843[++this.field1844 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1843[++this.field1844 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dk.am([IIIB)V")
    public void method2108(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1844;
        this.field1844 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2112();
            int var8 = this.method2112();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1844 -= 8;
            this.method2247(var7);
            this.method2247(var8);
        }
        this.field1844 = var4;
    }

    @ObfuscatedName("dk.ae([IIII)V")
    public void method2109(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1844;
        this.field1844 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2112();
            int var8 = this.method2112();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1844 -= 8;
            this.method2247(var7);
            this.method2247(var8);
        }
        this.field1844 = var4;
    }

    @ObfuscatedName("dk.ai(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2110(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1844;
        this.field1844 = 0;
        byte[] var4 = new byte[var3];
        this.method2283(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1844 = 0;
        this.method2100(var7.length);
        this.method2086(var7, 0, var7.length);
    }

    @ObfuscatedName("dk.ay(II)I")
    public int method2111(int arg0) {
        int var2 = method1945(this.field1843, arg0, this.field1844);
        this.method2247(var2);
        return var2;
    }

    @ObfuscatedName("dk.ax(B)Z")
    public boolean method2278() {
        this.field1844 -= 4;
        int var1 = method1945(this.field1843, 0, this.field1844);
        int var2 = this.method2112();
        return var1 == var2;
    }

    @ObfuscatedName("dk.au(IB)V")
    public void method2169(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.az(II)V")
    public void method2114(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dk.aw(II)V")
    public void method2115(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dk.ag(I)I")
    public int method2116() {
        return this.field1843[++this.field1844 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dk.ao(B)I")
    public int method2173() {
        return -this.field1843[++this.field1844 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.aq(I)I")
    public int method2118() {
        return 128 - this.field1843[++this.field1844 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.ak(B)B")
    public byte method2143() {
        return (byte) (-this.field1843[++this.field1844 - 1]);
    }

    @ObfuscatedName("dk.al(IS)V")
    public void method2120(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) arg0;
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.at(IB)V")
    public void method2101(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.an(II)V")
    public void method2137(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 + 128);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.av(I)I")
    public int method2123() {
        this.field1844 += 2;
        return ((this.field1843[this.field1844 - 1] & 0xFF) << 8) + (this.field1843[this.field1844 - 2] & 0xFF);
    }

    @ObfuscatedName("dk.ab(B)I")
    public int method2124() {
        this.field1844 += 2;
        return ((this.field1843[this.field1844 - 2] & 0xFF) << 8) + (this.field1843[this.field1844 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.ad(B)I")
    public int method2125() {
        this.field1844 += 2;
        return ((this.field1843[this.field1844 - 1] & 0xFF) << 8) + (this.field1843[this.field1844 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.af(B)I")
    public int method2207() {
        this.field1844 += 2;
        int var1 = ((this.field1843[this.field1844 - 2] & 0xFF) << 8) + (this.field1843[this.field1844 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.by(I)I")
    public int method2127() {
        this.field1844 += 2;
        int var1 = ((this.field1843[this.field1844 - 1] & 0xFF) << 8) + (this.field1843[this.field1844 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.bd(II)V")
    public void method2128(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1843[++this.field1844 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.bu(I)I")
    public int method2129() {
        this.field1844 += 3;
        return (this.field1843[this.field1844 - 3] & 0xFF) + ((this.field1843[this.field1844 - 1] & 0xFF) << 16) + ((this.field1843[this.field1844 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dk.bq(II)V")
    public void method2130(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) arg0;
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dk.ba(II)V")
    public void method2244(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
        this.field1843[++this.field1844 - 1] = (byte) arg0;
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 24);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dk.bf(II)V")
    public void method2132(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 16);
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 24);
        this.field1843[++this.field1844 - 1] = (byte) arg0;
        this.field1843[++this.field1844 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.bw(I)I")
    public int method2133() {
        this.field1844 += 4;
        return (this.field1843[this.field1844 - 4] & 0xFF) + ((this.field1843[this.field1844 - 3] & 0xFF) << 8) + ((this.field1843[this.field1844 - 2] & 0xFF) << 16) + ((this.field1843[this.field1844 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.bz(I)I")
    public int method2077() {
        this.field1844 += 4;
        return (this.field1843[this.field1844 - 3] & 0xFF) + ((this.field1843[this.field1844 - 4] & 0xFF) << 8) + ((this.field1843[this.field1844 - 1] & 0xFF) << 16) + ((this.field1843[this.field1844 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.be(B)I")
    public int method2135() {
        this.field1844 += 4;
        return (this.field1843[this.field1844 - 2] & 0xFF) + ((this.field1843[this.field1844 - 1] & 0xFF) << 8) + ((this.field1843[this.field1844 - 3] & 0xFF) << 24) + ((this.field1843[this.field1844 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.bc([BIII)V")
    public void method2136(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1843[++this.field1844 - 1] - 128);
        }
    }
}
