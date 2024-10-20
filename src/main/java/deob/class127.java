package deob;

import java.math.BigInteger;

@ObfuscatedName("do")
public class class127 extends class179 {

    @ObfuscatedName("do.z")
    public byte[] field2042;

    @ObfuscatedName("do.m")
    public int field2039;

    @ObfuscatedName("do.k")
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
        this.field2042 = class114.method2290(arg0);
        this.field2039 = 0;
    }

    public class127(byte[] arg0) {
        this.field2042 = arg0;
        this.field2039 = 0;
    }

    @ObfuscatedName("do.w(II)V")
    public void method2411(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.x(II)V")
    public void method2424(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2042[++this.field2039 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.j(II)V")
    public void method2413(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 16);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2042[++this.field2039 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.i(II)V")
    public void method2414(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 24);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 16);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2042[++this.field2039 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.ap(J)V")
    public void method2415(long arg0) {
        this.field2042[++this.field2039 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2042[++this.field2039 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2042[++this.field2039 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2042[++this.field2039 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2042[++this.field2039 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2042[++this.field2039 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2042[++this.field2039 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2042[++this.field2039 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("br.am(Ljava/lang/String;I)I")
    public static int method1331(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("do.ao(Ljava/lang/String;I)V")
    public void method2416(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2039 += class150.method2699(arg0, 0, arg0.length(), this.field2042, this.field2039);
        this.field2042[++this.field2039 - 1] = 0;
    }

    @ObfuscatedName("do.af(Ljava/lang/String;B)V")
    public void method2417(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2042[++this.field2039 - 1] = 0;
        this.field2039 += class150.method2699(arg0, 0, arg0.length(), this.field2042, this.field2039);
        this.field2042[++this.field2039 - 1] = 0;
    }

    @ObfuscatedName("do.ae(Ljava/lang/CharSequence;I)V")
    public void method2421(CharSequence arg0) {
        int var2 = class180.method3118(arg0);
        this.field2042[++this.field2039 - 1] = 0;
        this.method2472(var2);
        int var3 = this.field2039;
        byte[] var4 = this.field2042;
        int var5 = this.field2039;
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
        this.field2039 = var10 + var3;
    }

    @ObfuscatedName("do.az([BIII)V")
    public void method2503(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2042[++this.field2039 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("do.al(IB)V")
    public void method2420(int arg0) {
        this.field2042[this.field2039 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2042[this.field2039 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2042[this.field2039 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2042[this.field2039 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.ak(II)V")
    public void method2552(int arg0) {
        this.field2042[this.field2039 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2042[this.field2039 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.ac(II)V")
    public void method2422(int arg0) {
        this.field2042[this.field2039 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.an(II)V")
    public void method2565(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2411(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2424(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.ai(IS)V")
    public void method2472(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2411(arg0 >>> 28 | 0x80);
                    }
                    this.method2411(arg0 >>> 21 | 0x80);
                }
                this.method2411(arg0 >>> 14 | 0x80);
            }
            this.method2411(arg0 >>> 7 | 0x80);
        }
        this.method2411(arg0 & 0x7F);
    }

    @ObfuscatedName("do.aa(B)I")
    public int method2534() {
        return this.field2042[++this.field2039 - 1] & 0xFF;
    }

    @ObfuscatedName("do.ab(I)B")
    public byte method2426() {
        return this.field2042[++this.field2039 - 1];
    }

    @ObfuscatedName("do.aj(I)I")
    public int method2427() {
        this.field2039 += 2;
        return ((this.field2042[this.field2039 - 2] & 0xFF) << 8) + (this.field2042[this.field2039 - 1] & 0xFF);
    }

    @ObfuscatedName("do.au(I)I")
    public int method2452() {
        this.field2039 += 2;
        int var1 = ((this.field2042[this.field2039 - 2] & 0xFF) << 8) + (this.field2042[this.field2039 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.ar(I)I")
    public int method2429() {
        this.field2039 += 3;
        return (this.field2042[this.field2039 - 1] & 0xFF) + ((this.field2042[this.field2039 - 3] & 0xFF) << 16) + ((this.field2042[this.field2039 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("do.ad(B)I")
    public int method2430() {
        this.field2039 += 4;
        return (this.field2042[this.field2039 - 1] & 0xFF) + ((this.field2042[this.field2039 - 2] & 0xFF) << 8) + ((this.field2042[this.field2039 - 3] & 0xFF) << 16) + ((this.field2042[this.field2039 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("do.at(I)J")
    public long method2431() {
        long var1 = (long) this.method2430() & 0xFFFFFFFFL;
        long var3 = (long) this.method2430() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("do.ag(I)Ljava/lang/String;")
    public String method2432() {
        if (this.field2042[this.field2039] == 0) {
            this.field2039++;
            return null;
        } else {
            return this.method2460();
        }
    }

    @ObfuscatedName("do.ax(I)Ljava/lang/String;")
    public String method2460() {
        int var1 = this.field2039;
        while (this.field2042[++this.field2039 - 1] != 0) {
        }
        int var2 = this.field2039 - var1 - 1;
        return var2 == 0 ? "" : class150.method2180(this.field2042, var1, var2);
    }

    @ObfuscatedName("do.ah(I)Ljava/lang/String;")
    public String method2434() {
        byte var1 = this.field2042[++this.field2039 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2039;
        while (this.field2042[++this.field2039 - 1] != 0) {
        }
        int var3 = this.field2039 - var2 - 1;
        return var3 == 0 ? "" : class150.method2180(this.field2042, var2, var3);
    }

    @ObfuscatedName("do.av(I)Ljava/lang/String;")
    public String method2509() {
        byte var1 = this.field2042[++this.field2039 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2514();
        if (this.field2039 + var2 > this.field2042.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2042;
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

    @ObfuscatedName("do.as([BIII)V")
    public void method2532(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2042[++this.field2039 - 1];
        }
    }

    @ObfuscatedName("do.ay(I)I")
    public int method2437() {
        int var1 = this.field2042[this.field2039] & 0xFF;
        return var1 < 128 ? this.method2534() - 64 : this.method2427() - 49152;
    }

    @ObfuscatedName("do.aq(S)I")
    public int method2596() {
        int var1 = this.field2042[this.field2039] & 0xFF;
        return var1 < 128 ? this.method2534() : this.method2427() - 32768;
    }

    @ObfuscatedName("do.aw(I)I")
    public int method2439() {
        return this.field2042[this.field2039] < 0 ? this.method2430() & Integer.MAX_VALUE : this.method2427();
    }

    @ObfuscatedName("do.bc(B)I")
    public int method2514() {
        byte var1 = this.field2042[++this.field2039 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2042[++this.field2039 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("do.bb([IIII)V")
    public void method2441(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2039;
        this.field2039 = arg1;
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
            this.field2039 -= 8;
            this.method2414(var7);
            this.method2414(var8);
        }
        this.field2039 = var4;
    }

    @ObfuscatedName("do.bf([IIIB)V")
    public void method2442(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2039;
        this.field2039 = arg1;
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
            this.field2039 -= 8;
            this.method2414(var7);
            this.method2414(var8);
        }
        this.field2039 = var4;
    }

    @ObfuscatedName("do.bn(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2443(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2039;
        this.field2039 = 0;
        byte[] var4 = new byte[var3];
        this.method2532(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2039 = 0;
        this.method2424(var7.length);
        this.method2503(var7, 0, var7.length);
    }

    @ObfuscatedName("do.bh(IB)I")
    public int method2444(int arg0) {
        byte[] var2 = this.field2042;
        int var3 = this.field2039;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2040[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2414(var6);
        return var6;
    }

    @ObfuscatedName("do.bt(I)Z")
    public boolean method2445() {
        this.field2039 -= 4;
        byte[] var1 = this.field2042;
        int var2 = this.field2039;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2040[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2430();
        return var5 == var8;
    }

    @ObfuscatedName("do.bq(IS)V")
    public void method2492(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.bk(II)V")
    public void method2585(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("do.bi(IB)V")
    public void method2567(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("do.br(I)I")
    public int method2501() {
        return this.field2042[++this.field2039 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("do.by(I)I")
    public int method2491() {
        return -this.field2042[++this.field2039 - 1] & 0xFF;
    }

    @ObfuscatedName("do.bv(B)I")
    public int method2489() {
        return 128 - this.field2042[++this.field2039 - 1] & 0xFF;
    }

    @ObfuscatedName("do.bs(B)B")
    public byte method2428() {
        return (byte) (this.field2042[++this.field2039 - 1] - 128);
    }

    @ObfuscatedName("do.bj(B)B")
    public byte method2453() {
        return (byte) (-this.field2042[++this.field2039 - 1]);
    }

    @ObfuscatedName("do.bp(IB)V")
    public void method2454(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) arg0;
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.bw(II)V")
    public void method2455(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.bz(II)V")
    public void method2456(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 + 128);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.bo(B)I")
    public int method2457() {
        this.field2039 += 2;
        return ((this.field2042[this.field2039 - 1] & 0xFF) << 8) + (this.field2042[this.field2039 - 2] & 0xFF);
    }

    @ObfuscatedName("do.bm(I)I")
    public int method2458() {
        this.field2039 += 2;
        return ((this.field2042[this.field2039 - 2] & 0xFF) << 8) + (this.field2042[this.field2039 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("do.bu(I)I")
    public int method2459() {
        this.field2039 += 2;
        return ((this.field2042[this.field2039 - 1] & 0xFF) << 8) + (this.field2042[this.field2039 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("do.bl(I)I")
    public int method2488() {
        this.field2039 += 2;
        int var1 = ((this.field2042[this.field2039 - 1] & 0xFF) << 8) + (this.field2042[this.field2039 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.ba(B)I")
    public int method2461() {
        this.field2039 += 2;
        int var1 = ((this.field2042[this.field2039 - 1] & 0xFF) << 8) + (this.field2042[this.field2039 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.bd(II)V")
    public void method2462(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) arg0;
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("do.bx(I)I")
    public int method2463() {
        this.field2039 += 3;
        return (this.field2042[this.field2039 - 1] & 0xFF) + ((this.field2042[this.field2039 - 3] & 0xFF) << 8) + ((this.field2042[this.field2039 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("do.be(II)V")
    public void method2464(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) arg0;
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 16);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("do.bg(IB)V")
    public void method2549(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
        this.field2042[++this.field2039 - 1] = (byte) arg0;
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 24);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("do.cg(IB)V")
    public void method2465(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 16);
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 24);
        this.field2042[++this.field2039 - 1] = (byte) arg0;
        this.field2042[++this.field2039 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.cm(I)I")
    public int method2466() {
        this.field2039 += 4;
        return (this.field2042[this.field2039 - 4] & 0xFF) + ((this.field2042[this.field2039 - 3] & 0xFF) << 8) + ((this.field2042[this.field2039 - 1] & 0xFF) << 24) + ((this.field2042[this.field2039 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("do.cp(I)I")
    public int method2467() {
        this.field2039 += 4;
        return (this.field2042[this.field2039 - 3] & 0xFF) + ((this.field2042[this.field2039 - 4] & 0xFF) << 8) + ((this.field2042[this.field2039 - 1] & 0xFF) << 16) + ((this.field2042[this.field2039 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("do.ch(I)I")
    public int method2468() {
        this.field2039 += 4;
        return (this.field2042[this.field2039 - 2] & 0xFF) + ((this.field2042[this.field2039 - 1] & 0xFF) << 8) + ((this.field2042[this.field2039 - 4] & 0xFF) << 16) + ((this.field2042[this.field2039 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("do.co([BIII)V")
    public void method2436(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2042[++this.field2039 - 1];
        }
    }
}
