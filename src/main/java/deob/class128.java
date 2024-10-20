package deob;

import java.math.BigInteger;

@ObfuscatedName("dl")
public class class128 extends class181 {

    @ObfuscatedName("dl.q")
    public byte[] field2043;

    @ObfuscatedName("dl.j")
    public int field2045;

    @ObfuscatedName("dl.z")
    public static int[] field2042 = new int[256];

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
            field2042[var0] = var1;
        }
    }

    @ObfuscatedName("eq.ak([BIII)I")
    public static int method2726(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2042[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class128(int arg0) {
        this.field2043 = class115.method2318(arg0);
        this.field2045 = 0;
    }

    public class128(byte[] arg0) {
        this.field2043 = arg0;
        this.field2045 = 0;
    }

    @ObfuscatedName("dl.aw(II)V")
    public void method2634(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.av(II)V")
    public void method2603(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2043[++this.field2045 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.ah(IB)V")
    public void method2486(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 16);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2043[++this.field2045 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.ae(II)V")
    public void method2454(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 24);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 16);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2043[++this.field2045 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.am(J)V")
    public void method2444(long arg0) {
        this.field2043[++this.field2045 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2043[++this.field2045 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2043[++this.field2045 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2043[++this.field2045 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2043[++this.field2045 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2043[++this.field2045 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2043[++this.field2045 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2043[++this.field2045 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("h.aq(Ljava/lang/String;I)I")
    public static int method254(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dl.ai(Ljava/lang/String;I)V")
    public void method2445(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2045 += class152.method593(arg0, 0, arg0.length(), this.field2043, this.field2045);
        this.field2043[++this.field2045 - 1] = 0;
    }

    @ObfuscatedName("dl.an(Ljava/lang/String;I)V")
    public void method2446(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2043[++this.field2045 - 1] = 0;
        this.field2045 += class152.method593(arg0, 0, arg0.length(), this.field2043, this.field2045);
        this.field2043[++this.field2045 - 1] = 0;
    }

    @ObfuscatedName("dl.aa(Ljava/lang/CharSequence;I)V")
    public void method2447(CharSequence arg0) {
        int var2 = class182.method2044(arg0);
        this.field2043[++this.field2045 - 1] = 0;
        this.method2453(var2);
        int var3 = this.field2045;
        byte[] var4 = this.field2043;
        int var5 = this.field2045;
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
        this.field2045 = var10 + var3;
    }

    @ObfuscatedName("dl.ad([BIIB)V")
    public void method2448(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2043[++this.field2045 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dl.az(II)V")
    public void method2580(int arg0) {
        this.field2043[this.field2045 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2043[this.field2045 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2043[this.field2045 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2043[this.field2045 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.ar(IB)V")
    public void method2545(int arg0) {
        this.field2043[this.field2045 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2043[this.field2045 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.at(II)V")
    public void method2451(int arg0) {
        this.field2043[this.field2045 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.af(II)V")
    public void method2452(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2634(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2603(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.ay(II)V")
    public void method2453(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2634(arg0 >>> 28 | 0x80);
                    }
                    this.method2634(arg0 >>> 21 | 0x80);
                }
                this.method2634(arg0 >>> 14 | 0x80);
            }
            this.method2634(arg0 >>> 7 | 0x80);
        }
        this.method2634(arg0 & 0x7F);
    }

    @ObfuscatedName("dl.as(B)I")
    public int method2548() {
        return this.field2043[++this.field2045 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.ag(I)B")
    public byte method2455() {
        return this.field2043[++this.field2045 - 1];
    }

    @ObfuscatedName("dl.ac(B)I")
    public int method2456() {
        this.field2045 += 2;
        return ((this.field2043[this.field2045 - 2] & 0xFF) << 8) + (this.field2043[this.field2045 - 1] & 0xFF);
    }

    @ObfuscatedName("dl.aj(I)I")
    public int method2457() {
        this.field2045 += 2;
        int var1 = ((this.field2043[this.field2045 - 2] & 0xFF) << 8) + (this.field2043[this.field2045 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.ab(I)I")
    public int method2558() {
        this.field2045 += 3;
        return (this.field2043[this.field2045 - 1] & 0xFF) + ((this.field2043[this.field2045 - 3] & 0xFF) << 16) + ((this.field2043[this.field2045 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dl.au(I)I")
    public int method2592() {
        this.field2045 += 4;
        return (this.field2043[this.field2045 - 1] & 0xFF) + ((this.field2043[this.field2045 - 2] & 0xFF) << 8) + ((this.field2043[this.field2045 - 3] & 0xFF) << 16) + ((this.field2043[this.field2045 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.bg(I)J")
    public long method2460() {
        long var1 = (long) this.method2592() & 0xFFFFFFFFL;
        long var3 = (long) this.method2592() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dl.bw(B)Ljava/lang/String;")
    public String method2439() {
        if (this.field2043[this.field2045] == 0) {
            this.field2045++;
            return null;
        } else {
            return this.method2559();
        }
    }

    @ObfuscatedName("dl.bm(I)Ljava/lang/String;")
    public String method2559() {
        int var1 = this.field2045;
        while (this.field2043[++this.field2045 - 1] != 0) {
        }
        int var2 = this.field2045 - var1 - 1;
        return var2 == 0 ? "" : class152.method11(this.field2043, var1, var2);
    }

    @ObfuscatedName("dl.bp(B)Ljava/lang/String;")
    public String method2463() {
        byte var1 = this.field2043[++this.field2045 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2045;
        while (this.field2043[++this.field2045 - 1] != 0) {
        }
        int var3 = this.field2045 - var2 - 1;
        return var3 == 0 ? "" : class152.method11(this.field2043, var2, var3);
    }

    @ObfuscatedName("dl.bl(B)Ljava/lang/String;")
    public String method2464() {
        byte var1 = this.field2043[++this.field2045 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2469();
        if (this.field2045 + var2 > this.field2043.length) {
            throw new IllegalStateException("");
        }
        String var3 = class182.method791(this.field2043, this.field2045, var2);
        this.field2045 += var2;
        return var3;
    }

    @ObfuscatedName("dl.bv([BIII)V")
    public void method2465(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2043[++this.field2045 - 1];
        }
    }

    @ObfuscatedName("dl.bk(B)I")
    public int method2478() {
        int var1 = this.field2043[this.field2045] & 0xFF;
        return var1 < 128 ? this.method2548() - 64 : this.method2456() - 49152;
    }

    @ObfuscatedName("dl.bd(I)I")
    public int method2536() {
        int var1 = this.field2043[this.field2045] & 0xFF;
        return var1 < 128 ? this.method2548() : this.method2456() - 32768;
    }

    @ObfuscatedName("dl.bj(I)I")
    public int method2468() {
        return this.field2043[this.field2045] < 0 ? this.method2592() & Integer.MAX_VALUE : this.method2456();
    }

    @ObfuscatedName("dl.bt(I)I")
    public int method2469() {
        byte var1 = this.field2043[++this.field2045 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2043[++this.field2045 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dl.by([IIIB)V")
    public void method2575(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2045;
        this.field2045 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2592();
            int var8 = this.method2592();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2045 -= 8;
            this.method2454(var7);
            this.method2454(var8);
        }
        this.field2045 = var4;
    }

    @ObfuscatedName("dl.bs([IIII)V")
    public void method2571(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2045;
        this.field2045 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2592();
            int var8 = this.method2592();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2045 -= 8;
            this.method2454(var7);
            this.method2454(var8);
        }
        this.field2045 = var4;
    }

    @ObfuscatedName("dl.bx(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2472(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2045;
        this.field2045 = 0;
        byte[] var4 = new byte[var3];
        this.method2465(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2045 = 0;
        this.method2603(var7.length);
        this.method2448(var7, 0, var7.length);
    }

    @ObfuscatedName("dl.br(II)I")
    public int method2473(int arg0) {
        int var2 = method2726(this.field2043, arg0, this.field2045);
        this.method2454(var2);
        return var2;
    }

    @ObfuscatedName("dl.bq(I)Z")
    public boolean method2474() {
        this.field2045 -= 4;
        int var1 = method2726(this.field2043, 0, this.field2045);
        int var2 = this.method2592();
        return var1 == var2;
    }

    @ObfuscatedName("dl.be(II)V")
    public void method2475(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.bn(IB)V")
    public void method2476(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dl.bh(II)V")
    public void method2477(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dl.bz(I)I")
    public int method2556() {
        return this.field2043[++this.field2045 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dl.bu(I)I")
    public int method2479() {
        return -this.field2043[++this.field2045 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.bb(I)I")
    public int method2480() {
        return 128 - this.field2043[++this.field2045 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.bc(B)B")
    public byte method2481() {
        return (byte) (-this.field2043[++this.field2045 - 1]);
    }

    @ObfuscatedName("dl.bf(I)B")
    public byte method2533() {
        return (byte) (128 - this.field2043[++this.field2045 - 1]);
    }

    @ObfuscatedName("dl.ba(IB)V")
    public void method2483(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) arg0;
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bi(II)V")
    public void method2484(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.bo(IB)V")
    public void method2449(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 + 128);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.cg(I)I")
    public int method2517() {
        this.field2045 += 2;
        return ((this.field2043[this.field2045 - 1] & 0xFF) << 8) + (this.field2043[this.field2045 - 2] & 0xFF);
    }

    @ObfuscatedName("dl.cm(I)I")
    public int method2492() {
        this.field2045 += 2;
        return ((this.field2043[this.field2045 - 2] & 0xFF) << 8) + (this.field2043[this.field2045 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.cd(I)I")
    public int method2488() {
        this.field2045 += 2;
        return ((this.field2043[this.field2045 - 1] & 0xFF) << 8) + (this.field2043[this.field2045 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.cl(I)I")
    public int method2489() {
        this.field2045 += 2;
        int var1 = ((this.field2043[this.field2045 - 1] & 0xFF) << 8) + (this.field2043[this.field2045 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.cf(I)I")
    public int method2501() {
        this.field2045 += 2;
        int var1 = ((this.field2043[this.field2045 - 2] & 0xFF) << 8) + (this.field2043[this.field2045 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.cp(B)I")
    public int method2491() {
        this.field2045 += 2;
        int var1 = ((this.field2043[this.field2045 - 1] & 0xFF) << 8) + (this.field2043[this.field2045 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.ch(I)I")
    public int method2494() {
        this.field2045 += 3;
        return (this.field2043[this.field2045 - 3] & 0xFF) + ((this.field2043[this.field2045 - 1] & 0xFF) << 16) + ((this.field2043[this.field2045 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dl.cn(II)V")
    public void method2542(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) arg0;
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 16);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dl.cw(IB)V")
    public void method2543(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2043[++this.field2045 - 1] = (byte) arg0;
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 24);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dl.cr(IB)V")
    public void method2495(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 16);
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 24);
        this.field2043[++this.field2045 - 1] = (byte) arg0;
        this.field2043[++this.field2045 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.cx(I)I")
    public int method2496() {
        this.field2045 += 4;
        return (this.field2043[this.field2045 - 4] & 0xFF) + ((this.field2043[this.field2045 - 3] & 0xFF) << 8) + ((this.field2043[this.field2045 - 2] & 0xFF) << 16) + ((this.field2043[this.field2045 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.ce(I)I")
    public int method2497() {
        this.field2045 += 4;
        return (this.field2043[this.field2045 - 3] & 0xFF) + ((this.field2043[this.field2045 - 4] & 0xFF) << 8) + ((this.field2043[this.field2045 - 2] & 0xFF) << 24) + ((this.field2043[this.field2045 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.cv(I)I")
    public int method2531() {
        this.field2045 += 4;
        return (this.field2043[this.field2045 - 2] & 0xFF) + ((this.field2043[this.field2045 - 1] & 0xFF) << 8) + ((this.field2043[this.field2045 - 3] & 0xFF) << 24) + ((this.field2043[this.field2045 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.cz([BIII)V")
    public void method2499(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2043[++this.field2045 - 1] - 128);
        }
    }

    @ObfuscatedName("dl.cs([BIII)V")
    public void method2540(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2043[++this.field2045 - 1] - 128);
        }
    }
}
