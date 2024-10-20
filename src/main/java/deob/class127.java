package deob;

import java.math.BigInteger;

@ObfuscatedName("dt")
public class class127 extends class179 {

    @ObfuscatedName("dt.n")
    public byte[] field2037;

    @ObfuscatedName("dt.l")
    public int field2038;

    @ObfuscatedName("dt.v")
    public static int[] field2039 = new int[256];

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
            field2039[var0] = var1;
        }
    }

    public class127(int arg0) {
        this.field2037 = class114.method2343(arg0);
        this.field2038 = 0;
    }

    public class127(byte[] arg0) {
        this.field2037 = arg0;
        this.field2038 = 0;
    }

    @ObfuscatedName("dt.z(IB)V")
    public void method2474(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dt.at(II)V")
    public void method2475(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2038 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dt.ay(II)V")
    public void method2476(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2038 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dt.ae(II)V")
    public void method2606(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2038 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dt.af(J)V")
    public void method2568(long arg0) {
        this.field2037[++this.field2038 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2037[++this.field2038 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2037[++this.field2038 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2037[++this.field2038 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2037[++this.field2038 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2037[++this.field2038 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2037[++this.field2038 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2037[++this.field2038 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cl.ao(Ljava/lang/String;I)I")
    public static int method1638(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dt.ad(Ljava/lang/String;B)V")
    public void method2479(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2038 += class149.method39(arg0, 0, arg0.length(), this.field2037, this.field2038);
        this.field2037[++this.field2038 - 1] = 0;
    }

    @ObfuscatedName("dt.aj(Ljava/lang/String;I)V")
    public void method2480(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2037[++this.field2038 - 1] = 0;
        this.field2038 += class149.method39(arg0, 0, arg0.length(), this.field2037, this.field2038);
        this.field2037[++this.field2038 - 1] = 0;
    }

    @ObfuscatedName("dt.ah(Ljava/lang/CharSequence;B)V")
    public void method2481(CharSequence arg0) {
        int var2 = class180.method1310(arg0);
        this.field2037[++this.field2038 - 1] = 0;
        this.method2478(var2);
        this.field2038 += class180.method3252(this.field2037, this.field2038, arg0);
    }

    @ObfuscatedName("dt.aq([BIII)V")
    public void method2482(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2037[++this.field2038 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dt.ar(IB)V")
    public void method2515(int arg0) {
        this.field2037[this.field2038 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2037[this.field2038 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2037[this.field2038 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2037[this.field2038 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dt.aa(IB)V")
    public void method2484(int arg0) {
        this.field2037[this.field2038 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2037[this.field2038 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dt.an(II)V")
    public void method2485(int arg0) {
        this.field2037[this.field2038 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dt.ab(IB)V")
    public void method2486(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2474(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2475(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dt.ai(II)V")
    public void method2478(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2474(arg0 >>> 28 | 0x80);
                    }
                    this.method2474(arg0 >>> 21 | 0x80);
                }
                this.method2474(arg0 >>> 14 | 0x80);
            }
            this.method2474(arg0 >>> 7 | 0x80);
        }
        this.method2474(arg0 & 0x7F);
    }

    @ObfuscatedName("dt.ac(I)I")
    public int method2659() {
        return this.field2037[++this.field2038 - 1] & 0xFF;
    }

    @ObfuscatedName("dt.ak(I)B")
    public byte method2656() {
        return this.field2037[++this.field2038 - 1];
    }

    @ObfuscatedName("dt.au(I)I")
    public int method2652() {
        this.field2038 += 2;
        return ((this.field2037[this.field2038 - 2] & 0xFF) << 8) + (this.field2037[this.field2038 - 1] & 0xFF);
    }

    @ObfuscatedName("dt.am(B)I")
    public int method2588() {
        this.field2038 += 2;
        int var1 = ((this.field2037[this.field2038 - 2] & 0xFF) << 8) + (this.field2037[this.field2038 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dt.ag(B)I")
    public int method2595() {
        this.field2038 += 3;
        return (this.field2037[this.field2038 - 1] & 0xFF) + ((this.field2037[this.field2038 - 3] & 0xFF) << 16) + ((this.field2037[this.field2038 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dt.al(I)I")
    public int method2551() {
        this.field2038 += 4;
        return (this.field2037[this.field2038 - 1] & 0xFF) + ((this.field2037[this.field2038 - 2] & 0xFF) << 8) + ((this.field2037[this.field2038 - 4] & 0xFF) << 24) + ((this.field2037[this.field2038 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dt.av(I)J")
    public long method2494() {
        long var1 = (long) this.method2551() & 0xFFFFFFFFL;
        long var3 = (long) this.method2551() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dt.aw(B)Ljava/lang/String;")
    public String method2555() {
        if (this.field2037[this.field2038] == 0) {
            this.field2038++;
            return null;
        } else {
            return this.method2490();
        }
    }

    @ObfuscatedName("dt.ax(I)Ljava/lang/String;")
    public String method2490() {
        int var1 = this.field2038;
        while (this.field2037[++this.field2038 - 1] != 0) {
        }
        int var2 = this.field2038 - var1 - 1;
        return var2 == 0 ? "" : class149.method105(this.field2037, var1, var2);
    }

    @ObfuscatedName("dt.az(I)Ljava/lang/String;")
    public String method2497() {
        byte var1 = this.field2037[++this.field2038 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2038;
        while (this.field2037[++this.field2038 - 1] != 0) {
        }
        int var3 = this.field2038 - var2 - 1;
        return var3 == 0 ? "" : class149.method105(this.field2037, var2, var3);
    }

    @ObfuscatedName("dt.ap(I)Ljava/lang/String;")
    public String method2528() {
        byte var1 = this.field2037[++this.field2038 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2503();
        if (this.field2038 + var2 > this.field2037.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method2468(this.field2037, this.field2038, var2);
        this.field2038 += var2;
        return var3;
    }

    @ObfuscatedName("dt.as([BIIB)V")
    public void method2637(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2037[++this.field2038 - 1];
        }
    }

    @ObfuscatedName("dt.bp(I)I")
    public int method2563() {
        int var1 = this.field2037[this.field2038] & 0xFF;
        return var1 < 128 ? this.method2659() - 64 : this.method2652() - 49152;
    }

    @ObfuscatedName("dt.bs(I)I")
    public int method2501() {
        int var1 = this.field2037[this.field2038] & 0xFF;
        return var1 < 128 ? this.method2659() : this.method2652() - 32768;
    }

    @ObfuscatedName("dt.be(I)I")
    public int method2582() {
        return this.field2037[this.field2038] < 0 ? this.method2551() & Integer.MAX_VALUE : this.method2652();
    }

    @ObfuscatedName("dt.ba(B)I")
    public int method2503() {
        byte var1 = this.field2037[++this.field2038 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2037[++this.field2038 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dt.bd([IIII)V")
    public void method2504(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2038;
        this.field2038 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2551();
            int var8 = this.method2551();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2038 -= 8;
            this.method2606(var7);
            this.method2606(var8);
        }
        this.field2038 = var4;
    }

    @ObfuscatedName("dt.bb([IIII)V")
    public void method2542(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2038;
        this.field2038 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2551();
            int var8 = this.method2551();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2038 -= 8;
            this.method2606(var7);
            this.method2606(var8);
        }
        this.field2038 = var4;
    }

    @ObfuscatedName("dt.bk(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2506(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2038;
        this.field2038 = 0;
        byte[] var4 = new byte[var3];
        this.method2637(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2038 = 0;
        this.method2475(var7.length);
        this.method2482(var7, 0, var7.length);
    }

    @ObfuscatedName("dt.bx(IS)I")
    public int method2686(int arg0) {
        byte[] var2 = this.field2037;
        int var3 = this.field2038;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2039[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2606(var6);
        return var6;
    }

    @ObfuscatedName("dt.bv(B)Z")
    public boolean method2508() {
        this.field2038 -= 4;
        byte[] var1 = this.field2037;
        int var2 = this.field2038;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2039[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2551();
        return var5 == var8;
    }

    @ObfuscatedName("dt.bq(II)V")
    public void method2509(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dt.bj(IB)V")
    public void method2634(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dt.bg(B)I")
    public int method2511() {
        return this.field2037[++this.field2038 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dt.bf(I)I")
    public int method2671() {
        return -this.field2037[++this.field2038 - 1] & 0xFF;
    }

    @ObfuscatedName("dt.bi(B)I")
    public int method2513() {
        return 128 - this.field2037[++this.field2038 - 1] & 0xFF;
    }

    @ObfuscatedName("dt.br(I)B")
    public byte method2514() {
        return (byte) (this.field2037[++this.field2038 - 1] - 128);
    }

    @ObfuscatedName("dt.by(B)B")
    public byte method2663() {
        return (byte) (-this.field2037[++this.field2038 - 1]);
    }

    @ObfuscatedName("dt.bh(B)B")
    public byte method2672() {
        return (byte) (128 - this.field2037[++this.field2038 - 1]);
    }

    @ObfuscatedName("dt.bm(II)V")
    public void method2553(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) arg0;
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dt.bu(II)V")
    public void method2518(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dt.bn(IB)V")
    public void method2519(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 + 128);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dt.bt(I)I")
    public int method2520() {
        this.field2038 += 2;
        return ((this.field2037[this.field2038 - 1] & 0xFF) << 8) + (this.field2037[this.field2038 - 2] & 0xFF);
    }

    @ObfuscatedName("dt.bl(I)I")
    public int method2571() {
        this.field2038 += 2;
        return ((this.field2037[this.field2038 - 2] & 0xFF) << 8) + (this.field2037[this.field2038 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dt.bo(B)I")
    public int method2522() {
        this.field2038 += 2;
        return ((this.field2037[this.field2038 - 1] & 0xFF) << 8) + (this.field2037[this.field2038 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dt.bw(I)I")
    public int method2523() {
        this.field2038 += 2;
        int var1 = ((this.field2037[this.field2038 - 1] & 0xFF) << 8) + (this.field2037[this.field2038 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dt.bz(I)I")
    public int method2524() {
        this.field2038 += 2;
        int var1 = ((this.field2037[this.field2038 - 2] & 0xFF) << 8) + (this.field2037[this.field2038 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dt.bc(II)V")
    public void method2525(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2038 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dt.ce(I)I")
    public int method2526() {
        this.field2038 += 3;
        return (this.field2037[this.field2038 - 2] & 0xFF) + ((this.field2037[this.field2038 - 3] & 0xFF) << 16) + ((this.field2037[this.field2038 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dt.cd(II)V")
    public void method2527(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) arg0;
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dt.cg(II)V")
    public void method2507(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2038 - 1] = (byte) arg0;
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dt.cl(II)V")
    public void method2529(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2038 - 1] = (byte) arg0;
        this.field2037[++this.field2038 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dt.cw(I)I")
    public int method2530() {
        this.field2038 += 4;
        return (this.field2037[this.field2038 - 4] & 0xFF) + ((this.field2037[this.field2038 - 3] & 0xFF) << 8) + ((this.field2037[this.field2038 - 1] & 0xFF) << 24) + ((this.field2037[this.field2038 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dt.ch(I)I")
    public int method2531() {
        this.field2038 += 4;
        return (this.field2037[this.field2038 - 3] & 0xFF) + ((this.field2037[this.field2038 - 4] & 0xFF) << 8) + ((this.field2037[this.field2038 - 2] & 0xFF) << 24) + ((this.field2037[this.field2038 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dt.ci(I)I")
    public int method2605() {
        this.field2038 += 4;
        return (this.field2037[this.field2038 - 2] & 0xFF) + ((this.field2037[this.field2038 - 1] & 0xFF) << 8) + ((this.field2037[this.field2038 - 3] & 0xFF) << 24) + ((this.field2037[this.field2038 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dt.cj([BIII)V")
    public void method2533(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2037[++this.field2038 - 1];
        }
    }

    @ObfuscatedName("dt.cu([BIII)V")
    public void method2534(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2037[++this.field2038 - 1] - 128);
        }
    }
}
