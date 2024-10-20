package deob;

import java.math.BigInteger;

@ObfuscatedName("dd")
public class class119 extends class208 {

    @ObfuscatedName("dd.y")
    public byte[] field1974;

    @ObfuscatedName("dd.d")
    public int field1973;

    @ObfuscatedName("dd.g")
    public static int[] field1977 = new int[256];

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
            field1977[var0] = var1;
        }
    }

    @ObfuscatedName("ah.y([BIII)I")
    public static int method615(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1977[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1974 = class121.method2568(arg0);
        this.field1973 = 0;
    }

    public class119(byte[] arg0) {
        this.field1974 = arg0;
        this.field1973 = 0;
    }

    @ObfuscatedName("dd.d(II)V")
    public void method2354(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.g(II)V")
    public void method2312(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1973 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.w(II)V")
    public void method2494(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1973 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.e(II)V")
    public void method2423(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 24);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1973 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.c(J)V")
    public void method2324(long arg0) {
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1974[++this.field1973 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dd.a(J)V")
    public void method2316(long arg0) {
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1974[++this.field1973 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1974[++this.field1973 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ab.q(Ljava/lang/String;I)I")
    public static int method636(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dd.m(Ljava/lang/String;I)V")
    public void method2372(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1973 += class165.method2206(arg0, 0, arg0.length(), this.field1974, this.field1973);
        this.field1974[++this.field1973 - 1] = 0;
    }

    @ObfuscatedName("am.n(Ljava/lang/String;I)I")
    public static int method861(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dd.k(Ljava/lang/String;B)V")
    public void method2318(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1974[++this.field1973 - 1] = 0;
        this.field1973 += class165.method2206(arg0, 0, arg0.length(), this.field1974, this.field1973);
        this.field1974[++this.field1973 - 1] = 0;
    }

    @ObfuscatedName("dd.o(Ljava/lang/CharSequence;B)V")
    public void method2388(CharSequence arg0) {
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
        this.field1974[++this.field1973 - 1] = 0;
        this.method2325(var3);
        this.field1973 += class209.method3243(this.field1974, this.field1973, arg0);
    }

    @ObfuscatedName("dd.f([BIII)V")
    public void method2311(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1974[++this.field1973 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dd.s(IS)V")
    public void method2381(int arg0) {
        this.field1974[this.field1973 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1974[this.field1973 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1974[this.field1973 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1974[this.field1973 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.z(II)V")
    public void method2477(int arg0) {
        this.field1974[this.field1973 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1974[this.field1973 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.b(II)V")
    public void method2532(int arg0) {
        this.field1974[this.field1973 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dd.p(II)V")
    public void method2389(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2354(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2312(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dd.r(II)V")
    public void method2325(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2354(arg0 >>> 28 | 0x80);
                    }
                    this.method2354(arg0 >>> 21 | 0x80);
                }
                this.method2354(arg0 >>> 14 | 0x80);
            }
            this.method2354(arg0 >>> 7 | 0x80);
        }
        this.method2354(arg0 & 0x7F);
    }

    @ObfuscatedName("dd.x(I)I")
    public int method2326() {
        return this.field1974[++this.field1973 - 1] & 0xFF;
    }

    @ObfuscatedName("dd.h(I)B")
    public byte method2461() {
        return this.field1974[++this.field1973 - 1];
    }

    @ObfuscatedName("dd.j(I)I")
    public int method2525() {
        this.field1973 += 2;
        return ((this.field1974[this.field1973 - 2] & 0xFF) << 8) + (this.field1974[this.field1973 - 1] & 0xFF);
    }

    @ObfuscatedName("dd.v(I)I")
    public int method2383() {
        this.field1973 += 2;
        int var1 = ((this.field1974[this.field1973 - 2] & 0xFF) << 8) + (this.field1974[this.field1973 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dd.l(I)I")
    public int method2476() {
        this.field1973 += 3;
        return (this.field1974[this.field1973 - 1] & 0xFF) + ((this.field1974[this.field1973 - 2] & 0xFF) << 8) + ((this.field1974[this.field1973 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dd.u(I)I")
    public int method2331() {
        this.field1973 += 4;
        return (this.field1974[this.field1973 - 1] & 0xFF) + ((this.field1974[this.field1973 - 2] & 0xFF) << 8) + ((this.field1974[this.field1973 - 3] & 0xFF) << 16) + ((this.field1974[this.field1973 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dd.t(B)J")
    public long method2332() {
        long var1 = (long) this.method2331() & 0xFFFFFFFFL;
        long var3 = (long) this.method2331() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dd.i(I)Ljava/lang/String;")
    public String method2448() {
        if (this.field1974[this.field1973] == 0) {
            this.field1973++;
            return null;
        } else {
            return this.method2334();
        }
    }

    @ObfuscatedName("dd.ah(I)Ljava/lang/String;")
    public String method2334() {
        int var1 = this.field1973;
        while (this.field1974[++this.field1973 - 1] != 0) {
        }
        int var2 = this.field1973 - var1 - 1;
        return var2 == 0 ? "" : class165.method870(this.field1974, var1, var2);
    }

    @ObfuscatedName("dd.aa(I)Ljava/lang/String;")
    public String method2335() {
        byte var1 = this.field1974[++this.field1973 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1973;
        while (this.field1974[++this.field1973 - 1] != 0) {
        }
        int var3 = this.field1973 - var2 - 1;
        return var3 == 0 ? "" : class165.method870(this.field1974, var2, var3);
    }

    @ObfuscatedName("dd.ao(I)Ljava/lang/String;")
    public String method2336() {
        byte var1 = this.field1974[++this.field1973 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2341();
        if (this.field1973 + var2 > this.field1974.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1974;
        int var4 = this.field1973;
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
        this.field1973 += var2;
        return var12;
    }

    @ObfuscatedName("dd.ai([BIIS)V")
    public void method2333(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1974[++this.field1973 - 1];
        }
    }

    @ObfuscatedName("dd.ab(B)I")
    public int method2338() {
        int var1 = this.field1974[this.field1973] & 0xFF;
        return var1 < 128 ? this.method2326() - 64 : this.method2525() - 49152;
    }

    @ObfuscatedName("dd.ae(I)I")
    public int method2321() {
        int var1 = this.field1974[this.field1973] & 0xFF;
        return var1 < 128 ? this.method2326() : this.method2525() - 32768;
    }

    @ObfuscatedName("dd.aw(I)I")
    public int method2340() {
        return this.field1974[this.field1973] < 0 ? this.method2331() & Integer.MAX_VALUE : this.method2525();
    }

    @ObfuscatedName("dd.aj(I)I")
    public int method2341() {
        byte var1 = this.field1974[++this.field1973 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1974[++this.field1973 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dd.ay([IB)V")
    public void method2432(int[] arg0) {
        int var2 = this.field1973 / 8;
        this.field1973 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2331();
            int var5 = this.method2331();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1973 -= 8;
            this.method2423(var4);
            this.method2423(var5);
        }
    }

    @ObfuscatedName("dd.af([II)V")
    public void method2343(int[] arg0) {
        int var2 = this.field1973 / 8;
        this.field1973 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2331();
            int var5 = this.method2331();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1973 -= 8;
            this.method2423(var4);
            this.method2423(var5);
        }
    }

    @ObfuscatedName("dd.al([IIIB)V")
    public void method2344(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1973;
        this.field1973 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2331();
            int var8 = this.method2331();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1973 -= 8;
            this.method2423(var7);
            this.method2423(var8);
        }
        this.field1973 = var4;
    }

    @ObfuscatedName("dd.aq([IIII)V")
    public void method2345(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1973;
        this.field1973 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2331();
            int var8 = this.method2331();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1973 -= 8;
            this.method2423(var7);
            this.method2423(var8);
        }
        this.field1973 = var4;
    }

    @ObfuscatedName("dd.ak(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2346(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1973;
        this.field1973 = 0;
        byte[] var4 = new byte[var3];
        this.method2333(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1973 = 0;
        this.method2312(var7.length);
        this.method2311(var7, 0, var7.length);
    }

    @ObfuscatedName("dd.az(IB)I")
    public int method2347(int arg0) {
        int var2 = method615(this.field1974, arg0, this.field1973);
        this.method2423(var2);
        return var2;
    }

    @ObfuscatedName("dd.ar(I)Z")
    public boolean method2436() {
        this.field1973 -= 4;
        int var1 = method615(this.field1974, 0, this.field1973);
        int var2 = this.method2331();
        return var1 == var2;
    }

    @ObfuscatedName("dd.as(II)V")
    public void method2513(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dd.am(IB)V")
    public void method2350(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dd.an(IS)V")
    public void method2351(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dd.au(S)I")
    public int method2400() {
        return this.field1974[++this.field1973 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dd.av(S)I")
    public int method2353() {
        return -this.field1974[++this.field1973 - 1] & 0xFF;
    }

    @ObfuscatedName("dd.ac(B)I")
    public int method2465() {
        return 128 - this.field1974[++this.field1973 - 1] & 0xFF;
    }

    @ObfuscatedName("dd.ap(B)B")
    public byte method2355() {
        return (byte) (this.field1974[++this.field1973 - 1] - 128);
    }

    @ObfuscatedName("dd.ad(I)B")
    public byte method2356() {
        return (byte) (-this.field1974[++this.field1973 - 1]);
    }

    @ObfuscatedName("dd.ag(S)B")
    public byte method2472() {
        return (byte) (128 - this.field1974[++this.field1973 - 1]);
    }

    @ObfuscatedName("dd.ax(II)V")
    public void method2358(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) arg0;
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dd.at(II)V")
    public void method2359(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dd.bm(IB)V")
    public void method2360(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 + 128);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dd.bd(I)I")
    public int method2361() {
        this.field1973 += 2;
        return ((this.field1974[this.field1973 - 1] & 0xFF) << 8) + (this.field1974[this.field1973 - 2] & 0xFF);
    }

    @ObfuscatedName("dd.bf(I)I")
    public int method2362() {
        this.field1973 += 2;
        return ((this.field1974[this.field1973 - 2] & 0xFF) << 8) + (this.field1974[this.field1973 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dd.bj(I)I")
    public int method2363() {
        this.field1973 += 2;
        return ((this.field1974[this.field1973 - 1] & 0xFF) << 8) + (this.field1974[this.field1973 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dd.bk(B)I")
    public int method2364() {
        this.field1973 += 2;
        int var1 = ((this.field1974[this.field1973 - 1] & 0xFF) << 8) + (this.field1974[this.field1973 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dd.bh(I)I")
    public int method2523() {
        this.field1973 += 2;
        int var1 = ((this.field1974[this.field1973 - 2] & 0xFF) << 8) + (this.field1974[this.field1973 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dd.bc(B)I")
    public int method2366() {
        this.field1973 += 2;
        int var1 = ((this.field1974[this.field1973 - 1] & 0xFF) << 8) + (this.field1974[this.field1973 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dd.bi(II)V")
    public void method2337(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) arg0;
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dd.by(B)I")
    public int method2368() {
        this.field1973 += 3;
        return (this.field1974[this.field1973 - 2] & 0xFF) + ((this.field1974[this.field1973 - 1] & 0xFF) << 8) + ((this.field1974[this.field1973 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dd.bn(II)V")
    public void method2411(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) arg0;
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dd.be(IB)V")
    public void method2370(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1974[++this.field1973 - 1] = (byte) arg0;
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 24);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dd.bg(II)V")
    public void method2315(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 16);
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 24);
        this.field1974[++this.field1973 - 1] = (byte) arg0;
        this.field1974[++this.field1973 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dd.bp(I)I")
    public int method2488() {
        this.field1973 += 4;
        return (this.field1974[this.field1973 - 4] & 0xFF) + ((this.field1974[this.field1973 - 3] & 0xFF) << 8) + ((this.field1974[this.field1973 - 2] & 0xFF) << 16) + ((this.field1974[this.field1973 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dd.bz(S)I")
    public int method2373() {
        this.field1973 += 4;
        return (this.field1974[this.field1973 - 3] & 0xFF) + ((this.field1974[this.field1973 - 4] & 0xFF) << 8) + ((this.field1974[this.field1973 - 2] & 0xFF) << 24) + ((this.field1974[this.field1973 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dd.bs(B)I")
    public int method2374() {
        this.field1973 += 4;
        return (this.field1974[this.field1973 - 2] & 0xFF) + ((this.field1974[this.field1973 - 1] & 0xFF) << 8) + ((this.field1974[this.field1973 - 3] & 0xFF) << 24) + ((this.field1974[this.field1973 - 4] & 0xFF) << 16);
    }
}
