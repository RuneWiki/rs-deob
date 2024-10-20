package deob;

import java.math.BigInteger;

@ObfuscatedName("dw")
public class class127 extends class179 {

    @ObfuscatedName("dw.o")
    public byte[] field2030;

    @ObfuscatedName("dw.p")
    public int field2027;

    @ObfuscatedName("dw.x")
    public static int[] field2026 = new int[256];

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
            field2026[var0] = var1;
        }
    }

    @ObfuscatedName("ej.w([BIB)I")
    public static int method3061(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2026[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class127(int arg0) {
        this.field2030 = class114.method2352(arg0);
        this.field2027 = 0;
    }

    public class127(byte[] arg0) {
        this.field2030 = arg0;
        this.field2027 = 0;
    }

    @ObfuscatedName("dw.d(II)V")
    public void method2485(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.i(II)V")
    public void method2484(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.c(II)V")
    public void method2487(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.af(IB)V")
    public void method2605(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 24);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.aq(J)V")
    public void method2560(long arg0) {
        this.field2030[++this.field2027 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2030[++this.field2027 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2030[++this.field2027 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2030[++this.field2027 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2030[++this.field2027 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2030[++this.field2027 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2030[++this.field2027 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2030[++this.field2027 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cy.at(Ljava/lang/String;I)I")
    public static int method2082(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dw.aw(Ljava/lang/String;I)V")
    public void method2502(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2027 += class150.method151(arg0, 0, arg0.length(), this.field2030, this.field2027);
        this.field2030[++this.field2027 - 1] = 0;
    }

    @ObfuscatedName("dw.ax(Ljava/lang/String;B)V")
    public void method2491(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2030[++this.field2027 - 1] = 0;
        this.field2027 += class150.method151(arg0, 0, arg0.length(), this.field2030, this.field2027);
        this.field2030[++this.field2027 - 1] = 0;
    }

    @ObfuscatedName("dw.ak(Ljava/lang/CharSequence;I)V")
    public void method2635(CharSequence arg0) {
        int var2 = class180.method120(arg0);
        this.field2030[++this.field2027 - 1] = 0;
        this.method2594(var2);
        int var3 = this.field2027;
        byte[] var4 = this.field2030;
        int var5 = this.field2027;
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
        this.field2027 = var10 + var3;
    }

    @ObfuscatedName("dw.ar([BIIB)V")
    public void method2493(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2030[++this.field2027 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dw.az(IB)V")
    public void method2489(int arg0) {
        this.field2030[this.field2027 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2030[this.field2027 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2030[this.field2027 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2030[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.ai(II)V")
    public void method2495(int arg0) {
        this.field2030[this.field2027 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2030[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.aj(II)V")
    public void method2496(int arg0) {
        this.field2030[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.ap(IB)V")
    public void method2574(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2485(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2484(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dw.av(IB)V")
    public void method2594(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2485(arg0 >>> 28 | 0x80);
                    }
                    this.method2485(arg0 >>> 21 | 0x80);
                }
                this.method2485(arg0 >>> 14 | 0x80);
            }
            this.method2485(arg0 >>> 7 | 0x80);
        }
        this.method2485(arg0 & 0x7F);
    }

    @ObfuscatedName("dw.ad(I)I")
    public int method2499() {
        return this.field2030[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.ae(B)B")
    public byte method2500() {
        return this.field2030[++this.field2027 - 1];
    }

    @ObfuscatedName("dw.ah(B)I")
    public int method2501() {
        this.field2027 += 2;
        return ((this.field2030[this.field2027 - 2] & 0xFF) << 8) + (this.field2030[this.field2027 - 1] & 0xFF);
    }

    @ObfuscatedName("dw.am(I)I")
    public int method2511() {
        this.field2027 += 2;
        int var1 = ((this.field2030[this.field2027 - 2] & 0xFF) << 8) + (this.field2030[this.field2027 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dw.ay(I)I")
    public int method2503() {
        this.field2027 += 3;
        return (this.field2030[this.field2027 - 1] & 0xFF) + ((this.field2030[this.field2027 - 3] & 0xFF) << 16) + ((this.field2030[this.field2027 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dw.ag(I)I")
    public int method2548() {
        this.field2027 += 4;
        return (this.field2030[this.field2027 - 1] & 0xFF) + ((this.field2030[this.field2027 - 2] & 0xFF) << 8) + ((this.field2030[this.field2027 - 3] & 0xFF) << 16) + ((this.field2030[this.field2027 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.al(I)J")
    public long method2505() {
        long var1 = (long) this.method2548() & 0xFFFFFFFFL;
        long var3 = (long) this.method2548() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dw.an(S)Ljava/lang/String;")
    public String method2506() {
        if (this.field2030[this.field2027] == 0) {
            this.field2027++;
            return null;
        } else {
            return this.method2507();
        }
    }

    @ObfuscatedName("dw.aa(I)Ljava/lang/String;")
    public String method2507() {
        int var1 = this.field2027;
        while (this.field2030[++this.field2027 - 1] != 0) {
        }
        int var2 = this.field2027 - var1 - 1;
        return var2 == 0 ? "" : class150.method2170(this.field2030, var1, var2);
    }

    @ObfuscatedName("dw.ao(B)Ljava/lang/String;")
    public String method2508() {
        byte var1 = this.field2030[++this.field2027 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2027;
        while (this.field2030[++this.field2027 - 1] != 0) {
        }
        int var3 = this.field2027 - var2 - 1;
        return var3 == 0 ? "" : class150.method2170(this.field2030, var2, var3);
    }

    @ObfuscatedName("dw.au(B)Ljava/lang/String;")
    public String method2509() {
        byte var1 = this.field2030[++this.field2027 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2514();
        if (this.field2027 + var2 > this.field2030.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2030;
        int var4 = this.field2027;
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
        this.field2027 += var2;
        return var12;
    }

    @ObfuscatedName("dw.ab([BIIS)V")
    public void method2510(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2030[++this.field2027 - 1];
        }
    }

    @ObfuscatedName("dw.ac(B)I")
    public int method2609() {
        int var1 = this.field2030[this.field2027] & 0xFF;
        return var1 < 128 ? this.method2499() - 64 : this.method2501() - 49152;
    }

    @ObfuscatedName("dw.as(B)I")
    public int method2564() {
        int var1 = this.field2030[this.field2027] & 0xFF;
        return var1 < 128 ? this.method2499() : this.method2501() - 32768;
    }

    @ObfuscatedName("dw.bn(I)I")
    public int method2513() {
        return this.field2030[this.field2027] < 0 ? this.method2548() & Integer.MAX_VALUE : this.method2501();
    }

    @ObfuscatedName("dw.bl(I)I")
    public int method2514() {
        byte var1 = this.field2030[++this.field2027 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2030[++this.field2027 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dw.ba([IIII)V")
    public void method2515(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2027;
        this.field2027 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2548();
            int var8 = this.method2548();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2027 -= 8;
            this.method2605(var7);
            this.method2605(var8);
        }
        this.field2027 = var4;
    }

    @ObfuscatedName("dw.bq([IIII)V")
    public void method2516(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2027;
        this.field2027 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2548();
            int var8 = this.method2548();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2027 -= 8;
            this.method2605(var7);
            this.method2605(var8);
        }
        this.field2027 = var4;
    }

    @ObfuscatedName("dw.bu(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2517(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2027;
        this.field2027 = 0;
        byte[] var4 = new byte[var3];
        this.method2510(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2027 = 0;
        this.method2484(var7.length);
        this.method2493(var7, 0, var7.length);
    }

    @ObfuscatedName("dw.bg(II)I")
    public int method2518(int arg0) {
        byte[] var2 = this.field2030;
        int var3 = this.field2027;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2026[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2605(var6);
        return var6;
    }

    @ObfuscatedName("dw.bh(I)Z")
    public boolean method2519() {
        this.field2027 -= 4;
        byte[] var1 = this.field2030;
        int var2 = this.field2027;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2026[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2548();
        return var5 == var8;
    }

    @ObfuscatedName("dw.bz(II)V")
    public void method2520(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dw.bo(II)V")
    public void method2521(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dw.bd(B)I")
    public int method2522() {
        return this.field2030[++this.field2027 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dw.bk(B)I")
    public int method2582() {
        return -this.field2030[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.bs(B)I")
    public int method2524() {
        return 128 - this.field2030[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.br(I)B")
    public byte method2628() {
        return (byte) (-this.field2030[++this.field2027 - 1]);
    }

    @ObfuscatedName("dw.bm(B)B")
    public byte method2533() {
        return (byte) (128 - this.field2030[++this.field2027 - 1]);
    }

    @ObfuscatedName("dw.be(II)V")
    public void method2498(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) arg0;
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.bx(IB)V")
    public void method2528(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dw.bb(II)V")
    public void method2529(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (arg0 + 128);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.bj(I)I")
    public int method2530() {
        this.field2027 += 2;
        return ((this.field2030[this.field2027 - 1] & 0xFF) << 8) + (this.field2030[this.field2027 - 2] & 0xFF);
    }

    @ObfuscatedName("dw.bc(I)I")
    public int method2622() {
        this.field2027 += 2;
        return ((this.field2030[this.field2027 - 2] & 0xFF) << 8) + (this.field2030[this.field2027 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dw.bt(B)I")
    public int method2541() {
        this.field2027 += 2;
        return ((this.field2030[this.field2027 - 1] & 0xFF) << 8) + (this.field2030[this.field2027 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dw.bi(B)I")
    public int method2542() {
        this.field2027 += 2;
        int var1 = ((this.field2030[this.field2027 - 1] & 0xFF) << 8) + (this.field2030[this.field2027 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dw.bf(B)I")
    public int method2534() {
        this.field2027 += 2;
        int var1 = ((this.field2030[this.field2027 - 2] & 0xFF) << 8) + (this.field2030[this.field2027 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dw.bw(II)V")
    public void method2535(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) arg0;
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dw.bp(II)V")
    public void method2527(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) arg0;
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dw.bv(II)V")
    public void method2586(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2027 - 1] = (byte) arg0;
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 24);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dw.by(II)V")
    public void method2538(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 24);
        this.field2030[++this.field2027 - 1] = (byte) arg0;
        this.field2030[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.cp(B)I")
    public int method2539() {
        this.field2027 += 4;
        return (this.field2030[this.field2027 - 4] & 0xFF) + ((this.field2030[this.field2027 - 3] & 0xFF) << 8) + ((this.field2030[this.field2027 - 2] & 0xFF) << 16) + ((this.field2030[this.field2027 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.ch(I)I")
    public int method2497() {
        this.field2027 += 4;
        return (this.field2030[this.field2027 - 3] & 0xFF) + ((this.field2030[this.field2027 - 4] & 0xFF) << 8) + ((this.field2030[this.field2027 - 1] & 0xFF) << 16) + ((this.field2030[this.field2027 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.cs(I)I")
    public int method2549() {
        this.field2027 += 4;
        return (this.field2030[this.field2027 - 2] & 0xFF) + ((this.field2030[this.field2027 - 1] & 0xFF) << 8) + ((this.field2030[this.field2027 - 3] & 0xFF) << 24) + ((this.field2030[this.field2027 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dw.cw([BIII)V")
    public void method2637(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2030[++this.field2027 - 1] - 128);
        }
    }

    @ObfuscatedName("dw.ca([BIII)V")
    public void method2536(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2030[++this.field2027 - 1] - 128);
        }
    }
}
