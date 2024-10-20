package deob;

import java.math.BigInteger;

@ObfuscatedName("do")
public class class127 extends class179 {

    @ObfuscatedName("do.d")
    public byte[] field2061;

    @ObfuscatedName("do.b")
    public int field2059;

    @ObfuscatedName("do.i")
    public static int[] field2057 = new int[256];

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
            field2057[var0] = var1;
        }
    }

    @ObfuscatedName("e.g([BIIB)I")
    public static int method247(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2057[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class127(int arg0) {
        this.field2061 = class114.method2309(arg0);
        this.field2059 = 0;
    }

    public class127(byte[] arg0) {
        this.field2061 = arg0;
        this.field2059 = 0;
    }

    @ObfuscatedName("do.m(II)V")
    public void method2424(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.a(IS)V")
    public void method2641(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
        this.field2061[++this.field2059 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.n(II)V")
    public void method2431(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 16);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
        this.field2061[++this.field2059 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.v(II)V")
    public void method2633(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 24);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 16);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
        this.field2061[++this.field2059 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.e(J)V")
    public void method2428(long arg0) {
        this.field2061[++this.field2059 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2061[++this.field2059 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2061[++this.field2059 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2061[++this.field2059 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2061[++this.field2059 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2061[++this.field2059 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2061[++this.field2059 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2061[++this.field2059 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("r.ar(Ljava/lang/String;B)I")
    public static int method173(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("do.ak(Ljava/lang/String;B)V")
    public void method2429(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2059 += class149.method66(arg0, 0, arg0.length(), this.field2061, this.field2059);
        this.field2061[++this.field2059 - 1] = 0;
    }

    @ObfuscatedName("cr.ap(Ljava/lang/String;I)I")
    public static int method2039(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("do.aa(Ljava/lang/String;I)V")
    public void method2606(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2061[++this.field2059 - 1] = 0;
        this.field2059 += class149.method66(arg0, 0, arg0.length(), this.field2061, this.field2059);
        this.field2061[++this.field2059 - 1] = 0;
    }

    @ObfuscatedName("do.av(Ljava/lang/CharSequence;S)V")
    public void method2560(CharSequence arg0) {
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
        this.field2061[++this.field2059 - 1] = 0;
        this.method2493(var3);
        this.field2059 += class180.method1254(this.field2061, this.field2059, arg0);
    }

    @ObfuscatedName("do.aq([BIII)V")
    public void method2432(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2061[++this.field2059 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("do.an(IB)V")
    public void method2433(int arg0) {
        this.field2061[this.field2059 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2061[this.field2059 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2061[this.field2059 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2061[this.field2059 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.al(II)V")
    public void method2551(int arg0) {
        this.field2061[this.field2059 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2061[this.field2059 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.ax(II)V")
    public void method2435(int arg0) {
        this.field2061[this.field2059 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.as(II)V")
    public void method2436(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2424(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2641(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.ah(II)V")
    public void method2493(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2424(arg0 >>> 28 | 0x80);
                    }
                    this.method2424(arg0 >>> 21 | 0x80);
                }
                this.method2424(arg0 >>> 14 | 0x80);
            }
            this.method2424(arg0 >>> 7 | 0x80);
        }
        this.method2424(arg0 & 0x7F);
    }

    @ObfuscatedName("do.ae(B)I")
    public int method2438() {
        return this.field2061[++this.field2059 - 1] & 0xFF;
    }

    @ObfuscatedName("do.ac(I)B")
    public byte method2629() {
        return this.field2061[++this.field2059 - 1];
    }

    @ObfuscatedName("do.af(I)I")
    public int method2440() {
        this.field2059 += 2;
        return ((this.field2061[this.field2059 - 2] & 0xFF) << 8) + (this.field2061[this.field2059 - 1] & 0xFF);
    }

    @ObfuscatedName("do.aj(I)I")
    public int method2441() {
        this.field2059 += 2;
        int var1 = ((this.field2061[this.field2059 - 2] & 0xFF) << 8) + (this.field2061[this.field2059 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.ao(I)I")
    public int method2442() {
        this.field2059 += 3;
        return (this.field2061[this.field2059 - 1] & 0xFF) + ((this.field2061[this.field2059 - 2] & 0xFF) << 8) + ((this.field2061[this.field2059 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("do.au(I)I")
    public int method2448() {
        this.field2059 += 4;
        return (this.field2061[this.field2059 - 1] & 0xFF) + ((this.field2061[this.field2059 - 2] & 0xFF) << 8) + ((this.field2061[this.field2059 - 4] & 0xFF) << 24) + ((this.field2061[this.field2059 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("do.at(B)J")
    public long method2561() {
        long var1 = (long) this.method2448() & 0xFFFFFFFFL;
        long var3 = (long) this.method2448() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("do.az(B)Ljava/lang/String;")
    public String method2510() {
        if (this.field2061[this.field2059] == 0) {
            this.field2059++;
            return null;
        } else {
            return this.method2627();
        }
    }

    @ObfuscatedName("do.ag(I)Ljava/lang/String;")
    public String method2627() {
        int var1 = this.field2059;
        while (this.field2061[++this.field2059 - 1] != 0) {
        }
        int var2 = this.field2059 - var1 - 1;
        return var2 == 0 ? "" : class149.method2417(this.field2061, var1, var2);
    }

    @ObfuscatedName("do.am(I)Ljava/lang/String;")
    public String method2447() {
        byte var1 = this.field2061[++this.field2059 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2059;
        while (this.field2061[++this.field2059 - 1] != 0) {
        }
        int var3 = this.field2059 - var2 - 1;
        return var3 == 0 ? "" : class149.method2417(this.field2061, var2, var3);
    }

    @ObfuscatedName("do.ai(I)Ljava/lang/String;")
    public String method2430() {
        byte var1 = this.field2061[++this.field2059 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2453();
        if (this.field2059 + var2 > this.field2061.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2061;
        int var4 = this.field2059;
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
        this.field2059 += var2;
        return var12;
    }

    @ObfuscatedName("do.ab([BIII)V")
    public void method2449(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2061[++this.field2059 - 1];
        }
    }

    @ObfuscatedName("do.ay(I)I")
    public int method2628() {
        int var1 = this.field2061[this.field2059] & 0xFF;
        return var1 < 128 ? this.method2438() - 64 : this.method2440() - 49152;
    }

    @ObfuscatedName("do.aw(I)I")
    public int method2423() {
        int var1 = this.field2061[this.field2059] & 0xFF;
        return var1 < 128 ? this.method2438() : this.method2440() - 32768;
    }

    @ObfuscatedName("do.ad(I)I")
    public int method2452() {
        return this.field2061[this.field2059] < 0 ? this.method2448() & Integer.MAX_VALUE : this.method2440();
    }

    @ObfuscatedName("do.bs(I)I")
    public int method2453() {
        byte var1 = this.field2061[++this.field2059 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2061[++this.field2059 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("do.bt([IIII)V")
    public void method2454(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2059;
        this.field2059 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2448();
            int var8 = this.method2448();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2059 -= 8;
            this.method2633(var7);
            this.method2633(var8);
        }
        this.field2059 = var4;
    }

    @ObfuscatedName("do.bn([IIIB)V")
    public void method2455(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2059;
        this.field2059 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2448();
            int var8 = this.method2448();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2059 -= 8;
            this.method2633(var7);
            this.method2633(var8);
        }
        this.field2059 = var4;
    }

    @ObfuscatedName("do.bk(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2456(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2059;
        this.field2059 = 0;
        byte[] var4 = new byte[var3];
        this.method2449(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2059 = 0;
        this.method2641(var7.length);
        this.method2432(var7, 0, var7.length);
    }

    @ObfuscatedName("do.bl(II)I")
    public int method2457(int arg0) {
        int var2 = method247(this.field2061, arg0, this.field2059);
        this.method2633(var2);
        return var2;
    }

    @ObfuscatedName("do.bi(B)Z")
    public boolean method2458() {
        this.field2059 -= 4;
        int var1 = method247(this.field2061, 0, this.field2059);
        int var2 = this.method2448();
        return var1 == var2;
    }

    @ObfuscatedName("do.br(IB)V")
    public void method2459(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.bb(II)V")
    public void method2474(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("do.bm(B)I")
    public int method2621() {
        return this.field2061[++this.field2059 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("do.bw(I)I")
    public int method2462() {
        return -this.field2061[++this.field2059 - 1] & 0xFF;
    }

    @ObfuscatedName("do.bc(I)I")
    public int method2463() {
        return 128 - this.field2061[++this.field2059 - 1] & 0xFF;
    }

    @ObfuscatedName("do.bo(I)B")
    public byte method2464() {
        return (byte) (this.field2061[++this.field2059 - 1] - 128);
    }

    @ObfuscatedName("do.bq(I)B")
    public byte method2557() {
        return (byte) (128 - this.field2061[++this.field2059 - 1]);
    }

    @ObfuscatedName("do.bh(II)V")
    public void method2466(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) arg0;
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.bp(IB)V")
    public void method2467(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.bf(II)V")
    public void method2468(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 + 128);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.bj(I)I")
    public int method2469() {
        this.field2059 += 2;
        return ((this.field2061[this.field2059 - 1] & 0xFF) << 8) + (this.field2061[this.field2059 - 2] & 0xFF);
    }

    @ObfuscatedName("do.by(I)I")
    public int method2521() {
        this.field2059 += 2;
        return ((this.field2061[this.field2059 - 2] & 0xFF) << 8) + (this.field2061[this.field2059 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("do.bz(B)I")
    public int method2494() {
        this.field2059 += 2;
        return ((this.field2061[this.field2059 - 1] & 0xFF) << 8) + (this.field2061[this.field2059 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("do.bv(S)I")
    public int method2472() {
        this.field2059 += 2;
        int var1 = ((this.field2061[this.field2059 - 1] & 0xFF) << 8) + (this.field2061[this.field2059 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.ba(B)I")
    public int method2473() {
        this.field2059 += 2;
        int var1 = ((this.field2061[this.field2059 - 1] & 0xFF) << 8) + (this.field2061[this.field2059 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.bg(IS)V")
    public void method2531(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) arg0;
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("do.bu(II)V")
    public void method2475(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) arg0;
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 16);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("do.bx(II)V")
    public void method2476(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
        this.field2061[++this.field2059 - 1] = (byte) arg0;
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 24);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("do.bd(IB)V")
    public void method2477(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 16);
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 24);
        this.field2061[++this.field2059 - 1] = (byte) arg0;
        this.field2061[++this.field2059 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.be(I)I")
    public int method2478() {
        this.field2059 += 4;
        return (this.field2061[this.field2059 - 4] & 0xFF) + ((this.field2061[this.field2059 - 3] & 0xFF) << 8) + ((this.field2061[this.field2059 - 2] & 0xFF) << 16) + ((this.field2061[this.field2059 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("do.cz(I)I")
    public int method2479() {
        this.field2059 += 4;
        return (this.field2061[this.field2059 - 3] & 0xFF) + ((this.field2061[this.field2059 - 4] & 0xFF) << 8) + ((this.field2061[this.field2059 - 1] & 0xFF) << 16) + ((this.field2061[this.field2059 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("do.cm(I)I")
    public int method2439() {
        this.field2059 += 4;
        return (this.field2061[this.field2059 - 2] & 0xFF) + ((this.field2061[this.field2059 - 1] & 0xFF) << 8) + ((this.field2061[this.field2059 - 4] & 0xFF) << 16) + ((this.field2061[this.field2059 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("do.cw([BIIB)V")
    public void method2562(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2061[++this.field2059 - 1];
        }
    }
}
