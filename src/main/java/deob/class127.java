package deob;

import java.math.BigInteger;

@ObfuscatedName("dy")
public class class127 extends class179 {

    @ObfuscatedName("dy.r")
    public byte[] field2036;

    @ObfuscatedName("dy.p")
    public int field2035;

    @ObfuscatedName("dy.n")
    public static int[] field2037 = new int[256];

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
            field2037[var0] = var1;
        }
    }

    @ObfuscatedName("dt.aq([BIII)I")
    public static int method2146(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2037[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ag.am([BII)I")
    public static int method547(byte[] arg0, int arg1) {
        return method2146(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2036 = class114.method2265(arg0);
        this.field2035 = 0;
    }

    public class127(byte[] arg0) {
        this.field2036 = arg0;
        this.field2035 = 0;
    }

    @ObfuscatedName("dy.an(II)V")
    public void method2455(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.av(II)V")
    public void method2398(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2035 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.at(IB)V")
    public void method2399(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2035 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.ap(II)V")
    public void method2400(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 24);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2035 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.ae(J)V")
    public void method2401(long arg0) {
        this.field2036[++this.field2035 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2036[++this.field2035 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2036[++this.field2035 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2036[++this.field2035 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2036[++this.field2035 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2036[++this.field2035 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2036[++this.field2035 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2036[++this.field2035 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dy.af(Ljava/lang/String;I)V")
    public void method2402(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2035 += class149.method168(arg0, 0, arg0.length(), this.field2036, this.field2035);
        this.field2036[++this.field2035 - 1] = 0;
    }

    @ObfuscatedName("as.ai(Ljava/lang/String;I)I")
    public static int method604(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dy.aj(Ljava/lang/String;I)V")
    public void method2475(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2036[++this.field2035 - 1] = 0;
        this.field2035 += class149.method168(arg0, 0, arg0.length(), this.field2036, this.field2035);
        this.field2036[++this.field2035 - 1] = 0;
    }

    @ObfuscatedName("dy.ax(Ljava/lang/CharSequence;B)V")
    public void method2404(CharSequence arg0) {
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
        this.field2036[++this.field2035 - 1] = 0;
        this.method2410(var3);
        int var8 = this.field2035;
        byte[] var9 = this.field2036;
        int var10 = this.field2035;
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
        this.field2035 = var15 + var8;
    }

    @ObfuscatedName("dy.ak([BIII)V")
    public void method2405(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2036[++this.field2035 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dy.az(IS)V")
    public void method2406(int arg0) {
        this.field2036[this.field2035 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2036[this.field2035 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2036[this.field2035 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2036[this.field2035 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.aa(II)V")
    public void method2407(int arg0) {
        this.field2036[this.field2035 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2036[this.field2035 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.au(II)V")
    public void method2408(int arg0) {
        this.field2036[this.field2035 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.ar(II)V")
    public void method2467(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2455(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2398(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dy.ao(II)V")
    public void method2410(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2455(arg0 >>> 28 | 0x80);
                    }
                    this.method2455(arg0 >>> 21 | 0x80);
                }
                this.method2455(arg0 >>> 14 | 0x80);
            }
            this.method2455(arg0 >>> 7 | 0x80);
        }
        this.method2455(arg0 & 0x7F);
    }

    @ObfuscatedName("dy.aw(I)I")
    public int method2411() {
        return this.field2036[++this.field2035 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.ab(I)B")
    public byte method2412() {
        return this.field2036[++this.field2035 - 1];
    }

    @ObfuscatedName("dy.ac(I)I")
    public int method2413() {
        this.field2035 += 2;
        return ((this.field2036[this.field2035 - 2] & 0xFF) << 8) + (this.field2036[this.field2035 - 1] & 0xFF);
    }

    @ObfuscatedName("dy.ad(I)I")
    public int method2452() {
        this.field2035 += 2;
        int var1 = ((this.field2036[this.field2035 - 2] & 0xFF) << 8) + (this.field2036[this.field2035 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.al(I)I")
    public int method2415() {
        this.field2035 += 3;
        return (this.field2036[this.field2035 - 1] & 0xFF) + ((this.field2036[this.field2035 - 2] & 0xFF) << 8) + ((this.field2036[this.field2035 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.bg(I)I")
    public int method2416() {
        this.field2035 += 4;
        return (this.field2036[this.field2035 - 1] & 0xFF) + ((this.field2036[this.field2035 - 2] & 0xFF) << 8) + ((this.field2036[this.field2035 - 3] & 0xFF) << 16) + ((this.field2036[this.field2035 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dy.bt(I)J")
    public long method2566() {
        long var1 = (long) this.method2416() & 0xFFFFFFFFL;
        long var3 = (long) this.method2416() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dy.bz(I)Ljava/lang/String;")
    public String method2418() {
        if (this.field2036[this.field2035] == 0) {
            this.field2035++;
            return null;
        } else {
            return this.method2564();
        }
    }

    @ObfuscatedName("dy.bn(I)Ljava/lang/String;")
    public String method2564() {
        int var1 = this.field2035;
        while (this.field2036[++this.field2035 - 1] != 0) {
        }
        int var2 = this.field2035 - var1 - 1;
        return var2 == 0 ? "" : class149.method1510(this.field2036, var1, var2);
    }

    @ObfuscatedName("dy.bd(I)Ljava/lang/String;")
    public String method2555() {
        byte var1 = this.field2036[++this.field2035 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2035;
        while (this.field2036[++this.field2035 - 1] != 0) {
        }
        int var3 = this.field2035 - var2 - 1;
        return var3 == 0 ? "" : class149.method1510(this.field2036, var2, var3);
    }

    @ObfuscatedName("dy.ba(I)Ljava/lang/String;")
    public String method2421() {
        byte var1 = this.field2036[++this.field2035 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2426();
        if (this.field2035 + var2 > this.field2036.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2036;
        int var4 = this.field2035;
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
        this.field2035 += var2;
        return var12;
    }

    @ObfuscatedName("dy.bk([BIIB)V")
    public void method2422(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2036[++this.field2035 - 1];
        }
    }

    @ObfuscatedName("dy.by(I)I")
    public int method2423() {
        int var1 = this.field2036[this.field2035] & 0xFF;
        return var1 < 128 ? this.method2411() - 64 : this.method2413() - 49152;
    }

    @ObfuscatedName("dy.bf(I)I")
    public int method2581() {
        int var1 = this.field2036[this.field2035] & 0xFF;
        return var1 < 128 ? this.method2411() : this.method2413() - 32768;
    }

    @ObfuscatedName("dy.bo(I)I")
    public int method2425() {
        return this.field2036[this.field2035] < 0 ? this.method2416() & Integer.MAX_VALUE : this.method2413();
    }

    @ObfuscatedName("dy.bu(B)I")
    public int method2426() {
        byte var1 = this.field2036[++this.field2035 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2036[++this.field2035 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dy.bw([IIII)V")
    public void method2589(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2035;
        this.field2035 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2416();
            int var8 = this.method2416();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2035 -= 8;
            this.method2400(var7);
            this.method2400(var8);
        }
        this.field2035 = var4;
    }

    @ObfuscatedName("dy.bs([IIIB)V")
    public void method2441(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2035;
        this.field2035 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2416();
            int var8 = this.method2416();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2035 -= 8;
            this.method2400(var7);
            this.method2400(var8);
        }
        this.field2035 = var4;
    }

    @ObfuscatedName("dy.bc(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2429(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2035;
        this.field2035 = 0;
        byte[] var4 = new byte[var3];
        this.method2422(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2035 = 0;
        this.method2398(var7.length);
        this.method2405(var7, 0, var7.length);
    }

    @ObfuscatedName("dy.bj(II)I")
    public int method2430(int arg0) {
        int var2 = method2146(this.field2036, arg0, this.field2035);
        this.method2400(var2);
        return var2;
    }

    @ObfuscatedName("dy.bb(I)Z")
    public boolean method2431() {
        this.field2035 -= 4;
        int var1 = method2146(this.field2036, 0, this.field2035);
        int var2 = this.method2416();
        return var1 == var2;
    }

    @ObfuscatedName("dy.bx(IB)V")
    public void method2526(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dy.be(II)V")
    public void method2433(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dy.bq(II)V")
    public void method2434(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dy.bi(B)I")
    public int method2435() {
        return this.field2036[++this.field2035 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dy.bl(I)I")
    public int method2436() {
        return -this.field2036[++this.field2035 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.bh(I)I")
    public int method2437() {
        return 128 - this.field2036[++this.field2035 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.bv(I)B")
    public byte method2575() {
        return (byte) (this.field2036[++this.field2035 - 1] - 128);
    }

    @ObfuscatedName("dy.bm(I)B")
    public byte method2438() {
        return (byte) (-this.field2036[++this.field2035 - 1]);
    }

    @ObfuscatedName("dy.bp(I)B")
    public byte method2478() {
        return (byte) (128 - this.field2036[++this.field2035 - 1]);
    }

    @ObfuscatedName("dy.br(II)V")
    public void method2556(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) arg0;
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.cw(II)V")
    public void method2527(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dy.ct(IB)V")
    public void method2442(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 + 128);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.ce(I)I")
    public int method2443() {
        this.field2035 += 2;
        return ((this.field2036[this.field2035 - 1] & 0xFF) << 8) + (this.field2036[this.field2035 - 2] & 0xFF);
    }

    @ObfuscatedName("dy.cd(I)I")
    public int method2444() {
        this.field2035 += 2;
        return ((this.field2036[this.field2035 - 2] & 0xFF) << 8) + (this.field2036[this.field2035 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dy.cv(S)I")
    public int method2445() {
        this.field2035 += 2;
        return ((this.field2036[this.field2035 - 1] & 0xFF) << 8) + (this.field2036[this.field2035 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dy.cm(I)I")
    public int method2528() {
        this.field2035 += 2;
        int var1 = ((this.field2036[this.field2035 - 1] & 0xFF) << 8) + (this.field2036[this.field2035 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.cl(I)I")
    public int method2447() {
        this.field2035 += 2;
        int var1 = ((this.field2036[this.field2035 - 1] & 0xFF) << 8) + (this.field2036[this.field2035 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.cj(II)V")
    public void method2448(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) arg0;
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dy.cf(II)V")
    public void method2546(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) arg0;
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dy.cq(IB)V")
    public void method2450(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2035 - 1] = (byte) arg0;
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 24);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dy.co(II)V")
    public void method2451(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 24);
        this.field2036[++this.field2035 - 1] = (byte) arg0;
        this.field2036[++this.field2035 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.cu(I)I")
    public int method2476() {
        this.field2035 += 4;
        return (this.field2036[this.field2035 - 4] & 0xFF) + ((this.field2036[this.field2035 - 3] & 0xFF) << 8) + ((this.field2036[this.field2035 - 1] & 0xFF) << 24) + ((this.field2036[this.field2035 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.cp(I)I")
    public int method2453() {
        this.field2035 += 4;
        return (this.field2036[this.field2035 - 3] & 0xFF) + ((this.field2036[this.field2035 - 4] & 0xFF) << 8) + ((this.field2036[this.field2035 - 2] & 0xFF) << 24) + ((this.field2036[this.field2035 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.cb(I)I")
    public int method2454() {
        this.field2035 += 4;
        return (this.field2036[this.field2035 - 2] & 0xFF) + ((this.field2036[this.field2035 - 1] & 0xFF) << 8) + ((this.field2036[this.field2035 - 3] & 0xFF) << 24) + ((this.field2036[this.field2035 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.cy([BIII)V")
    public void method2580(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2036[++this.field2035 - 1] - 128);
        }
    }
}
