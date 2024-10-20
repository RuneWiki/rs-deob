package deob;

import java.math.BigInteger;

@ObfuscatedName("da")
public class class127 extends class179 {

    @ObfuscatedName("da.j")
    public byte[] field2041;

    @ObfuscatedName("da.o")
    public int field2039;

    @ObfuscatedName("da.l")
    public static int[] field2040 = new int[256];

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
            field2040[var0] = var1;
        }
    }

    public class127(int arg0) {
        this.field2041 = class114.method2343(arg0);
        this.field2039 = 0;
    }

    public class127(byte[] arg0) {
        this.field2041 = arg0;
        this.field2039 = 0;
    }

    @ObfuscatedName("da.ac(IB)V")
    public void method2477(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.as(IS)V")
    public void method2694(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2041[++this.field2039 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.ag(II)V")
    public void method2574(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 16);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2041[++this.field2039 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.ak(II)V")
    public void method2480(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 24);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 16);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2041[++this.field2039 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.am(J)V")
    public void method2481(long arg0) {
        this.field2041[++this.field2039 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2041[++this.field2039 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2041[++this.field2039 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2041[++this.field2039 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2041[++this.field2039 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2041[++this.field2039 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2041[++this.field2039 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2041[++this.field2039 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("v.ap(Ljava/lang/String;I)I")
    public static int method12(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("da.au(Ljava/lang/String;I)V")
    public void method2535(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2039 += class149.method175(arg0, 0, arg0.length(), this.field2041, this.field2039);
        this.field2041[++this.field2039 - 1] = 0;
    }

    @ObfuscatedName("ea.aq(Ljava/lang/String;I)I")
    public static int method2899(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("da.at(Ljava/lang/String;I)V")
    public void method2495(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2041[++this.field2039 - 1] = 0;
        this.field2039 += class149.method175(arg0, 0, arg0.length(), this.field2041, this.field2039);
        this.field2041[++this.field2039 - 1] = 0;
    }

    @ObfuscatedName("da.aw(Ljava/lang/CharSequence;I)V")
    public void method2484(CharSequence arg0) {
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
        this.field2041[++this.field2039 - 1] = 0;
        this.method2521(var3);
        int var8 = this.field2039;
        byte[] var9 = this.field2041;
        int var10 = this.field2039;
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
        this.field2039 = var15 + var8;
    }

    @ObfuscatedName("da.ai([BIII)V")
    public void method2485(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2041[++this.field2039 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("da.ae(II)V")
    public void method2486(int arg0) {
        this.field2041[this.field2039 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2041[this.field2039 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2041[this.field2039 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2041[this.field2039 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.ab(II)V")
    public void method2681(int arg0) {
        this.field2041[this.field2039 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2041[this.field2039 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.ay(II)V")
    public void method2488(int arg0) {
        this.field2041[this.field2039 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.ax(II)V")
    public void method2489(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2477(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2694(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("da.ao(II)V")
    public void method2521(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2477(arg0 >>> 28 | 0x80);
                    }
                    this.method2477(arg0 >>> 21 | 0x80);
                }
                this.method2477(arg0 >>> 14 | 0x80);
            }
            this.method2477(arg0 >>> 7 | 0x80);
        }
        this.method2477(arg0 & 0x7F);
    }

    @ObfuscatedName("da.al(I)I")
    public int method2491() {
        return this.field2041[++this.field2039 - 1] & 0xFF;
    }

    @ObfuscatedName("da.az(B)B")
    public byte method2492() {
        return this.field2041[++this.field2039 - 1];
    }

    @ObfuscatedName("da.aj(I)I")
    public int method2493() {
        this.field2039 += 2;
        return ((this.field2041[this.field2039 - 2] & 0xFF) << 8) + (this.field2041[this.field2039 - 1] & 0xFF);
    }

    @ObfuscatedName("da.an(I)I")
    public int method2529() {
        this.field2039 += 2;
        int var1 = ((this.field2041[this.field2039 - 2] & 0xFF) << 8) + (this.field2041[this.field2039 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("da.ad(B)I")
    public int method2494() {
        this.field2039 += 3;
        return (this.field2041[this.field2039 - 1] & 0xFF) + ((this.field2041[this.field2039 - 3] & 0xFF) << 16) + ((this.field2041[this.field2039 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("da.af(I)I")
    public int method2668() {
        this.field2039 += 4;
        return (this.field2041[this.field2039 - 1] & 0xFF) + ((this.field2041[this.field2039 - 2] & 0xFF) << 8) + ((this.field2041[this.field2039 - 4] & 0xFF) << 24) + ((this.field2041[this.field2039 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("da.av(I)J")
    public long method2496() {
        long var1 = (long) this.method2668() & 0xFFFFFFFFL;
        long var3 = (long) this.method2668() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("da.aa(B)Ljava/lang/String;")
    public String method2497() {
        if (this.field2041[this.field2039] == 0) {
            this.field2039++;
            return null;
        } else {
            return this.method2500();
        }
    }

    @ObfuscatedName("da.be(I)Ljava/lang/String;")
    public String method2500() {
        int var1 = this.field2039;
        while (this.field2041[++this.field2039 - 1] != 0) {
        }
        int var2 = this.field2039 - var1 - 1;
        return var2 == 0 ? "" : class149.method2999(this.field2041, var1, var2);
    }

    @ObfuscatedName("da.bc(B)Ljava/lang/String;")
    public String method2499() {
        byte var1 = this.field2041[++this.field2039 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2039;
        while (this.field2041[++this.field2039 - 1] != 0) {
        }
        int var3 = this.field2039 - var2 - 1;
        return var3 == 0 ? "" : class149.method2999(this.field2041, var2, var3);
    }

    @ObfuscatedName("da.br(I)Ljava/lang/String;")
    public String method2646() {
        byte var1 = this.field2041[++this.field2039 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2505();
        if (this.field2039 + var2 > this.field2041.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2041;
        int var4 = this.field2039;
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
        this.field2039 += var2;
        return var12;
    }

    @ObfuscatedName("da.bw([BIIB)V")
    public void method2647(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2041[++this.field2039 - 1];
        }
    }

    @ObfuscatedName("da.bj(B)I")
    public int method2502() {
        int var1 = this.field2041[this.field2039] & 0xFF;
        return var1 < 128 ? this.method2491() - 64 : this.method2493() - 49152;
    }

    @ObfuscatedName("da.bs(I)I")
    public int method2570() {
        int var1 = this.field2041[this.field2039] & 0xFF;
        return var1 < 128 ? this.method2491() : this.method2493() - 32768;
    }

    @ObfuscatedName("da.bi(I)I")
    public int method2504() {
        return this.field2041[this.field2039] < 0 ? this.method2668() & Integer.MAX_VALUE : this.method2493();
    }

    @ObfuscatedName("da.bb(B)I")
    public int method2505() {
        byte var1 = this.field2041[++this.field2039 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2041[++this.field2039 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("da.bk([IIII)V")
    public void method2506(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2039;
        this.field2039 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2668();
            int var8 = this.method2668();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2039 -= 8;
            this.method2480(var7);
            this.method2480(var8);
        }
        this.field2039 = var4;
    }

    @ObfuscatedName("da.bm([IIII)V")
    public void method2565(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2039;
        this.field2039 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2668();
            int var8 = this.method2668();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2039 -= 8;
            this.method2480(var7);
            this.method2480(var8);
        }
        this.field2039 = var4;
    }

    @ObfuscatedName("da.bd(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2508(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2039;
        this.field2039 = 0;
        byte[] var4 = new byte[var3];
        this.method2647(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2039 = 0;
        this.method2694(var7.length);
        this.method2485(var7, 0, var7.length);
    }

    @ObfuscatedName("da.bx(IB)I")
    public int method2579(int arg0) {
        byte[] var2 = this.field2041;
        int var3 = this.field2039;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2040[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2480(var6);
        return var6;
    }

    @ObfuscatedName("da.bl(I)Z")
    public boolean method2621() {
        this.field2039 -= 4;
        byte[] var1 = this.field2041;
        int var2 = this.field2039;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2040[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2668();
        return var5 == var8;
    }

    @ObfuscatedName("da.bq(II)V")
    public void method2511(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("da.ba(II)V")
    public void method2512(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("da.bf(II)V")
    public void method2513(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("da.bg(B)I")
    public int method2648() {
        return this.field2041[++this.field2039 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("da.bu(I)I")
    public int method2515() {
        return -this.field2041[++this.field2039 - 1] & 0xFF;
    }

    @ObfuscatedName("da.bt(I)I")
    public int method2516() {
        return 128 - this.field2041[++this.field2039 - 1] & 0xFF;
    }

    @ObfuscatedName("da.bp(I)B")
    public byte method2517() {
        return (byte) (this.field2041[++this.field2039 - 1] - 128);
    }

    @ObfuscatedName("da.bz(I)B")
    public byte method2518() {
        return (byte) (128 - this.field2041[++this.field2039 - 1]);
    }

    @ObfuscatedName("da.by(IB)V")
    public void method2519(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) arg0;
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("da.bo(II)V")
    public void method2520(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("da.bv(IB)V")
    public void method2537(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 + 128);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("da.bh(I)I")
    public int method2522() {
        this.field2039 += 2;
        return ((this.field2041[this.field2039 - 1] & 0xFF) << 8) + (this.field2041[this.field2039 - 2] & 0xFF);
    }

    @ObfuscatedName("da.bn(B)I")
    public int method2644() {
        this.field2039 += 2;
        return ((this.field2041[this.field2039 - 2] & 0xFF) << 8) + (this.field2041[this.field2039 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("da.ca(I)I")
    public int method2524() {
        this.field2039 += 2;
        return ((this.field2041[this.field2039 - 1] & 0xFF) << 8) + (this.field2041[this.field2039 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("da.cq(I)I")
    public int method2660() {
        this.field2039 += 2;
        int var1 = ((this.field2041[this.field2039 - 1] & 0xFF) << 8) + (this.field2041[this.field2039 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("da.cu(B)I")
    public int method2526() {
        this.field2039 += 2;
        int var1 = ((this.field2041[this.field2039 - 2] & 0xFF) << 8) + (this.field2041[this.field2039 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("da.cs(I)I")
    public int method2576() {
        this.field2039 += 3;
        return (this.field2041[this.field2039 - 3] & 0xFF) + ((this.field2041[this.field2039 - 1] & 0xFF) << 16) + ((this.field2041[this.field2039 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("da.cf(II)V")
    public void method2528(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) arg0;
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 16);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("da.cx(II)V")
    public void method2670(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2041[++this.field2039 - 1] = (byte) arg0;
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 24);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("da.cl(IS)V")
    public void method2548(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 16);
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 24);
        this.field2041[++this.field2039 - 1] = (byte) arg0;
        this.field2041[++this.field2039 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("da.co(S)I")
    public int method2531() {
        this.field2039 += 4;
        return (this.field2041[this.field2039 - 4] & 0xFF) + ((this.field2041[this.field2039 - 3] & 0xFF) << 8) + ((this.field2041[this.field2039 - 1] & 0xFF) << 24) + ((this.field2041[this.field2039 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("da.cj(I)I")
    public int method2656() {
        this.field2039 += 4;
        return (this.field2041[this.field2039 - 3] & 0xFF) + ((this.field2041[this.field2039 - 4] & 0xFF) << 8) + ((this.field2041[this.field2039 - 2] & 0xFF) << 24) + ((this.field2041[this.field2039 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("da.cz(B)I")
    public int method2533() {
        this.field2039 += 4;
        return (this.field2041[this.field2039 - 2] & 0xFF) + ((this.field2041[this.field2039 - 1] & 0xFF) << 8) + ((this.field2041[this.field2039 - 4] & 0xFF) << 16) + ((this.field2041[this.field2039 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("da.cd([BIII)V")
    public void method2561(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2041[++this.field2039 - 1];
        }
    }

    @ObfuscatedName("da.cp([BIII)V")
    public void method2575(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2041[++this.field2039 - 1] - 128);
        }
    }
}
