package deob;

import java.math.BigInteger;

@ObfuscatedName("ds")
public class class127 extends class179 {

    @ObfuscatedName("ds.x")
    public byte[] field2036;

    @ObfuscatedName("ds.o")
    public int field2030;

    @ObfuscatedName("ds.a")
    public static int[] field2031 = new int[256];

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
            field2031[var0] = var1;
        }
    }

    @ObfuscatedName("n.ap([BIB)I")
    public static int method134(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2031[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class127(int arg0) {
        this.field2036 = class114.method2347(arg0);
        this.field2030 = 0;
    }

    public class127(byte[] arg0) {
        this.field2036 = arg0;
        this.field2030 = 0;
    }

    @ObfuscatedName("ds.ah(II)V")
    public void method2484(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.at(II)V")
    public void method2485(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2030 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.aa(IB)V")
    public void method2486(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 16);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2030 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.ae(II)V")
    public void method2487(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 24);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 16);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2030 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.aw(J)V")
    public void method2510(long arg0) {
        this.field2036[++this.field2030 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2036[++this.field2030 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2036[++this.field2030 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2036[++this.field2030 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2036[++this.field2030 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2036[++this.field2030 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2036[++this.field2030 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2036[++this.field2030 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ds.ar(Ljava/lang/String;I)V")
    public void method2682(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2030 += class150.method836(arg0, 0, arg0.length(), this.field2036, this.field2030);
        this.field2036[++this.field2030 - 1] = 0;
    }

    @ObfuscatedName("dn.ai(Ljava/lang/String;I)I")
    public static int method2428(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ds.au(Ljava/lang/String;I)V")
    public void method2490(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2036[++this.field2030 - 1] = 0;
        this.field2030 += class150.method836(arg0, 0, arg0.length(), this.field2036, this.field2030);
        this.field2036[++this.field2030 - 1] = 0;
    }

    @ObfuscatedName("ds.ay(Ljava/lang/CharSequence;B)V")
    public void method2491(CharSequence arg0) {
        int var2 = Statics.method2349(arg0);
        this.field2036[++this.field2030 - 1] = 0;
        this.method2497(var2);
        int var3 = this.field2030;
        byte[] var4 = this.field2036;
        int var5 = this.field2030;
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
        this.field2030 = var10 + var3;
    }

    @ObfuscatedName("ds.an([BIII)V")
    public void method2492(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2036[++this.field2030 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ds.al(IB)V")
    public void method2493(int arg0) {
        this.field2036[this.field2030 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2036[this.field2030 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2036[this.field2030 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2036[this.field2030 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.as(II)V")
    public void method2494(int arg0) {
        this.field2036[this.field2030 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2036[this.field2030 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.az(II)V")
    public void method2518(int arg0) {
        this.field2036[this.field2030 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.aq(II)V")
    public void method2574(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2484(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2485(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.ag(IB)V")
    public void method2497(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2484(arg0 >>> 28 | 0x80);
                    }
                    this.method2484(arg0 >>> 21 | 0x80);
                }
                this.method2484(arg0 >>> 14 | 0x80);
            }
            this.method2484(arg0 >>> 7 | 0x80);
        }
        this.method2484(arg0 & 0x7F);
    }

    @ObfuscatedName("ds.aj(I)I")
    public int method2498() {
        return this.field2036[++this.field2030 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.ak(I)B")
    public byte method2499() {
        return this.field2036[++this.field2030 - 1];
    }

    @ObfuscatedName("ds.ac(B)I")
    public int method2581() {
        this.field2030 += 2;
        return ((this.field2036[this.field2030 - 2] & 0xFF) << 8) + (this.field2036[this.field2030 - 1] & 0xFF);
    }

    @ObfuscatedName("ds.ab(B)I")
    public int method2542() {
        this.field2030 += 2;
        int var1 = ((this.field2036[this.field2030 - 2] & 0xFF) << 8) + (this.field2036[this.field2030 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.ax(I)I")
    public int method2502() {
        this.field2030 += 3;
        return (this.field2036[this.field2030 - 1] & 0xFF) + ((this.field2036[this.field2030 - 2] & 0xFF) << 8) + ((this.field2036[this.field2030 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.av(B)I")
    public int method2489() {
        this.field2030 += 4;
        return (this.field2036[this.field2030 - 1] & 0xFF) + ((this.field2036[this.field2030 - 2] & 0xFF) << 8) + ((this.field2036[this.field2030 - 4] & 0xFF) << 24) + ((this.field2036[this.field2030 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.ad(I)J")
    public long method2673() {
        long var1 = (long) this.method2489() & 0xFFFFFFFFL;
        long var3 = (long) this.method2489() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ds.am(B)Ljava/lang/String;")
    public String method2505() {
        if (this.field2036[this.field2030] == 0) {
            this.field2030++;
            return null;
        } else {
            return this.method2506();
        }
    }

    @ObfuscatedName("ds.ao(I)Ljava/lang/String;")
    public String method2506() {
        int var1 = this.field2030;
        while (this.field2036[++this.field2030 - 1] != 0) {
        }
        int var2 = this.field2030 - var1 - 1;
        return var2 == 0 ? "" : class150.method2756(this.field2036, var1, var2);
    }

    @ObfuscatedName("ds.bo(I)Ljava/lang/String;")
    public String method2653() {
        byte var1 = this.field2036[++this.field2030 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2030;
        while (this.field2036[++this.field2030 - 1] != 0) {
        }
        int var3 = this.field2030 - var2 - 1;
        return var3 == 0 ? "" : class150.method2756(this.field2036, var2, var3);
    }

    @ObfuscatedName("ds.bj(B)Ljava/lang/String;")
    public String method2508() {
        byte var1 = this.field2036[++this.field2030 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2612();
        if (this.field2030 + var2 > this.field2036.length) {
            throw new IllegalStateException("");
        }
        String var3 = Statics.method1598(this.field2036, this.field2030, var2);
        this.field2030 += var2;
        return var3;
    }

    @ObfuscatedName("ds.bg([BIIB)V")
    public void method2504(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2036[++this.field2030 - 1];
        }
    }

    @ObfuscatedName("ds.bb(B)I")
    public int method2529() {
        int var1 = this.field2036[this.field2030] & 0xFF;
        return var1 < 128 ? this.method2498() - 64 : this.method2581() - 49152;
    }

    @ObfuscatedName("ds.bf(I)I")
    public int method2511() {
        int var1 = this.field2036[this.field2030] & 0xFF;
        return var1 < 128 ? this.method2498() : this.method2581() - 32768;
    }

    @ObfuscatedName("ds.bd(B)I")
    public int method2512() {
        return this.field2036[this.field2030] < 0 ? this.method2489() & Integer.MAX_VALUE : this.method2581();
    }

    @ObfuscatedName("ds.br(B)I")
    public int method2612() {
        byte var1 = this.field2036[++this.field2030 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2036[++this.field2030 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ds.bu([IIII)V")
    public void method2514(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2030;
        this.field2030 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2489();
            int var8 = this.method2489();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2030 -= 8;
            this.method2487(var7);
            this.method2487(var8);
        }
        this.field2030 = var4;
    }

    @ObfuscatedName("ds.bl([IIII)V")
    public void method2515(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2030;
        this.field2030 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2489();
            int var8 = this.method2489();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2030 -= 8;
            this.method2487(var7);
            this.method2487(var8);
        }
        this.field2030 = var4;
    }

    @ObfuscatedName("ds.bw(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2516(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2030;
        this.field2030 = 0;
        byte[] var4 = new byte[var3];
        this.method2504(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2030 = 0;
        this.method2485(var7.length);
        this.method2492(var7, 0, var7.length);
    }

    @ObfuscatedName("ds.bx(II)I")
    public int method2509(int arg0) {
        byte[] var2 = this.field2036;
        int var3 = this.field2030;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2031[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2487(var6);
        return var6;
    }

    @ObfuscatedName("ds.bn(B)Z")
    public boolean method2513() {
        this.field2030 -= 4;
        byte[] var1 = this.field2036;
        int var2 = this.field2030;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2031[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2489();
        return var5 == var8;
    }

    @ObfuscatedName("ds.be(IB)V")
    public void method2519(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ds.by(I)I")
    public int method2615() {
        return this.field2036[++this.field2030 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ds.bq(I)I")
    public int method2521() {
        return -this.field2036[++this.field2030 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.bi(B)I")
    public int method2624() {
        return 128 - this.field2036[++this.field2030 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.bt(I)B")
    public byte method2523() {
        return (byte) (this.field2036[++this.field2030 - 1] - 128);
    }

    @ObfuscatedName("ds.bk(I)B")
    public byte method2524() {
        return (byte) (-this.field2036[++this.field2030 - 1]);
    }

    @ObfuscatedName("ds.bp(I)B")
    public byte method2525() {
        return (byte) (128 - this.field2036[++this.field2030 - 1]);
    }

    @ObfuscatedName("ds.bv(II)V")
    public void method2526(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) arg0;
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.ba(IS)V")
    public void method2550(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.bc(II)V")
    public void method2528(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (arg0 + 128);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bm(I)I")
    public int method2555() {
        this.field2030 += 2;
        return ((this.field2036[this.field2030 - 1] & 0xFF) << 8) + (this.field2036[this.field2030 - 2] & 0xFF);
    }

    @ObfuscatedName("ds.bs(I)I")
    public int method2530() {
        this.field2030 += 2;
        return ((this.field2036[this.field2030 - 2] & 0xFF) << 8) + (this.field2036[this.field2030 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.bz(I)I")
    public int method2531() {
        this.field2030 += 2;
        return ((this.field2036[this.field2030 - 1] & 0xFF) << 8) + (this.field2036[this.field2030 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.bh(I)I")
    public int method2501() {
        this.field2030 += 2;
        int var1 = ((this.field2036[this.field2030 - 1] & 0xFF) << 8) + (this.field2036[this.field2030 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.co(I)I")
    public int method2533() {
        this.field2030 += 3;
        return (this.field2036[this.field2030 - 1] & 0xFF) + ((this.field2036[this.field2030 - 3] & 0xFF) << 8) + ((this.field2036[this.field2030 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.cd(II)V")
    public void method2534(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) arg0;
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 16);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ds.cb(II)V")
    public void method2535(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
        this.field2036[++this.field2030 - 1] = (byte) arg0;
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 24);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ds.cj(IB)V")
    public void method2536(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 16);
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 24);
        this.field2036[++this.field2030 - 1] = (byte) arg0;
        this.field2036[++this.field2030 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.ce(I)I")
    public int method2685() {
        this.field2030 += 4;
        return (this.field2036[this.field2030 - 4] & 0xFF) + ((this.field2036[this.field2030 - 3] & 0xFF) << 8) + ((this.field2036[this.field2030 - 2] & 0xFF) << 16) + ((this.field2036[this.field2030 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ds.cu(I)I")
    public int method2594() {
        this.field2030 += 4;
        return (this.field2036[this.field2030 - 3] & 0xFF) + ((this.field2036[this.field2030 - 4] & 0xFF) << 8) + ((this.field2036[this.field2030 - 2] & 0xFF) << 24) + ((this.field2036[this.field2030 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.cz(I)I")
    public int method2539() {
        this.field2030 += 4;
        return (this.field2036[this.field2030 - 2] & 0xFF) + ((this.field2036[this.field2030 - 1] & 0xFF) << 8) + ((this.field2036[this.field2030 - 3] & 0xFF) << 24) + ((this.field2036[this.field2030 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.cv([BIII)V")
    public void method2540(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2036[++this.field2030 - 1];
        }
    }
}
