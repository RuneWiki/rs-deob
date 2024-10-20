package deob;

import java.math.BigInteger;

@ObfuscatedName("dg")
public class class127 extends class179 {

    @ObfuscatedName("dg.a")
    public byte[] field2015;

    @ObfuscatedName("dg.q")
    public int field2008;

    @ObfuscatedName("dg.j")
    public static int[] field2009 = new int[256];

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
            field2009[var0] = var1;
        }
    }

    @ObfuscatedName("aw.ai([BIIB)I")
    public static int method868(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2009[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("de.ag([BII)I")
    public static int method2391(byte[] arg0, int arg1) {
        return method868(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2015 = class114.method2266(arg0);
        this.field2008 = 0;
    }

    public class127(byte[] arg0) {
        this.field2015 = arg0;
        this.field2008 = 0;
    }

    @ObfuscatedName("dg.as(IB)V")
    public void method2396(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.al(IB)V")
    public void method2397(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2008 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.aj(IS)V")
    public void method2398(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2008 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.am(IB)V")
    public void method2470(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 24);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2008 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.ab(J)V")
    public void method2400(long arg0) {
        this.field2015[++this.field2008 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2015[++this.field2008 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2015[++this.field2008 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2015[++this.field2008 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2015[++this.field2008 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2015[++this.field2008 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2015[++this.field2008 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2015[++this.field2008 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dg.ao(Ljava/lang/String;B)V")
    public void method2401(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2008 += Statics.method128(arg0, 0, arg0.length(), this.field2015, this.field2008);
        this.field2015[++this.field2008 - 1] = 0;
    }

    @ObfuscatedName("al.ac(Ljava/lang/String;B)I")
    public static int method575(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dg.ap(Ljava/lang/String;B)V")
    public void method2402(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2015[++this.field2008 - 1] = 0;
        this.field2008 += Statics.method128(arg0, 0, arg0.length(), this.field2015, this.field2008);
        this.field2015[++this.field2008 - 1] = 0;
    }

    @ObfuscatedName("dg.at(Ljava/lang/CharSequence;B)V")
    public void method2429(CharSequence arg0) {
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
        this.field2015[++this.field2008 - 1] = 0;
        this.method2409(var3);
        int var8 = this.field2008;
        byte[] var9 = this.field2015;
        int var10 = this.field2008;
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
        this.field2008 = var15 + var8;
    }

    @ObfuscatedName("dg.az([BIII)V")
    public void method2404(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2015[++this.field2008 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dg.ae(IB)V")
    public void method2405(int arg0) {
        this.field2015[this.field2008 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2015[this.field2008 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2015[this.field2008 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2015[this.field2008 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.ad(II)V")
    public void method2406(int arg0) {
        this.field2015[this.field2008 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2015[this.field2008 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.aw(II)V")
    public void method2492(int arg0) {
        this.field2015[this.field2008 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.an(II)V")
    public void method2408(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2396(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2397(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dg.aq(II)V")
    public void method2409(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2396(arg0 >>> 28 | 0x80);
                    }
                    this.method2396(arg0 >>> 21 | 0x80);
                }
                this.method2396(arg0 >>> 14 | 0x80);
            }
            this.method2396(arg0 >>> 7 | 0x80);
        }
        this.method2396(arg0 & 0x7F);
    }

    @ObfuscatedName("dg.ax(I)I")
    public int method2484() {
        return this.field2015[++this.field2008 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.af(B)B")
    public byte method2411() {
        return this.field2015[++this.field2008 - 1];
    }

    @ObfuscatedName("dg.ar(B)I")
    public int method2539() {
        this.field2008 += 2;
        return ((this.field2015[this.field2008 - 2] & 0xFF) << 8) + (this.field2015[this.field2008 - 1] & 0xFF);
    }

    @ObfuscatedName("dg.ay(B)I")
    public int method2517() {
        this.field2008 += 2;
        int var1 = ((this.field2015[this.field2008 - 2] & 0xFF) << 8) + (this.field2015[this.field2008 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.au(B)I")
    public int method2403() {
        this.field2008 += 3;
        return (this.field2015[this.field2008 - 1] & 0xFF) + ((this.field2015[this.field2008 - 3] & 0xFF) << 16) + ((this.field2015[this.field2008 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dg.ak(I)I")
    public int method2415() {
        this.field2008 += 4;
        return (this.field2015[this.field2008 - 1] & 0xFF) + ((this.field2015[this.field2008 - 2] & 0xFF) << 8) + ((this.field2015[this.field2008 - 3] & 0xFF) << 16) + ((this.field2015[this.field2008 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.aa(I)J")
    public long method2554() {
        long var1 = (long) this.method2415() & 0xFFFFFFFFL;
        long var3 = (long) this.method2415() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dg.av(I)Ljava/lang/String;")
    public String method2423() {
        if (this.field2015[this.field2008] == 0) {
            this.field2008++;
            return null;
        } else {
            return this.method2571();
        }
    }

    @ObfuscatedName("dg.ah(I)Ljava/lang/String;")
    public String method2571() {
        int var1 = this.field2008;
        while (this.field2015[++this.field2008 - 1] != 0) {
        }
        int var2 = this.field2008 - var1 - 1;
        return var2 == 0 ? "" : class149.method1537(this.field2015, var1, var2);
    }

    @ObfuscatedName("dg.bb(B)Ljava/lang/String;")
    public String method2399() {
        byte var1 = this.field2015[++this.field2008 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2008;
        while (this.field2015[++this.field2008 - 1] != 0) {
        }
        int var3 = this.field2008 - var2 - 1;
        return var3 == 0 ? "" : class149.method1537(this.field2015, var2, var3);
    }

    @ObfuscatedName("dg.bz(B)Ljava/lang/String;")
    public String method2410() {
        byte var1 = this.field2015[++this.field2008 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2425();
        if (this.field2008 + var2 > this.field2015.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method2638(this.field2015, this.field2008, var2);
        this.field2008 += var2;
        return var3;
    }

    @ObfuscatedName("dg.bl([BIII)V")
    public void method2421(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2015[++this.field2008 - 1];
        }
    }

    @ObfuscatedName("dg.bc(B)I")
    public int method2565() {
        int var1 = this.field2015[this.field2008] & 0xFF;
        return var1 < 128 ? this.method2484() - 64 : this.method2539() - 49152;
    }

    @ObfuscatedName("dg.bi(I)I")
    public int method2437() {
        int var1 = this.field2015[this.field2008] & 0xFF;
        return var1 < 128 ? this.method2484() : this.method2539() - 32768;
    }

    @ObfuscatedName("dg.bd(S)I")
    public int method2424() {
        return this.field2015[this.field2008] < 0 ? this.method2415() & Integer.MAX_VALUE : this.method2539();
    }

    @ObfuscatedName("dg.bv(I)I")
    public int method2425() {
        byte var1 = this.field2015[++this.field2008 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2015[++this.field2008 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dg.bs([IIII)V")
    public void method2426(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2008;
        this.field2008 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2415();
            int var8 = this.method2415();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2008 -= 8;
            this.method2470(var7);
            this.method2470(var8);
        }
        this.field2008 = var4;
    }

    @ObfuscatedName("dg.be([IIIB)V")
    public void method2427(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2008;
        this.field2008 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2415();
            int var8 = this.method2415();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2008 -= 8;
            this.method2470(var7);
            this.method2470(var8);
        }
        this.field2008 = var4;
    }

    @ObfuscatedName("dg.bu(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2428(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2008;
        this.field2008 = 0;
        byte[] var4 = new byte[var3];
        this.method2421(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2008 = 0;
        this.method2397(var7.length);
        this.method2404(var7, 0, var7.length);
    }

    @ObfuscatedName("dg.bj(II)I")
    public int method2550(int arg0) {
        int var2 = method868(this.field2015, arg0, this.field2008);
        this.method2470(var2);
        return var2;
    }

    @ObfuscatedName("dg.bh(B)Z")
    public boolean method2431() {
        this.field2008 -= 4;
        int var1 = method868(this.field2015, 0, this.field2008);
        int var2 = this.method2415();
        return var1 == var2;
    }

    @ObfuscatedName("dg.bm(IB)V")
    public void method2430(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dg.bg(II)V")
    public void method2567(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dg.br(I)I")
    public int method2432() {
        return this.field2015[++this.field2008 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dg.bw(B)I")
    public int method2433() {
        return -this.field2015[++this.field2008 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.bn(B)I")
    public int method2434() {
        return 128 - this.field2015[++this.field2008 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.bx(B)B")
    public byte method2478() {
        return (byte) (this.field2015[++this.field2008 - 1] - 128);
    }

    @ObfuscatedName("dg.bt(I)B")
    public byte method2471() {
        return (byte) (-this.field2015[++this.field2008 - 1]);
    }

    @ObfuscatedName("dg.ba(I)B")
    public byte method2551() {
        return (byte) (128 - this.field2015[++this.field2008 - 1]);
    }

    @ObfuscatedName("dg.bo(II)V")
    public void method2466(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) arg0;
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.bp(II)V")
    public void method2439(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dg.bk(II)V")
    public void method2499(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 + 128);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.by(B)I")
    public int method2441() {
        this.field2008 += 2;
        return ((this.field2015[this.field2008 - 1] & 0xFF) << 8) + (this.field2015[this.field2008 - 2] & 0xFF);
    }

    @ObfuscatedName("dg.bf(I)I")
    public int method2442() {
        this.field2008 += 2;
        return ((this.field2015[this.field2008 - 2] & 0xFF) << 8) + (this.field2015[this.field2008 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dg.bq(B)I")
    public int method2443() {
        this.field2008 += 2;
        return ((this.field2015[this.field2008 - 1] & 0xFF) << 8) + (this.field2015[this.field2008 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dg.cr(B)I")
    public int method2479() {
        this.field2008 += 2;
        int var1 = ((this.field2015[this.field2008 - 2] & 0xFF) << 8) + (this.field2015[this.field2008 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.cq(II)V")
    public void method2445(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2008 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.cn(II)V")
    public void method2446(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) arg0;
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dg.ck(II)V")
    public void method2467(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
        this.field2015[++this.field2008 - 1] = (byte) arg0;
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 24);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dg.co(II)V")
    public void method2448(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 16);
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 24);
        this.field2015[++this.field2008 - 1] = (byte) arg0;
        this.field2015[++this.field2008 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.cs(S)I")
    public int method2449() {
        this.field2008 += 4;
        return (this.field2015[this.field2008 - 4] & 0xFF) + ((this.field2015[this.field2008 - 3] & 0xFF) << 8) + ((this.field2015[this.field2008 - 1] & 0xFF) << 24) + ((this.field2015[this.field2008 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dg.cc(I)I")
    public int method2450() {
        this.field2008 += 4;
        return (this.field2015[this.field2008 - 3] & 0xFF) + ((this.field2015[this.field2008 - 4] & 0xFF) << 8) + ((this.field2015[this.field2008 - 1] & 0xFF) << 16) + ((this.field2015[this.field2008 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.cm(I)I")
    public int method2451() {
        this.field2008 += 4;
        return (this.field2015[this.field2008 - 2] & 0xFF) + ((this.field2015[this.field2008 - 1] & 0xFF) << 8) + ((this.field2015[this.field2008 - 3] & 0xFF) << 24) + ((this.field2015[this.field2008 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dg.ci([BIII)V")
    public void method2407(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2015[++this.field2008 - 1] - 128);
        }
    }
}
