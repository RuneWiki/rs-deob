package deob;

import java.math.BigInteger;

@ObfuscatedName("dr")
public class class127 extends class179 {

    @ObfuscatedName("dr.r")
    public byte[] field2028;

    @ObfuscatedName("dr.n")
    public int field2023;

    @ObfuscatedName("dr.i")
    public static int[] field2027 = new int[256];

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
            field2027[var0] = var1;
        }
    }

    @ObfuscatedName("y.k([BIII)I")
    public static int method194(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2027[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("dc.a([BIB)I")
    public static int method2284(byte[] arg0, int arg1) {
        return method194(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2028 = Statics.method2286(arg0);
        this.field2023 = 0;
    }

    public class127(byte[] arg0) {
        this.field2028 = arg0;
        this.field2023 = 0;
    }

    @ObfuscatedName("dr.y(II)V")
    public void method2498(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.q(IB)V")
    public void method2401(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
        this.field2028[++this.field2023 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.c(II)V")
    public void method2402(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 16);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
        this.field2028[++this.field2023 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.u(II)V")
    public void method2448(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 24);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 16);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
        this.field2028[++this.field2023 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.ah(J)V")
    public void method2484(long arg0) {
        this.field2028[++this.field2023 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2028[++this.field2023 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2028[++this.field2023 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2028[++this.field2023 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2028[++this.field2023 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2028[++this.field2023 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2028[++this.field2023 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2028[++this.field2023 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dr.au(Ljava/lang/String;I)V")
    public void method2465(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2023 += class149.method2297(arg0, 0, arg0.length(), this.field2028, this.field2023);
        this.field2028[++this.field2023 - 1] = 0;
    }

    @ObfuscatedName("dr.ae(Ljava/lang/String;I)V")
    public void method2406(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2028[++this.field2023 - 1] = 0;
        this.field2023 += class149.method2297(arg0, 0, arg0.length(), this.field2028, this.field2023);
        this.field2028[++this.field2023 - 1] = 0;
    }

    @ObfuscatedName("dr.aa(Ljava/lang/CharSequence;I)V")
    public void method2407(CharSequence arg0) {
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
        this.field2028[++this.field2023 - 1] = 0;
        this.method2413(var3);
        this.field2023 += class180.method3132(this.field2028, this.field2023, arg0);
    }

    @ObfuscatedName("dr.av([BIII)V")
    public void method2408(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2028[++this.field2023 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dr.aq(II)V")
    public void method2403(int arg0) {
        this.field2028[this.field2023 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2028[this.field2023 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2028[this.field2023 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2028[this.field2023 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.ak(IS)V")
    public void method2410(int arg0) {
        this.field2028[this.field2023 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2028[this.field2023 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.ad(IB)V")
    public void method2411(int arg0) {
        this.field2028[this.field2023 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.at(IS)V")
    public void method2492(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2498(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2401(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.an(II)V")
    public void method2413(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2498(arg0 >>> 28 | 0x80);
                    }
                    this.method2498(arg0 >>> 21 | 0x80);
                }
                this.method2498(arg0 >>> 14 | 0x80);
            }
            this.method2498(arg0 >>> 7 | 0x80);
        }
        this.method2498(arg0 & 0x7F);
    }

    @ObfuscatedName("dr.aw(S)I")
    public int method2414() {
        return this.field2028[++this.field2023 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.am(I)B")
    public byte method2415() {
        return this.field2028[++this.field2023 - 1];
    }

    @ObfuscatedName("dr.af(I)I")
    public int method2416() {
        this.field2023 += 2;
        return ((this.field2028[this.field2023 - 2] & 0xFF) << 8) + (this.field2028[this.field2023 - 1] & 0xFF);
    }

    @ObfuscatedName("dr.as(B)I")
    public int method2480() {
        this.field2023 += 2;
        int var1 = ((this.field2028[this.field2023 - 2] & 0xFF) << 8) + (this.field2028[this.field2023 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.ao(B)I")
    public int method2479() {
        this.field2023 += 3;
        return (this.field2028[this.field2023 - 1] & 0xFF) + ((this.field2028[this.field2023 - 2] & 0xFF) << 8) + ((this.field2028[this.field2023 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.ab(I)I")
    public int method2430() {
        this.field2023 += 4;
        return (this.field2028[this.field2023 - 1] & 0xFF) + ((this.field2028[this.field2023 - 2] & 0xFF) << 8) + ((this.field2028[this.field2023 - 3] & 0xFF) << 16) + ((this.field2028[this.field2023 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dr.ay(S)J")
    public long method2420() {
        long var1 = (long) this.method2430() & 0xFFFFFFFFL;
        long var3 = (long) this.method2430() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dr.ar(I)Ljava/lang/String;")
    public String method2421() {
        if (this.field2028[this.field2023] == 0) {
            this.field2023++;
            return null;
        } else {
            return this.method2422();
        }
    }

    @ObfuscatedName("dr.aj(I)Ljava/lang/String;")
    public String method2422() {
        int var1 = this.field2023;
        while (this.field2028[++this.field2023 - 1] != 0) {
        }
        int var2 = this.field2023 - var1 - 1;
        return var2 == 0 ? "" : class149.method1644(this.field2028, var1, var2);
    }

    @ObfuscatedName("dr.ai(I)Ljava/lang/String;")
    public String method2423() {
        byte var1 = this.field2028[++this.field2023 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2023;
        while (this.field2028[++this.field2023 - 1] != 0) {
        }
        int var3 = this.field2023 - var2 - 1;
        return var3 == 0 ? "" : class149.method1644(this.field2028, var2, var3);
    }

    @ObfuscatedName("dr.ax(I)Ljava/lang/String;")
    public String method2424() {
        byte var1 = this.field2028[++this.field2023 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2429();
        if (this.field2023 + var2 > this.field2028.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method106(this.field2028, this.field2023, var2);
        this.field2023 += var2;
        return var3;
    }

    @ObfuscatedName("dr.al([BIIS)V")
    public void method2425(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2028[++this.field2023 - 1];
        }
    }

    @ObfuscatedName("dr.ag(I)I")
    public int method2426() {
        int var1 = this.field2028[this.field2023] & 0xFF;
        return var1 < 128 ? this.method2414() - 64 : this.method2416() - 49152;
    }

    @ObfuscatedName("dr.ap(B)I")
    public int method2427() {
        int var1 = this.field2028[this.field2023] & 0xFF;
        return var1 < 128 ? this.method2414() : this.method2416() - 32768;
    }

    @ObfuscatedName("dr.ac(I)I")
    public int method2443() {
        return this.field2028[this.field2023] < 0 ? this.method2430() & Integer.MAX_VALUE : this.method2416();
    }

    @ObfuscatedName("dr.bp(I)I")
    public int method2429() {
        byte var1 = this.field2028[++this.field2023 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2028[++this.field2023 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dr.bm([IIIB)V")
    public void method2539(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2023;
        this.field2023 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2430();
            int var8 = this.method2430();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2023 -= 8;
            this.method2448(var7);
            this.method2448(var8);
        }
        this.field2023 = var4;
    }

    @ObfuscatedName("dr.ba([IIII)V")
    public void method2467(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2023;
        this.field2023 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2430();
            int var8 = this.method2430();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2023 -= 8;
            this.method2448(var7);
            this.method2448(var8);
        }
        this.field2023 = var4;
    }

    @ObfuscatedName("dr.bx(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2432(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2023;
        this.field2023 = 0;
        byte[] var4 = new byte[var3];
        this.method2425(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2023 = 0;
        this.method2401(var7.length);
        this.method2408(var7, 0, var7.length);
    }

    @ObfuscatedName("dr.bn(II)I")
    public int method2433(int arg0) {
        int var2 = method194(this.field2028, arg0, this.field2023);
        this.method2448(var2);
        return var2;
    }

    @ObfuscatedName("dr.be(B)Z")
    public boolean method2434() {
        this.field2023 -= 4;
        int var1 = method194(this.field2028, 0, this.field2023);
        int var2 = this.method2430();
        return var1 == var2;
    }

    @ObfuscatedName("dr.bs(IB)V")
    public void method2435(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dr.bk(II)V")
    public void method2598(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dr.bu(II)V")
    public void method2437(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dr.by(B)I")
    public int method2438() {
        return this.field2028[++this.field2023 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dr.bd(I)I")
    public int method2439() {
        return -this.field2028[++this.field2023 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.bq(B)I")
    public int method2440() {
        return 128 - this.field2028[++this.field2023 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.bt(I)B")
    public byte method2441() {
        return (byte) (this.field2028[++this.field2023 - 1] - 128);
    }

    @ObfuscatedName("dr.br(I)B")
    public byte method2442() {
        return (byte) (-this.field2028[++this.field2023 - 1]);
    }

    @ObfuscatedName("dr.bg(B)B")
    public byte method2476() {
        return (byte) (128 - this.field2028[++this.field2023 - 1]);
    }

    @ObfuscatedName("dr.bf(II)V")
    public void method2444(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) arg0;
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bi(II)V")
    public void method2445(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dr.bz(II)V")
    public void method2568(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 + 128);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bl(I)I")
    public int method2447() {
        this.field2023 += 2;
        return ((this.field2028[this.field2023 - 1] & 0xFF) << 8) + (this.field2028[this.field2023 - 2] & 0xFF);
    }

    @ObfuscatedName("dr.bj(B)I")
    public int method2419() {
        this.field2023 += 2;
        return ((this.field2028[this.field2023 - 2] & 0xFF) << 8) + (this.field2028[this.field2023 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dr.bo(I)I")
    public int method2493() {
        this.field2023 += 2;
        return ((this.field2028[this.field2023 - 1] & 0xFF) << 8) + (this.field2028[this.field2023 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dr.bc(I)I")
    public int method2450() {
        this.field2023 += 2;
        int var1 = ((this.field2028[this.field2023 - 2] & 0xFF) << 8) + (this.field2028[this.field2023 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.bh(I)I")
    public int method2537() {
        this.field2023 += 2;
        int var1 = ((this.field2028[this.field2023 - 1] & 0xFF) << 8) + (this.field2028[this.field2023 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.bv(IB)V")
    public void method2452(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 16);
        this.field2028[++this.field2023 - 1] = (byte) arg0;
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bb(I)I")
    public int method2453() {
        this.field2023 += 3;
        return (this.field2028[this.field2023 - 2] & 0xFF) + ((this.field2028[this.field2023 - 1] & 0xFF) << 8) + ((this.field2028[this.field2023 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.bw(II)V")
    public void method2454(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) arg0;
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 16);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dr.cq(IS)V")
    public void method2468(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
        this.field2028[++this.field2023 - 1] = (byte) arg0;
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 24);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dr.ct(II)V")
    public void method2456(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 16);
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 24);
        this.field2028[++this.field2023 - 1] = (byte) arg0;
        this.field2028[++this.field2023 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.cc(I)I")
    public int method2449() {
        this.field2023 += 4;
        return (this.field2028[this.field2023 - 4] & 0xFF) + ((this.field2028[this.field2023 - 3] & 0xFF) << 8) + ((this.field2028[this.field2023 - 2] & 0xFF) << 16) + ((this.field2028[this.field2023 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dr.ca(I)I")
    public int method2536() {
        this.field2023 += 4;
        return (this.field2028[this.field2023 - 3] & 0xFF) + ((this.field2028[this.field2023 - 4] & 0xFF) << 8) + ((this.field2028[this.field2023 - 1] & 0xFF) << 16) + ((this.field2028[this.field2023 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dr.cw(I)I")
    public int method2459() {
        this.field2023 += 4;
        return (this.field2028[this.field2023 - 2] & 0xFF) + ((this.field2028[this.field2023 - 1] & 0xFF) << 8) + ((this.field2028[this.field2023 - 3] & 0xFF) << 24) + ((this.field2028[this.field2023 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.cg([BIIB)V")
    public void method2460(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2028[++this.field2023 - 1] - 128);
        }
    }

    @ObfuscatedName("dr.ce([BIII)V")
    public void method2461(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2028[++this.field2023 - 1] - 128);
        }
    }
}
