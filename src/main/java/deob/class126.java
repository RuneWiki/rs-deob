package deob;

import java.math.BigInteger;

@ObfuscatedName("du")
public class class126 extends class177 {

    @ObfuscatedName("du.j")
    public byte[] field2013;

    @ObfuscatedName("du.i")
    public int field2016;

    @ObfuscatedName("du.o")
    public static int[] field2014 = new int[256];

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
            field2014[var0] = var1;
        }
    }

    @ObfuscatedName("cx.k([BIIB)I")
    public static int method1609(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2014[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class126(int arg0) {
        this.field2013 = class113.method2344(arg0);
        this.field2016 = 0;
    }

    public class126(byte[] arg0) {
        this.field2013 = arg0;
        this.field2016 = 0;
    }

    @ObfuscatedName("du.c(IB)V")
    public void method2472(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.al(II)V")
    public void method2473(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2016 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.ai(II)V")
    public void method2615(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2016 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.ad(II)V")
    public void method2475(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 24);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2016 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.aw(J)V")
    public void method2476(long arg0) {
        this.field2013[++this.field2016 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2013[++this.field2016 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2013[++this.field2016 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2013[++this.field2016 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2013[++this.field2016 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2013[++this.field2016 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2013[++this.field2016 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2013[++this.field2016 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("h.af(Ljava/lang/String;I)I")
    public static int method198(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("du.an(Ljava/lang/String;S)V")
    public void method2477(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2016 += class148.method1867(arg0, 0, arg0.length(), this.field2013, this.field2016);
        this.field2013[++this.field2016 - 1] = 0;
    }

    @ObfuscatedName("du.ao(Ljava/lang/CharSequence;I)V")
    public void method2478(CharSequence arg0) {
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
        this.field2013[++this.field2016 - 1] = 0;
        this.method2633(var3);
        this.field2016 += class178.method761(this.field2013, this.field2016, arg0);
    }

    @ObfuscatedName("du.ak([BIII)V")
    public void method2606(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2013[++this.field2016 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("du.ah(IB)V")
    public void method2480(int arg0) {
        this.field2013[this.field2016 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2013[this.field2016 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2013[this.field2016 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2013[this.field2016 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.aq(IB)V")
    public void method2481(int arg0) {
        this.field2013[this.field2016 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2013[this.field2016 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.ax(II)V")
    public void method2491(int arg0) {
        this.field2013[this.field2016 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.ag(II)V")
    public void method2483(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2472(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2473(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("du.am(IB)V")
    public void method2633(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2472(arg0 >>> 28 | 0x80);
                    }
                    this.method2472(arg0 >>> 21 | 0x80);
                }
                this.method2472(arg0 >>> 14 | 0x80);
            }
            this.method2472(arg0 >>> 7 | 0x80);
        }
        this.method2472(arg0 & 0x7F);
    }

    @ObfuscatedName("du.at(I)I")
    public int method2485() {
        return this.field2013[++this.field2016 - 1] & 0xFF;
    }

    @ObfuscatedName("du.ae(I)B")
    public byte method2479() {
        return this.field2013[++this.field2016 - 1];
    }

    @ObfuscatedName("du.ay(I)I")
    public int method2487() {
        this.field2016 += 2;
        return ((this.field2013[this.field2016 - 2] & 0xFF) << 8) + (this.field2013[this.field2016 - 1] & 0xFF);
    }

    @ObfuscatedName("du.as(B)I")
    public int method2488() {
        this.field2016 += 2;
        int var1 = ((this.field2013[this.field2016 - 2] & 0xFF) << 8) + (this.field2013[this.field2016 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.ar(B)I")
    public int method2489() {
        this.field2016 += 3;
        return (this.field2013[this.field2016 - 1] & 0xFF) + ((this.field2013[this.field2016 - 2] & 0xFF) << 8) + ((this.field2013[this.field2016 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("du.aj(B)I")
    public int method2593() {
        this.field2016 += 4;
        return (this.field2013[this.field2016 - 1] & 0xFF) + ((this.field2013[this.field2016 - 2] & 0xFF) << 8) + ((this.field2013[this.field2016 - 3] & 0xFF) << 16) + ((this.field2013[this.field2016 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("du.av(B)J")
    public long method2567() {
        long var1 = (long) this.method2593() & 0xFFFFFFFFL;
        long var3 = (long) this.method2593() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("du.az(I)Ljava/lang/String;")
    public String method2498() {
        if (this.field2013[this.field2016] == 0) {
            this.field2016++;
            return null;
        } else {
            return this.method2470();
        }
    }

    @ObfuscatedName("du.aa(B)Ljava/lang/String;")
    public String method2470() {
        int var1 = this.field2016;
        while (this.field2013[++this.field2016 - 1] != 0) {
        }
        int var2 = this.field2016 - var1 - 1;
        return var2 == 0 ? "" : class148.method15(this.field2013, var1, var2);
    }

    @ObfuscatedName("du.au(I)Ljava/lang/String;")
    public String method2583() {
        byte var1 = this.field2013[++this.field2016 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2016;
        while (this.field2013[++this.field2016 - 1] != 0) {
        }
        int var3 = this.field2016 - var2 - 1;
        return var3 == 0 ? "" : class148.method15(this.field2013, var2, var3);
    }

    @ObfuscatedName("du.ac(I)Ljava/lang/String;")
    public String method2495() {
        byte var1 = this.field2013[++this.field2016 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2500();
        if (this.field2016 + var2 > this.field2013.length) {
            throw new IllegalStateException("");
        }
        String var3 = class178.method1387(this.field2013, this.field2016, var2);
        this.field2016 += var2;
        return var3;
    }

    @ObfuscatedName("du.ap([BIII)V")
    public void method2651(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2013[++this.field2016 - 1];
        }
    }

    @ObfuscatedName("du.ab(I)I")
    public int method2497() {
        int var1 = this.field2013[this.field2016] & 0xFF;
        return var1 < 128 ? this.method2485() - 64 : this.method2487() - 49152;
    }

    @ObfuscatedName("du.bu(I)I")
    public int method2628() {
        int var1 = this.field2013[this.field2016] & 0xFF;
        return var1 < 128 ? this.method2485() : this.method2487() - 32768;
    }

    @ObfuscatedName("du.bc(I)I")
    public int method2499() {
        return this.field2013[this.field2016] < 0 ? this.method2593() & Integer.MAX_VALUE : this.method2487();
    }

    @ObfuscatedName("du.br(I)I")
    public int method2500() {
        byte var1 = this.field2013[++this.field2016 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2013[++this.field2016 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("du.bo([IIIB)V")
    public void method2501(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2016;
        this.field2016 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2593();
            int var8 = this.method2593();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2016 -= 8;
            this.method2475(var7);
            this.method2475(var8);
        }
        this.field2016 = var4;
    }

    @ObfuscatedName("du.bb([IIII)V")
    public void method2502(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2016;
        this.field2016 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2593();
            int var8 = this.method2593();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2016 -= 8;
            this.method2475(var7);
            this.method2475(var8);
        }
        this.field2016 = var4;
    }

    @ObfuscatedName("du.bt(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2578(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2016;
        this.field2016 = 0;
        byte[] var4 = new byte[var3];
        this.method2651(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2016 = 0;
        this.method2473(var7.length);
        this.method2606(var7, 0, var7.length);
    }

    @ObfuscatedName("du.bw(II)I")
    public int method2504(int arg0) {
        int var2 = method1609(this.field2013, arg0, this.field2016);
        this.method2475(var2);
        return var2;
    }

    @ObfuscatedName("du.bk(I)Z")
    public boolean method2505() {
        this.field2016 -= 4;
        int var1 = method1609(this.field2013, 0, this.field2016);
        int var2 = this.method2593();
        return var1 == var2;
    }

    @ObfuscatedName("du.bx(II)V")
    public void method2506(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("du.bf(II)V")
    public void method2507(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("du.bl(I)I")
    public int method2508() {
        return this.field2013[++this.field2016 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("du.bv(B)I")
    public int method2535() {
        return -this.field2013[++this.field2016 - 1] & 0xFF;
    }

    @ObfuscatedName("du.ba(B)I")
    public int method2510() {
        return 128 - this.field2013[++this.field2016 - 1] & 0xFF;
    }

    @ObfuscatedName("du.bp(I)B")
    public byte method2547() {
        return (byte) (this.field2013[++this.field2016 - 1] - 128);
    }

    @ObfuscatedName("du.be(I)B")
    public byte method2539() {
        return (byte) (-this.field2013[++this.field2016 - 1]);
    }

    @ObfuscatedName("du.bs(IB)V")
    public void method2591(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) arg0;
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.bh(IB)V")
    public void method2514(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("du.by(II)V")
    public void method2540(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (arg0 + 128);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.bz(B)I")
    public int method2592() {
        this.field2016 += 2;
        return ((this.field2013[this.field2016 - 1] & 0xFF) << 8) + (this.field2013[this.field2016 - 2] & 0xFF);
    }

    @ObfuscatedName("du.bj(I)I")
    public int method2503() {
        this.field2016 += 2;
        return ((this.field2013[this.field2016 - 2] & 0xFF) << 8) + (this.field2013[this.field2016 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("du.bg(I)I")
    public int method2530() {
        this.field2016 += 2;
        return ((this.field2013[this.field2016 - 1] & 0xFF) << 8) + (this.field2013[this.field2016 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("du.bq(B)I")
    public int method2534() {
        this.field2016 += 2;
        int var1 = ((this.field2013[this.field2016 - 1] & 0xFF) << 8) + (this.field2013[this.field2016 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.bm(B)I")
    public int method2520() {
        this.field2016 += 2;
        int var1 = ((this.field2013[this.field2016 - 1] & 0xFF) << 8) + (this.field2013[this.field2016 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.bn(I)I")
    public int method2538() {
        this.field2016 += 3;
        return (this.field2013[this.field2016 - 1] & 0xFF) + ((this.field2013[this.field2016 - 3] & 0xFF) << 8) + ((this.field2013[this.field2016 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("du.bi(II)V")
    public void method2522(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) arg0;
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("du.bd(II)V")
    public void method2523(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2013[++this.field2016 - 1] = (byte) arg0;
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 24);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("du.cj(II)V")
    public void method2524(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 24);
        this.field2013[++this.field2016 - 1] = (byte) arg0;
        this.field2013[++this.field2016 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.cb(I)I")
    public int method2525() {
        this.field2016 += 4;
        return (this.field2013[this.field2016 - 4] & 0xFF) + ((this.field2013[this.field2016 - 3] & 0xFF) << 8) + ((this.field2013[this.field2016 - 1] & 0xFF) << 24) + ((this.field2013[this.field2016 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("du.cx(I)I")
    public int method2526() {
        this.field2016 += 4;
        return (this.field2013[this.field2016 - 3] & 0xFF) + ((this.field2013[this.field2016 - 4] & 0xFF) << 8) + ((this.field2013[this.field2016 - 1] & 0xFF) << 16) + ((this.field2013[this.field2016 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("du.ck(I)I")
    public int method2527() {
        this.field2016 += 4;
        return (this.field2013[this.field2016 - 2] & 0xFF) + ((this.field2013[this.field2016 - 1] & 0xFF) << 8) + ((this.field2013[this.field2016 - 4] & 0xFF) << 16) + ((this.field2013[this.field2016 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("du.ci([BIII)V")
    public void method2528(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2013[++this.field2016 - 1] - 128);
        }
    }

    @ObfuscatedName("du.cw([BIIB)V")
    public void method2486(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2013[++this.field2016 - 1] - 128);
        }
    }
}
