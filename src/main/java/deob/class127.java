package deob;

import java.math.BigInteger;

@ObfuscatedName("dn")
public class class127 extends class179 {

    @ObfuscatedName("dn.p")
    public byte[] field2025;

    @ObfuscatedName("dn.e")
    public int field2022;

    @ObfuscatedName("dn.d")
    public static int[] field2023 = new int[256];

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
            field2023[var0] = var1;
        }
    }

    @ObfuscatedName("bp.m([BIII)I")
    public static int method1235(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2023[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("dc.b([BIB)I")
    public static int method2385(byte[] arg0, int arg1) {
        return method1235(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2025 = class114.method2310(arg0);
        this.field2022 = 0;
    }

    public class127(byte[] arg0) {
        this.field2025 = arg0;
        this.field2022 = 0;
    }

    @ObfuscatedName("dn.h(II)V")
    public void method2482(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.n(IB)V")
    public void method2428(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2022 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.s(IB)V")
    public void method2625(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2022 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.c(II)V")
    public void method2430(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 24);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2022 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.am(J)V")
    public void method2431(long arg0) {
        this.field2025[++this.field2022 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2025[++this.field2022 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2025[++this.field2022 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2025[++this.field2022 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2025[++this.field2022 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2025[++this.field2022 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2025[++this.field2022 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2025[++this.field2022 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dn.ap(Ljava/lang/String;B)V")
    public void method2432(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2022 += class149.method124(arg0, 0, arg0.length(), this.field2025, this.field2022);
        this.field2025[++this.field2022 - 1] = 0;
    }

    @ObfuscatedName("bo.au(Ljava/lang/String;B)I")
    public static int method1412(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dn.ab(Ljava/lang/String;I)V")
    public void method2433(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2025[++this.field2022 - 1] = 0;
        this.field2022 += class149.method124(arg0, 0, arg0.length(), this.field2025, this.field2022);
        this.field2025[++this.field2022 - 1] = 0;
    }

    @ObfuscatedName("dn.ae(Ljava/lang/CharSequence;I)V")
    public void method2434(CharSequence arg0) {
        int var2 = class180.method2350(arg0);
        this.field2025[++this.field2022 - 1] = 0;
        this.method2452(var2);
        int var3 = this.field2022;
        byte[] var4 = this.field2025;
        int var5 = this.field2022;
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
        this.field2022 = var10 + var3;
    }

    @ObfuscatedName("dn.as([BIII)V")
    public void method2435(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2025[++this.field2022 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dn.av(IB)V")
    public void method2552(int arg0) {
        this.field2025[this.field2022 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2025[this.field2022 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2025[this.field2022 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2025[this.field2022 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.ar(II)V")
    public void method2437(int arg0) {
        this.field2025[this.field2022 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2025[this.field2022 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.ad(II)V")
    public void method2438(int arg0) {
        this.field2025[this.field2022 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.ac(II)V")
    public void method2516(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2482(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2428(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dn.ax(II)V")
    public void method2452(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2482(arg0 >>> 28 | 0x80);
                    }
                    this.method2482(arg0 >>> 21 | 0x80);
                }
                this.method2482(arg0 >>> 14 | 0x80);
            }
            this.method2482(arg0 >>> 7 | 0x80);
        }
        this.method2482(arg0 & 0x7F);
    }

    @ObfuscatedName("dn.ao(I)I")
    public int method2441() {
        return this.field2025[++this.field2022 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.aj(I)B")
    public byte method2442() {
        return this.field2025[++this.field2022 - 1];
    }

    @ObfuscatedName("dn.al(I)I")
    public int method2609() {
        this.field2022 += 2;
        return ((this.field2025[this.field2022 - 2] & 0xFF) << 8) + (this.field2025[this.field2022 - 1] & 0xFF);
    }

    @ObfuscatedName("dn.ak(B)I")
    public int method2495() {
        this.field2022 += 2;
        int var1 = ((this.field2025[this.field2022 - 2] & 0xFF) << 8) + (this.field2025[this.field2022 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.ag(S)I")
    public int method2461() {
        this.field2022 += 3;
        return (this.field2025[this.field2022 - 1] & 0xFF) + ((this.field2025[this.field2022 - 2] & 0xFF) << 8) + ((this.field2025[this.field2022 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dn.ah(I)I")
    public int method2446() {
        this.field2022 += 4;
        return (this.field2025[this.field2022 - 1] & 0xFF) + ((this.field2025[this.field2022 - 2] & 0xFF) << 8) + ((this.field2025[this.field2022 - 4] & 0xFF) << 24) + ((this.field2025[this.field2022 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dn.ay(I)J")
    public long method2575() {
        long var1 = (long) this.method2446() & 0xFFFFFFFFL;
        long var3 = (long) this.method2446() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dn.an(I)Ljava/lang/String;")
    public String method2607() {
        if (this.field2025[this.field2022] == 0) {
            this.field2022++;
            return null;
        } else {
            return this.method2449();
        }
    }

    @ObfuscatedName("dn.aq(I)Ljava/lang/String;")
    public String method2449() {
        int var1 = this.field2022;
        while (this.field2025[++this.field2022 - 1] != 0) {
        }
        int var2 = this.field2022 - var1 - 1;
        return var2 == 0 ? "" : class149.method2313(this.field2025, var1, var2);
    }

    @ObfuscatedName("dn.af(I)Ljava/lang/String;")
    public String method2520() {
        byte var1 = this.field2025[++this.field2022 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2022;
        while (this.field2025[++this.field2022 - 1] != 0) {
        }
        int var3 = this.field2022 - var2 - 1;
        return var3 == 0 ? "" : class149.method2313(this.field2025, var2, var3);
    }

    @ObfuscatedName("dn.aw(I)Ljava/lang/String;")
    public String method2451() {
        byte var1 = this.field2025[++this.field2022 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2456();
        if (this.field2022 + var2 > this.field2025.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method2884(this.field2025, this.field2022, var2);
        this.field2022 += var2;
        return var3;
    }

    @ObfuscatedName("dn.at([BIIB)V")
    public void method2497(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2025[++this.field2022 - 1];
        }
    }

    @ObfuscatedName("dn.aa(I)I")
    public int method2508() {
        int var1 = this.field2025[this.field2022] & 0xFF;
        return var1 < 128 ? this.method2441() - 64 : this.method2609() - 49152;
    }

    @ObfuscatedName("dn.ai(I)I")
    public int method2454() {
        int var1 = this.field2025[this.field2022] & 0xFF;
        return var1 < 128 ? this.method2441() : this.method2609() - 32768;
    }

    @ObfuscatedName("dn.az(B)I")
    public int method2455() {
        return this.field2025[this.field2022] < 0 ? this.method2446() & Integer.MAX_VALUE : this.method2609();
    }

    @ObfuscatedName("dn.bz(B)I")
    public int method2456() {
        byte var1 = this.field2025[++this.field2022 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2025[++this.field2022 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dn.by([IIII)V")
    public void method2457(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2022;
        this.field2022 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2446();
            int var8 = this.method2446();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2022 -= 8;
            this.method2430(var7);
            this.method2430(var8);
        }
        this.field2022 = var4;
    }

    @ObfuscatedName("dn.bp([IIII)V")
    public void method2604(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2022;
        this.field2022 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2446();
            int var8 = this.method2446();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2022 -= 8;
            this.method2430(var7);
            this.method2430(var8);
        }
        this.field2022 = var4;
    }

    @ObfuscatedName("dn.bg(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2459(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2022;
        this.field2022 = 0;
        byte[] var4 = new byte[var3];
        this.method2497(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2022 = 0;
        this.method2428(var7.length);
        this.method2435(var7, 0, var7.length);
    }

    @ObfuscatedName("dn.bk(II)I")
    public int method2579(int arg0) {
        int var2 = method1235(this.field2025, arg0, this.field2022);
        this.method2430(var2);
        return var2;
    }

    @ObfuscatedName("dn.be(I)Z")
    public boolean method2460() {
        this.field2022 -= 4;
        int var1 = method1235(this.field2025, 0, this.field2022);
        int var2 = this.method2446();
        return var1 == var2;
    }

    @ObfuscatedName("dn.bc(IB)V")
    public void method2540(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dn.bd(IB)V")
    public void method2426(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dn.bf(II)V")
    public void method2463(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dn.bl(B)I")
    public int method2464() {
        return this.field2025[++this.field2022 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dn.bx(I)I")
    public int method2465() {
        return -this.field2025[++this.field2022 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.bh(B)I")
    public int method2466() {
        return 128 - this.field2025[++this.field2022 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.bu(S)B")
    public byte method2467() {
        return (byte) (this.field2025[++this.field2022 - 1] - 128);
    }

    @ObfuscatedName("dn.bi(I)B")
    public byte method2468() {
        return (byte) (-this.field2025[++this.field2022 - 1]);
    }

    @ObfuscatedName("dn.bb(I)B")
    public byte method2469() {
        return (byte) (128 - this.field2025[++this.field2022 - 1]);
    }

    @ObfuscatedName("dn.bq(II)V")
    public void method2581(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) arg0;
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.bs(IS)V")
    public void method2471(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dn.ba(II)V")
    public void method2472(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 + 128);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.bt(B)I")
    public int method2473() {
        this.field2022 += 2;
        return ((this.field2025[this.field2022 - 1] & 0xFF) << 8) + (this.field2025[this.field2022 - 2] & 0xFF);
    }

    @ObfuscatedName("dn.bo(B)I")
    public int method2494() {
        this.field2022 += 2;
        return ((this.field2025[this.field2022 - 2] & 0xFF) << 8) + (this.field2025[this.field2022 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dn.bv(B)I")
    public int method2475() {
        this.field2022 += 2;
        return ((this.field2025[this.field2022 - 1] & 0xFF) << 8) + (this.field2025[this.field2022 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dn.bw(I)I")
    public int method2476() {
        this.field2022 += 2;
        int var1 = ((this.field2025[this.field2022 - 1] & 0xFF) << 8) + (this.field2025[this.field2022 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.bn(I)I")
    public int method2477() {
        this.field2022 += 2;
        int var1 = ((this.field2025[this.field2022 - 2] & 0xFF) << 8) + (this.field2025[this.field2022 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.bj(II)V")
    public void method2521(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) arg0;
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dn.bm(IB)V")
    public void method2479(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) arg0;
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dn.br(IB)V")
    public void method2480(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2022 - 1] = (byte) arg0;
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 24);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dn.cw(II)V")
    public void method2481(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 24);
        this.field2025[++this.field2022 - 1] = (byte) arg0;
        this.field2025[++this.field2022 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.cf(B)I")
    public int method2620() {
        this.field2022 += 4;
        return (this.field2025[this.field2022 - 4] & 0xFF) + ((this.field2025[this.field2022 - 3] & 0xFF) << 8) + ((this.field2025[this.field2022 - 2] & 0xFF) << 16) + ((this.field2025[this.field2022 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dn.cc(B)I")
    public int method2447() {
        this.field2022 += 4;
        return (this.field2025[this.field2022 - 3] & 0xFF) + ((this.field2025[this.field2022 - 4] & 0xFF) << 8) + ((this.field2025[this.field2022 - 1] & 0xFF) << 16) + ((this.field2025[this.field2022 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dn.cn(I)I")
    public int method2474() {
        this.field2022 += 4;
        return (this.field2025[this.field2022 - 2] & 0xFF) + ((this.field2025[this.field2022 - 1] & 0xFF) << 8) + ((this.field2025[this.field2022 - 3] & 0xFF) << 24) + ((this.field2025[this.field2022 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dn.ca([BIIB)V")
    public void method2485(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2025[++this.field2022 - 1] - 128);
        }
    }
}
