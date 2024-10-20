package deob;

import java.math.BigInteger;

@ObfuscatedName("dh")
public class class111 extends class198 {

    @ObfuscatedName("dh.e")
    public byte[] field1835;

    @ObfuscatedName("dh.a")
    public int field1834;

    @ObfuscatedName("dh.l")
    public static int[] field1840 = new int[256];

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
            field1840[var0] = var1;
        }
    }

    public class111(int arg0) {
        this.field1835 = class113.method2435(arg0);
        this.field1834 = 0;
    }

    public class111(byte[] arg0) {
        this.field1835 = arg0;
        this.field1834 = 0;
    }

    @ObfuscatedName("dh.e(IB)V")
    public void method2366(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.a(IB)V")
    public void method2190(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
        this.field1835[++this.field1834 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.l(IB)V")
    public void method2163(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 16);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
        this.field1835[++this.field1834 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.c(II)V")
    public void method2229(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 24);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 16);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
        this.field1835[++this.field1834 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.u(J)V")
    public void method2351(long arg0) {
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1835[++this.field1834 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dh.w(J)V")
    public void method2312(long arg0) {
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1835[++this.field1834 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1835[++this.field1834 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dh.i(Ljava/lang/String;S)V")
    public void method2177(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1834 += class156.method158(arg0, 0, arg0.length(), this.field1835, this.field1834);
        this.field1835[++this.field1834 - 1] = 0;
    }

    @ObfuscatedName("ct.r(Ljava/lang/String;S)I")
    public static int method1927(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dh.f(Ljava/lang/String;I)V")
    public void method2264(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1835[++this.field1834 - 1] = 0;
        this.field1834 += class156.method158(arg0, 0, arg0.length(), this.field1835, this.field1834);
        this.field1835[++this.field1834 - 1] = 0;
    }

    @ObfuscatedName("dh.g(Ljava/lang/CharSequence;B)V")
    public void method2271(CharSequence arg0) {
        int var2 = class199.method2778(arg0);
        this.field1835[++this.field1834 - 1] = 0;
        this.method2175(var2);
        int var3 = this.field1834;
        byte[] var4 = this.field1835;
        int var5 = this.field1834;
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
        this.field1834 = var10 + var3;
    }

    @ObfuscatedName("dh.o([BIII)V")
    public void method2170(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1835[++this.field1834 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dh.h(IB)V")
    public void method2230(int arg0) {
        this.field1835[this.field1834 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1835[this.field1834 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1835[this.field1834 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1835[this.field1834 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.s(II)V")
    public void method2172(int arg0) {
        this.field1835[this.field1834 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1835[this.field1834 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.j(IB)V")
    public void method2211(int arg0) {
        this.field1835[this.field1834 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.m(II)V")
    public void method2341(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2366(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2190(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.t(IB)V")
    public void method2175(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2366(arg0 >>> 28 | 0x80);
                    }
                    this.method2366(arg0 >>> 21 | 0x80);
                }
                this.method2366(arg0 >>> 14 | 0x80);
            }
            this.method2366(arg0 >>> 7 | 0x80);
        }
        this.method2366(arg0 & 0x7F);
    }

    @ObfuscatedName("dh.z(I)I")
    public int method2176() {
        return this.field1835[++this.field1834 - 1] & 0xFF;
    }

    @ObfuscatedName("dh.y(B)B")
    public byte method2162() {
        return this.field1835[++this.field1834 - 1];
    }

    @ObfuscatedName("dh.q(I)I")
    public int method2178() {
        this.field1834 += 2;
        return ((this.field1835[this.field1834 - 2] & 0xFF) << 8) + (this.field1835[this.field1834 - 1] & 0xFF);
    }

    @ObfuscatedName("dh.d(I)I")
    public int method2236() {
        this.field1834 += 2;
        int var1 = ((this.field1835[this.field1834 - 2] & 0xFF) << 8) + (this.field1835[this.field1834 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dh.b(I)I")
    public int method2179() {
        this.field1834 += 3;
        return (this.field1835[this.field1834 - 1] & 0xFF) + ((this.field1835[this.field1834 - 2] & 0xFF) << 8) + ((this.field1835[this.field1834 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dh.x(I)I")
    public int method2378() {
        this.field1834 += 4;
        return (this.field1835[this.field1834 - 1] & 0xFF) + ((this.field1835[this.field1834 - 2] & 0xFF) << 8) + ((this.field1835[this.field1834 - 4] & 0xFF) << 24) + ((this.field1835[this.field1834 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dh.n(I)J")
    public long method2265() {
        long var1 = (long) this.method2378() & 0xFFFFFFFFL;
        long var3 = (long) this.method2378() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dh.v(I)Ljava/lang/String;")
    public String method2284() {
        if (this.field1835[this.field1834] == 0) {
            this.field1834++;
            return null;
        } else {
            return this.method2167();
        }
    }

    @ObfuscatedName("dh.p(I)Ljava/lang/String;")
    public String method2167() {
        int var1 = this.field1834;
        while (this.field1835[++this.field1834 - 1] != 0) {
        }
        int var2 = this.field1834 - var1 - 1;
        return var2 == 0 ? "" : class156.method2563(this.field1835, var1, var2);
    }

    @ObfuscatedName("dh.k(I)Ljava/lang/String;")
    public String method2184() {
        byte var1 = this.field1835[++this.field1834 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1834;
        while (this.field1835[++this.field1834 - 1] != 0) {
        }
        int var3 = this.field1834 - var2 - 1;
        return var3 == 0 ? "" : class156.method2563(this.field1835, var2, var3);
    }

    @ObfuscatedName("dh.ax(I)Ljava/lang/String;")
    public String method2185() {
        byte var1 = this.field1835[++this.field1834 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2248();
        if (this.field1834 + var2 > this.field1835.length) {
            throw new IllegalStateException("");
        }
        String var3 = class199.method2777(this.field1835, this.field1834, var2);
        this.field1834 += var2;
        return var3;
    }

    @ObfuscatedName("dh.ap([BIIB)V")
    public void method2171(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1835[++this.field1834 - 1];
        }
    }

    @ObfuscatedName("dh.ao(I)I")
    public int method2332() {
        int var1 = this.field1835[this.field1834] & 0xFF;
        return var1 < 128 ? this.method2176() - 64 : this.method2178() - 49152;
    }

    @ObfuscatedName("dh.ai(B)I")
    public int method2188() {
        int var1 = this.field1835[this.field1834] & 0xFF;
        return var1 < 128 ? this.method2176() : this.method2178() - 32768;
    }

    @ObfuscatedName("dh.aw(S)I")
    public int method2287() {
        return this.field1835[this.field1834] < 0 ? this.method2378() & Integer.MAX_VALUE : this.method2178();
    }

    @ObfuscatedName("dh.am(I)I")
    public int method2248() {
        byte var1 = this.field1835[++this.field1834 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1835[++this.field1834 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dh.au([II)V")
    public void method2191(int[] arg0) {
        int var2 = this.field1834 / 8;
        this.field1834 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2378();
            int var5 = this.method2378();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1834 -= 8;
            this.method2229(var4);
            this.method2229(var5);
        }
    }

    @ObfuscatedName("dh.ae([II)V")
    public void method2199(int[] arg0) {
        int var2 = this.field1834 / 8;
        this.field1834 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2378();
            int var5 = this.method2378();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1834 -= 8;
            this.method2229(var4);
            this.method2229(var5);
        }
    }

    @ObfuscatedName("dh.ab([IIII)V")
    public void method2193(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1834;
        this.field1834 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2378();
            int var8 = this.method2378();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1834 -= 8;
            this.method2229(var7);
            this.method2229(var8);
        }
        this.field1834 = var4;
    }

    @ObfuscatedName("dh.av([IIIB)V")
    public void method2300(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1834;
        this.field1834 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2378();
            int var8 = this.method2378();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1834 -= 8;
            this.method2229(var7);
            this.method2229(var8);
        }
        this.field1834 = var4;
    }

    @ObfuscatedName("dh.ay(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2383(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1834;
        this.field1834 = 0;
        byte[] var4 = new byte[var3];
        this.method2171(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1834 = 0;
        this.method2190(var7.length);
        this.method2170(var7, 0, var7.length);
    }

    @ObfuscatedName("dh.ag(IB)I")
    public int method2186(int arg0) {
        byte[] var2 = this.field1835;
        int var3 = this.field1834;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1840[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2229(var6);
        return var6;
    }

    @ObfuscatedName("dh.aj(I)Z")
    public boolean method2159() {
        this.field1834 -= 4;
        byte[] var1 = this.field1835;
        int var2 = this.field1834;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1840[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2378();
        return var5 == var8;
    }

    @ObfuscatedName("dh.ah(IB)V")
    public void method2198(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dh.at(II)V")
    public void method2200(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dh.al(II)V")
    public void method2354(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dh.ak(I)I")
    public int method2201() {
        return this.field1835[++this.field1834 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dh.ar(I)I")
    public int method2202() {
        return -this.field1835[++this.field1834 - 1] & 0xFF;
    }

    @ObfuscatedName("dh.aq(I)I")
    public int method2336() {
        return 128 - this.field1835[++this.field1834 - 1] & 0xFF;
    }

    @ObfuscatedName("dh.ac(B)B")
    public byte method2204() {
        return (byte) (this.field1835[++this.field1834 - 1] - 128);
    }

    @ObfuscatedName("dh.ad(I)B")
    public byte method2331() {
        return (byte) (-this.field1835[++this.field1834 - 1]);
    }

    @ObfuscatedName("dh.an(IB)V")
    public void method2206(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) arg0;
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dh.az(IB)V")
    public void method2342(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dh.af(II)V")
    public void method2208(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 + 128);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dh.as(B)I")
    public int method2209() {
        this.field1834 += 2;
        return ((this.field1835[this.field1834 - 1] & 0xFF) << 8) + (this.field1835[this.field1834 - 2] & 0xFF);
    }

    @ObfuscatedName("dh.aa(I)I")
    public int method2210() {
        this.field1834 += 2;
        return ((this.field1835[this.field1834 - 2] & 0xFF) << 8) + (this.field1835[this.field1834 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dh.bl(B)I")
    public int method2278() {
        this.field1834 += 2;
        return ((this.field1835[this.field1834 - 1] & 0xFF) << 8) + (this.field1835[this.field1834 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dh.bk(I)I")
    public int method2212() {
        this.field1834 += 2;
        int var1 = ((this.field1835[this.field1834 - 2] & 0xFF) << 8) + (this.field1835[this.field1834 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dh.bm(IB)V")
    public void method2213(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 16);
        this.field1835[++this.field1834 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.bw(B)I")
    public int method2308() {
        this.field1834 += 3;
        return (this.field1835[this.field1834 - 1] & 0xFF) + ((this.field1835[this.field1834 - 2] & 0xFF) << 16) + ((this.field1835[this.field1834 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dh.bp(II)V")
    public void method2215(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) arg0;
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 16);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dh.be(II)V")
    public void method2161(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
        this.field1835[++this.field1834 - 1] = (byte) arg0;
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 24);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dh.bv(II)V")
    public void method2217(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 16);
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 24);
        this.field1835[++this.field1834 - 1] = (byte) arg0;
        this.field1835[++this.field1834 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dh.bc(I)I")
    public int method2218() {
        this.field1834 += 4;
        return (this.field1835[this.field1834 - 4] & 0xFF) + ((this.field1835[this.field1834 - 3] & 0xFF) << 8) + ((this.field1835[this.field1834 - 1] & 0xFF) << 24) + ((this.field1835[this.field1834 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dh.br(I)I")
    public int method2219() {
        this.field1834 += 4;
        return (this.field1835[this.field1834 - 3] & 0xFF) + ((this.field1835[this.field1834 - 4] & 0xFF) << 8) + ((this.field1835[this.field1834 - 2] & 0xFF) << 24) + ((this.field1835[this.field1834 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dh.bu(I)I")
    public int method2220() {
        this.field1834 += 4;
        return (this.field1835[this.field1834 - 2] & 0xFF) + ((this.field1835[this.field1834 - 1] & 0xFF) << 8) + ((this.field1835[this.field1834 - 4] & 0xFF) << 16) + ((this.field1835[this.field1834 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dh.ba([BIII)V")
    public void method2221(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1835[++this.field1834 - 1];
        }
    }
}
