package deob;

import java.math.BigInteger;

@ObfuscatedName("dl")
public class class126 extends class178 {

    @ObfuscatedName("dl.m")
    public byte[] field2022;

    @ObfuscatedName("dl.n")
    public int field2024;

    @ObfuscatedName("dl.q")
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

    public class126(int arg0) {
        this.field2022 = class113.method2313(arg0);
        this.field2024 = 0;
    }

    public class126(byte[] arg0) {
        this.field2022 = arg0;
        this.field2024 = 0;
    }

    @ObfuscatedName("dl.ax(II)V")
    public void method2554(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.aa(II)V")
    public void method2435(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
        this.field2022[++this.field2024 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.af(IS)V")
    public void method2436(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 16);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
        this.field2022[++this.field2024 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.al(II)V")
    public void method2551(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 24);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 16);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
        this.field2022[++this.field2024 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.av(J)V")
    public void method2438(long arg0) {
        this.field2022[++this.field2024 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2022[++this.field2024 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2022[++this.field2024 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2022[++this.field2024 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2022[++this.field2024 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2022[++this.field2024 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2022[++this.field2024 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2022[++this.field2024 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dl.ab(Ljava/lang/String;I)V")
    public void method2439(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2024 += class148.method124(arg0, 0, arg0.length(), this.field2022, this.field2024);
        this.field2022[++this.field2024 - 1] = 0;
    }

    @ObfuscatedName("dl.ad(Ljava/lang/String;I)V")
    public void method2440(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2022[++this.field2024 - 1] = 0;
        this.field2024 += class148.method124(arg0, 0, arg0.length(), this.field2022, this.field2024);
        this.field2022[++this.field2024 - 1] = 0;
    }

    @ObfuscatedName("dl.ai(Ljava/lang/CharSequence;B)V")
    public void method2488(CharSequence arg0) {
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
        this.field2022[++this.field2024 - 1] = 0;
        this.method2543(var3);
        int var8 = this.field2024;
        byte[] var9 = this.field2022;
        int var10 = this.field2024;
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
        this.field2024 = var15 + var8;
    }

    @ObfuscatedName("dl.ak([BIIB)V")
    public void method2442(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2022[++this.field2024 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dl.ao(II)V")
    public void method2443(int arg0) {
        this.field2022[this.field2024 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2022[this.field2024 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2022[this.field2024 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2022[this.field2024 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.aq(II)V")
    public void method2444(int arg0) {
        this.field2022[this.field2024 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2022[this.field2024 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.aj(II)V")
    public void method2528(int arg0) {
        this.field2022[this.field2024 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.ag(IB)V")
    public void method2446(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2554(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2435(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.ap(II)V")
    public void method2543(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2554(arg0 >>> 28 | 0x80);
                    }
                    this.method2554(arg0 >>> 21 | 0x80);
                }
                this.method2554(arg0 >>> 14 | 0x80);
            }
            this.method2554(arg0 >>> 7 | 0x80);
        }
        this.method2554(arg0 & 0x7F);
    }

    @ObfuscatedName("dl.an(I)I")
    public int method2559() {
        return this.field2022[++this.field2024 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.as(S)B")
    public byte method2449() {
        return this.field2022[++this.field2024 - 1];
    }

    @ObfuscatedName("dl.au(I)I")
    public int method2450() {
        this.field2024 += 2;
        return ((this.field2022[this.field2024 - 2] & 0xFF) << 8) + (this.field2022[this.field2024 - 1] & 0xFF);
    }

    @ObfuscatedName("dl.ay(B)I")
    public int method2487() {
        this.field2024 += 2;
        int var1 = ((this.field2022[this.field2024 - 2] & 0xFF) << 8) + (this.field2022[this.field2024 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.ah(I)I")
    public int method2452() {
        this.field2024 += 3;
        return (this.field2022[this.field2024 - 1] & 0xFF) + ((this.field2022[this.field2024 - 2] & 0xFF) << 8) + ((this.field2022[this.field2024 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.aw(S)I")
    public int method2526() {
        this.field2024 += 4;
        return (this.field2022[this.field2024 - 1] & 0xFF) + ((this.field2022[this.field2024 - 2] & 0xFF) << 8) + ((this.field2022[this.field2024 - 3] & 0xFF) << 16) + ((this.field2022[this.field2024 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.ac(I)J")
    public long method2454() {
        long var1 = (long) this.method2526() & 0xFFFFFFFFL;
        long var3 = (long) this.method2526() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dl.az(B)Ljava/lang/String;")
    public String method2569() {
        if (this.field2022[this.field2024] == 0) {
            this.field2024++;
            return null;
        } else {
            return this.method2630();
        }
    }

    @ObfuscatedName("dl.am(I)Ljava/lang/String;")
    public String method2630() {
        int var1 = this.field2024;
        while (this.field2022[++this.field2024 - 1] != 0) {
        }
        int var2 = this.field2024 - var1 - 1;
        return var2 == 0 ? "" : class148.method811(this.field2022, var1, var2);
    }

    @ObfuscatedName("dl.ae(I)Ljava/lang/String;")
    public String method2623() {
        byte var1 = this.field2022[++this.field2024 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2024;
        while (this.field2022[++this.field2024 - 1] != 0) {
        }
        int var3 = this.field2024 - var2 - 1;
        return var3 == 0 ? "" : class148.method811(this.field2022, var2, var3);
    }

    @ObfuscatedName("dl.at(B)Ljava/lang/String;")
    public String method2538() {
        byte var1 = this.field2022[++this.field2024 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2463();
        if (this.field2024 + var2 > this.field2022.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2022;
        int var4 = this.field2024;
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
        this.field2024 += var2;
        return var12;
    }

    @ObfuscatedName("dl.ar([BIIS)V")
    public void method2613(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2022[++this.field2024 - 1];
        }
    }

    @ObfuscatedName("dl.bj(B)I")
    public int method2506() {
        int var1 = this.field2022[this.field2024] & 0xFF;
        return var1 < 128 ? this.method2559() - 64 : this.method2450() - 49152;
    }

    @ObfuscatedName("dl.bu(B)I")
    public int method2580() {
        int var1 = this.field2022[this.field2024] & 0xFF;
        return var1 < 128 ? this.method2559() : this.method2450() - 32768;
    }

    @ObfuscatedName("dl.bh(I)I")
    public int method2567() {
        return this.field2022[this.field2024] < 0 ? this.method2526() & Integer.MAX_VALUE : this.method2450();
    }

    @ObfuscatedName("dl.bt(B)I")
    public int method2463() {
        byte var1 = this.field2022[++this.field2024 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2022[++this.field2024 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dl.bl([IIII)V")
    public void method2547(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2024;
        this.field2024 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2526();
            int var8 = this.method2526();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2024 -= 8;
            this.method2551(var7);
            this.method2551(var8);
        }
        this.field2024 = var4;
    }

    @ObfuscatedName("dl.bw([IIII)V")
    public void method2465(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2024;
        this.field2024 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2526();
            int var8 = this.method2526();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2024 -= 8;
            this.method2551(var7);
            this.method2551(var8);
        }
        this.field2024 = var4;
    }

    @ObfuscatedName("dl.bi(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2560(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2024;
        this.field2024 = 0;
        byte[] var4 = new byte[var3];
        this.method2613(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2024 = 0;
        this.method2435(var7.length);
        this.method2442(var7, 0, var7.length);
    }

    @ObfuscatedName("dl.bn(II)I")
    public int method2467(int arg0) {
        byte[] var2 = this.field2022;
        int var3 = this.field2024;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2023[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2551(var6);
        return var6;
    }

    @ObfuscatedName("dl.bq(I)Z")
    public boolean method2468() {
        this.field2024 -= 4;
        byte[] var1 = this.field2022;
        int var2 = this.field2024;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2023[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2526();
        return var5 == var8;
    }

    @ObfuscatedName("dl.bp(IB)V")
    public void method2469(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.bb(II)V")
    public void method2470(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dl.bg(I)I")
    public int method2471() {
        return this.field2022[++this.field2024 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dl.br(I)I")
    public int method2462() {
        return -this.field2022[++this.field2024 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.by(S)I")
    public int method2473() {
        return 128 - this.field2022[++this.field2024 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.ba(I)B")
    public byte method2474() {
        return (byte) (-this.field2022[++this.field2024 - 1]);
    }

    @ObfuscatedName("dl.bs(IB)V")
    public void method2533(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) arg0;
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bf(II)V")
    public void method2460(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.bk(II)V")
    public void method2477(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 + 128);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bv(I)I")
    public int method2478() {
        this.field2024 += 2;
        return ((this.field2022[this.field2024 - 1] & 0xFF) << 8) + (this.field2022[this.field2024 - 2] & 0xFF);
    }

    @ObfuscatedName("dl.bx(B)I")
    public int method2479() {
        this.field2024 += 2;
        return ((this.field2022[this.field2024 - 2] & 0xFF) << 8) + (this.field2022[this.field2024 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bz(B)I")
    public int method2480() {
        this.field2024 += 2;
        return ((this.field2022[this.field2024 - 1] & 0xFF) << 8) + (this.field2022[this.field2024 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bm(S)I")
    public int method2457() {
        this.field2024 += 2;
        int var1 = ((this.field2022[this.field2024 - 2] & 0xFF) << 8) + (this.field2022[this.field2024 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.bc(IB)V")
    public void method2482(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) arg0;
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dl.bd(I)I")
    public int method2483() {
        this.field2024 += 3;
        return (this.field2022[this.field2024 - 3] & 0xFF) + ((this.field2022[this.field2024 - 1] & 0xFF) << 16) + ((this.field2022[this.field2024 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dl.be(II)V")
    public void method2448(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) arg0;
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 16);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dl.bo(IB)V")
    public void method2485(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
        this.field2022[++this.field2024 - 1] = (byte) arg0;
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 24);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dl.cc(II)V")
    public void method2555(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 16);
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 24);
        this.field2022[++this.field2024 - 1] = (byte) arg0;
        this.field2022[++this.field2024 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.cg(I)I")
    public int method2602() {
        this.field2024 += 4;
        return (this.field2022[this.field2024 - 4] & 0xFF) + ((this.field2022[this.field2024 - 3] & 0xFF) << 8) + ((this.field2022[this.field2024 - 1] & 0xFF) << 24) + ((this.field2022[this.field2024 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.cd(I)I")
    public int method2451() {
        this.field2024 += 4;
        return (this.field2022[this.field2024 - 3] & 0xFF) + ((this.field2022[this.field2024 - 4] & 0xFF) << 8) + ((this.field2022[this.field2024 - 2] & 0xFF) << 24) + ((this.field2022[this.field2024 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.cw(I)I")
    public int method2619() {
        this.field2024 += 4;
        return (this.field2022[this.field2024 - 2] & 0xFF) + ((this.field2022[this.field2024 - 1] & 0xFF) << 8) + ((this.field2022[this.field2024 - 4] & 0xFF) << 16) + ((this.field2022[this.field2024 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.cp([BIII)V")
    public void method2490(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2022[++this.field2024 - 1] - 128);
        }
    }
}
