package deob;

import java.math.BigInteger;

@ObfuscatedName("dk")
public class class108 extends class189 {

    @ObfuscatedName("dk.l")
    public byte[] field1828;

    @ObfuscatedName("dk.y")
    public int field1823;

    @ObfuscatedName("dk.g")
    public static int[] field1822 = new int[256];

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
            field1822[var0] = var1;
        }
    }

    @ObfuscatedName("ag.l([BIII)I")
    public static int method596(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1822[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class108(int arg0) {
        this.field1828 = class110.method2378(arg0);
        this.field1823 = 0;
    }

    public class108(byte[] arg0) {
        this.field1828 = arg0;
        this.field1823 = 0;
    }

    @ObfuscatedName("dk.y(II)V")
    public void method2226(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.g(II)V")
    public void method2148(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1823 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.j(II)V")
    public void method2149(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1823 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.w(II)V")
    public void method2150(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 24);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1823 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.c(J)V")
    public void method2151(long arg0) {
        this.field1828[++this.field1823 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1828[++this.field1823 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1828[++this.field1823 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1828[++this.field1823 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1828[++this.field1823 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1828[++this.field1823 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1828[++this.field1823 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1828[++this.field1823 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dk.x(Ljava/lang/String;I)V")
    public void method2152(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1823 += class213.method2432(arg0, 0, arg0.length(), this.field1828, this.field1823);
        this.field1828[++this.field1823 - 1] = 0;
    }

    @ObfuscatedName("dk.f(Ljava/lang/String;I)V")
    public void method2153(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1828[++this.field1823 - 1] = 0;
        this.field1823 += class213.method2432(arg0, 0, arg0.length(), this.field1828, this.field1823);
        this.field1828[++this.field1823 - 1] = 0;
    }

    @ObfuscatedName("dk.t(Ljava/lang/CharSequence;I)V")
    public void method2192(CharSequence arg0) {
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
        this.field1828[++this.field1823 - 1] = 0;
        this.method2160(var3);
        this.field1823 += class190.method2493(this.field1828, this.field1823, arg0);
    }

    @ObfuscatedName("dk.n([BIII)V")
    public void method2155(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1828[++this.field1823 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dk.p(IB)V")
    public void method2311(int arg0) {
        this.field1828[this.field1823 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1828[this.field1823 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1828[this.field1823 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1828[this.field1823 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.a(II)V")
    public void method2157(int arg0) {
        this.field1828[this.field1823 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1828[this.field1823 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.o(II)V")
    public void method2158(int arg0) {
        this.field1828[this.field1823 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.b(II)V")
    public void method2159(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2226(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2148(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dk.r(II)V")
    public void method2160(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2226(arg0 >>> 28 | 0x80);
                    }
                    this.method2226(arg0 >>> 21 | 0x80);
                }
                this.method2226(arg0 >>> 14 | 0x80);
            }
            this.method2226(arg0 >>> 7 | 0x80);
        }
        this.method2226(arg0 & 0x7F);
    }

    @ObfuscatedName("dk.z(I)I")
    public int method2291() {
        return this.field1828[++this.field1823 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.u(I)B")
    public byte method2292() {
        return this.field1828[++this.field1823 - 1];
    }

    @ObfuscatedName("dk.s(I)I")
    public int method2163() {
        this.field1823 += 2;
        return ((this.field1828[this.field1823 - 2] & 0xFF) << 8) + (this.field1828[this.field1823 - 1] & 0xFF);
    }

    @ObfuscatedName("dk.i(B)I")
    public int method2164() {
        this.field1823 += 2;
        int var1 = ((this.field1828[this.field1823 - 2] & 0xFF) << 8) + (this.field1828[this.field1823 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.e(I)I")
    public int method2214() {
        this.field1823 += 3;
        return (this.field1828[this.field1823 - 1] & 0xFF) + ((this.field1828[this.field1823 - 3] & 0xFF) << 16) + ((this.field1828[this.field1823 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dk.h(B)I")
    public int method2297() {
        this.field1823 += 4;
        return (this.field1828[this.field1823 - 1] & 0xFF) + ((this.field1828[this.field1823 - 2] & 0xFF) << 8) + ((this.field1828[this.field1823 - 3] & 0xFF) << 16) + ((this.field1828[this.field1823 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.k(I)J")
    public long method2166() {
        long var1 = (long) this.method2297() & 0xFFFFFFFFL;
        long var3 = (long) this.method2297() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dk.v(B)Ljava/lang/String;")
    public String method2167() {
        if (this.field1828[this.field1823] == 0) {
            this.field1823++;
            return null;
        } else {
            return this.method2168();
        }
    }

    @ObfuscatedName("dk.m(I)Ljava/lang/String;")
    public String method2168() {
        int var1 = this.field1823;
        while (this.field1828[++this.field1823 - 1] != 0) {
        }
        int var2 = this.field1823 - var1 - 1;
        return var2 == 0 ? "" : class213.method2731(this.field1828, var1, var2);
    }

    @ObfuscatedName("dk.d(B)Ljava/lang/String;")
    public String method2283() {
        byte var1 = this.field1828[++this.field1823 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1823;
        while (this.field1828[++this.field1823 - 1] != 0) {
        }
        int var3 = this.field1823 - var2 - 1;
        return var3 == 0 ? "" : class213.method2731(this.field1828, var2, var3);
    }

    @ObfuscatedName("dk.q(B)Ljava/lang/String;")
    public String method2196() {
        byte var1 = this.field1828[++this.field1823 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2162();
        if (this.field1823 + var2 > this.field1828.length) {
            throw new IllegalStateException("");
        }
        String var3 = class190.method2623(this.field1828, this.field1823, var2);
        this.field1823 += var2;
        return var3;
    }

    @ObfuscatedName("dk.ak([BIII)V")
    public void method2171(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1828[++this.field1823 - 1];
        }
    }

    @ObfuscatedName("dk.ah(I)I")
    public int method2172() {
        int var1 = this.field1828[this.field1823] & 0xFF;
        return var1 < 128 ? this.method2291() - 64 : this.method2163() - 49152;
    }

    @ObfuscatedName("dk.an(B)I")
    public int method2173() {
        int var1 = this.field1828[this.field1823] & 0xFF;
        return var1 < 128 ? this.method2291() : this.method2163() - 32768;
    }

    @ObfuscatedName("dk.aw(B)I")
    public int method2174() {
        return this.field1828[this.field1823] < 0 ? this.method2297() & Integer.MAX_VALUE : this.method2163();
    }

    @ObfuscatedName("dk.az(I)I")
    public int method2162() {
        byte var1 = this.field1828[++this.field1823 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1828[++this.field1823 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dk.ad([IIII)V")
    public void method2176(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1823;
        this.field1823 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2297();
            int var8 = this.method2297();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1823 -= 8;
            this.method2150(var7);
            this.method2150(var8);
        }
        this.field1823 = var4;
    }

    @ObfuscatedName("dk.ag([IIII)V")
    public void method2177(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1823;
        this.field1823 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2297();
            int var8 = this.method2297();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1823 -= 8;
            this.method2150(var7);
            this.method2150(var8);
        }
        this.field1823 = var4;
    }

    @ObfuscatedName("dk.aa(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2195(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1823;
        this.field1823 = 0;
        byte[] var4 = new byte[var3];
        this.method2171(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1823 = 0;
        this.method2148(var7.length);
        this.method2155(var7, 0, var7.length);
    }

    @ObfuscatedName("dk.au(II)I")
    public int method2178(int arg0) {
        int var2 = method596(this.field1828, arg0, this.field1823);
        this.method2150(var2);
        return var2;
    }

    @ObfuscatedName("dk.aq(I)Z")
    public boolean method2179() {
        this.field1823 -= 4;
        int var1 = method596(this.field1828, 0, this.field1823);
        int var2 = this.method2297();
        return var1 == var2;
    }

    @ObfuscatedName("dk.am(IB)V")
    public void method2180(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.ax(II)V")
    public void method2185(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dk.af(II)V")
    public void method2252(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dk.av(B)I")
    public int method2218() {
        return this.field1828[++this.field1823 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dk.ao(I)I")
    public int method2184() {
        return -this.field1828[++this.field1823 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.al(I)I")
    public int method2147() {
        return 128 - this.field1828[++this.field1823 - 1] & 0xFF;
    }

    @ObfuscatedName("dk.aj(B)B")
    public byte method2186() {
        return (byte) (this.field1828[++this.field1823 - 1] - 128);
    }

    @ObfuscatedName("dk.ae(I)B")
    public byte method2337() {
        return (byte) (-this.field1828[++this.field1823 - 1]);
    }

    @ObfuscatedName("dk.ai(I)B")
    public byte method2188() {
        return (byte) (128 - this.field1828[++this.field1823 - 1]);
    }

    @ObfuscatedName("dk.ay(II)V")
    public void method2189(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) arg0;
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.ab(IB)V")
    public void method2190(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dk.ar(II)V")
    public void method2191(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 + 128);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.as(I)I")
    public int method2278() {
        this.field1823 += 2;
        return ((this.field1828[this.field1823 - 1] & 0xFF) << 8) + (this.field1828[this.field1823 - 2] & 0xFF);
    }

    @ObfuscatedName("dk.at(I)I")
    public int method2193() {
        this.field1823 += 2;
        return ((this.field1828[this.field1823 - 2] & 0xFF) << 8) + (this.field1828[this.field1823 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.ac(I)I")
    public int method2194() {
        this.field1823 += 2;
        return ((this.field1828[this.field1823 - 1] & 0xFF) << 8) + (this.field1828[this.field1823 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dk.ap(I)I")
    public int method2242() {
        this.field1823 += 2;
        int var1 = ((this.field1828[this.field1823 - 1] & 0xFF) << 8) + (this.field1828[this.field1823 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.bm(I)I")
    public int method2183() {
        this.field1823 += 2;
        int var1 = ((this.field1828[this.field1823 - 2] & 0xFF) << 8) + (this.field1828[this.field1823 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dk.bl(II)V")
    public void method2197(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1823 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dk.bh(I)I")
    public int method2325() {
        this.field1823 += 3;
        return (this.field1828[this.field1823 - 3] & 0xFF) + ((this.field1828[this.field1823 - 2] & 0xFF) << 8) + ((this.field1828[this.field1823 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.bv(II)V")
    public void method2339(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) arg0;
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dk.be(II)V")
    public void method2200(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1823 - 1] = (byte) arg0;
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 24);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dk.bd(II)V")
    public void method2201(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 24);
        this.field1828[++this.field1823 - 1] = (byte) arg0;
        this.field1828[++this.field1823 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dk.ba(I)I")
    public int method2202() {
        this.field1823 += 4;
        return (this.field1828[this.field1823 - 4] & 0xFF) + ((this.field1828[this.field1823 - 3] & 0xFF) << 8) + ((this.field1828[this.field1823 - 2] & 0xFF) << 16) + ((this.field1828[this.field1823 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.bn(I)I")
    public int method2329() {
        this.field1823 += 4;
        return (this.field1828[this.field1823 - 3] & 0xFF) + ((this.field1828[this.field1823 - 4] & 0xFF) << 8) + ((this.field1828[this.field1823 - 1] & 0xFF) << 16) + ((this.field1828[this.field1823 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dk.bc(I)I")
    public int method2204() {
        this.field1823 += 4;
        return (this.field1828[this.field1823 - 2] & 0xFF) + ((this.field1828[this.field1823 - 1] & 0xFF) << 8) + ((this.field1828[this.field1823 - 3] & 0xFF) << 24) + ((this.field1828[this.field1823 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dk.bk([BIIB)V")
    public void method2205(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1828[++this.field1823 - 1];
        }
    }

    @ObfuscatedName("dk.bf([BIIB)V")
    public void method2206(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1828[++this.field1823 - 1] - 128);
        }
    }
}
