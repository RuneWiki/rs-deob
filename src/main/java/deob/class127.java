package deob;

import java.math.BigInteger;

@ObfuscatedName("dp")
public class class127 extends class179 {

    @ObfuscatedName("dp.k")
    public byte[] field2037;

    @ObfuscatedName("dp.n")
    public int field2036;

    @ObfuscatedName("dp.s")
    public static int[] field2038 = new int[256];

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
            field2038[var0] = var1;
        }
    }

    @ObfuscatedName("cy.h([BIIS)I")
    public static int method2053(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2038[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ae.q([BIB)I")
    public static int method685(byte[] arg0, int arg1) {
        return method2053(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2037 = class114.method2329(arg0);
        this.field2036 = 0;
    }

    public class127(byte[] arg0) {
        this.field2037 = arg0;
        this.field2036 = 0;
    }

    @ObfuscatedName("dp.g(II)V")
    public void method2444(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.e(II)V")
    public void method2445(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2036 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.as(II)V")
    public void method2446(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2036 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.an(II)V")
    public void method2563(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2036 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.aj(J)V")
    public void method2599(long arg0) {
        this.field2037[++this.field2036 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2037[++this.field2036 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2037[++this.field2036 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2037[++this.field2036 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2037[++this.field2036 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2037[++this.field2036 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2037[++this.field2036 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2037[++this.field2036 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cy.ax(Ljava/lang/String;I)I")
    public static int method2052(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dp.av(Ljava/lang/String;B)V")
    public void method2484(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2036 += class149.method1643(arg0, 0, arg0.length(), this.field2037, this.field2036);
        this.field2037[++this.field2036 - 1] = 0;
    }

    @ObfuscatedName("av.ae(Ljava/lang/String;I)I")
    public static int method628(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dp.am(Ljava/lang/String;I)V")
    public void method2450(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2037[++this.field2036 - 1] = 0;
        this.field2036 += class149.method1643(arg0, 0, arg0.length(), this.field2037, this.field2036);
        this.field2037[++this.field2036 - 1] = 0;
    }

    @ObfuscatedName("dp.aq(Ljava/lang/CharSequence;B)V")
    public void method2463(CharSequence arg0) {
        int var2 = class180.method5(arg0);
        this.field2037[++this.field2036 - 1] = 0;
        this.method2457(var2);
        int var3 = this.field2036;
        byte[] var4 = this.field2037;
        int var5 = this.field2036;
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
        this.field2036 = var10 + var3;
    }

    @ObfuscatedName("dp.at([BIII)V")
    public void method2452(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2037[++this.field2036 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dp.ac(II)V")
    public void method2490(int arg0) {
        this.field2037[this.field2036 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2037[this.field2036 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2037[this.field2036 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2037[this.field2036 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.al(II)V")
    public void method2454(int arg0) {
        this.field2037[this.field2036 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2037[this.field2036 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.ab(II)V")
    public void method2455(int arg0) {
        this.field2037[this.field2036 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.aa(II)V")
    public void method2456(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2444(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2445(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.ao(IB)V")
    public void method2457(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2444(arg0 >>> 28 | 0x80);
                    }
                    this.method2444(arg0 >>> 21 | 0x80);
                }
                this.method2444(arg0 >>> 14 | 0x80);
            }
            this.method2444(arg0 >>> 7 | 0x80);
        }
        this.method2444(arg0 & 0x7F);
    }

    @ObfuscatedName("dp.ah(B)I")
    public int method2534() {
        return this.field2037[++this.field2036 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.au(B)B")
    public byte method2459() {
        return this.field2037[++this.field2036 - 1];
    }

    @ObfuscatedName("dp.aw(I)I")
    public int method2460() {
        this.field2036 += 2;
        return ((this.field2037[this.field2036 - 2] & 0xFF) << 8) + (this.field2037[this.field2036 - 1] & 0xFF);
    }

    @ObfuscatedName("dp.az(I)I")
    public int method2461() {
        this.field2036 += 2;
        int var1 = ((this.field2037[this.field2036 - 2] & 0xFF) << 8) + (this.field2037[this.field2036 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.af(B)I")
    public int method2462() {
        this.field2036 += 3;
        return (this.field2037[this.field2036 - 1] & 0xFF) + ((this.field2037[this.field2036 - 2] & 0xFF) << 8) + ((this.field2037[this.field2036 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.ap(B)I")
    public int method2628() {
        this.field2036 += 4;
        return (this.field2037[this.field2036 - 1] & 0xFF) + ((this.field2037[this.field2036 - 2] & 0xFF) << 8) + ((this.field2037[this.field2036 - 4] & 0xFF) << 24) + ((this.field2037[this.field2036 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.ak(I)J")
    public long method2464() {
        long var1 = (long) this.method2628() & 0xFFFFFFFFL;
        long var3 = (long) this.method2628() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dp.ad(B)Ljava/lang/String;")
    public String method2514() {
        if (this.field2037[this.field2036] == 0) {
            this.field2036++;
            return null;
        } else {
            return this.method2466();
        }
    }

    @ObfuscatedName("dp.ag(I)Ljava/lang/String;")
    public String method2466() {
        int var1 = this.field2036;
        while (this.field2037[++this.field2036 - 1] != 0) {
        }
        int var2 = this.field2036 - var1 - 1;
        return var2 == 0 ? "" : class149.method630(this.field2037, var1, var2);
    }

    @ObfuscatedName("dp.ay(I)Ljava/lang/String;")
    public String method2467() {
        byte var1 = this.field2037[++this.field2036 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2036;
        while (this.field2037[++this.field2036 - 1] != 0) {
        }
        int var3 = this.field2036 - var2 - 1;
        return var3 == 0 ? "" : class149.method630(this.field2037, var2, var3);
    }

    @ObfuscatedName("dp.ai(B)Ljava/lang/String;")
    public String method2468() {
        byte var1 = this.field2037[++this.field2036 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2651();
        if (this.field2036 + var2 > this.field2037.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method24(this.field2037, this.field2036, var2);
        this.field2036 += var2;
        return var3;
    }

    @ObfuscatedName("dp.ar([BIII)V")
    public void method2469(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2037[++this.field2036 - 1];
        }
    }

    @ObfuscatedName("dp.br(I)I")
    public int method2470() {
        int var1 = this.field2037[this.field2036] & 0xFF;
        return var1 < 128 ? this.method2534() - 64 : this.method2460() - 49152;
    }

    @ObfuscatedName("dp.bd(I)I")
    public int method2637() {
        int var1 = this.field2037[this.field2036] & 0xFF;
        return var1 < 128 ? this.method2534() : this.method2460() - 32768;
    }

    @ObfuscatedName("dp.be(I)I")
    public int method2472() {
        return this.field2037[this.field2036] < 0 ? this.method2628() & Integer.MAX_VALUE : this.method2460();
    }

    @ObfuscatedName("dp.bl(I)I")
    public int method2651() {
        byte var1 = this.field2037[++this.field2036 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2037[++this.field2036 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dp.bi([IIII)V")
    public void method2586(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2036;
        this.field2036 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2628();
            int var8 = this.method2628();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2036 -= 8;
            this.method2563(var7);
            this.method2563(var8);
        }
        this.field2036 = var4;
    }

    @ObfuscatedName("dp.bh([IIII)V")
    public void method2596(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2036;
        this.field2036 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2628();
            int var8 = this.method2628();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2036 -= 8;
            this.method2563(var7);
            this.method2563(var8);
        }
        this.field2036 = var4;
    }

    @ObfuscatedName("dp.bq(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2560(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2036;
        this.field2036 = 0;
        byte[] var4 = new byte[var3];
        this.method2469(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2036 = 0;
        this.method2445(var7.length);
        this.method2452(var7, 0, var7.length);
    }

    @ObfuscatedName("dp.bj(IB)I")
    public int method2476(int arg0) {
        int var2 = method2053(this.field2037, arg0, this.field2036);
        this.method2563(var2);
        return var2;
    }

    @ObfuscatedName("dp.bw(B)Z")
    public boolean method2477() {
        this.field2036 -= 4;
        int var1 = method2053(this.field2037, 0, this.field2036);
        int var2 = this.method2628();
        return var1 == var2;
    }

    @ObfuscatedName("dp.bg(II)V")
    public void method2478(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.bx(II)V")
    public void method2647(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dp.bt(II)V")
    public void method2607(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dp.bo(B)I")
    public int method2481() {
        return this.field2037[++this.field2036 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dp.bz(B)I")
    public int method2482() {
        return -this.field2037[++this.field2036 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.bk(B)I")
    public int method2483() {
        return 128 - this.field2037[++this.field2036 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.bb(I)B")
    public byte method2518() {
        return (byte) (-this.field2037[++this.field2036 - 1]);
    }

    @ObfuscatedName("dp.bf(I)B")
    public byte method2485() {
        return (byte) (128 - this.field2037[++this.field2036 - 1]);
    }

    @ObfuscatedName("dp.by(IB)V")
    public void method2465(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) arg0;
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bm(IB)V")
    public void method2487(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.bc(IB)V")
    public void method2488(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 + 128);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bs(I)I")
    public int method2489() {
        this.field2036 += 2;
        return ((this.field2037[this.field2036 - 1] & 0xFF) << 8) + (this.field2037[this.field2036 - 2] & 0xFF);
    }

    @ObfuscatedName("dp.ba(I)I")
    public int method2600() {
        this.field2036 += 2;
        return ((this.field2037[this.field2036 - 2] & 0xFF) << 8) + (this.field2037[this.field2036 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bn(I)I")
    public int method2656() {
        this.field2036 += 2;
        return ((this.field2037[this.field2036 - 1] & 0xFF) << 8) + (this.field2037[this.field2036 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bp(I)I")
    public int method2492() {
        this.field2036 += 2;
        int var1 = ((this.field2037[this.field2036 - 1] & 0xFF) << 8) + (this.field2037[this.field2036 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bu(I)I")
    public int method2493() {
        this.field2036 += 2;
        int var1 = ((this.field2037[this.field2036 - 1] & 0xFF) << 8) + (this.field2037[this.field2036 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bv(I)I")
    public int method2494() {
        this.field2036 += 3;
        return (this.field2037[this.field2036 - 2] & 0xFF) + ((this.field2037[this.field2036 - 3] & 0xFF) << 16) + ((this.field2037[this.field2036 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dp.co(II)V")
    public void method2495(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) arg0;
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dp.cp(II)V")
    public void method2496(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2036 - 1] = (byte) arg0;
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.cs(IB)V")
    public void method2497(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2036 - 1] = (byte) arg0;
        this.field2037[++this.field2036 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.cd(I)I")
    public int method2498() {
        this.field2036 += 4;
        return (this.field2037[this.field2036 - 4] & 0xFF) + ((this.field2037[this.field2036 - 3] & 0xFF) << 8) + ((this.field2037[this.field2036 - 2] & 0xFF) << 16) + ((this.field2037[this.field2036 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.cb(I)I")
    public int method2648() {
        this.field2036 += 4;
        return (this.field2037[this.field2036 - 3] & 0xFF) + ((this.field2037[this.field2036 - 4] & 0xFF) << 8) + ((this.field2037[this.field2036 - 1] & 0xFF) << 16) + ((this.field2037[this.field2036 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.cx(I)I")
    public int method2500() {
        this.field2036 += 4;
        return (this.field2037[this.field2036 - 2] & 0xFF) + ((this.field2037[this.field2036 - 1] & 0xFF) << 8) + ((this.field2037[this.field2036 - 4] & 0xFF) << 16) + ((this.field2037[this.field2036 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.ca([BIIB)V")
    public void method2501(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2037[++this.field2036 - 1];
        }
    }

    @ObfuscatedName("dp.cz([BIIS)V")
    public void method2502(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2037[++this.field2036 - 1] - 128);
        }
    }
}
