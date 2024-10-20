package deob;

import java.math.BigInteger;

@ObfuscatedName("df")
public class class108 extends class189 {

    @ObfuscatedName("df.g")
    public byte[] field1828;

    @ObfuscatedName("df.j")
    public int field1824;

    @ObfuscatedName("df.z")
    public static int[] field1825 = new int[256];

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
            field1825[var0] = var1;
        }
    }

    @ObfuscatedName("ed.g([BIII)I")
    public static int method2629(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1825[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ac.j([BII)I")
    public static int method516(byte[] arg0, int arg1) {
        return method2629(arg0, 0, arg1);
    }

    public class108(int arg0) {
        this.field1828 = class110.method2307(arg0);
        this.field1824 = 0;
    }

    public class108(byte[] arg0) {
        this.field1828 = arg0;
        this.field1824 = 0;
    }

    @ObfuscatedName("df.z(IB)V")
    public void method2069(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.b(II)V")
    public void method2195(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1824 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.k(IB)V")
    public void method2217(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1824 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.c(IB)V")
    public void method2245(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 24);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1824 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.w(J)V")
    public void method2265(long arg0) {
        this.field1828[++this.field1824 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1828[++this.field1824 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1828[++this.field1824 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1828[++this.field1824 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1828[++this.field1824 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1828[++this.field1824 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1828[++this.field1824 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1828[++this.field1824 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("az.l(Ljava/lang/String;I)I")
    public static int method546(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("df.n(Ljava/lang/String;I)V")
    public void method2074(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1824 += class213.method2631(arg0, 0, arg0.length(), this.field1828, this.field1824);
        this.field1828[++this.field1824 - 1] = 0;
    }

    @ObfuscatedName("ec.d(Ljava/lang/String;S)I")
    public static int method2800(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("df.h(Ljava/lang/String;I)V")
    public void method2075(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1828[++this.field1824 - 1] = 0;
        this.field1824 += class213.method2631(arg0, 0, arg0.length(), this.field1828, this.field1824);
        this.field1828[++this.field1824 - 1] = 0;
    }

    @ObfuscatedName("df.y(Ljava/lang/CharSequence;I)V")
    public void method2076(CharSequence arg0) {
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
        this.field1828[++this.field1824 - 1] = 0;
        this.method2082(var3);
        int var8 = this.field1824;
        byte[] var9 = this.field1828;
        int var10 = this.field1824;
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
        this.field1824 = var15 + var8;
    }

    @ObfuscatedName("df.p([BIII)V")
    public void method2146(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1828[++this.field1824 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("df.i(II)V")
    public void method2078(int arg0) {
        this.field1828[this.field1824 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1828[this.field1824 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1828[this.field1824 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1828[this.field1824 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.s(II)V")
    public void method2079(int arg0) {
        this.field1828[this.field1824 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1828[this.field1824 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.f(II)V")
    public void method2189(int arg0) {
        this.field1828[this.field1824 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.u(IB)V")
    public void method2081(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2069(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2195(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.v(II)V")
    public void method2082(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2069(arg0 >>> 28 | 0x80);
                    }
                    this.method2069(arg0 >>> 21 | 0x80);
                }
                this.method2069(arg0 >>> 14 | 0x80);
            }
            this.method2069(arg0 >>> 7 | 0x80);
        }
        this.method2069(arg0 & 0x7F);
    }

    @ObfuscatedName("df.r(I)I")
    public int method2083() {
        return this.field1828[++this.field1824 - 1] & 0xFF;
    }

    @ObfuscatedName("df.q(I)B")
    public byte method2173() {
        return this.field1828[++this.field1824 - 1];
    }

    @ObfuscatedName("df.x(I)I")
    public int method2263() {
        this.field1824 += 2;
        return ((this.field1828[this.field1824 - 2] & 0xFF) << 8) + (this.field1828[this.field1824 - 1] & 0xFF);
    }

    @ObfuscatedName("df.t(B)I")
    public int method2214() {
        this.field1824 += 2;
        int var1 = ((this.field1828[this.field1824 - 2] & 0xFF) << 8) + (this.field1828[this.field1824 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.e(I)I")
    public int method2260() {
        this.field1824 += 3;
        return (this.field1828[this.field1824 - 1] & 0xFF) + ((this.field1828[this.field1824 - 2] & 0xFF) << 8) + ((this.field1828[this.field1824 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("df.m(I)I")
    public int method2117() {
        this.field1824 += 4;
        return (this.field1828[this.field1824 - 1] & 0xFF) + ((this.field1828[this.field1824 - 2] & 0xFF) << 8) + ((this.field1828[this.field1824 - 4] & 0xFF) << 24) + ((this.field1828[this.field1824 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("df.o(I)J")
    public long method2089() {
        long var1 = (long) this.method2117() & 0xFFFFFFFFL;
        long var3 = (long) this.method2117() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("df.a(B)Ljava/lang/String;")
    public String method2231() {
        if (this.field1828[this.field1824] == 0) {
            this.field1824++;
            return null;
        } else {
            return this.method2091();
        }
    }

    @ObfuscatedName("df.am(I)Ljava/lang/String;")
    public String method2091() {
        int var1 = this.field1824;
        while (this.field1828[++this.field1824 - 1] != 0) {
        }
        int var2 = this.field1824 - var1 - 1;
        return var2 == 0 ? "" : class213.method549(this.field1828, var1, var2);
    }

    @ObfuscatedName("df.ac(I)Ljava/lang/String;")
    public String method2188() {
        byte var1 = this.field1828[++this.field1824 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1824;
        while (this.field1828[++this.field1824 - 1] != 0) {
        }
        int var3 = this.field1824 - var2 - 1;
        return var3 == 0 ? "" : class213.method549(this.field1828, var2, var3);
    }

    @ObfuscatedName("df.ap(B)Ljava/lang/String;")
    public String method2093() {
        byte var1 = this.field1828[++this.field1824 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2098();
        if (this.field1824 + var2 > this.field1828.length) {
            throw new IllegalStateException("");
        }
        String var3 = class190.method2796(this.field1828, this.field1824, var2);
        this.field1824 += var2;
        return var3;
    }

    @ObfuscatedName("df.aq([BIII)V")
    public void method2094(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1828[++this.field1824 - 1];
        }
    }

    @ObfuscatedName("df.az(B)I")
    public int method2179() {
        int var1 = this.field1828[this.field1824] & 0xFF;
        return var1 < 128 ? this.method2083() - 64 : this.method2263() - 49152;
    }

    @ObfuscatedName("df.ae(B)I")
    public int method2215() {
        int var1 = this.field1828[this.field1824] & 0xFF;
        return var1 < 128 ? this.method2083() : this.method2263() - 32768;
    }

    @ObfuscatedName("df.at(B)I")
    public int method2154() {
        return this.field1828[this.field1824] < 0 ? this.method2117() & Integer.MAX_VALUE : this.method2263();
    }

    @ObfuscatedName("df.as(I)I")
    public int method2098() {
        byte var1 = this.field1828[++this.field1824 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1828[++this.field1824 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("df.aj([IIIB)V")
    public void method2099(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1824;
        this.field1824 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2117();
            int var8 = this.method2117();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1824 -= 8;
            this.method2245(var7);
            this.method2245(var8);
        }
        this.field1824 = var4;
    }

    @ObfuscatedName("df.an([IIII)V")
    public void method2100(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1824;
        this.field1824 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2117();
            int var8 = this.method2117();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1824 -= 8;
            this.method2245(var7);
            this.method2245(var8);
        }
        this.field1824 = var4;
    }

    @ObfuscatedName("df.al(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2101(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1824;
        this.field1824 = 0;
        byte[] var4 = new byte[var3];
        this.method2094(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1824 = 0;
        this.method2195(var7.length);
        this.method2146(var7, 0, var7.length);
    }

    @ObfuscatedName("df.ag(II)I")
    public int method2102(int arg0) {
        int var2 = method2629(this.field1828, arg0, this.field1824);
        this.method2245(var2);
        return var2;
    }

    @ObfuscatedName("df.ah(I)Z")
    public boolean method2225() {
        this.field1824 -= 4;
        int var1 = method2629(this.field1828, 0, this.field1824);
        int var2 = this.method2117();
        return var1 == var2;
    }

    @ObfuscatedName("df.ar(II)V")
    public void method2088(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("df.aa(II)V")
    public void method2196(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("df.ax(IB)V")
    public void method2152(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("df.ay(I)I")
    public int method2107() {
        return this.field1828[++this.field1824 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("df.ao(I)I")
    public int method2108() {
        return -this.field1828[++this.field1824 - 1] & 0xFF;
    }

    @ObfuscatedName("df.ad(B)I")
    public int method2227() {
        return 128 - this.field1828[++this.field1824 - 1] & 0xFF;
    }

    @ObfuscatedName("df.ab(B)B")
    public byte method2110() {
        return (byte) (this.field1828[++this.field1824 - 1] - 128);
    }

    @ObfuscatedName("df.af(B)B")
    public byte method2111() {
        return (byte) (-this.field1828[++this.field1824 - 1]);
    }

    @ObfuscatedName("df.aw(I)B")
    public byte method2112() {
        return (byte) (128 - this.field1828[++this.field1824 - 1]);
    }

    @ObfuscatedName("df.ai(II)V")
    public void method2113(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) arg0;
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.ak(II)V")
    public void method2114(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("df.au(IB)V")
    public void method2115(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 + 128);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.av(I)I")
    public int method2116() {
        this.field1824 += 2;
        return ((this.field1828[this.field1824 - 1] & 0xFF) << 8) + (this.field1828[this.field1824 - 2] & 0xFF);
    }

    @ObfuscatedName("df.bq(I)I")
    public int method2164() {
        this.field1824 += 2;
        return ((this.field1828[this.field1824 - 2] & 0xFF) << 8) + (this.field1828[this.field1824 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("df.bs(B)I")
    public int method2118() {
        this.field1824 += 2;
        return ((this.field1828[this.field1824 - 1] & 0xFF) << 8) + (this.field1828[this.field1824 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("df.bh(I)I")
    public int method2119() {
        this.field1824 += 2;
        int var1 = ((this.field1828[this.field1824 - 2] & 0xFF) << 8) + (this.field1828[this.field1824 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.bt(I)I")
    public int method2120() {
        this.field1824 += 2;
        int var1 = ((this.field1828[this.field1824 - 1] & 0xFF) << 8) + (this.field1828[this.field1824 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.bg(II)V")
    public void method2121(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1824 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.bx(I)I")
    public int method2122() {
        this.field1824 += 3;
        return (this.field1828[this.field1824 - 1] & 0xFF) + ((this.field1828[this.field1824 - 3] & 0xFF) << 8) + ((this.field1828[this.field1824 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("df.bk(IB)V")
    public void method2123(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) arg0;
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("df.by(II)V")
    public void method2124(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
        this.field1828[++this.field1824 - 1] = (byte) arg0;
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 24);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("df.br(II)V")
    public void method2125(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 16);
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 24);
        this.field1828[++this.field1824 - 1] = (byte) arg0;
        this.field1828[++this.field1824 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.be(I)I")
    public int method2126() {
        this.field1824 += 4;
        return (this.field1828[this.field1824 - 4] & 0xFF) + ((this.field1828[this.field1824 - 3] & 0xFF) << 8) + ((this.field1828[this.field1824 - 1] & 0xFF) << 24) + ((this.field1828[this.field1824 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("df.bm(B)I")
    public int method2127() {
        this.field1824 += 4;
        return (this.field1828[this.field1824 - 3] & 0xFF) + ((this.field1828[this.field1824 - 4] & 0xFF) << 8) + ((this.field1828[this.field1824 - 2] & 0xFF) << 24) + ((this.field1828[this.field1824 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("df.bl(I)I")
    public int method2106() {
        this.field1824 += 4;
        return (this.field1828[this.field1824 - 2] & 0xFF) + ((this.field1828[this.field1824 - 1] & 0xFF) << 8) + ((this.field1828[this.field1824 - 3] & 0xFF) << 24) + ((this.field1828[this.field1824 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("df.bz([BIII)V")
    public void method2129(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1828[++this.field1824 - 1] - 128);
        }
    }
}
