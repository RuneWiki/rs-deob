package deob;

import java.math.BigInteger;

@ObfuscatedName("db")
public class class107 extends class186 {

    @ObfuscatedName("db.t")
    public byte[] field1831;

    @ObfuscatedName("db.s")
    public int field1830;

    @ObfuscatedName("db.f")
    public static int[] field1834 = new int[256];

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
            field1834[var0] = var1;
        }
    }

    public class107(int arg0) {
        this.field1831 = Statics.method2340(arg0);
        this.field1830 = 0;
    }

    public class107(byte[] arg0) {
        this.field1831 = arg0;
        this.field1830 = 0;
    }

    @ObfuscatedName("db.s(II)V")
    public void method2214(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.f(IS)V")
    public void method2251(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
        this.field1831[++this.field1830 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.e(IB)V")
    public void method2176(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 16);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
        this.field1831[++this.field1830 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.d(II)V")
    public void method2090(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 24);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 16);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
        this.field1831[++this.field1830 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.n(J)V")
    public void method2091(long arg0) {
        this.field1831[++this.field1830 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1831[++this.field1830 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1831[++this.field1830 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1831[++this.field1830 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1831[++this.field1830 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1831[++this.field1830 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1831[++this.field1830 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1831[++this.field1830 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("db.v(Ljava/lang/String;I)V")
    public void method2092(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1830 += class201.method2907(arg0, 0, arg0.length(), this.field1831, this.field1830);
        this.field1831[++this.field1830 - 1] = 0;
    }

    @ObfuscatedName("db.z(Ljava/lang/String;I)V")
    public void method2200(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1831[++this.field1830 - 1] = 0;
        this.field1830 += class201.method2907(arg0, 0, arg0.length(), this.field1831, this.field1830);
        this.field1831[++this.field1830 - 1] = 0;
    }

    @ObfuscatedName("db.j(Ljava/lang/CharSequence;I)V")
    public void method2094(CharSequence arg0) {
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
        this.field1831[++this.field1830 - 1] = 0;
        this.method2100(var3);
        this.field1830 += class187.method2825(this.field1831, this.field1830, arg0);
    }

    @ObfuscatedName("db.u([BIIB)V")
    public void method2095(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1831[++this.field1830 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("db.g(II)V")
    public void method2096(int arg0) {
        this.field1831[this.field1830 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1831[this.field1830 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1831[this.field1830 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1831[this.field1830 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.a(II)V")
    public void method2085(int arg0) {
        this.field1831[this.field1830 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1831[this.field1830 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.c(II)V")
    public void method2098(int arg0) {
        this.field1831[this.field1830 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.w(II)V")
    public void method2208(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2214(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2251(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("db.l(IB)V")
    public void method2100(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2214(arg0 >>> 28 | 0x80);
                    }
                    this.method2214(arg0 >>> 21 | 0x80);
                }
                this.method2214(arg0 >>> 14 | 0x80);
            }
            this.method2214(arg0 >>> 7 | 0x80);
        }
        this.method2214(arg0 & 0x7F);
    }

    @ObfuscatedName("db.q(B)I")
    public int method2101() {
        return this.field1831[++this.field1830 - 1] & 0xFF;
    }

    @ObfuscatedName("db.x(I)B")
    public byte method2102() {
        return this.field1831[++this.field1830 - 1];
    }

    @ObfuscatedName("db.p(B)I")
    public int method2103() {
        this.field1830 += 2;
        return ((this.field1831[this.field1830 - 2] & 0xFF) << 8) + (this.field1831[this.field1830 - 1] & 0xFF);
    }

    @ObfuscatedName("db.y(B)I")
    public int method2104() {
        this.field1830 += 2;
        int var1 = ((this.field1831[this.field1830 - 2] & 0xFF) << 8) + (this.field1831[this.field1830 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("db.r(I)I")
    public int method2304() {
        this.field1830 += 3;
        return (this.field1831[this.field1830 - 1] & 0xFF) + ((this.field1831[this.field1830 - 3] & 0xFF) << 16) + ((this.field1831[this.field1830 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("db.k(I)I")
    public int method2106() {
        this.field1830 += 4;
        return (this.field1831[this.field1830 - 1] & 0xFF) + ((this.field1831[this.field1830 - 2] & 0xFF) << 8) + ((this.field1831[this.field1830 - 3] & 0xFF) << 16) + ((this.field1831[this.field1830 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("db.b(I)J")
    public long method2107() {
        long var1 = (long) this.method2106() & 0xFFFFFFFFL;
        long var3 = (long) this.method2106() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("db.h(I)Ljava/lang/String;")
    public String method2265() {
        if (this.field1831[this.field1830] == 0) {
            this.field1830++;
            return null;
        } else {
            return this.method2109();
        }
    }

    @ObfuscatedName("db.i(B)Ljava/lang/String;")
    public String method2109() {
        int var1 = this.field1830;
        while (this.field1831[++this.field1830 - 1] != 0) {
        }
        int var2 = this.field1830 - var1 - 1;
        return var2 == 0 ? "" : class201.method1941(this.field1831, var1, var2);
    }

    @ObfuscatedName("db.o(B)Ljava/lang/String;")
    public String method2110() {
        byte var1 = this.field1831[++this.field1830 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1830;
        while (this.field1831[++this.field1830 - 1] != 0) {
        }
        int var3 = this.field1830 - var2 - 1;
        return var3 == 0 ? "" : class201.method1941(this.field1831, var2, var3);
    }

    @ObfuscatedName("db.m(I)Ljava/lang/String;")
    public String method2130() {
        byte var1 = this.field1831[++this.field1830 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2116();
        if (this.field1830 + var2 > this.field1831.length) {
            throw new IllegalStateException("");
        }
        String var3 = class187.method135(this.field1831, this.field1830, var2);
        this.field1830 += var2;
        return var3;
    }

    @ObfuscatedName("db.ak([BIII)V")
    public void method2112(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1831[++this.field1830 - 1];
        }
    }

    @ObfuscatedName("db.aw(I)I")
    public int method2213() {
        int var1 = this.field1831[this.field1830] & 0xFF;
        return var1 < 128 ? this.method2101() - 64 : this.method2103() - 49152;
    }

    @ObfuscatedName("db.af(I)I")
    public int method2114() {
        int var1 = this.field1831[this.field1830] & 0xFF;
        return var1 < 128 ? this.method2101() : this.method2103() - 32768;
    }

    @ObfuscatedName("db.ab(I)I")
    public int method2193() {
        return this.field1831[this.field1830] < 0 ? this.method2106() & Integer.MAX_VALUE : this.method2103();
    }

    @ObfuscatedName("db.ao(B)I")
    public int method2116() {
        byte var1 = this.field1831[++this.field1830 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1831[++this.field1830 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("db.ah([IIII)V")
    public void method2117(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1830;
        this.field1830 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2106();
            int var8 = this.method2106();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1830 -= 8;
            this.method2090(var7);
            this.method2090(var8);
        }
        this.field1830 = var4;
    }

    @ObfuscatedName("db.ae([IIII)V")
    public void method2306(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1830;
        this.field1830 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2106();
            int var8 = this.method2106();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1830 -= 8;
            this.method2090(var7);
            this.method2090(var8);
        }
        this.field1830 = var4;
    }

    @ObfuscatedName("db.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2119(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1830;
        this.field1830 = 0;
        byte[] var4 = new byte[var3];
        this.method2112(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1830 = 0;
        this.method2251(var7.length);
        this.method2095(var7, 0, var7.length);
    }

    @ObfuscatedName("db.ar(II)I")
    public int method2298(int arg0) {
        byte[] var2 = this.field1831;
        int var3 = this.field1830;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1834[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2090(var6);
        return var6;
    }

    @ObfuscatedName("db.aq(B)Z")
    public boolean method2121() {
        this.field1830 -= 4;
        byte[] var1 = this.field1831;
        int var2 = this.field1830;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1834[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2106();
        return var5 == var8;
    }

    @ObfuscatedName("db.am(II)V")
    public void method2301(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("db.az(II)V")
    public void method2276(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("db.an(IB)V")
    public void method2124(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("db.at(I)I")
    public int method2297() {
        return this.field1831[++this.field1830 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("db.av(I)I")
    public int method2126() {
        return -this.field1831[++this.field1830 - 1] & 0xFF;
    }

    @ObfuscatedName("db.aa(B)I")
    public int method2127() {
        return 128 - this.field1831[++this.field1830 - 1] & 0xFF;
    }

    @ObfuscatedName("db.ag(B)B")
    public byte method2128() {
        return (byte) (this.field1831[++this.field1830 - 1] - 128);
    }

    @ObfuscatedName("db.au(B)B")
    public byte method2129() {
        return (byte) (-this.field1831[++this.field1830 - 1]);
    }

    @ObfuscatedName("db.aj(I)B")
    public byte method2147() {
        return (byte) (128 - this.field1831[++this.field1830 - 1]);
    }

    @ObfuscatedName("db.ay(II)V")
    public void method2131(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) arg0;
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("db.ac(IB)V")
    public void method2278(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("db.al(II)V")
    public void method2133(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 + 128);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("db.as(I)I")
    public int method2134() {
        this.field1830 += 2;
        return ((this.field1831[this.field1830 - 1] & 0xFF) << 8) + (this.field1831[this.field1830 - 2] & 0xFF);
    }

    @ObfuscatedName("db.ai(I)I")
    public int method2135() {
        this.field1830 += 2;
        return ((this.field1831[this.field1830 - 2] & 0xFF) << 8) + (this.field1831[this.field1830 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("db.ad(I)I")
    public int method2136() {
        this.field1830 += 2;
        return ((this.field1831[this.field1830 - 1] & 0xFF) << 8) + (this.field1831[this.field1830 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("db.ap(I)I")
    public int method2137() {
        this.field1830 += 2;
        int var1 = ((this.field1831[this.field1830 - 1] & 0xFF) << 8) + (this.field1831[this.field1830 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("db.bf(I)I")
    public int method2105() {
        this.field1830 += 2;
        int var1 = ((this.field1831[this.field1830 - 2] & 0xFF) << 8) + (this.field1831[this.field1830 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("db.bu(I)I")
    public int method2224() {
        this.field1830 += 2;
        int var1 = ((this.field1831[this.field1830 - 1] & 0xFF) << 8) + (this.field1831[this.field1830 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("db.bi(IB)V")
    public void method2140(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 16);
        this.field1831[++this.field1830 - 1] = (byte) arg0;
    }

    @ObfuscatedName("db.ba(I)I")
    public int method2141() {
        this.field1830 += 3;
        return (this.field1831[this.field1830 - 2] & 0xFF) + ((this.field1831[this.field1830 - 3] & 0xFF) << 16) + ((this.field1831[this.field1830 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("db.bt(II)V")
    public void method2142(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) arg0;
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 16);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("db.bo(II)V")
    public void method2143(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
        this.field1831[++this.field1830 - 1] = (byte) arg0;
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 24);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("db.br(IB)V")
    public void method2118(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 16);
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 24);
        this.field1831[++this.field1830 - 1] = (byte) arg0;
        this.field1831[++this.field1830 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("db.be(I)I")
    public int method2145() {
        this.field1830 += 4;
        return (this.field1831[this.field1830 - 4] & 0xFF) + ((this.field1831[this.field1830 - 3] & 0xFF) << 8) + ((this.field1831[this.field1830 - 1] & 0xFF) << 24) + ((this.field1831[this.field1830 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("db.bp(B)I")
    public int method2305() {
        this.field1830 += 4;
        return (this.field1831[this.field1830 - 3] & 0xFF) + ((this.field1831[this.field1830 - 4] & 0xFF) << 8) + ((this.field1831[this.field1830 - 2] & 0xFF) << 24) + ((this.field1831[this.field1830 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("db.bc(B)I")
    public int method2206() {
        this.field1830 += 4;
        return (this.field1831[this.field1830 - 2] & 0xFF) + ((this.field1831[this.field1830 - 1] & 0xFF) << 8) + ((this.field1831[this.field1830 - 3] & 0xFF) << 24) + ((this.field1831[this.field1830 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("db.bn([BIII)V")
    public void method2148(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1831[++this.field1830 - 1];
        }
    }

    @ObfuscatedName("db.bd([BIIB)V")
    public void method2149(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1831[++this.field1830 - 1] - 128);
        }
    }
}
