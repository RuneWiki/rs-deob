package deob;

import java.math.BigInteger;

@ObfuscatedName("dm")
public class class108 extends class189 {

    @ObfuscatedName("dm.x")
    public byte[] field1839;

    @ObfuscatedName("dm.v")
    public int field1841;

    @ObfuscatedName("dm.m")
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

    @ObfuscatedName("aj.x([BIIB)I")
    public static int method917(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1840[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class108(int arg0) {
        this.field1839 = class110.method2361(arg0);
        this.field1841 = 0;
    }

    public class108(byte[] arg0) {
        this.field1839 = arg0;
        this.field1841 = 0;
    }

    @ObfuscatedName("dm.v(II)V")
    public void method2113(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.m(IB)V")
    public void method2114(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.e(II)V")
    public void method2147(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.h(II)V")
    public void method2233(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.p(J)V")
    public void method2117(long arg0) {
        this.field1839[++this.field1841 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1839[++this.field1841 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1839[++this.field1841 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1839[++this.field1841 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1839[++this.field1841 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1839[++this.field1841 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1839[++this.field1841 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1839[++this.field1841 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dm.j(Ljava/lang/String;I)V")
    public void method2212(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1841 += class213.method1085(arg0, 0, arg0.length(), this.field1839, this.field1841);
        this.field1839[++this.field1841 - 1] = 0;
    }

    @ObfuscatedName("dm.i(Ljava/lang/String;B)V")
    public void method2279(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1839[++this.field1841 - 1] = 0;
        this.field1841 += class213.method1085(arg0, 0, arg0.length(), this.field1839, this.field1841);
        this.field1839[++this.field1841 - 1] = 0;
    }

    @ObfuscatedName("dm.u(Ljava/lang/CharSequence;B)V")
    public void method2120(CharSequence arg0) {
        int var2 = class190.method1890(arg0);
        this.field1839[++this.field1841 - 1] = 0;
        this.method2126(var2);
        int var3 = this.field1841;
        byte[] var4 = this.field1839;
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

    @ObfuscatedName("dm.l([BIIB)V")
    public void method2312(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1839[++this.field1841 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dm.k(IS)V")
    public void method2122(int arg0) {
        this.field1839[this.field1841 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1839[this.field1841 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1839[this.field1841 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1839[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.q(II)V")
    public void method2123(int arg0) {
        this.field1839[this.field1841 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1839[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.b(II)V")
    public void method2124(int arg0) {
        this.field1839[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.w(II)V")
    public void method2171(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2113(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2114(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dm.g(II)V")
    public void method2126(int arg0) {
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

    @ObfuscatedName("dm.s(I)I")
    public int method2299() {
        return this.field1839[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.c(B)B")
    public byte method2128() {
        return this.field1839[++this.field1841 - 1];
    }

    @ObfuscatedName("dm.r(B)I")
    public int method2129() {
        this.field1841 += 2;
        return ((this.field1839[this.field1841 - 2] & 0xFF) << 8) + (this.field1839[this.field1841 - 1] & 0xFF);
    }

    @ObfuscatedName("dm.f(I)I")
    public int method2130() {
        this.field1841 += 2;
        int var1 = ((this.field1839[this.field1841 - 2] & 0xFF) << 8) + (this.field1839[this.field1841 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.t(I)I")
    public int method2131() {
        this.field1841 += 3;
        return (this.field1839[this.field1841 - 1] & 0xFF) + ((this.field1839[this.field1841 - 2] & 0xFF) << 8) + ((this.field1839[this.field1841 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.o(I)I")
    public int method2132() {
        this.field1841 += 4;
        return (this.field1839[this.field1841 - 1] & 0xFF) + ((this.field1839[this.field1841 - 2] & 0xFF) << 8) + ((this.field1839[this.field1841 - 3] & 0xFF) << 16) + ((this.field1839[this.field1841 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.z(I)J")
    public long method2133() {
        long var1 = (long) this.method2132() & 0xFFFFFFFFL;
        long var3 = (long) this.method2132() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dm.d(I)Ljava/lang/String;")
    public String method2196() {
        if (this.field1839[this.field1841] == 0) {
            this.field1841++;
            return null;
        } else {
            return this.method2270();
        }
    }

    @ObfuscatedName("dm.y(I)Ljava/lang/String;")
    public String method2270() {
        int var1 = this.field1841;
        while (this.field1839[++this.field1841 - 1] != 0) {
        }
        int var2 = this.field1841 - var1 - 1;
        return var2 == 0 ? "" : class213.method3648(this.field1839, var1, var2);
    }

    @ObfuscatedName("dm.a(I)Ljava/lang/String;")
    public String method2136() {
        byte var1 = this.field1839[++this.field1841 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1841;
        while (this.field1839[++this.field1841 - 1] != 0) {
        }
        int var3 = this.field1841 - var2 - 1;
        return var3 == 0 ? "" : class213.method3648(this.field1839, var2, var3);
    }

    @ObfuscatedName("dm.n(I)Ljava/lang/String;")
    public String method2278() {
        byte var1 = this.field1839[++this.field1841 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2142();
        if (this.field1841 + var2 > this.field1839.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1839;
        int var4 = this.field1841;
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
        this.field1841 += var2;
        return var12;
    }

    @ObfuscatedName("dm.ae([BIII)V")
    public void method2315(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1839[++this.field1841 - 1];
        }
    }

    @ObfuscatedName("dm.ay(B)I")
    public int method2139() {
        int var1 = this.field1839[this.field1841] & 0xFF;
        return var1 < 128 ? this.method2299() - 64 : this.method2129() - 49152;
    }

    @ObfuscatedName("dm.ac(B)I")
    public int method2125() {
        int var1 = this.field1839[this.field1841] & 0xFF;
        return var1 < 128 ? this.method2299() : this.method2129() - 32768;
    }

    @ObfuscatedName("dm.ag(I)I")
    public int method2141() {
        return this.field1839[this.field1841] < 0 ? this.method2132() & Integer.MAX_VALUE : this.method2129();
    }

    @ObfuscatedName("dm.am(I)I")
    public int method2142() {
        byte var1 = this.field1839[++this.field1841 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1839[++this.field1841 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dm.au([IIII)V")
    public void method2143(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1841;
        this.field1841 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2132();
            int var8 = this.method2132();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1841 -= 8;
            this.method2233(var7);
            this.method2233(var8);
        }
        this.field1841 = var4;
    }

    @ObfuscatedName("dm.ai([IIII)V")
    public void method2144(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1841;
        this.field1841 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2132();
            int var8 = this.method2132();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1841 -= 8;
            this.method2233(var7);
            this.method2233(var8);
        }
        this.field1841 = var4;
    }

    @ObfuscatedName("dm.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2145(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1841;
        this.field1841 = 0;
        byte[] var4 = new byte[var3];
        this.method2315(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1841 = 0;
        this.method2114(var7.length);
        this.method2312(var7, 0, var7.length);
    }

    @ObfuscatedName("dm.az(II)I")
    public int method2146(int arg0) {
        int var2 = method917(this.field1839, arg0, this.field1841);
        this.method2233(var2);
        return var2;
    }

    @ObfuscatedName("dm.as(B)Z")
    public boolean method2297() {
        this.field1841 -= 4;
        int var1 = method917(this.field1839, 0, this.field1841);
        int var2 = this.method2132();
        return var1 == var2;
    }

    @ObfuscatedName("dm.ah(II)V")
    public void method2239(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.aw(IB)V")
    public void method2149(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dm.ar(II)V")
    public void method2150(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dm.at(I)I")
    public int method2151() {
        return this.field1839[++this.field1841 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dm.ap(I)I")
    public int method2152() {
        return -this.field1839[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.ak(I)I")
    public int method2112() {
        return 128 - this.field1839[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.aa(B)B")
    public byte method2154() {
        return (byte) (this.field1839[++this.field1841 - 1] - 128);
    }

    @ObfuscatedName("dm.av(I)B")
    public byte method2155() {
        return (byte) (-this.field1839[++this.field1841 - 1]);
    }

    @ObfuscatedName("dm.al(B)B")
    public byte method2156() {
        return (byte) (128 - this.field1839[++this.field1841 - 1]);
    }

    @ObfuscatedName("dm.af(IB)V")
    public void method2157(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) arg0;
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.aj(IB)V")
    public void method2158(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.ao(II)V")
    public void method2159(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 + 128);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.an(I)I")
    public int method2160() {
        this.field1841 += 2;
        return ((this.field1839[this.field1841 - 1] & 0xFF) << 8) + (this.field1839[this.field1841 - 2] & 0xFF);
    }

    @ObfuscatedName("dm.ad(I)I")
    public int method2256() {
        this.field1841 += 2;
        return ((this.field1839[this.field1841 - 2] & 0xFF) << 8) + (this.field1839[this.field1841 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.aq(I)I")
    public int method2162() {
        this.field1841 += 2;
        return ((this.field1839[this.field1841 - 1] & 0xFF) << 8) + (this.field1839[this.field1841 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.ax(B)I")
    public int method2140() {
        this.field1841 += 2;
        int var1 = ((this.field1839[this.field1841 - 1] & 0xFF) << 8) + (this.field1839[this.field1841 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.bk(I)I")
    public int method2164() {
        this.field1841 += 2;
        int var1 = ((this.field1839[this.field1841 - 2] & 0xFF) << 8) + (this.field1839[this.field1841 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.by(II)V")
    public void method2257(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1841 - 1] = (byte) arg0;
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bp(II)V")
    public void method2210(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) arg0;
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dm.bs(IB)V")
    public void method2163(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1841 - 1] = (byte) arg0;
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.bn(II)V")
    public void method2168(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1839[++this.field1841 - 1] = (byte) arg0;
        this.field1839[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bb(I)I")
    public int method2169() {
        this.field1841 += 4;
        return (this.field1839[this.field1841 - 4] & 0xFF) + ((this.field1839[this.field1841 - 3] & 0xFF) << 8) + ((this.field1839[this.field1841 - 2] & 0xFF) << 16) + ((this.field1839[this.field1841 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.bt(I)I")
    public int method2170() {
        this.field1841 += 4;
        return (this.field1839[this.field1841 - 3] & 0xFF) + ((this.field1839[this.field1841 - 4] & 0xFF) << 8) + ((this.field1839[this.field1841 - 1] & 0xFF) << 16) + ((this.field1839[this.field1841 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.bj(S)I")
    public int method2237() {
        this.field1841 += 4;
        return (this.field1839[this.field1841 - 2] & 0xFF) + ((this.field1839[this.field1841 - 1] & 0xFF) << 8) + ((this.field1839[this.field1841 - 4] & 0xFF) << 16) + ((this.field1839[this.field1841 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.bh([BIII)V")
    public void method2172(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1839[++this.field1841 - 1];
        }
    }

    @ObfuscatedName("dm.bw([BIIB)V")
    public void method2292(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1839[++this.field1841 - 1] - 128);
        }
    }
}
