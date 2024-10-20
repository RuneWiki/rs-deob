package deob;

import java.math.BigInteger;

@ObfuscatedName("ds")
public class class128 extends class181 {

    @ObfuscatedName("ds.l")
    public byte[] field2050;

    @ObfuscatedName("ds.s")
    public int field2048;

    @ObfuscatedName("ds.d")
    public static int[] field2047 = new int[256];

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
            field2047[var0] = var1;
        }
    }

    @ObfuscatedName("cq.af([BIIB)I")
    public static int method2049(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2047[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class128(int arg0) {
        this.field2050 = class115.method2326(arg0);
        this.field2048 = 0;
    }

    public class128(byte[] arg0) {
        this.field2050 = arg0;
        this.field2048 = 0;
    }

    @ObfuscatedName("ds.ar(II)V")
    public void method2449(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.ax(IB)V")
    public void method2529(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
        this.field2050[++this.field2048 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.at(IB)V")
    public void method2501(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 16);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
        this.field2050[++this.field2048 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.ah(IB)V")
    public void method2452(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 24);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 16);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
        this.field2050[++this.field2048 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.ap(J)V")
    public void method2453(long arg0) {
        this.field2050[++this.field2048 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2050[++this.field2048 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2050[++this.field2048 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2050[++this.field2048 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2050[++this.field2048 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2050[++this.field2048 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2050[++this.field2048 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2050[++this.field2048 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("at.ay(Ljava/lang/String;I)I")
    public static int method594(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ds.ag(Ljava/lang/String;I)V")
    public void method2454(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2048 += class152.method2332(arg0, 0, arg0.length(), this.field2050, this.field2048);
        this.field2050[++this.field2048 - 1] = 0;
    }

    @ObfuscatedName("c.ai(Ljava/lang/String;S)I")
    public static int method188(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ds.aw(Ljava/lang/String;I)V")
    public void method2455(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2050[++this.field2048 - 1] = 0;
        this.field2048 += class152.method2332(arg0, 0, arg0.length(), this.field2050, this.field2048);
        this.field2050[++this.field2048 - 1] = 0;
    }

    @ObfuscatedName("ds.am(Ljava/lang/CharSequence;I)V")
    public void method2456(CharSequence arg0) {
        int var2 = class182.method651(arg0);
        this.field2050[++this.field2048 - 1] = 0;
        this.method2498(var2);
        int var3 = this.field2048;
        byte[] var4 = this.field2050;
        int var5 = this.field2048;
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
        this.field2048 = var10 + var3;
    }

    @ObfuscatedName("ds.an([BIII)V")
    public void method2480(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2050[++this.field2048 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ds.as(II)V")
    public void method2555(int arg0) {
        this.field2050[this.field2048 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2050[this.field2048 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2050[this.field2048 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2050[this.field2048 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.au(II)V")
    public void method2459(int arg0) {
        this.field2050[this.field2048 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2050[this.field2048 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.aq(IB)V")
    public void method2460(int arg0) {
        this.field2050[this.field2048 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.ac(II)V")
    public void method2461(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2449(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2529(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.ae(II)V")
    public void method2498(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2449(arg0 >>> 28 | 0x80);
                    }
                    this.method2449(arg0 >>> 21 | 0x80);
                }
                this.method2449(arg0 >>> 14 | 0x80);
            }
            this.method2449(arg0 >>> 7 | 0x80);
        }
        this.method2449(arg0 & 0x7F);
    }

    @ObfuscatedName("ds.ad(B)I")
    public int method2531() {
        return this.field2050[++this.field2048 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.ao(I)B")
    public byte method2464() {
        return this.field2050[++this.field2048 - 1];
    }

    @ObfuscatedName("ds.aj(B)I")
    public int method2473() {
        this.field2048 += 2;
        return ((this.field2050[this.field2048 - 2] & 0xFF) << 8) + (this.field2050[this.field2048 - 1] & 0xFF);
    }

    @ObfuscatedName("ds.aa(I)I")
    public int method2487() {
        this.field2048 += 2;
        int var1 = ((this.field2050[this.field2048 - 2] & 0xFF) << 8) + (this.field2050[this.field2048 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.al(I)I")
    public int method2599() {
        this.field2048 += 3;
        return (this.field2050[this.field2048 - 1] & 0xFF) + ((this.field2050[this.field2048 - 2] & 0xFF) << 8) + ((this.field2050[this.field2048 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.az(B)I")
    public int method2468() {
        this.field2048 += 4;
        return (this.field2050[this.field2048 - 1] & 0xFF) + ((this.field2050[this.field2048 - 2] & 0xFF) << 8) + ((this.field2050[this.field2048 - 3] & 0xFF) << 16) + ((this.field2050[this.field2048 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("ds.av(S)J")
    public long method2569() {
        long var1 = (long) this.method2468() & 0xFFFFFFFFL;
        long var3 = (long) this.method2468() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ds.ab(I)Ljava/lang/String;")
    public String method2525() {
        if (this.field2050[this.field2048] == 0) {
            this.field2048++;
            return null;
        } else {
            return this.method2618();
        }
    }

    @ObfuscatedName("ds.ak(B)Ljava/lang/String;")
    public String method2618() {
        int var1 = this.field2048;
        while (this.field2050[++this.field2048 - 1] != 0) {
        }
        int var2 = this.field2048 - var1 - 1;
        return var2 == 0 ? "" : class152.method37(this.field2050, var1, var2);
    }

    @ObfuscatedName("ds.bi(B)Ljava/lang/String;")
    public String method2472() {
        byte var1 = this.field2050[++this.field2048 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2048;
        while (this.field2050[++this.field2048 - 1] != 0) {
        }
        int var3 = this.field2048 - var2 - 1;
        return var3 == 0 ? "" : class152.method37(this.field2050, var2, var3);
    }

    @ObfuscatedName("ds.bp(I)Ljava/lang/String;")
    public String method2491() {
        byte var1 = this.field2050[++this.field2048 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2533();
        if (this.field2048 + var2 > this.field2050.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2050;
        int var4 = this.field2048;
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
        this.field2048 += var2;
        return var12;
    }

    @ObfuscatedName("ds.bg([BIII)V")
    public void method2474(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2050[++this.field2048 - 1];
        }
    }

    @ObfuscatedName("ds.ba(I)I")
    public int method2475() {
        int var1 = this.field2050[this.field2048] & 0xFF;
        return var1 < 128 ? this.method2531() - 64 : this.method2473() - 49152;
    }

    @ObfuscatedName("ds.by(I)I")
    public int method2476() {
        int var1 = this.field2050[this.field2048] & 0xFF;
        return var1 < 128 ? this.method2531() : this.method2473() - 32768;
    }

    @ObfuscatedName("ds.bf(B)I")
    public int method2477() {
        return this.field2050[this.field2048] < 0 ? this.method2468() & Integer.MAX_VALUE : this.method2473();
    }

    @ObfuscatedName("ds.bo(S)I")
    public int method2533() {
        byte var1 = this.field2050[++this.field2048 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2050[++this.field2048 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ds.bd([IIII)V")
    public void method2479(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2048;
        this.field2048 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2468();
            int var8 = this.method2468();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2048 -= 8;
            this.method2452(var7);
            this.method2452(var8);
        }
        this.field2048 = var4;
    }

    @ObfuscatedName("ds.bn([IIII)V")
    public void method2497(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2048;
        this.field2048 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2468();
            int var8 = this.method2468();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2048 -= 8;
            this.method2452(var7);
            this.method2452(var8);
        }
        this.field2048 = var4;
    }

    @ObfuscatedName("ds.bz(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2642(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2048;
        this.field2048 = 0;
        byte[] var4 = new byte[var3];
        this.method2474(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2048 = 0;
        this.method2529(var7.length);
        this.method2480(var7, 0, var7.length);
    }

    @ObfuscatedName("ds.bl(II)I")
    public int method2534(int arg0) {
        int var2 = method2049(this.field2050, arg0, this.field2048);
        this.method2452(var2);
        return var2;
    }

    @ObfuscatedName("ds.bq(B)Z")
    public boolean method2483() {
        this.field2048 -= 4;
        int var1 = method2049(this.field2050, 0, this.field2048);
        int var2 = this.method2468();
        return var1 == var2;
    }

    @ObfuscatedName("ds.bc(II)V")
    public void method2573(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.bb(II)V")
    public void method2481(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ds.bt(IB)V")
    public void method2547(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ds.br(I)I")
    public int method2633() {
        return this.field2050[++this.field2048 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ds.bs(B)I")
    public int method2539() {
        return -this.field2050[++this.field2048 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.bu(I)I")
    public int method2484() {
        return 128 - this.field2050[++this.field2048 - 1] & 0xFF;
    }

    @ObfuscatedName("ds.bv(B)B")
    public byte method2490() {
        return (byte) (this.field2050[++this.field2048 - 1] - 128);
    }

    @ObfuscatedName("ds.bh(I)B")
    public byte method2635() {
        return (byte) (-this.field2050[++this.field2048 - 1]);
    }

    @ObfuscatedName("ds.be(B)B")
    public byte method2492() {
        return (byte) (128 - this.field2050[++this.field2048 - 1]);
    }

    @ObfuscatedName("ds.bx(II)V")
    public void method2628(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) arg0;
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bm(IS)V")
    public void method2494(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ds.bj(IB)V")
    public void method2470(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 + 128);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.bk(I)I")
    public int method2496() {
        this.field2048 += 2;
        return ((this.field2050[this.field2048 - 1] & 0xFF) << 8) + (this.field2050[this.field2048 - 2] & 0xFF);
    }

    @ObfuscatedName("ds.bw(I)I")
    public int method2519() {
        this.field2048 += 2;
        return ((this.field2050[this.field2048 - 2] & 0xFF) << 8) + (this.field2050[this.field2048 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.cv(I)I")
    public int method2457() {
        this.field2048 += 2;
        return ((this.field2050[this.field2048 - 1] & 0xFF) << 8) + (this.field2050[this.field2048 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ds.cm(I)I")
    public int method2499() {
        this.field2048 += 2;
        int var1 = ((this.field2050[this.field2048 - 2] & 0xFF) << 8) + (this.field2050[this.field2048 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.cb(I)I")
    public int method2500() {
        this.field2048 += 2;
        int var1 = ((this.field2050[this.field2048 - 1] & 0xFF) << 8) + (this.field2050[this.field2048 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds.cd(II)V")
    public void method2450(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 16);
        this.field2050[++this.field2048 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ds.ch(I)I")
    public int method2507() {
        this.field2048 += 3;
        return (this.field2050[this.field2048 - 2] & 0xFF) + ((this.field2050[this.field2048 - 3] & 0xFF) << 16) + ((this.field2050[this.field2048 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("ds.cj(II)V")
    public void method2503(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) arg0;
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 16);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ds.cl(IS)V")
    public void method2502(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
        this.field2050[++this.field2048 - 1] = (byte) arg0;
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 24);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ds.cn(IB)V")
    public void method2505(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 16);
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 24);
        this.field2050[++this.field2048 - 1] = (byte) arg0;
        this.field2050[++this.field2048 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ds.cz(B)I")
    public int method2506() {
        this.field2048 += 4;
        return (this.field2050[this.field2048 - 4] & 0xFF) + ((this.field2050[this.field2048 - 3] & 0xFF) << 8) + ((this.field2050[this.field2048 - 1] & 0xFF) << 24) + ((this.field2050[this.field2048 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.ck(I)I")
    public int method2485() {
        this.field2048 += 4;
        return (this.field2050[this.field2048 - 3] & 0xFF) + ((this.field2050[this.field2048 - 4] & 0xFF) << 8) + ((this.field2050[this.field2048 - 1] & 0xFF) << 16) + ((this.field2050[this.field2048 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ds.cs(I)I")
    public int method2508() {
        this.field2048 += 4;
        return (this.field2050[this.field2048 - 2] & 0xFF) + ((this.field2050[this.field2048 - 1] & 0xFF) << 8) + ((this.field2050[this.field2048 - 3] & 0xFF) << 24) + ((this.field2050[this.field2048 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("ds.cr([BIII)V")
    public void method2509(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2050[++this.field2048 - 1] - 128);
        }
    }
}
