package deob;

import java.math.BigInteger;

@ObfuscatedName("dz")
public class class127 extends class179 {

    @ObfuscatedName("dz.e")
    public byte[] field2049;

    @ObfuscatedName("dz.t")
    public int field2045;

    @ObfuscatedName("dz.d")
    public static int[] field2043 = new int[256];

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
            field2043[var0] = var1;
        }
    }

    @ObfuscatedName("ac.ae([BIII)I")
    public static int method890(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2043[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("bo.aa([BIB)I")
    public static int method1408(byte[] arg0, int arg1) {
        return method890(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2049 = class114.method2319(arg0);
        this.field2045 = 0;
    }

    public class127(byte[] arg0) {
        this.field2049 = arg0;
        this.field2045 = 0;
    }

    @ObfuscatedName("dz.ah(II)V")
    public void method2438(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dz.aw(II)V")
    public void method2585(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2045 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dz.an(IB)V")
    public void method2527(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 16);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2045 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dz.av(II)V")
    public void method2441(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 24);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 16);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2045 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dz.ak(J)V")
    public void method2442(long arg0) {
        this.field2049[++this.field2045 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2049[++this.field2045 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2049[++this.field2045 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2049[++this.field2045 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2049[++this.field2045 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2049[++this.field2045 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2049[++this.field2045 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2049[++this.field2045 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dz.ax(Ljava/lang/String;B)V")
    public void method2443(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2045 += class149.method1501(arg0, 0, arg0.length(), this.field2049, this.field2045);
        this.field2049[++this.field2045 - 1] = 0;
    }

    @ObfuscatedName("dv.ab(Ljava/lang/String;S)I")
    public static int method2322(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dz.af(Ljava/lang/String;B)V")
    public void method2444(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2049[++this.field2045 - 1] = 0;
        this.field2045 += class149.method1501(arg0, 0, arg0.length(), this.field2049, this.field2045);
        this.field2049[++this.field2045 - 1] = 0;
    }

    @ObfuscatedName("dz.ai(Ljava/lang/CharSequence;I)V")
    public void method2445(CharSequence arg0) {
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
        this.field2049[++this.field2045 - 1] = 0;
        this.method2451(var3);
        int var8 = this.field2045;
        byte[] var9 = this.field2049;
        int var10 = this.field2045;
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
        this.field2045 = var15 + var8;
    }

    @ObfuscatedName("dz.at([BIII)V")
    public void method2609(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2049[++this.field2045 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dz.aq(IB)V")
    public void method2555(int arg0) {
        this.field2049[this.field2045 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2049[this.field2045 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2049[this.field2045 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2049[this.field2045 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dz.ac(IB)V")
    public void method2448(int arg0) {
        this.field2049[this.field2045 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2049[this.field2045 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dz.al(IB)V")
    public void method2449(int arg0) {
        this.field2049[this.field2045 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dz.ag(IB)V")
    public void method2450(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2438(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2585(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dz.ap(IB)V")
    public void method2451(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2438(arg0 >>> 28 | 0x80);
                    }
                    this.method2438(arg0 >>> 21 | 0x80);
                }
                this.method2438(arg0 >>> 14 | 0x80);
            }
            this.method2438(arg0 >>> 7 | 0x80);
        }
        this.method2438(arg0 & 0x7F);
    }

    @ObfuscatedName("dz.am(B)I")
    public int method2472() {
        return this.field2049[++this.field2045 - 1] & 0xFF;
    }

    @ObfuscatedName("dz.as(I)B")
    public byte method2453() {
        return this.field2049[++this.field2045 - 1];
    }

    @ObfuscatedName("dz.aj(B)I")
    public int method2615() {
        this.field2045 += 2;
        return ((this.field2049[this.field2045 - 2] & 0xFF) << 8) + (this.field2049[this.field2045 - 1] & 0xFF);
    }

    @ObfuscatedName("dz.ar(I)I")
    public int method2455() {
        this.field2045 += 2;
        int var1 = ((this.field2049[this.field2045 - 2] & 0xFF) << 8) + (this.field2049[this.field2045 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dz.au(S)I")
    public int method2608() {
        this.field2045 += 3;
        return (this.field2049[this.field2045 - 1] & 0xFF) + ((this.field2049[this.field2045 - 3] & 0xFF) << 16) + ((this.field2049[this.field2045 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dz.ad(I)I")
    public int method2457() {
        this.field2045 += 4;
        return (this.field2049[this.field2045 - 1] & 0xFF) + ((this.field2049[this.field2045 - 2] & 0xFF) << 8) + ((this.field2049[this.field2045 - 3] & 0xFF) << 16) + ((this.field2049[this.field2045 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dz.az(I)J")
    public long method2564() {
        long var1 = (long) this.method2457() & 0xFFFFFFFFL;
        long var3 = (long) this.method2457() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dz.ay(I)Ljava/lang/String;")
    public String method2591() {
        if (this.field2049[this.field2045] == 0) {
            this.field2045++;
            return null;
        } else {
            return this.method2460();
        }
    }

    @ObfuscatedName("dz.bh(B)Ljava/lang/String;")
    public String method2460() {
        int var1 = this.field2045;
        while (this.field2049[++this.field2045 - 1] != 0) {
        }
        int var2 = this.field2045 - var1 - 1;
        return var2 == 0 ? "" : class149.method28(this.field2049, var1, var2);
    }

    @ObfuscatedName("dz.ba(B)Ljava/lang/String;")
    public String method2538() {
        byte var1 = this.field2049[++this.field2045 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2045;
        while (this.field2049[++this.field2045 - 1] != 0) {
        }
        int var3 = this.field2045 - var2 - 1;
        return var3 == 0 ? "" : class149.method28(this.field2049, var2, var3);
    }

    @ObfuscatedName("dz.bn(B)Ljava/lang/String;")
    public String method2462() {
        byte var1 = this.field2049[++this.field2045 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2467();
        if (this.field2045 + var2 > this.field2049.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method2321(this.field2049, this.field2045, var2);
        this.field2045 += var2;
        return var3;
    }

    @ObfuscatedName("dz.bj([BIII)V")
    public void method2463(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2049[++this.field2045 - 1];
        }
    }

    @ObfuscatedName("dz.bu(B)I")
    public int method2464() {
        int var1 = this.field2049[this.field2045] & 0xFF;
        return var1 < 128 ? this.method2472() - 64 : this.method2615() - 49152;
    }

    @ObfuscatedName("dz.br(I)I")
    public int method2465() {
        int var1 = this.field2049[this.field2045] & 0xFF;
        return var1 < 128 ? this.method2472() : this.method2615() - 32768;
    }

    @ObfuscatedName("dz.bd(I)I")
    public int method2487() {
        return this.field2049[this.field2045] < 0 ? this.method2457() & Integer.MAX_VALUE : this.method2615();
    }

    @ObfuscatedName("dz.bf(I)I")
    public int method2467() {
        byte var1 = this.field2049[++this.field2045 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2049[++this.field2045 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dz.bg([IIII)V")
    public void method2584(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2045;
        this.field2045 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2457();
            int var8 = this.method2457();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2045 -= 8;
            this.method2441(var7);
            this.method2441(var8);
        }
        this.field2045 = var4;
    }

    @ObfuscatedName("dz.bp([IIII)V")
    public void method2469(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2045;
        this.field2045 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2457();
            int var8 = this.method2457();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2045 -= 8;
            this.method2441(var7);
            this.method2441(var8);
        }
        this.field2045 = var4;
    }

    @ObfuscatedName("dz.bb(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2519(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2045;
        this.field2045 = 0;
        byte[] var4 = new byte[var3];
        this.method2463(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2045 = 0;
        this.method2585(var7.length);
        this.method2609(var7, 0, var7.length);
    }

    @ObfuscatedName("dz.bc(IB)I")
    public int method2471(int arg0) {
        int var2 = method890(this.field2049, arg0, this.field2045);
        this.method2441(var2);
        return var2;
    }

    @ObfuscatedName("dz.by(I)Z")
    public boolean method2486() {
        this.field2045 -= 4;
        int var1 = method890(this.field2049, 0, this.field2045);
        int var2 = this.method2457();
        return var1 == var2;
    }

    @ObfuscatedName("dz.bw(II)V")
    public void method2452(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dz.bm(IB)V")
    public void method2474(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dz.bz(I)I")
    public int method2475() {
        return this.field2049[++this.field2045 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dz.bv(B)I")
    public int method2559() {
        return -this.field2049[++this.field2045 - 1] & 0xFF;
    }

    @ObfuscatedName("dz.bq(I)I")
    public int method2477() {
        return 128 - this.field2049[++this.field2045 - 1] & 0xFF;
    }

    @ObfuscatedName("dz.bk(S)B")
    public byte method2478() {
        return (byte) (this.field2049[++this.field2045 - 1] - 128);
    }

    @ObfuscatedName("dz.bo(S)B")
    public byte method2479() {
        return (byte) (128 - this.field2049[++this.field2045 - 1]);
    }

    @ObfuscatedName("dz.bs(IB)V")
    public void method2480(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) arg0;
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dz.bx(IB)V")
    public void method2481(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dz.bl(II)V")
    public void method2575(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 + 128);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dz.be(I)I")
    public int method2483() {
        this.field2045 += 2;
        return ((this.field2049[this.field2045 - 1] & 0xFF) << 8) + (this.field2049[this.field2045 - 2] & 0xFF);
    }

    @ObfuscatedName("dz.bi(B)I")
    public int method2484() {
        this.field2045 += 2;
        return ((this.field2049[this.field2045 - 2] & 0xFF) << 8) + (this.field2049[this.field2045 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dz.bt(B)I")
    public int method2593() {
        this.field2045 += 2;
        return ((this.field2049[this.field2045 - 1] & 0xFF) << 8) + (this.field2049[this.field2045 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dz.cd(B)I")
    public int method2572() {
        this.field2045 += 2;
        int var1 = ((this.field2049[this.field2045 - 1] & 0xFF) << 8) + (this.field2049[this.field2045 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dz.ca(B)I")
    public int method2503() {
        this.field2045 += 2;
        int var1 = ((this.field2049[this.field2045 - 1] & 0xFF) << 8) + (this.field2049[this.field2045 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dz.ck(II)V")
    public void method2482(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) arg0;
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dz.cq(IB)V")
    public void method2489(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) arg0;
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 16);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dz.cg(II)V")
    public void method2490(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
        this.field2049[++this.field2045 - 1] = (byte) arg0;
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 24);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dz.ct(IB)V")
    public void method2491(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 16);
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 24);
        this.field2049[++this.field2045 - 1] = (byte) arg0;
        this.field2049[++this.field2045 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dz.cc(I)I")
    public int method2436() {
        this.field2045 += 4;
        return (this.field2049[this.field2045 - 4] & 0xFF) + ((this.field2049[this.field2045 - 3] & 0xFF) << 8) + ((this.field2049[this.field2045 - 2] & 0xFF) << 16) + ((this.field2049[this.field2045 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dz.cx(B)I")
    public int method2563() {
        this.field2045 += 4;
        return (this.field2049[this.field2045 - 3] & 0xFF) + ((this.field2049[this.field2045 - 4] & 0xFF) << 8) + ((this.field2049[this.field2045 - 1] & 0xFF) << 16) + ((this.field2049[this.field2045 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dz.cu(I)I")
    public int method2494() {
        this.field2045 += 4;
        return (this.field2049[this.field2045 - 2] & 0xFF) + ((this.field2049[this.field2045 - 1] & 0xFF) << 8) + ((this.field2049[this.field2045 - 3] & 0xFF) << 24) + ((this.field2049[this.field2045 - 4] & 0xFF) << 16);
    }
}
