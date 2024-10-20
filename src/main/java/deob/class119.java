package deob;

import java.math.BigInteger;

@ObfuscatedName("dp")
public class class119 extends class208 {

    @ObfuscatedName("dp.h")
    public byte[] field1989;

    @ObfuscatedName("dp.m")
    public int field1988;

    @ObfuscatedName("dp.i")
    public static int[] field1991 = new int[256];

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
            field1991[var0] = var1;
        }
    }

    @ObfuscatedName("aw.h([BIII)I")
    public static int method949(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1991[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1989 = class121.method2560(arg0);
        this.field1988 = 0;
    }

    public class119(byte[] arg0) {
        this.field1989 = arg0;
        this.field1988 = 0;
    }

    @ObfuscatedName("dp.i(IS)V")
    public void method2305(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.q(IS)V")
    public void method2501(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1988 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.p(II)V")
    public void method2512(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1988 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.c(II)V")
    public void method2308(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 24);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1988 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.f(J)V")
    public void method2444(long arg0) {
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1989[++this.field1988 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dp.y(J)V")
    public void method2307(long arg0) {
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1989[++this.field1988 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1989[++this.field1988 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("r.w(Ljava/lang/String;B)I")
    public static int method537(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dp.l(Ljava/lang/String;I)V")
    public void method2311(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1988 += class165.method724(arg0, 0, arg0.length(), this.field1989, this.field1988);
        this.field1989[++this.field1988 - 1] = 0;
    }

    @ObfuscatedName("dp.v(Ljava/lang/String;I)V")
    public void method2312(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1989[++this.field1988 - 1] = 0;
        this.field1988 += class165.method724(arg0, 0, arg0.length(), this.field1989, this.field1988);
        this.field1989[++this.field1988 - 1] = 0;
    }

    @ObfuscatedName("dp.k(Ljava/lang/CharSequence;I)V")
    public void method2313(CharSequence arg0) {
        int var2 = class209.method2932(arg0);
        this.field1989[++this.field1988 - 1] = 0;
        this.method2319(var2);
        this.field1988 += class209.method959(this.field1989, this.field1988, arg0);
    }

    @ObfuscatedName("dp.o([BIII)V")
    public void method2452(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1989[++this.field1988 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dp.u(II)V")
    public void method2315(int arg0) {
        this.field1989[this.field1988 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1989[this.field1988 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1989[this.field1988 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1989[this.field1988 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.s(II)V")
    public void method2316(int arg0) {
        this.field1989[this.field1988 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1989[this.field1988 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.g(II)V")
    public void method2317(int arg0) {
        this.field1989[this.field1988 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.x(IB)V")
    public void method2318(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2305(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2501(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.a(II)V")
    public void method2319(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2305(arg0 >>> 28 | 0x80);
                    }
                    this.method2305(arg0 >>> 21 | 0x80);
                }
                this.method2305(arg0 >>> 14 | 0x80);
            }
            this.method2305(arg0 >>> 7 | 0x80);
        }
        this.method2305(arg0 & 0x7F);
    }

    @ObfuscatedName("dp.t(I)I")
    public int method2320() {
        return this.field1989[++this.field1988 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.z(I)B")
    public byte method2425() {
        return this.field1989[++this.field1988 - 1];
    }

    @ObfuscatedName("dp.r(I)I")
    public int method2322() {
        this.field1988 += 2;
        return ((this.field1989[this.field1988 - 2] & 0xFF) << 8) + (this.field1989[this.field1988 - 1] & 0xFF);
    }

    @ObfuscatedName("dp.d(I)I")
    public int method2323() {
        this.field1988 += 2;
        int var1 = ((this.field1989[this.field1988 - 2] & 0xFF) << 8) + (this.field1989[this.field1988 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.n(I)I")
    public int method2487() {
        this.field1988 += 3;
        return (this.field1989[this.field1988 - 1] & 0xFF) + ((this.field1989[this.field1988 - 3] & 0xFF) << 16) + ((this.field1989[this.field1988 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dp.j(I)I")
    public int method2324() {
        this.field1988 += 4;
        return (this.field1989[this.field1988 - 1] & 0xFF) + ((this.field1989[this.field1988 - 2] & 0xFF) << 8) + ((this.field1989[this.field1988 - 3] & 0xFF) << 16) + ((this.field1989[this.field1988 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.b(I)J")
    public long method2325() {
        long var1 = (long) this.method2324() & 0xFFFFFFFFL;
        long var3 = (long) this.method2324() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dp.e(B)Ljava/lang/String;")
    public String method2453() {
        if (this.field1989[this.field1988] == 0) {
            this.field1988++;
            return null;
        } else {
            return this.method2350();
        }
    }

    @ObfuscatedName("dp.ai(I)Ljava/lang/String;")
    public String method2350() {
        int var1 = this.field1988;
        while (this.field1989[++this.field1988 - 1] != 0) {
        }
        int var2 = this.field1988 - var1 - 1;
        return var2 == 0 ? "" : class165.method2020(this.field1989, var1, var2);
    }

    @ObfuscatedName("dp.ao(B)Ljava/lang/String;")
    public String method2421() {
        byte var1 = this.field1989[++this.field1988 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1988;
        while (this.field1989[++this.field1988 - 1] != 0) {
        }
        int var3 = this.field1988 - var2 - 1;
        return var3 == 0 ? "" : class165.method2020(this.field1989, var2, var3);
    }

    @ObfuscatedName("dp.af(I)Ljava/lang/String;")
    public String method2461() {
        byte var1 = this.field1989[++this.field1988 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2373();
        if (this.field1988 + var2 > this.field1989.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1989;
        int var4 = this.field1988;
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
        this.field1988 += var2;
        return var12;
    }

    @ObfuscatedName("dp.ab([BIIB)V")
    public void method2436(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1989[++this.field1988 - 1];
        }
    }

    @ObfuscatedName("dp.ax(I)I")
    public int method2331() {
        int var1 = this.field1989[this.field1988] & 0xFF;
        return var1 < 128 ? this.method2320() - 64 : this.method2322() - 49152;
    }

    @ObfuscatedName("dp.ap(B)I")
    public int method2332() {
        int var1 = this.field1989[this.field1988] & 0xFF;
        return var1 < 128 ? this.method2320() : this.method2322() - 32768;
    }

    @ObfuscatedName("dp.as(I)I")
    public int method2333() {
        return this.field1989[this.field1988] < 0 ? this.method2324() & Integer.MAX_VALUE : this.method2322();
    }

    @ObfuscatedName("dp.av(I)I")
    public int method2373() {
        byte var1 = this.field1989[++this.field1988 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1989[++this.field1988 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dp.am([II)V")
    public void method2335(int[] arg0) {
        int var2 = this.field1988 / 8;
        this.field1988 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2324();
            int var5 = this.method2324();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1988 -= 8;
            this.method2308(var4);
            this.method2308(var5);
        }
    }

    @ObfuscatedName("dp.aa([II)V")
    public void method2426(int[] arg0) {
        int var2 = this.field1988 / 8;
        this.field1988 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2324();
            int var5 = this.method2324();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1988 -= 8;
            this.method2308(var4);
            this.method2308(var5);
        }
    }

    @ObfuscatedName("dp.aq([IIII)V")
    public void method2483(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1988;
        this.field1988 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2324();
            int var8 = this.method2324();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1988 -= 8;
            this.method2308(var7);
            this.method2308(var8);
        }
        this.field1988 = var4;
    }

    @ObfuscatedName("dp.ad([IIII)V")
    public void method2338(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1988;
        this.field1988 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2324();
            int var8 = this.method2324();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1988 -= 8;
            this.method2308(var7);
            this.method2308(var8);
        }
        this.field1988 = var4;
    }

    @ObfuscatedName("dp.ar(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2339(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1988;
        this.field1988 = 0;
        byte[] var4 = new byte[var3];
        this.method2436(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1988 = 0;
        this.method2501(var7.length);
        this.method2452(var7, 0, var7.length);
    }

    @ObfuscatedName("dp.ag(II)I")
    public int method2336(int arg0) {
        int var2 = method949(this.field1989, arg0, this.field1988);
        this.method2308(var2);
        return var2;
    }

    @ObfuscatedName("dp.ae(I)Z")
    public boolean method2515() {
        this.field1988 -= 4;
        int var1 = method949(this.field1989, 0, this.field1988);
        int var2 = this.method2324();
        return var1 == var2;
    }

    @ObfuscatedName("dp.ak(II)V")
    public void method2342(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.az(IB)V")
    public void method2343(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dp.ac(IB)V")
    public void method2344(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dp.ay(I)I")
    public int method2345() {
        return this.field1989[++this.field1988 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dp.al(I)I")
    public int method2417() {
        return -this.field1989[++this.field1988 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.at(I)I")
    public int method2356() {
        return 128 - this.field1989[++this.field1988 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.aj(B)B")
    public byte method2303() {
        return (byte) (this.field1989[++this.field1988 - 1] - 128);
    }

    @ObfuscatedName("dp.aw(I)B")
    public byte method2349() {
        return (byte) (-this.field1989[++this.field1988 - 1]);
    }

    @ObfuscatedName("dp.au(I)B")
    public byte method2430() {
        return (byte) (128 - this.field1989[++this.field1988 - 1]);
    }

    @ObfuscatedName("dp.ah(II)V")
    public void method2513(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) arg0;
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.an(II)V")
    public void method2352(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.bm(II)V")
    public void method2353(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 + 128);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bo(I)I")
    public int method2354() {
        this.field1988 += 2;
        return ((this.field1989[this.field1988 - 1] & 0xFF) << 8) + (this.field1989[this.field1988 - 2] & 0xFF);
    }

    @ObfuscatedName("dp.bl(B)I")
    public int method2382() {
        this.field1988 += 2;
        return ((this.field1989[this.field1988 - 2] & 0xFF) << 8) + (this.field1989[this.field1988 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.ba(I)I")
    public int method2409() {
        this.field1988 += 2;
        return ((this.field1989[this.field1988 - 1] & 0xFF) << 8) + (this.field1989[this.field1988 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bj(I)I")
    public int method2357() {
        this.field1988 += 2;
        int var1 = ((this.field1989[this.field1988 - 1] & 0xFF) << 8) + (this.field1989[this.field1988 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bx(B)I")
    public int method2358() {
        this.field1988 += 2;
        int var1 = ((this.field1989[this.field1988 - 1] & 0xFF) << 8) + (this.field1989[this.field1988 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bi(II)V")
    public void method2519(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1988 - 1] = (byte) arg0;
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.be(I)I")
    public int method2360() {
        this.field1988 += 3;
        return (this.field1989[this.field1988 - 3] & 0xFF) + ((this.field1989[this.field1988 - 2] & 0xFF) << 8) + ((this.field1989[this.field1988 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.bp(II)V")
    public void method2361(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) arg0;
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dp.br(IB)V")
    public void method2362(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
        this.field1989[++this.field1988 - 1] = (byte) arg0;
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 24);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.by(II)V")
    public void method2363(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 16);
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 24);
        this.field1989[++this.field1988 - 1] = (byte) arg0;
        this.field1989[++this.field1988 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bs(I)I")
    public int method2364() {
        this.field1988 += 4;
        return (this.field1989[this.field1988 - 4] & 0xFF) + ((this.field1989[this.field1988 - 3] & 0xFF) << 8) + ((this.field1989[this.field1988 - 2] & 0xFF) << 16) + ((this.field1989[this.field1988 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bu(I)I")
    public int method2304() {
        this.field1988 += 4;
        return (this.field1989[this.field1988 - 3] & 0xFF) + ((this.field1989[this.field1988 - 4] & 0xFF) << 8) + ((this.field1989[this.field1988 - 1] & 0xFF) << 16) + ((this.field1989[this.field1988 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bf(I)I")
    public int method2438() {
        this.field1988 += 4;
        return (this.field1989[this.field1988 - 2] & 0xFF) + ((this.field1989[this.field1988 - 1] & 0xFF) << 8) + ((this.field1989[this.field1988 - 3] & 0xFF) << 24) + ((this.field1989[this.field1988 - 4] & 0xFF) << 16);
    }
}
