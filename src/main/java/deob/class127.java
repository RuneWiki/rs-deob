package deob;

import java.math.BigInteger;

@ObfuscatedName("dq")
public class class127 extends class179 {

    @ObfuscatedName("dq.h")
    public byte[] field2037;

    @ObfuscatedName("dq.u")
    public int field2035;

    @ObfuscatedName("dq.a")
    public static int[] field2036 = new int[256];

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
            field2036[var0] = var1;
        }
    }

    @ObfuscatedName("as.ah([BIIB)I")
    public static int method820(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2036[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("j.ad([BII)I")
    public static int method6(byte[] arg0, int arg1) {
        return method820(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2037 = class114.method2320(arg0);
        this.field2035 = 0;
    }

    public class127(byte[] arg0) {
        this.field2037 = arg0;
        this.field2035 = 0;
    }

    @ObfuscatedName("dq.ak(II)V")
    public void method2450(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ap(II)V")
    public void method2593(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2035 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.al(II)V")
    public void method2452(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2035 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.am(II)V")
    public void method2453(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2035 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ab(J)V")
    public void method2454(long arg0) {
        this.field2037[++this.field2035 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2037[++this.field2035 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2037[++this.field2035 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2037[++this.field2035 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2037[++this.field2035 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2037[++this.field2035 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2037[++this.field2035 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2037[++this.field2035 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("bc.ax(Ljava/lang/String;I)I")
    public static int method1431(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dq.az(Ljava/lang/String;B)V")
    public void method2455(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2035 += class150.method770(arg0, 0, arg0.length(), this.field2037, this.field2035);
        this.field2037[++this.field2035 - 1] = 0;
    }

    @ObfuscatedName("t.at(Ljava/lang/String;I)I")
    public static int method56(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dq.as(Ljava/lang/String;I)V")
    public void method2456(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2037[++this.field2035 - 1] = 0;
        this.field2035 += class150.method770(arg0, 0, arg0.length(), this.field2037, this.field2035);
        this.field2037[++this.field2035 - 1] = 0;
    }

    @ObfuscatedName("dq.aj(Ljava/lang/CharSequence;I)V")
    public void method2647(CharSequence arg0) {
        int var2 = class180.method2845(arg0);
        this.field2037[++this.field2035 - 1] = 0;
        this.method2463(var2);
        int var3 = this.field2035;
        byte[] var4 = this.field2037;
        int var5 = this.field2035;
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
        this.field2035 = var10 + var3;
    }

    @ObfuscatedName("dq.aa([BIII)V")
    public void method2458(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2037[++this.field2035 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dq.au(II)V")
    public void method2459(int arg0) {
        this.field2037[this.field2035 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2037[this.field2035 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2037[this.field2035 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2037[this.field2035 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ae(II)V")
    public void method2538(int arg0) {
        this.field2037[this.field2035 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2037[this.field2035 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ao(IB)V")
    public void method2637(int arg0) {
        this.field2037[this.field2035 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.af(II)V")
    public void method2462(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2450(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2593(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dq.ar(IB)V")
    public void method2463(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2450(arg0 >>> 28 | 0x80);
                    }
                    this.method2450(arg0 >>> 21 | 0x80);
                }
                this.method2450(arg0 >>> 14 | 0x80);
            }
            this.method2450(arg0 >>> 7 | 0x80);
        }
        this.method2450(arg0 & 0x7F);
    }

    @ObfuscatedName("dq.ay(I)I")
    public int method2464() {
        return this.field2037[++this.field2035 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.av(I)B")
    public byte method2449() {
        return this.field2037[++this.field2035 - 1];
    }

    @ObfuscatedName("dq.ac(I)I")
    public int method2582() {
        this.field2035 += 2;
        return ((this.field2037[this.field2035 - 2] & 0xFF) << 8) + (this.field2037[this.field2035 - 1] & 0xFF);
    }

    @ObfuscatedName("dq.aq(I)I")
    public int method2467() {
        this.field2035 += 2;
        int var1 = ((this.field2037[this.field2035 - 2] & 0xFF) << 8) + (this.field2037[this.field2035 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.ag(S)I")
    public int method2643() {
        this.field2035 += 3;
        return (this.field2037[this.field2035 - 1] & 0xFF) + ((this.field2037[this.field2035 - 3] & 0xFF) << 16) + ((this.field2037[this.field2035 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dq.an(B)I")
    public int method2508() {
        this.field2035 += 4;
        return (this.field2037[this.field2035 - 1] & 0xFF) + ((this.field2037[this.field2035 - 2] & 0xFF) << 8) + ((this.field2037[this.field2035 - 3] & 0xFF) << 16) + ((this.field2037[this.field2035 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.by(I)J")
    public long method2631() {
        long var1 = (long) this.method2508() & 0xFFFFFFFFL;
        long var3 = (long) this.method2508() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dq.ba(I)Ljava/lang/String;")
    public String method2471() {
        if (this.field2037[this.field2035] == 0) {
            this.field2035++;
            return null;
        } else {
            return this.method2518();
        }
    }

    @ObfuscatedName("dq.bb(I)Ljava/lang/String;")
    public String method2518() {
        int var1 = this.field2035;
        while (this.field2037[++this.field2035 - 1] != 0) {
        }
        int var2 = this.field2035 - var1 - 1;
        return var2 == 0 ? "" : class150.method2061(this.field2037, var1, var2);
    }

    @ObfuscatedName("dq.br(I)Ljava/lang/String;")
    public String method2473() {
        byte var1 = this.field2037[++this.field2035 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2035;
        while (this.field2037[++this.field2035 - 1] != 0) {
        }
        int var3 = this.field2035 - var2 - 1;
        return var3 == 0 ? "" : class150.method2061(this.field2037, var2, var3);
    }

    @ObfuscatedName("dq.bz(I)Ljava/lang/String;")
    public String method2472() {
        byte var1 = this.field2037[++this.field2035 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2479();
        if (this.field2035 + var2 > this.field2037.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method121(this.field2037, this.field2035, var2);
        this.field2035 += var2;
        return var3;
    }

    @ObfuscatedName("dq.bl([BIII)V")
    public void method2475(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2037[++this.field2035 - 1];
        }
    }

    @ObfuscatedName("dq.bo(I)I")
    public int method2476() {
        int var1 = this.field2037[this.field2035] & 0xFF;
        return var1 < 128 ? this.method2464() - 64 : this.method2582() - 49152;
    }

    @ObfuscatedName("dq.bm(S)I")
    public int method2635() {
        int var1 = this.field2037[this.field2035] & 0xFF;
        return var1 < 128 ? this.method2464() : this.method2582() - 32768;
    }

    @ObfuscatedName("dq.bh(I)I")
    public int method2478() {
        return this.field2037[this.field2035] < 0 ? this.method2508() & Integer.MAX_VALUE : this.method2582();
    }

    @ObfuscatedName("dq.bu(I)I")
    public int method2479() {
        byte var1 = this.field2037[++this.field2035 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2037[++this.field2035 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dq.bx([IIIB)V")
    public void method2461(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2035;
        this.field2035 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2508();
            int var8 = this.method2508();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2035 -= 8;
            this.method2453(var7);
            this.method2453(var8);
        }
        this.field2035 = var4;
    }

    @ObfuscatedName("dq.bv([IIII)V")
    public void method2481(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2035;
        this.field2035 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2508();
            int var8 = this.method2508();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2035 -= 8;
            this.method2453(var7);
            this.method2453(var8);
        }
        this.field2035 = var4;
    }

    @ObfuscatedName("dq.bt(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2482(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2035;
        this.field2035 = 0;
        byte[] var4 = new byte[var3];
        this.method2475(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2035 = 0;
        this.method2593(var7.length);
        this.method2458(var7, 0, var7.length);
    }

    @ObfuscatedName("dq.be(II)I")
    public int method2483(int arg0) {
        int var2 = method820(this.field2037, arg0, this.field2035);
        this.method2453(var2);
        return var2;
    }

    @ObfuscatedName("dq.bi(I)Z")
    public boolean method2484() {
        this.field2035 -= 4;
        int var1 = method820(this.field2037, 0, this.field2035);
        int var2 = this.method2508();
        return var1 == var2;
    }

    @ObfuscatedName("dq.bw(II)V")
    public void method2535(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.bd(II)V")
    public void method2486(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dq.bp(II)V")
    public void method2487(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dq.bk(I)I")
    public int method2488() {
        return this.field2037[++this.field2035 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dq.bj(I)I")
    public int method2523() {
        return -this.field2037[++this.field2035 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.bc(I)I")
    public int method2490() {
        return 128 - this.field2037[++this.field2035 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.bn(B)B")
    public byte method2564() {
        return (byte) (this.field2037[++this.field2035 - 1] - 128);
    }

    @ObfuscatedName("dq.bg(I)B")
    public byte method2492() {
        return (byte) (-this.field2037[++this.field2035 - 1]);
    }

    @ObfuscatedName("dq.bs(IB)V")
    public void method2493(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) arg0;
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bf(IB)V")
    public void method2494(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.bq(II)V")
    public void method2495(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 + 128);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.cq(I)I")
    public int method2496() {
        this.field2035 += 2;
        return ((this.field2037[this.field2035 - 1] & 0xFF) << 8) + (this.field2037[this.field2035 - 2] & 0xFF);
    }

    @ObfuscatedName("dq.cl(I)I")
    public int method2451() {
        this.field2035 += 2;
        return ((this.field2037[this.field2035 - 2] & 0xFF) << 8) + (this.field2037[this.field2035 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.ce(I)I")
    public int method2498() {
        this.field2035 += 2;
        return ((this.field2037[this.field2035 - 1] & 0xFF) << 8) + (this.field2037[this.field2035 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.cd(I)I")
    public int method2617() {
        this.field2035 += 2;
        int var1 = ((this.field2037[this.field2035 - 1] & 0xFF) << 8) + (this.field2037[this.field2035 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.cc(II)V")
    public void method2500(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2035 - 1] = (byte) arg0;
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.cr(I)I")
    public int method2501() {
        this.field2035 += 3;
        return (this.field2037[this.field2035 - 3] & 0xFF) + ((this.field2037[this.field2035 - 1] & 0xFF) << 16) + ((this.field2037[this.field2035 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dq.ci(II)V")
    public void method2502(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) arg0;
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dq.cu(IB)V")
    public void method2503(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
        this.field2037[++this.field2035 - 1] = (byte) arg0;
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dq.ca(II)V")
    public void method2504(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 16);
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 24);
        this.field2037[++this.field2035 - 1] = (byte) arg0;
        this.field2037[++this.field2035 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.cf(I)I")
    public int method2505() {
        this.field2035 += 4;
        return (this.field2037[this.field2035 - 4] & 0xFF) + ((this.field2037[this.field2035 - 3] & 0xFF) << 8) + ((this.field2037[this.field2035 - 2] & 0xFF) << 16) + ((this.field2037[this.field2035 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.co(B)I")
    public int method2585() {
        this.field2035 += 4;
        return (this.field2037[this.field2035 - 3] & 0xFF) + ((this.field2037[this.field2035 - 4] & 0xFF) << 8) + ((this.field2037[this.field2035 - 2] & 0xFF) << 24) + ((this.field2037[this.field2035 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.cg(I)I")
    public int method2507() {
        this.field2035 += 4;
        return (this.field2037[this.field2035 - 2] & 0xFF) + ((this.field2037[this.field2035 - 1] & 0xFF) << 8) + ((this.field2037[this.field2035 - 4] & 0xFF) << 16) + ((this.field2037[this.field2035 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.ct([BIII)V")
    public void method2591(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2037[++this.field2035 - 1];
        }
    }
}
