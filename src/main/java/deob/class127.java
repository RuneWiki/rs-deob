package deob;

import java.math.BigInteger;

@ObfuscatedName("dj")
public class class127 extends class179 {

    @ObfuscatedName("dj.h")
    public byte[] field2033;

    @ObfuscatedName("dj.y")
    public int field2029;

    @ObfuscatedName("dj.j")
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

    @ObfuscatedName("cx.b([BIII)I")
    public static int method1887(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2031[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class127(int arg0) {
        this.field2033 = class114.method2337(arg0);
        this.field2029 = 0;
    }

    public class127(byte[] arg0) {
        this.field2033 = arg0;
        this.field2029 = 0;
    }

    @ObfuscatedName("dj.c(II)V")
    public void method2657(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.aw(II)V")
    public void method2481(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2029 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.ap(II)V")
    public void method2482(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2029 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.am(IB)V")
    public void method2483(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 24);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2029 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.az(J)V")
    public void method2552(long arg0) {
        this.field2033[++this.field2029 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2033[++this.field2029 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2033[++this.field2029 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2033[++this.field2029 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2033[++this.field2029 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2033[++this.field2029 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2033[++this.field2029 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2033[++this.field2029 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dj.ax(Ljava/lang/String;I)V")
    public void method2485(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2029 += class150.method649(arg0, 0, arg0.length(), this.field2033, this.field2029);
        this.field2033[++this.field2029 - 1] = 0;
    }

    @ObfuscatedName("cm.af(Ljava/lang/String;I)I")
    public static int method1883(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dj.aa(Ljava/lang/String;I)V")
    public void method2541(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2033[++this.field2029 - 1] = 0;
        this.field2029 += class150.method649(arg0, 0, arg0.length(), this.field2033, this.field2029);
        this.field2033[++this.field2029 - 1] = 0;
    }

    @ObfuscatedName("dj.ag(Ljava/lang/CharSequence;I)V")
    public void method2487(CharSequence arg0) {
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
        this.field2033[++this.field2029 - 1] = 0;
        this.method2493(var3);
        int var8 = this.field2029;
        byte[] var9 = this.field2033;
        int var10 = this.field2029;
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
        this.field2029 = var15 + var8;
    }

    @ObfuscatedName("dj.aj([BIIB)V")
    public void method2488(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2033[++this.field2029 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dj.aq(II)V")
    public void method2572(int arg0) {
        this.field2033[this.field2029 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2033[this.field2029 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2033[this.field2029 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2033[this.field2029 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.ah(II)V")
    public void method2490(int arg0) {
        this.field2033[this.field2029 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2033[this.field2029 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.ae(IB)V")
    public void method2491(int arg0) {
        this.field2033[this.field2029 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.ar(II)V")
    public void method2643(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2657(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2481(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dj.ab(IB)V")
    public void method2493(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2657(arg0 >>> 28 | 0x80);
                    }
                    this.method2657(arg0 >>> 21 | 0x80);
                }
                this.method2657(arg0 >>> 14 | 0x80);
            }
            this.method2657(arg0 >>> 7 | 0x80);
        }
        this.method2657(arg0 & 0x7F);
    }

    @ObfuscatedName("dj.ay(I)I")
    public int method2494() {
        return this.field2033[++this.field2029 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.ac(B)B")
    public byte method2604() {
        return this.field2033[++this.field2029 - 1];
    }

    @ObfuscatedName("dj.ad(B)I")
    public int method2496() {
        this.field2029 += 2;
        return ((this.field2033[this.field2029 - 2] & 0xFF) << 8) + (this.field2033[this.field2029 - 1] & 0xFF);
    }

    @ObfuscatedName("dj.al(B)I")
    public int method2582() {
        this.field2029 += 2;
        int var1 = ((this.field2033[this.field2029 - 2] & 0xFF) << 8) + (this.field2033[this.field2029 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.an(I)I")
    public int method2498() {
        this.field2029 += 3;
        return (this.field2033[this.field2029 - 1] & 0xFF) + ((this.field2033[this.field2029 - 3] & 0xFF) << 16) + ((this.field2033[this.field2029 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dj.at(I)I")
    public int method2617() {
        this.field2029 += 4;
        return (this.field2033[this.field2029 - 1] & 0xFF) + ((this.field2033[this.field2029 - 2] & 0xFF) << 8) + ((this.field2033[this.field2029 - 3] & 0xFF) << 16) + ((this.field2033[this.field2029 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.ak(S)J")
    public long method2647() {
        long var1 = (long) this.method2617() & 0xFFFFFFFFL;
        long var3 = (long) this.method2617() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dj.as(I)Ljava/lang/String;")
    public String method2576() {
        if (this.field2033[this.field2029] == 0) {
            this.field2029++;
            return null;
        } else {
            return this.method2502();
        }
    }

    @ObfuscatedName("dj.ai(I)Ljava/lang/String;")
    public String method2502() {
        int var1 = this.field2029;
        while (this.field2033[++this.field2029 - 1] != 0) {
        }
        int var2 = this.field2029 - var1 - 1;
        return var2 == 0 ? "" : class150.method2252(this.field2033, var1, var2);
    }

    @ObfuscatedName("dj.ao(I)Ljava/lang/String;")
    public String method2492() {
        byte var1 = this.field2033[++this.field2029 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2029;
        while (this.field2033[++this.field2029 - 1] != 0) {
        }
        int var3 = this.field2029 - var2 - 1;
        return var3 == 0 ? "" : class150.method2252(this.field2033, var2, var3);
    }

    @ObfuscatedName("dj.av(I)Ljava/lang/String;")
    public String method2504() {
        byte var1 = this.field2033[++this.field2029 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2509();
        if (this.field2029 + var2 > this.field2033.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method705(this.field2033, this.field2029, var2);
        this.field2029 += var2;
        return var3;
    }

    @ObfuscatedName("dj.au([BIII)V")
    public void method2505(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2033[++this.field2029 - 1];
        }
    }

    @ObfuscatedName("dj.bg(B)I")
    public int method2625() {
        int var1 = this.field2033[this.field2029] & 0xFF;
        return var1 < 128 ? this.method2494() - 64 : this.method2496() - 49152;
    }

    @ObfuscatedName("dj.bl(I)I")
    public int method2507() {
        int var1 = this.field2033[this.field2029] & 0xFF;
        return var1 < 128 ? this.method2494() : this.method2496() - 32768;
    }

    @ObfuscatedName("dj.bn(B)I")
    public int method2508() {
        return this.field2033[this.field2029] < 0 ? this.method2617() & Integer.MAX_VALUE : this.method2496();
    }

    @ObfuscatedName("dj.bh(B)I")
    public int method2509() {
        byte var1 = this.field2033[++this.field2029 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2033[++this.field2029 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dj.bi([IIII)V")
    public void method2591(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2029;
        this.field2029 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2617();
            int var8 = this.method2617();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2029 -= 8;
            this.method2483(var7);
            this.method2483(var8);
        }
        this.field2029 = var4;
    }

    @ObfuscatedName("dj.ba([IIII)V")
    public void method2503(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2029;
        this.field2029 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2617();
            int var8 = this.method2617();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2029 -= 8;
            this.method2483(var7);
            this.method2483(var8);
        }
        this.field2029 = var4;
    }

    @ObfuscatedName("dj.bf(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2568(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2029;
        this.field2029 = 0;
        byte[] var4 = new byte[var3];
        this.method2505(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2029 = 0;
        this.method2481(var7.length);
        this.method2488(var7, 0, var7.length);
    }

    @ObfuscatedName("dj.bd(II)I")
    public int method2513(int arg0) {
        int var2 = method1887(this.field2033, arg0, this.field2029);
        this.method2483(var2);
        return var2;
    }

    @ObfuscatedName("dj.bw(I)Z")
    public boolean method2542() {
        this.field2029 -= 4;
        int var1 = method1887(this.field2033, 0, this.field2029);
        int var2 = this.method2617();
        return var1 == var2;
    }

    @ObfuscatedName("dj.bj(II)V")
    public void method2515(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dj.by(I)I")
    public int method2516() {
        return this.field2033[++this.field2029 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dj.be(B)I")
    public int method2517() {
        return -this.field2033[++this.field2029 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.bv(I)I")
    public int method2518() {
        return 128 - this.field2033[++this.field2029 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.bk(B)B")
    public byte method2519() {
        return (byte) (this.field2033[++this.field2029 - 1] - 128);
    }

    @ObfuscatedName("dj.bu(I)B")
    public byte method2520() {
        return (byte) (-this.field2033[++this.field2029 - 1]);
    }

    @ObfuscatedName("dj.bc(I)B")
    public byte method2521() {
        return (byte) (128 - this.field2033[++this.field2029 - 1]);
    }

    @ObfuscatedName("dj.bq(II)V")
    public void method2522(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) arg0;
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bp(IB)V")
    public void method2531(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.br(II)V")
    public void method2595(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (arg0 + 128);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bm(I)I")
    public int method2525() {
        this.field2029 += 2;
        return ((this.field2033[this.field2029 - 1] & 0xFF) << 8) + (this.field2033[this.field2029 - 2] & 0xFF);
    }

    @ObfuscatedName("dj.bx(I)I")
    public int method2526() {
        this.field2029 += 2;
        return ((this.field2033[this.field2029 - 2] & 0xFF) << 8) + (this.field2033[this.field2029 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bb(S)I")
    public int method2527() {
        this.field2029 += 2;
        return ((this.field2033[this.field2029 - 1] & 0xFF) << 8) + (this.field2033[this.field2029 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bs(B)I")
    public int method2528() {
        this.field2029 += 2;
        int var1 = ((this.field2033[this.field2029 - 2] & 0xFF) << 8) + (this.field2033[this.field2029 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.bz(II)V")
    public void method2529(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) arg0;
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dj.bo(I)I")
    public int method2530() {
        this.field2029 += 3;
        return (this.field2033[this.field2029 - 2] & 0xFF) + ((this.field2033[this.field2029 - 3] & 0xFF) << 16) + ((this.field2033[this.field2029 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dj.bt(IB)V")
    public void method2501(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) arg0;
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dj.cy(II)V")
    public void method2532(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
        this.field2033[++this.field2029 - 1] = (byte) arg0;
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 24);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dj.cp(II)V")
    public void method2486(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 16);
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 24);
        this.field2033[++this.field2029 - 1] = (byte) arg0;
        this.field2033[++this.field2029 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.cs(I)I")
    public int method2534() {
        this.field2029 += 4;
        return (this.field2033[this.field2029 - 4] & 0xFF) + ((this.field2033[this.field2029 - 3] & 0xFF) << 8) + ((this.field2033[this.field2029 - 2] & 0xFF) << 16) + ((this.field2033[this.field2029 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.cf(B)I")
    public int method2512() {
        this.field2029 += 4;
        return (this.field2033[this.field2029 - 3] & 0xFF) + ((this.field2033[this.field2029 - 4] & 0xFF) << 8) + ((this.field2033[this.field2029 - 2] & 0xFF) << 24) + ((this.field2033[this.field2029 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.ca(I)I")
    public int method2536() {
        this.field2029 += 4;
        return (this.field2033[this.field2029 - 2] & 0xFF) + ((this.field2033[this.field2029 - 1] & 0xFF) << 8) + ((this.field2033[this.field2029 - 3] & 0xFF) << 24) + ((this.field2033[this.field2029 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.ce([BIIB)V")
    public void method2537(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2033[++this.field2029 - 1] - 128);
        }
    }
}
