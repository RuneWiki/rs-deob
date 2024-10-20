package deob;

import java.math.BigInteger;

@ObfuscatedName("df")
public class class126 extends class179 {

    @ObfuscatedName("df.t")
    public byte[] field2015;

    @ObfuscatedName("df.k")
    public int field2016;

    @ObfuscatedName("df.x")
    public static int[] field2017 = new int[256];

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
            field2017[var0] = var1;
        }
    }

    @ObfuscatedName("z.ad([BIB)I")
    public static int method148(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2017[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class126(int arg0) {
        this.field2015 = class114.method2250(arg0);
        this.field2016 = 0;
    }

    public class126(byte[] arg0) {
        this.field2015 = arg0;
        this.field2016 = 0;
    }

    @ObfuscatedName("df.au(II)V")
    public void method2364(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.as(II)V")
    public void method2365(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2016 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.ag(II)V")
    public void method2366(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2016 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.ab(II)V")
    public void method2367(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 24);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2016 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.aq(J)V")
    public void method2368(long arg0) {
        this.field2015[++this.field2016 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2015[++this.field2016 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2015[++this.field2016 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2015[++this.field2016 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2015[++this.field2016 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2015[++this.field2016 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2015[++this.field2016 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2015[++this.field2016 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("df.af(Ljava/lang/String;I)V")
    public void method2578(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2016 += class149.method1987(arg0, 0, arg0.length(), this.field2015, this.field2016);
        this.field2015[++this.field2016 - 1] = 0;
    }

    @ObfuscatedName("co.ay(Ljava/lang/String;I)I")
    public static int method1608(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("df.ax(Ljava/lang/String;I)V")
    public void method2370(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2015[++this.field2016 - 1] = 0;
        this.field2016 += class149.method1987(arg0, 0, arg0.length(), this.field2015, this.field2016);
        this.field2015[++this.field2016 - 1] = 0;
    }

    @ObfuscatedName("df.aa(Ljava/lang/CharSequence;B)V")
    public void method2559(CharSequence arg0) {
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
        this.field2015[++this.field2016 - 1] = 0;
        this.method2377(var3);
        this.field2016 += class180.method3164(this.field2015, this.field2016, arg0);
    }

    @ObfuscatedName("df.ak([BIIB)V")
    public void method2372(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2015[++this.field2016 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("df.ac(II)V")
    public void method2426(int arg0) {
        this.field2015[this.field2016 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2015[this.field2016 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2015[this.field2016 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2015[this.field2016 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.aj(II)V")
    public void method2441(int arg0) {
        this.field2015[this.field2016 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2015[this.field2016 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.av(II)V")
    public void method2375(int arg0) {
        this.field2015[this.field2016 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("df.al(II)V")
    public void method2469(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2364(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2365(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.an(II)V")
    public void method2377(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2364(arg0 >>> 28 | 0x80);
                    }
                    this.method2364(arg0 >>> 21 | 0x80);
                }
                this.method2364(arg0 >>> 14 | 0x80);
            }
            this.method2364(arg0 >>> 7 | 0x80);
        }
        this.method2364(arg0 & 0x7F);
    }

    @ObfuscatedName("df.ap(I)I")
    public int method2481() {
        return this.field2015[++this.field2016 - 1] & 0xFF;
    }

    @ObfuscatedName("df.at(B)B")
    public byte method2379() {
        return this.field2015[++this.field2016 - 1];
    }

    @ObfuscatedName("df.ae(B)I")
    public int method2373() {
        this.field2016 += 2;
        return ((this.field2015[this.field2016 - 2] & 0xFF) << 8) + (this.field2015[this.field2016 - 1] & 0xFF);
    }

    @ObfuscatedName("df.aw(I)I")
    public int method2381() {
        this.field2016 += 2;
        int var1 = ((this.field2015[this.field2016 - 2] & 0xFF) << 8) + (this.field2015[this.field2016 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.am(I)I")
    public int method2382() {
        this.field2016 += 3;
        return (this.field2015[this.field2016 - 1] & 0xFF) + ((this.field2015[this.field2016 - 3] & 0xFF) << 16) + ((this.field2015[this.field2016 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("df.ar(I)I")
    public int method2383() {
        this.field2016 += 4;
        return (this.field2015[this.field2016 - 1] & 0xFF) + ((this.field2015[this.field2016 - 2] & 0xFF) << 8) + ((this.field2015[this.field2016 - 4] & 0xFF) << 24) + ((this.field2015[this.field2016 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("df.ai(B)J")
    public long method2384() {
        long var1 = (long) this.method2383() & 0xFFFFFFFFL;
        long var3 = (long) this.method2383() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("df.ao(B)Ljava/lang/String;")
    public String method2398() {
        if (this.field2015[this.field2016] == 0) {
            this.field2016++;
            return null;
        } else {
            return this.method2386();
        }
    }

    @ObfuscatedName("df.az(I)Ljava/lang/String;")
    public String method2386() {
        int var1 = this.field2016;
        while (this.field2015[++this.field2016 - 1] != 0) {
        }
        int var2 = this.field2016 - var1 - 1;
        return var2 == 0 ? "" : class149.method2586(this.field2015, var1, var2);
    }

    @ObfuscatedName("df.bg(B)Ljava/lang/String;")
    public String method2378() {
        byte var1 = this.field2015[++this.field2016 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2016;
        while (this.field2015[++this.field2016 - 1] != 0) {
        }
        int var3 = this.field2016 - var2 - 1;
        return var3 == 0 ? "" : class149.method2586(this.field2015, var2, var3);
    }

    @ObfuscatedName("df.bd(I)Ljava/lang/String;")
    public String method2534() {
        byte var1 = this.field2015[++this.field2016 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2554();
        if (this.field2016 + var2 > this.field2015.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2015;
        int var4 = this.field2016;
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
        this.field2016 += var2;
        return var12;
    }

    @ObfuscatedName("df.bo([BIIB)V")
    public void method2575(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2015[++this.field2016 - 1];
        }
    }

    @ObfuscatedName("df.by(I)I")
    public int method2390() {
        int var1 = this.field2015[this.field2016] & 0xFF;
        return var1 < 128 ? this.method2481() - 64 : this.method2373() - 49152;
    }

    @ObfuscatedName("df.bk(B)I")
    public int method2391() {
        int var1 = this.field2015[this.field2016] & 0xFF;
        return var1 < 128 ? this.method2481() : this.method2373() - 32768;
    }

    @ObfuscatedName("df.be(I)I")
    public int method2392() {
        return this.field2015[this.field2016] < 0 ? this.method2383() & Integer.MAX_VALUE : this.method2373();
    }

    @ObfuscatedName("df.bc(I)I")
    public int method2554() {
        byte var1 = this.field2015[++this.field2016 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2015[++this.field2016 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("df.bl([IIII)V")
    public void method2453(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2016;
        this.field2016 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2383();
            int var8 = this.method2383();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2016 -= 8;
            this.method2367(var7);
            this.method2367(var8);
        }
        this.field2016 = var4;
    }

    @ObfuscatedName("df.ba([IIIB)V")
    public void method2395(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2016;
        this.field2016 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2383();
            int var8 = this.method2383();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2016 -= 8;
            this.method2367(var7);
            this.method2367(var8);
        }
        this.field2016 = var4;
    }

    @ObfuscatedName("df.bx(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2396(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2016;
        this.field2016 = 0;
        byte[] var4 = new byte[var3];
        this.method2575(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2016 = 0;
        this.method2365(var7.length);
        this.method2372(var7, 0, var7.length);
    }

    @ObfuscatedName("df.bq(IB)I")
    public int method2520(int arg0) {
        byte[] var2 = this.field2015;
        int var3 = this.field2016;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2017[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2367(var6);
        return var6;
    }

    @ObfuscatedName("df.bu(I)Z")
    public boolean method2399() {
        this.field2016 -= 4;
        byte[] var1 = this.field2015;
        int var2 = this.field2016;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2017[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2383();
        return var5 == var8;
    }

    @ObfuscatedName("df.bz(II)V")
    public void method2567(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("df.bw(IB)V")
    public void method2400(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("df.br(II)V")
    public void method2401(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("df.bf(I)I")
    public int method2397() {
        return this.field2015[++this.field2016 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("df.bi(I)I")
    public int method2403() {
        return -this.field2015[++this.field2016 - 1] & 0xFF;
    }

    @ObfuscatedName("df.bh(B)I")
    public int method2404() {
        return 128 - this.field2015[++this.field2016 - 1] & 0xFF;
    }

    @ObfuscatedName("df.bp(I)B")
    public byte method2405() {
        return (byte) (-this.field2015[++this.field2016 - 1]);
    }

    @ObfuscatedName("df.bb(I)B")
    public byte method2394() {
        return (byte) (128 - this.field2015[++this.field2016 - 1]);
    }

    @ObfuscatedName("df.bs(II)V")
    public void method2407(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) arg0;
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.bn(II)V")
    public void method2408(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("df.bm(II)V")
    public void method2409(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 + 128);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.bt(I)I")
    public int method2410() {
        this.field2016 += 2;
        return ((this.field2015[this.field2016 - 1] & 0xFF) << 8) + (this.field2015[this.field2016 - 2] & 0xFF);
    }

    @ObfuscatedName("df.bv(S)I")
    public int method2411() {
        this.field2016 += 2;
        return ((this.field2015[this.field2016 - 2] & 0xFF) << 8) + (this.field2015[this.field2016 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("df.bj(I)I")
    public int method2412() {
        this.field2016 += 2;
        return ((this.field2015[this.field2016 - 1] & 0xFF) << 8) + (this.field2015[this.field2016 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("df.cl(I)I")
    public int method2413() {
        this.field2016 += 2;
        int var1 = ((this.field2015[this.field2016 - 1] & 0xFF) << 8) + (this.field2015[this.field2016 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.ce(I)I")
    public int method2556() {
        this.field2016 += 2;
        int var1 = ((this.field2015[this.field2016 - 2] & 0xFF) << 8) + (this.field2015[this.field2016 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("df.ci(IB)V")
    public void method2415(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2016 - 1] = (byte) arg0;
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.cr(B)I")
    public int method2477() {
        this.field2016 += 3;
        return (this.field2015[this.field2016 - 3] & 0xFF) + ((this.field2015[this.field2016 - 1] & 0xFF) << 16) + ((this.field2015[this.field2016 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("df.cy(II)V")
    public void method2417(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) arg0;
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("df.cm(II)V")
    public void method2418(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2016 - 1] = (byte) arg0;
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 24);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("df.co(IS)V")
    public void method2419(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 24);
        this.field2015[++this.field2016 - 1] = (byte) arg0;
        this.field2015[++this.field2016 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("df.ct(B)I")
    public int method2420() {
        this.field2016 += 4;
        return (this.field2015[this.field2016 - 4] & 0xFF) + ((this.field2015[this.field2016 - 3] & 0xFF) << 8) + ((this.field2015[this.field2016 - 2] & 0xFF) << 16) + ((this.field2015[this.field2016 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("df.cb(I)I")
    public int method2421() {
        this.field2016 += 4;
        return (this.field2015[this.field2016 - 3] & 0xFF) + ((this.field2015[this.field2016 - 4] & 0xFF) << 8) + ((this.field2015[this.field2016 - 2] & 0xFF) << 24) + ((this.field2015[this.field2016 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("df.cw(I)I")
    public int method2393() {
        this.field2016 += 4;
        return (this.field2015[this.field2016 - 2] & 0xFF) + ((this.field2015[this.field2016 - 1] & 0xFF) << 8) + ((this.field2015[this.field2016 - 3] & 0xFF) << 24) + ((this.field2015[this.field2016 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("df.cj([BIII)V")
    public void method2460(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2015[++this.field2016 - 1] - 128);
        }
    }
}
