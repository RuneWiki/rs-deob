package deob;

import java.math.BigInteger;

@ObfuscatedName("dv")
public class class126 extends class179 {

    @ObfuscatedName("dv.o")
    public byte[] field2026;

    @ObfuscatedName("dv.a")
    public int field2027;

    @ObfuscatedName("dv.h")
    public static int[] field2028 = new int[256];

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
            field2028[var0] = var1;
        }
    }

    @ObfuscatedName("z.c([BIII)I")
    public static int method114(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2028[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("co.i([BII)I")
    public static int method2018(byte[] arg0, int arg1) {
        return method114(arg0, 0, arg1);
    }

    public class126(int arg0) {
        this.field2026 = class114.method2295(arg0);
        this.field2027 = 0;
    }

    public class126(byte[] arg0) {
        this.field2026 = arg0;
        this.field2027 = 0;
    }

    @ObfuscatedName("dv.u(II)V")
    public void method2422(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.at(IB)V")
    public void method2423(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2026[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.as(II)V")
    public void method2451(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2026[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ax(II)V")
    public void method2425(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 24);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2026[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ao(J)V")
    public void method2426(long arg0) {
        this.field2026[++this.field2027 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2026[++this.field2027 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2026[++this.field2027 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2026[++this.field2027 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2026[++this.field2027 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2026[++this.field2027 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2026[++this.field2027 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2026[++this.field2027 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dv.aq(Ljava/lang/String;I)V")
    public void method2588(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2027 += class150.method805(arg0, 0, arg0.length(), this.field2026, this.field2027);
        this.field2026[++this.field2027 - 1] = 0;
    }

    @ObfuscatedName("df.am(Ljava/lang/String;I)I")
    public static int method2419(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dv.al(Ljava/lang/String;I)V")
    public void method2428(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2026[++this.field2027 - 1] = 0;
        this.field2027 += class150.method805(arg0, 0, arg0.length(), this.field2026, this.field2027);
        this.field2026[++this.field2027 - 1] = 0;
    }

    @ObfuscatedName("dv.ab(Ljava/lang/CharSequence;B)V")
    public void method2429(CharSequence arg0) {
        int var2 = class180.method736(arg0);
        this.field2026[++this.field2027 - 1] = 0;
        this.method2435(var2);
        int var3 = this.field2027;
        byte[] var4 = this.field2026;
        int var5 = this.field2027;
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
        this.field2027 = var10 + var3;
    }

    @ObfuscatedName("dv.aw([BIII)V")
    public void method2430(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2026[++this.field2027 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dv.ah(IB)V")
    public void method2450(int arg0) {
        this.field2026[this.field2027 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2026[this.field2027 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2026[this.field2027 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2026[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.aa(II)V")
    public void method2432(int arg0) {
        this.field2026[this.field2027 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2026[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ay(IB)V")
    public void method2461(int arg0) {
        this.field2026[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ak(IB)V")
    public void method2459(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2422(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2423(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dv.az(IB)V")
    public void method2435(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2422(arg0 >>> 28 | 0x80);
                    }
                    this.method2422(arg0 >>> 21 | 0x80);
                }
                this.method2422(arg0 >>> 14 | 0x80);
            }
            this.method2422(arg0 >>> 7 | 0x80);
        }
        this.method2422(arg0 & 0x7F);
    }

    @ObfuscatedName("dv.ap(I)I")
    public int method2436() {
        return this.field2026[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.af(I)B")
    public byte method2437() {
        return this.field2026[++this.field2027 - 1];
    }

    @ObfuscatedName("dv.au(B)I")
    public int method2572() {
        this.field2027 += 2;
        return ((this.field2026[this.field2027 - 2] & 0xFF) << 8) + (this.field2026[this.field2027 - 1] & 0xFF);
    }

    @ObfuscatedName("dv.an(B)I")
    public int method2531() {
        this.field2027 += 2;
        int var1 = ((this.field2026[this.field2027 - 2] & 0xFF) << 8) + (this.field2026[this.field2027 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.av(I)I")
    public int method2440() {
        this.field2027 += 3;
        return (this.field2026[this.field2027 - 1] & 0xFF) + ((this.field2026[this.field2027 - 2] & 0xFF) << 8) + ((this.field2026[this.field2027 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dv.ac(I)I")
    public int method2439() {
        this.field2027 += 4;
        return (this.field2026[this.field2027 - 1] & 0xFF) + ((this.field2026[this.field2027 - 2] & 0xFF) << 8) + ((this.field2026[this.field2027 - 3] & 0xFF) << 16) + ((this.field2026[this.field2027 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.ae(B)J")
    public long method2442() {
        long var1 = (long) this.method2439() & 0xFFFFFFFFL;
        long var3 = (long) this.method2439() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dv.ai(I)Ljava/lang/String;")
    public String method2443() {
        if (this.field2026[this.field2027] == 0) {
            this.field2027++;
            return null;
        } else {
            return this.method2444();
        }
    }

    @ObfuscatedName("dv.ag(I)Ljava/lang/String;")
    public String method2444() {
        int var1 = this.field2027;
        while (this.field2026[++this.field2027 - 1] != 0) {
        }
        int var2 = this.field2027 - var1 - 1;
        return var2 == 0 ? "" : class150.method2846(this.field2026, var1, var2);
    }

    @ObfuscatedName("dv.aj(I)Ljava/lang/String;")
    public String method2445() {
        byte var1 = this.field2026[++this.field2027 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2027;
        while (this.field2026[++this.field2027 - 1] != 0) {
        }
        int var3 = this.field2027 - var2 - 1;
        return var3 == 0 ? "" : class150.method2846(this.field2026, var2, var3);
    }

    @ObfuscatedName("dv.ad(I)Ljava/lang/String;")
    public String method2446() {
        byte var1 = this.field2026[++this.field2027 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2530();
        if (this.field2027 + var2 > this.field2026.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2026;
        int var4 = this.field2027;
        char[] var5 = new char[var2];
        int var6 = 0;
        int var7 = var4;
        int var8 = var2 + var4;
        while (var7 < var8) {
            int var9 = var3[var7++] & 0xFF;
            int var10;
            if (var9 < 128) {
                if (var9 == 0) {
                    var10 = 65533;
                } else {
                    var10 = var9;
                }
            } else if (var9 < 192) {
                var10 = 65533;
            } else if (var9 < 224) {
                if (var7 < var8 && (var3[var7] & 0xC0) == 128) {
                    var10 = (var9 & 0x1F) << 6 | var3[var7++] & 0x3F;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 < 240) {
                if (var7 + 1 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128) {
                    var10 = (var9 & 0xF) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
                    if (var10 < 2048) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 >= 248) {
                var10 = 65533;
            } else if (var7 + 2 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128 && (var3[var7 + 2] & 0xC0) == 128) {
                int var11 = (var9 & 0x7) << 18 | (var3[var7++] & 0x3F) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
                if (var11 >= 65536 && var11 <= 1114111) {
                    var10 = 65533;
                } else {
                    var10 = 65533;
                }
            } else {
                var10 = 65533;
            }
            var5[var6++] = (char) var10;
        }
        String var12 = new String(var5, 0, var6);
        this.field2027 += var2;
        return var12;
    }

    @ObfuscatedName("dv.ar([BIIB)V")
    public void method2466(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2026[++this.field2027 - 1];
        }
    }

    @ObfuscatedName("dv.bu(B)I")
    public int method2448() {
        int var1 = this.field2026[this.field2027] & 0xFF;
        return var1 < 128 ? this.method2436() - 64 : this.method2572() - 49152;
    }

    @ObfuscatedName("dv.bl(I)I")
    public int method2560() {
        int var1 = this.field2026[this.field2027] & 0xFF;
        return var1 < 128 ? this.method2436() : this.method2572() - 32768;
    }

    @ObfuscatedName("dv.bj(B)I")
    public int method2555() {
        return this.field2026[this.field2027] < 0 ? this.method2439() & Integer.MAX_VALUE : this.method2572();
    }

    @ObfuscatedName("dv.bi(B)I")
    public int method2530() {
        byte var1 = this.field2026[++this.field2027 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2026[++this.field2027 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dv.bx([IIII)V")
    public void method2452(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2027;
        this.field2027 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2439();
            int var8 = this.method2439();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2027 -= 8;
            this.method2425(var7);
            this.method2425(var8);
        }
        this.field2027 = var4;
    }

    @ObfuscatedName("dv.bh([IIII)V")
    public void method2599(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2027;
        this.field2027 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2439();
            int var8 = this.method2439();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2027 -= 8;
            this.method2425(var7);
            this.method2425(var8);
        }
        this.field2027 = var4;
    }

    @ObfuscatedName("dv.br(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2454(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2027;
        this.field2027 = 0;
        byte[] var4 = new byte[var3];
        this.method2466(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2027 = 0;
        this.method2423(var7.length);
        this.method2430(var7, 0, var7.length);
    }

    @ObfuscatedName("dv.bn(II)I")
    public int method2455(int arg0) {
        int var2 = method114(this.field2026, arg0, this.field2027);
        this.method2425(var2);
        return var2;
    }

    @ObfuscatedName("dv.bo(I)Z")
    public boolean method2487() {
        this.field2027 -= 4;
        int var1 = method114(this.field2026, 0, this.field2027);
        int var2 = this.method2439();
        return var1 == var2;
    }

    @ObfuscatedName("dv.bf(IB)V")
    public void method2457(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dv.bv(IB)V")
    public void method2583(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dv.bd(I)I")
    public int method2577() {
        return this.field2026[++this.field2027 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dv.bt(B)I")
    public int method2460() {
        return -this.field2026[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.be(B)I")
    public int method2545() {
        return 128 - this.field2026[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.bq(B)B")
    public byte method2462() {
        return (byte) (this.field2026[++this.field2027 - 1] - 128);
    }

    @ObfuscatedName("dv.ba(B)B")
    public byte method2424() {
        return (byte) (128 - this.field2026[++this.field2027 - 1]);
    }

    @ObfuscatedName("dv.bp(II)V")
    public void method2464(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) arg0;
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.bm(II)V")
    public void method2465(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dv.bg(II)V")
    public void method2441(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 + 128);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.bw(I)I")
    public int method2467() {
        this.field2027 += 2;
        return ((this.field2026[this.field2027 - 1] & 0xFF) << 8) + (this.field2026[this.field2027 - 2] & 0xFF);
    }

    @ObfuscatedName("dv.bc(I)I")
    public int method2613() {
        this.field2027 += 2;
        return ((this.field2026[this.field2027 - 2] & 0xFF) << 8) + (this.field2026[this.field2027 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dv.bs(I)I")
    public int method2469() {
        this.field2027 += 2;
        return ((this.field2026[this.field2027 - 1] & 0xFF) << 8) + (this.field2026[this.field2027 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dv.by(I)I")
    public int method2470() {
        this.field2027 += 2;
        int var1 = ((this.field2026[this.field2027 - 1] & 0xFF) << 8) + (this.field2026[this.field2027 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.bk(I)I")
    public int method2471() {
        this.field2027 += 3;
        return (this.field2026[this.field2027 - 1] & 0xFF) + ((this.field2026[this.field2027 - 2] & 0xFF) << 16) + ((this.field2026[this.field2027 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dv.bz(II)V")
    public void method2456(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) arg0;
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dv.bb(II)V")
    public void method2473(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2026[++this.field2027 - 1] = (byte) arg0;
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 24);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dv.cp(II)V")
    public void method2474(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 24);
        this.field2026[++this.field2027 - 1] = (byte) arg0;
        this.field2026[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.ch(I)I")
    public int method2475() {
        this.field2027 += 4;
        return (this.field2026[this.field2027 - 4] & 0xFF) + ((this.field2026[this.field2027 - 3] & 0xFF) << 8) + ((this.field2026[this.field2027 - 2] & 0xFF) << 16) + ((this.field2026[this.field2027 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.ct(I)I")
    public int method2476() {
        this.field2027 += 4;
        return (this.field2026[this.field2027 - 3] & 0xFF) + ((this.field2026[this.field2027 - 4] & 0xFF) << 8) + ((this.field2026[this.field2027 - 2] & 0xFF) << 24) + ((this.field2026[this.field2027 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dv.cr(B)I")
    public int method2477() {
        this.field2027 += 4;
        return (this.field2026[this.field2027 - 2] & 0xFF) + ((this.field2026[this.field2027 - 1] & 0xFF) << 8) + ((this.field2026[this.field2027 - 3] & 0xFF) << 24) + ((this.field2026[this.field2027 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dv.ca([BIII)V")
    public void method2478(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2026[++this.field2027 - 1];
        }
    }

    @ObfuscatedName("dv.cs([BIIS)V")
    public void method2614(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2026[++this.field2027 - 1] - 128);
        }
    }
}
