package deob;

import java.math.BigInteger;

@ObfuscatedName("dv")
public class class127 extends class179 {

    @ObfuscatedName("dv.i")
    public byte[] field2056;

    @ObfuscatedName("dv.k")
    public int field2051;

    @ObfuscatedName("dv.q")
    public static int[] field2053 = new int[256];

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
            field2053[var0] = var1;
        }
    }

    @ObfuscatedName("v.e([BIIB)I")
    public static int method65(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2053[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class127(int arg0) {
        this.field2056 = class114.method2264(arg0);
        this.field2051 = 0;
    }

    public class127(byte[] arg0) {
        this.field2056 = arg0;
        this.field2051 = 0;
    }

    @ObfuscatedName("dv.r(II)V")
    public void method2590(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.av(IB)V")
    public void method2576(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.an(II)V")
    public void method2404(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ae(II)V")
    public void method2385(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 24);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2051 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.au(J)V")
    public void method2398(long arg0) {
        this.field2056[++this.field2051 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2056[++this.field2051 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2056[++this.field2051 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2056[++this.field2051 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2056[++this.field2051 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2056[++this.field2051 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2056[++this.field2051 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2056[++this.field2051 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dv.ag(Ljava/lang/String;I)V")
    public void method2520(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2051 += class150.method169(arg0, 0, arg0.length(), this.field2056, this.field2051);
        this.field2056[++this.field2051 - 1] = 0;
    }

    @ObfuscatedName("dp.at(Ljava/lang/String;I)I")
    public static int method2169(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dv.ac(Ljava/lang/String;I)V")
    public void method2388(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2056[++this.field2051 - 1] = 0;
        this.field2051 += class150.method169(arg0, 0, arg0.length(), this.field2056, this.field2051);
        this.field2056[++this.field2051 - 1] = 0;
    }

    @ObfuscatedName("dv.aw(Ljava/lang/CharSequence;I)V")
    public void method2498(CharSequence arg0) {
        int var2 = class180.method166(arg0);
        this.field2056[++this.field2051 - 1] = 0;
        this.method2395(var2);
        int var3 = this.field2051;
        byte[] var4 = this.field2056;
        int var5 = this.field2051;
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
        this.field2051 = var10 + var3;
    }

    @ObfuscatedName("dv.ah([BIIB)V")
    public void method2579(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2056[++this.field2051 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dv.ai(II)V")
    public void method2391(int arg0) {
        this.field2056[this.field2051 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2056[this.field2051 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2056[this.field2051 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2056[this.field2051 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ap(IB)V")
    public void method2392(int arg0) {
        this.field2056[this.field2051 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2056[this.field2051 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ad(II)V")
    public void method2547(int arg0) {
        this.field2056[this.field2051 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ay(IB)V")
    public void method2488(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2590(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2576(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dv.az(IB)V")
    public void method2395(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2590(arg0 >>> 28 | 0x80);
                    }
                    this.method2590(arg0 >>> 21 | 0x80);
                }
                this.method2590(arg0 >>> 14 | 0x80);
            }
            this.method2590(arg0 >>> 7 | 0x80);
        }
        this.method2590(arg0 & 0x7F);
    }

    @ObfuscatedName("dv.ab(I)I")
    public int method2416() {
        return this.field2056[++this.field2051 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.am(I)B")
    public byte method2397() {
        return this.field2056[++this.field2051 - 1];
    }

    @ObfuscatedName("dv.as(B)I")
    public int method2394() {
        this.field2051 += 2;
        return ((this.field2056[this.field2051 - 2] & 0xFF) << 8) + (this.field2056[this.field2051 - 1] & 0xFF);
    }

    @ObfuscatedName("dv.aa(B)I")
    public int method2399() {
        this.field2051 += 2;
        int var1 = ((this.field2056[this.field2051 - 2] & 0xFF) << 8) + (this.field2056[this.field2051 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.af(B)I")
    public int method2400() {
        this.field2051 += 3;
        return (this.field2056[this.field2051 - 1] & 0xFF) + ((this.field2056[this.field2051 - 3] & 0xFF) << 16) + ((this.field2056[this.field2051 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dv.ax(B)I")
    public int method2455() {
        this.field2051 += 4;
        return (this.field2056[this.field2051 - 1] & 0xFF) + ((this.field2056[this.field2051 - 2] & 0xFF) << 8) + ((this.field2056[this.field2051 - 3] & 0xFF) << 16) + ((this.field2056[this.field2051 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.aq(I)J")
    public long method2402() {
        long var1 = (long) this.method2455() & 0xFFFFFFFFL;
        long var3 = (long) this.method2455() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dv.ao(B)Ljava/lang/String;")
    public String method2403() {
        if (this.field2056[this.field2051] == 0) {
            this.field2051++;
            return null;
        } else {
            return this.method2473();
        }
    }

    @ObfuscatedName("dv.ar(I)Ljava/lang/String;")
    public String method2473() {
        int var1 = this.field2051;
        while (this.field2056[++this.field2051 - 1] != 0) {
        }
        int var2 = this.field2051 - var1 - 1;
        return var2 == 0 ? "" : class150.method766(this.field2056, var1, var2);
    }

    @ObfuscatedName("dv.aj(I)Ljava/lang/String;")
    public String method2405() {
        byte var1 = this.field2056[++this.field2051 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2051;
        while (this.field2056[++this.field2051 - 1] != 0) {
        }
        int var3 = this.field2051 - var2 - 1;
        return var3 == 0 ? "" : class150.method766(this.field2056, var2, var3);
    }

    @ObfuscatedName("dv.al(I)Ljava/lang/String;")
    public String method2406() {
        byte var1 = this.field2056[++this.field2051 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2411();
        if (this.field2051 + var2 > this.field2056.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2056;
        int var4 = this.field2051;
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
        this.field2051 += var2;
        return var12;
    }

    @ObfuscatedName("dv.ak([BIIB)V")
    public void method2407(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2056[++this.field2051 - 1];
        }
    }

    @ObfuscatedName("dv.bj(I)I")
    public int method2408() {
        int var1 = this.field2056[this.field2051] & 0xFF;
        return var1 < 128 ? this.method2416() - 64 : this.method2394() - 49152;
    }

    @ObfuscatedName("dv.bk(B)I")
    public int method2409() {
        int var1 = this.field2056[this.field2051] & 0xFF;
        return var1 < 128 ? this.method2416() : this.method2394() - 32768;
    }

    @ObfuscatedName("dv.bm(I)I")
    public int method2439() {
        return this.field2056[this.field2051] < 0 ? this.method2455() & Integer.MAX_VALUE : this.method2394();
    }

    @ObfuscatedName("dv.bq(I)I")
    public int method2411() {
        byte var1 = this.field2056[++this.field2051 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2056[++this.field2051 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dv.bh([IIII)V")
    public void method2477(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2051;
        this.field2051 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2455();
            int var8 = this.method2455();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2051 -= 8;
            this.method2385(var7);
            this.method2385(var8);
        }
        this.field2051 = var4;
    }

    @ObfuscatedName("dv.bo([IIII)V")
    public void method2413(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2051;
        this.field2051 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2455();
            int var8 = this.method2455();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2051 -= 8;
            this.method2385(var7);
            this.method2385(var8);
        }
        this.field2051 = var4;
    }

    @ObfuscatedName("dv.bx(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2485(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2051;
        this.field2051 = 0;
        byte[] var4 = new byte[var3];
        this.method2407(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2051 = 0;
        this.method2576(var7.length);
        this.method2579(var7, 0, var7.length);
    }

    @ObfuscatedName("dv.bw(II)I")
    public int method2382(int arg0) {
        int var2 = method65(this.field2056, arg0, this.field2051);
        this.method2385(var2);
        return var2;
    }

    @ObfuscatedName("dv.bz(B)Z")
    public boolean method2453() {
        this.field2051 -= 4;
        int var1 = method65(this.field2056, 0, this.field2051);
        int var2 = this.method2455();
        return var1 == var2;
    }

    @ObfuscatedName("dv.bb(II)V")
    public void method2417(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dv.bl(IB)V")
    public void method2418(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dv.bf(I)I")
    public int method2419() {
        return this.field2056[++this.field2051 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dv.ba(I)I")
    public int method2479() {
        return -this.field2056[++this.field2051 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.br(B)I")
    public int method2421() {
        return 128 - this.field2056[++this.field2051 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.bc(I)B")
    public byte method2422() {
        return (byte) (this.field2056[++this.field2051 - 1] - 128);
    }

    @ObfuscatedName("dv.bd(S)B")
    public byte method2509() {
        return (byte) (-this.field2056[++this.field2051 - 1]);
    }

    @ObfuscatedName("dv.bu(B)B")
    public byte method2424() {
        return (byte) (128 - this.field2056[++this.field2051 - 1]);
    }

    @ObfuscatedName("dv.bi(II)V")
    public void method2425(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) arg0;
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.bv(IB)V")
    public void method2426(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dv.bp(II)V")
    public void method2427(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 + 128);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.bt(I)I")
    public int method2389() {
        this.field2051 += 2;
        return ((this.field2056[this.field2051 - 1] & 0xFF) << 8) + (this.field2056[this.field2051 - 2] & 0xFF);
    }

    @ObfuscatedName("dv.bg(I)I")
    public int method2441() {
        this.field2051 += 2;
        return ((this.field2056[this.field2051 - 2] & 0xFF) << 8) + (this.field2056[this.field2051 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dv.by(B)I")
    public int method2528() {
        this.field2051 += 2;
        return ((this.field2056[this.field2051 - 1] & 0xFF) << 8) + (this.field2056[this.field2051 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dv.bn(B)I")
    public int method2431() {
        this.field2051 += 2;
        int var1 = ((this.field2056[this.field2051 - 1] & 0xFF) << 8) + (this.field2056[this.field2051 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.bs(IB)V")
    public void method2434(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) arg0;
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dv.be(IB)V")
    public void method2433(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) arg0;
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dv.cc(II)V")
    public void method2412(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2051 - 1] = (byte) arg0;
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 24);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dv.cj(II)V")
    public void method2435(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 24);
        this.field2056[++this.field2051 - 1] = (byte) arg0;
        this.field2056[++this.field2051 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.ci(I)I")
    public int method2527() {
        this.field2051 += 4;
        return (this.field2056[this.field2051 - 4] & 0xFF) + ((this.field2056[this.field2051 - 3] & 0xFF) << 8) + ((this.field2056[this.field2051 - 2] & 0xFF) << 16) + ((this.field2056[this.field2051 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.cb(I)I")
    public int method2437() {
        this.field2051 += 4;
        return (this.field2056[this.field2051 - 3] & 0xFF) + ((this.field2056[this.field2051 - 4] & 0xFF) << 8) + ((this.field2056[this.field2051 - 1] & 0xFF) << 16) + ((this.field2056[this.field2051 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.cy(I)I")
    public int method2438() {
        this.field2051 += 4;
        return (this.field2056[this.field2051 - 2] & 0xFF) + ((this.field2056[this.field2051 - 1] & 0xFF) << 8) + ((this.field2056[this.field2051 - 4] & 0xFF) << 16) + ((this.field2056[this.field2051 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.ca([BIIB)V")
    public void method2466(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2056[++this.field2051 - 1];
        }
    }

    @ObfuscatedName("dv.ce([BIII)V")
    public void method2440(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2056[++this.field2051 - 1] - 128);
        }
    }
}
