package deob;

import java.math.BigInteger;

@ObfuscatedName("dn")
public class class127 extends class179 {

    @ObfuscatedName("dn.l")
    public byte[] field2039;

    @ObfuscatedName("dn.q")
    public int field2037;

    @ObfuscatedName("dn.b")
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

    @ObfuscatedName("a.az([BIII)I")
    public static int method30(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2040[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class127(int arg0) {
        this.field2039 = class114.method2257(arg0);
        this.field2037 = 0;
    }

    public class127(byte[] arg0) {
        this.field2039 = arg0;
        this.field2037 = 0;
    }

    @ObfuscatedName("dn.ax(II)V")
    public void method2397(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.aq(IB)V")
    public void method2398(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
        this.field2039[++this.field2037 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.ap(IB)V")
    public void method2399(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 16);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
        this.field2039[++this.field2037 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.aa(IB)V")
    public void method2400(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 24);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 16);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
        this.field2039[++this.field2037 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.ai(J)V")
    public void method2401(long arg0) {
        this.field2039[++this.field2037 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2039[++this.field2037 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2039[++this.field2037 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2039[++this.field2037 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2039[++this.field2037 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2039[++this.field2037 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2039[++this.field2037 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2039[++this.field2037 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("bo.ar(Ljava/lang/String;S)I")
    public static int method1488(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dn.ag(Ljava/lang/String;I)V")
    public void method2469(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2037 += class149.method1(arg0, 0, arg0.length(), this.field2039, this.field2037);
        this.field2039[++this.field2037 - 1] = 0;
    }

    @ObfuscatedName("dn.as(Ljava/lang/String;I)V")
    public void method2497(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2039[++this.field2037 - 1] = 0;
        this.field2037 += class149.method1(arg0, 0, arg0.length(), this.field2039, this.field2037);
        this.field2039[++this.field2037 - 1] = 0;
    }

    @ObfuscatedName("dn.ak(Ljava/lang/CharSequence;I)V")
    public void method2404(CharSequence arg0) {
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
        this.field2039[++this.field2037 - 1] = 0;
        this.method2410(var3);
        int var8 = this.field2037;
        byte[] var9 = this.field2039;
        int var10 = this.field2037;
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
        this.field2037 = var15 + var8;
    }

    @ObfuscatedName("dn.al([BIIB)V")
    public void method2405(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2039[++this.field2037 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dn.am(II)V")
    public void method2406(int arg0) {
        this.field2039[this.field2037 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2039[this.field2037 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2039[this.field2037 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2039[this.field2037 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.ao(II)V")
    public void method2407(int arg0) {
        this.field2039[this.field2037 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2039[this.field2037 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.ah(IB)V")
    public void method2408(int arg0) {
        this.field2039[this.field2037 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dn.aw(II)V")
    public void method2409(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2397(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2398(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dn.av(II)V")
    public void method2410(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2397(arg0 >>> 28 | 0x80);
                    }
                    this.method2397(arg0 >>> 21 | 0x80);
                }
                this.method2397(arg0 >>> 14 | 0x80);
            }
            this.method2397(arg0 >>> 7 | 0x80);
        }
        this.method2397(arg0 & 0x7F);
    }

    @ObfuscatedName("dn.au(I)I")
    public int method2411() {
        return this.field2039[++this.field2037 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.af(I)B")
    public byte method2475() {
        return this.field2039[++this.field2037 - 1];
    }

    @ObfuscatedName("dn.ab(B)I")
    public int method2413() {
        this.field2037 += 2;
        return ((this.field2039[this.field2037 - 2] & 0xFF) << 8) + (this.field2039[this.field2037 - 1] & 0xFF);
    }

    @ObfuscatedName("dn.aj(I)I")
    public int method2414() {
        this.field2037 += 2;
        int var1 = ((this.field2039[this.field2037 - 2] & 0xFF) << 8) + (this.field2039[this.field2037 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.ac(B)I")
    public int method2415() {
        this.field2037 += 3;
        return (this.field2039[this.field2037 - 1] & 0xFF) + ((this.field2039[this.field2037 - 3] & 0xFF) << 16) + ((this.field2039[this.field2037 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dn.ay(I)I")
    public int method2416() {
        this.field2037 += 4;
        return (this.field2039[this.field2037 - 1] & 0xFF) + ((this.field2039[this.field2037 - 2] & 0xFF) << 8) + ((this.field2039[this.field2037 - 4] & 0xFF) << 24) + ((this.field2039[this.field2037 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dn.ae(I)J")
    public long method2417() {
        long var1 = (long) this.method2416() & 0xFFFFFFFFL;
        long var3 = (long) this.method2416() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dn.ad(I)Ljava/lang/String;")
    public String method2557() {
        if (this.field2039[this.field2037] == 0) {
            this.field2037++;
            return null;
        } else {
            return this.method2419();
        }
    }

    @ObfuscatedName("dn.an(I)Ljava/lang/String;")
    public String method2419() {
        int var1 = this.field2037;
        while (this.field2039[++this.field2037 - 1] != 0) {
        }
        int var2 = this.field2037 - var1 - 1;
        return var2 == 0 ? "" : class149.method215(this.field2039, var1, var2);
    }

    @ObfuscatedName("dn.at(B)Ljava/lang/String;")
    public String method2420() {
        byte var1 = this.field2039[++this.field2037 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2037;
        while (this.field2039[++this.field2037 - 1] != 0) {
        }
        int var3 = this.field2037 - var2 - 1;
        return var3 == 0 ? "" : class149.method215(this.field2039, var2, var3);
    }

    @ObfuscatedName("dn.bu(I)Ljava/lang/String;")
    public String method2421() {
        byte var1 = this.field2039[++this.field2037 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2426();
        if (this.field2037 + var2 > this.field2039.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2039;
        int var4 = this.field2037;
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
        this.field2037 += var2;
        return var12;
    }

    @ObfuscatedName("dn.bt([BIII)V")
    public void method2597(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2039[++this.field2037 - 1];
        }
    }

    @ObfuscatedName("dn.bm(I)I")
    public int method2423() {
        int var1 = this.field2039[this.field2037] & 0xFF;
        return var1 < 128 ? this.method2411() - 64 : this.method2413() - 49152;
    }

    @ObfuscatedName("dn.bf(I)I")
    public int method2424() {
        int var1 = this.field2039[this.field2037] & 0xFF;
        return var1 < 128 ? this.method2411() : this.method2413() - 32768;
    }

    @ObfuscatedName("dn.bn(B)I")
    public int method2489() {
        return this.field2039[this.field2037] < 0 ? this.method2416() & Integer.MAX_VALUE : this.method2413();
    }

    @ObfuscatedName("dn.bw(I)I")
    public int method2426() {
        byte var1 = this.field2039[++this.field2037 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2039[++this.field2037 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dn.bd([IIII)V")
    public void method2427(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2037;
        this.field2037 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2416();
            int var8 = this.method2416();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2037 -= 8;
            this.method2400(var7);
            this.method2400(var8);
        }
        this.field2037 = var4;
    }

    @ObfuscatedName("dn.ba([IIII)V")
    public void method2428(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2037;
        this.field2037 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2416();
            int var8 = this.method2416();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2037 -= 8;
            this.method2400(var7);
            this.method2400(var8);
        }
        this.field2037 = var4;
    }

    @ObfuscatedName("dn.bk(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2429(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2037;
        this.field2037 = 0;
        byte[] var4 = new byte[var3];
        this.method2597(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2037 = 0;
        this.method2398(var7.length);
        this.method2405(var7, 0, var7.length);
    }

    @ObfuscatedName("dn.bz(II)I")
    public int method2595(int arg0) {
        int var2 = method30(this.field2039, arg0, this.field2037);
        this.method2400(var2);
        return var2;
    }

    @ObfuscatedName("dn.bh(I)Z")
    public boolean method2431() {
        this.field2037 -= 4;
        int var1 = method30(this.field2039, 0, this.field2037);
        int var2 = this.method2416();
        return var1 == var2;
    }

    @ObfuscatedName("dn.bp(II)V")
    public void method2432(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dn.bg(II)V")
    public void method2433(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dn.bx(B)I")
    public int method2434() {
        return this.field2039[++this.field2037 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dn.bi(B)I")
    public int method2535() {
        return -this.field2039[++this.field2037 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.bq(I)I")
    public int method2457() {
        return 128 - this.field2039[++this.field2037 - 1] & 0xFF;
    }

    @ObfuscatedName("dn.bc(B)B")
    public byte method2503() {
        return (byte) (this.field2039[++this.field2037 - 1] - 128);
    }

    @ObfuscatedName("dn.bs(I)B")
    public byte method2438() {
        return (byte) (-this.field2039[++this.field2037 - 1]);
    }

    @ObfuscatedName("dn.bb(B)B")
    public byte method2499() {
        return (byte) (128 - this.field2039[++this.field2037 - 1]);
    }

    @ObfuscatedName("dn.be(II)V")
    public void method2440(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) arg0;
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.by(II)V")
    public void method2441(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dn.bl(IB)V")
    public void method2442(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 + 128);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.bo(B)I")
    public int method2443() {
        this.field2037 += 2;
        return ((this.field2039[this.field2037 - 1] & 0xFF) << 8) + (this.field2039[this.field2037 - 2] & 0xFF);
    }

    @ObfuscatedName("dn.bv(B)I")
    public int method2490() {
        this.field2037 += 2;
        return ((this.field2039[this.field2037 - 2] & 0xFF) << 8) + (this.field2039[this.field2037 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dn.bj(B)I")
    public int method2445() {
        this.field2037 += 2;
        return ((this.field2039[this.field2037 - 1] & 0xFF) << 8) + (this.field2039[this.field2037 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dn.br(I)I")
    public int method2446() {
        this.field2037 += 2;
        int var1 = ((this.field2039[this.field2037 - 1] & 0xFF) << 8) + (this.field2039[this.field2037 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.ci(I)I")
    public int method2447() {
        this.field2037 += 2;
        int var1 = ((this.field2039[this.field2037 - 1] & 0xFF) << 8) + (this.field2039[this.field2037 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dn.ch(II)V")
    public void method2448(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) arg0;
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dn.cy(I)I")
    public int method2502() {
        this.field2037 += 3;
        return (this.field2039[this.field2037 - 3] & 0xFF) + ((this.field2039[this.field2037 - 1] & 0xFF) << 16) + ((this.field2039[this.field2037 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dn.cr(IS)V")
    public void method2559(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) arg0;
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 16);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dn.ca(IS)V")
    public void method2403(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
        this.field2039[++this.field2037 - 1] = (byte) arg0;
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 24);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dn.cs(IB)V")
    public void method2452(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 16);
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 24);
        this.field2039[++this.field2037 - 1] = (byte) arg0;
        this.field2039[++this.field2037 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dn.cj(I)I")
    public int method2453() {
        this.field2037 += 4;
        return (this.field2039[this.field2037 - 4] & 0xFF) + ((this.field2039[this.field2037 - 3] & 0xFF) << 8) + ((this.field2039[this.field2037 - 1] & 0xFF) << 24) + ((this.field2039[this.field2037 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dn.cq(B)I")
    public int method2435() {
        this.field2037 += 4;
        return (this.field2039[this.field2037 - 3] & 0xFF) + ((this.field2039[this.field2037 - 4] & 0xFF) << 8) + ((this.field2039[this.field2037 - 1] & 0xFF) << 16) + ((this.field2039[this.field2037 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dn.cn(I)I")
    public int method2478() {
        this.field2037 += 4;
        return (this.field2039[this.field2037 - 2] & 0xFF) + ((this.field2039[this.field2037 - 1] & 0xFF) << 8) + ((this.field2039[this.field2037 - 4] & 0xFF) << 16) + ((this.field2039[this.field2037 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dn.cf([BIII)V")
    public void method2456(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2039[++this.field2037 - 1] - 128);
        }
    }

    @ObfuscatedName("dn.cp([BIII)V")
    public void method2584(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2039[++this.field2037 - 1] - 128);
        }
    }
}
