package deob;

import java.math.BigInteger;

@ObfuscatedName("di")
public class class110 extends class191 {

    @ObfuscatedName("di.a")
    public byte[] field1865;

    @ObfuscatedName("di.v")
    public int field1861;

    @ObfuscatedName("di.i")
    public static int[] field1858 = new int[256];

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
            field1858[var0] = var1;
        }
    }

    public class110(int arg0) {
        this.field1865 = class112.method2360(arg0);
        this.field1861 = 0;
    }

    public class110(byte[] arg0) {
        this.field1865 = arg0;
        this.field1861 = 0;
    }

    @ObfuscatedName("di.a(II)V")
    public void method2117(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.v(II)V")
    public void method2188(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.i(II)V")
    public void method2276(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.b(II)V")
    public void method2120(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 24);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.l(J)V")
    public void method2121(long arg0) {
        this.field1865[++this.field1861 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1865[++this.field1861 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1865[++this.field1861 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1865[++this.field1861 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1865[++this.field1861 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1865[++this.field1861 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1865[++this.field1861 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1865[++this.field1861 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("p.m(Ljava/lang/String;I)I")
    public static int method529(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("di.w(Ljava/lang/String;B)V")
    public void method2122(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1861 += class215.method3658(arg0, 0, arg0.length(), this.field1865, this.field1861);
        this.field1865[++this.field1861 - 1] = 0;
    }

    @ObfuscatedName("cr.e(Ljava/lang/String;I)I")
    public static int method1590(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("di.n(Ljava/lang/String;I)V")
    public void method2292(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1865[++this.field1861 - 1] = 0;
        this.field1861 += class215.method3658(arg0, 0, arg0.length(), this.field1865, this.field1861);
        this.field1865[++this.field1861 - 1] = 0;
    }

    @ObfuscatedName("di.s(Ljava/lang/CharSequence;I)V")
    public void method2124(CharSequence arg0) {
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
        this.field1865[++this.field1861 - 1] = 0;
        this.method2130(var3);
        this.field1861 += class192.method88(this.field1865, this.field1861, arg0);
    }

    @ObfuscatedName("di.k([BIII)V")
    public void method2133(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1865[++this.field1861 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("di.f(IB)V")
    public void method2165(int arg0) {
        this.field1865[this.field1861 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1865[this.field1861 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1865[this.field1861 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1865[this.field1861 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.d(II)V")
    public void method2127(int arg0) {
        this.field1865[this.field1861 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1865[this.field1861 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.x(IB)V")
    public void method2206(int arg0) {
        this.field1865[this.field1861 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.o(IB)V")
    public void method2115(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2117(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2188(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("di.q(II)V")
    public void method2130(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2117(arg0 >>> 28 | 0x80);
                    }
                    this.method2117(arg0 >>> 21 | 0x80);
                }
                this.method2117(arg0 >>> 14 | 0x80);
            }
            this.method2117(arg0 >>> 7 | 0x80);
        }
        this.method2117(arg0 & 0x7F);
    }

    @ObfuscatedName("di.t(I)I")
    public int method2199() {
        return this.field1865[++this.field1861 - 1] & 0xFF;
    }

    @ObfuscatedName("di.h(I)B")
    public byte method2132() {
        return this.field1865[++this.field1861 - 1];
    }

    @ObfuscatedName("di.u(I)I")
    public int method2282() {
        this.field1861 += 2;
        return ((this.field1865[this.field1861 - 2] & 0xFF) << 8) + (this.field1865[this.field1861 - 1] & 0xFF);
    }

    @ObfuscatedName("di.j(B)I")
    public int method2134() {
        this.field1861 += 2;
        int var1 = ((this.field1865[this.field1861 - 2] & 0xFF) << 8) + (this.field1865[this.field1861 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("di.g(I)I")
    public int method2208() {
        this.field1861 += 3;
        return (this.field1865[this.field1861 - 1] & 0xFF) + ((this.field1865[this.field1861 - 2] & 0xFF) << 8) + ((this.field1865[this.field1861 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("di.y(B)I")
    public int method2136() {
        this.field1861 += 4;
        return (this.field1865[this.field1861 - 1] & 0xFF) + ((this.field1865[this.field1861 - 2] & 0xFF) << 8) + ((this.field1865[this.field1861 - 3] & 0xFF) << 16) + ((this.field1865[this.field1861 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("di.p(I)J")
    public long method2137() {
        long var1 = (long) this.method2136() & 0xFFFFFFFFL;
        long var3 = (long) this.method2136() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("di.r(S)Ljava/lang/String;")
    public String method2138() {
        if (this.field1865[this.field1861] == 0) {
            this.field1861++;
            return null;
        } else {
            return this.method2139();
        }
    }

    @ObfuscatedName("di.z(I)Ljava/lang/String;")
    public String method2139() {
        int var1 = this.field1861;
        while (this.field1865[++this.field1861 - 1] != 0) {
        }
        int var2 = this.field1861 - var1 - 1;
        return var2 == 0 ? "" : class215.method3385(this.field1865, var1, var2);
    }

    @ObfuscatedName("di.c(I)Ljava/lang/String;")
    public String method2140() {
        byte var1 = this.field1865[++this.field1861 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1861;
        while (this.field1865[++this.field1861 - 1] != 0) {
        }
        int var3 = this.field1861 - var2 - 1;
        return var3 == 0 ? "" : class215.method3385(this.field1865, var2, var3);
    }

    @ObfuscatedName("di.an(I)Ljava/lang/String;")
    public String method2141() {
        byte var1 = this.field1865[++this.field1861 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2146();
        if (this.field1861 + var2 > this.field1865.length) {
            throw new IllegalStateException("");
        }
        String var3 = class192.method3165(this.field1865, this.field1861, var2);
        this.field1861 += var2;
        return var3;
    }

    @ObfuscatedName("di.as([BIIB)V")
    public void method2142(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1865[++this.field1861 - 1];
        }
    }

    @ObfuscatedName("di.ah(I)I")
    public int method2231() {
        int var1 = this.field1865[this.field1861] & 0xFF;
        return var1 < 128 ? this.method2199() - 64 : this.method2282() - 49152;
    }

    @ObfuscatedName("di.ar(I)I")
    public int method2144() {
        int var1 = this.field1865[this.field1861] & 0xFF;
        return var1 < 128 ? this.method2199() : this.method2282() - 32768;
    }

    @ObfuscatedName("di.ae(I)I")
    public int method2145() {
        return this.field1865[this.field1861] < 0 ? this.method2136() & Integer.MAX_VALUE : this.method2282();
    }

    @ObfuscatedName("di.av(S)I")
    public int method2146() {
        byte var1 = this.field1865[++this.field1861 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1865[++this.field1861 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("di.al([IIIB)V")
    public void method2147(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1861;
        this.field1861 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2136();
            int var8 = this.method2136();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1861 -= 8;
            this.method2120(var7);
            this.method2120(var8);
        }
        this.field1861 = var4;
    }

    @ObfuscatedName("di.aq([IIII)V")
    public void method2118(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1861;
        this.field1861 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2136();
            int var8 = this.method2136();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1861 -= 8;
            this.method2120(var7);
            this.method2120(var8);
        }
        this.field1861 = var4;
    }

    @ObfuscatedName("di.am(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2149(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1861;
        this.field1861 = 0;
        byte[] var4 = new byte[var3];
        this.method2142(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1861 = 0;
        this.method2188(var7.length);
        this.method2133(var7, 0, var7.length);
    }

    @ObfuscatedName("di.ax(II)I")
    public int method2150(int arg0) {
        byte[] var2 = this.field1865;
        int var3 = this.field1861;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1858[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2120(var6);
        return var6;
    }

    @ObfuscatedName("di.az(S)Z")
    public boolean method2151() {
        this.field1861 -= 4;
        byte[] var1 = this.field1865;
        int var2 = this.field1861;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1858[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2136();
        return var5 == var8;
    }

    @ObfuscatedName("di.ai(II)V")
    public void method2152(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("di.aa(IB)V")
    public void method2153(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("di.at(IB)V")
    public void method2154(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("di.aw(B)I")
    public int method2261() {
        return this.field1865[++this.field1861 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("di.ao(B)I")
    public int method2156() {
        return -this.field1865[++this.field1861 - 1] & 0xFF;
    }

    @ObfuscatedName("di.ag(B)I")
    public int method2157() {
        return 128 - this.field1865[++this.field1861 - 1] & 0xFF;
    }

    @ObfuscatedName("di.ad(I)B")
    public byte method2280() {
        return (byte) (-this.field1865[++this.field1861 - 1]);
    }

    @ObfuscatedName("di.au(B)B")
    public byte method2159() {
        return (byte) (128 - this.field1865[++this.field1861 - 1]);
    }

    @ObfuscatedName("di.ak(II)V")
    public void method2218(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) arg0;
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.aj(II)V")
    public void method2161(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("di.af(II)V")
    public void method2287(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 + 128);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.ab(I)I")
    public int method2163() {
        this.field1861 += 2;
        return ((this.field1865[this.field1861 - 1] & 0xFF) << 8) + (this.field1865[this.field1861 - 2] & 0xFF);
    }

    @ObfuscatedName("di.ac(B)I")
    public int method2164() {
        this.field1861 += 2;
        return ((this.field1865[this.field1861 - 2] & 0xFF) << 8) + (this.field1865[this.field1861 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("di.ap(I)I")
    public int method2298() {
        this.field1861 += 2;
        return ((this.field1865[this.field1861 - 1] & 0xFF) << 8) + (this.field1865[this.field1861 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("di.ay(B)I")
    public int method2166() {
        this.field1861 += 2;
        int var1 = ((this.field1865[this.field1861 - 2] & 0xFF) << 8) + (this.field1865[this.field1861 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("di.bu(II)V")
    public void method2167(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1861 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.bo(II)V")
    public void method2254(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) arg0;
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("di.bi(IB)V")
    public void method2169(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1861 - 1] = (byte) arg0;
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 24);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("di.bs(II)V")
    public void method2170(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 24);
        this.field1865[++this.field1861 - 1] = (byte) arg0;
        this.field1865[++this.field1861 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.bl(I)I")
    public int method2171() {
        this.field1861 += 4;
        return (this.field1865[this.field1861 - 4] & 0xFF) + ((this.field1865[this.field1861 - 3] & 0xFF) << 8) + ((this.field1865[this.field1861 - 1] & 0xFF) << 24) + ((this.field1865[this.field1861 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("di.bp(I)I")
    public int method2311() {
        this.field1861 += 4;
        return (this.field1865[this.field1861 - 3] & 0xFF) + ((this.field1865[this.field1861 - 4] & 0xFF) << 8) + ((this.field1865[this.field1861 - 1] & 0xFF) << 16) + ((this.field1865[this.field1861 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("di.bw(I)I")
    public int method2173() {
        this.field1861 += 4;
        return (this.field1865[this.field1861 - 2] & 0xFF) + ((this.field1865[this.field1861 - 1] & 0xFF) << 8) + ((this.field1865[this.field1861 - 3] & 0xFF) << 24) + ((this.field1865[this.field1861 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("di.bm([BIII)V")
    public void method2174(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1865[++this.field1861 - 1] - 128);
        }
    }
}
