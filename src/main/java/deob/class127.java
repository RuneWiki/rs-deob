package deob;

import java.math.BigInteger;

@ObfuscatedName("dg")
public class class127 extends class179 {

    @ObfuscatedName("dg.v")
    public byte[] field2057;

    @ObfuscatedName("dg.g")
    public int field2052;

    @ObfuscatedName("dg.x")
    public static int[] field2053 = new int[256];

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
            field2053[var0] = var1;
        }
    }

    @ObfuscatedName("y.i([BIIB)I")
    public static int method28(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2053[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ax.ap([BIB)I")
    public static int method793(byte[] arg0, int arg1) {
        return method28(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2057 = class114.method2197(arg0);
        this.field2052 = 0;
    }

    public class127(byte[] arg0) {
        this.field2057 = arg0;
        this.field2052 = 0;
    }

    @ObfuscatedName("dg.as(II)V")
    public void method2333(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.ak(II)V")
    public void method2306(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2057[++this.field2052 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.af(IB)V")
    public void method2406(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2057[++this.field2052 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.ag(IB)V")
    public void method2307(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 24);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2057[++this.field2052 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.aj(J)V")
    public void method2308(long arg0) {
        this.field2057[++this.field2052 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2057[++this.field2052 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2057[++this.field2052 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2057[++this.field2052 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2057[++this.field2052 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2057[++this.field2052 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2057[++this.field2052 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2057[++this.field2052 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("e.ac(Ljava/lang/String;I)I")
    public static int method210(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dg.an(Ljava/lang/String;I)V")
    public void method2309(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2052 += class150.method4(arg0, 0, arg0.length(), this.field2057, this.field2052);
        this.field2057[++this.field2052 - 1] = 0;
    }

    @ObfuscatedName("dg.ad(Ljava/lang/String;I)V")
    public void method2310(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2057[++this.field2052 - 1] = 0;
        this.field2052 += class150.method4(arg0, 0, arg0.length(), this.field2057, this.field2052);
        this.field2057[++this.field2052 - 1] = 0;
    }

    @ObfuscatedName("dg.ai(Ljava/lang/CharSequence;I)V")
    public void method2452(CharSequence arg0) {
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
        this.field2057[++this.field2052 - 1] = 0;
        this.method2317(var3);
        int var8 = this.field2052;
        byte[] var9 = this.field2057;
        int var10 = this.field2052;
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
        this.field2052 = var15 + var8;
    }

    @ObfuscatedName("dg.ae([BIII)V")
    public void method2312(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2057[++this.field2052 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dg.au(IB)V")
    public void method2313(int arg0) {
        this.field2057[this.field2052 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2057[this.field2052 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2057[this.field2052 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2057[this.field2052 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.at(II)V")
    public void method2314(int arg0) {
        this.field2057[this.field2052 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2057[this.field2052 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.ax(II)V")
    public void method2374(int arg0) {
        this.field2057[this.field2052 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.aq(IB)V")
    public void method2316(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2333(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2306(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dg.aw(II)V")
    public void method2317(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2333(arg0 >>> 28 | 0x80);
                    }
                    this.method2333(arg0 >>> 21 | 0x80);
                }
                this.method2333(arg0 >>> 14 | 0x80);
            }
            this.method2333(arg0 >>> 7 | 0x80);
        }
        this.method2333(arg0 & 0x7F);
    }

    @ObfuscatedName("dg.ao(I)I")
    public int method2383() {
        return this.field2057[++this.field2052 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.aa(I)B")
    public byte method2319() {
        return this.field2057[++this.field2052 - 1];
    }

    @ObfuscatedName("dg.ah(B)I")
    public int method2327() {
        this.field2052 += 2;
        return ((this.field2057[this.field2052 - 2] & 0xFF) << 8) + (this.field2057[this.field2052 - 1] & 0xFF);
    }

    @ObfuscatedName("dg.av(I)I")
    public int method2321() {
        this.field2052 += 2;
        int var1 = ((this.field2057[this.field2052 - 2] & 0xFF) << 8) + (this.field2057[this.field2052 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.am(I)I")
    public int method2322() {
        this.field2052 += 3;
        return (this.field2057[this.field2052 - 1] & 0xFF) + ((this.field2057[this.field2052 - 2] & 0xFF) << 8) + ((this.field2057[this.field2052 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dg.ab(I)I")
    public int method2323() {
        this.field2052 += 4;
        return (this.field2057[this.field2052 - 1] & 0xFF) + ((this.field2057[this.field2052 - 2] & 0xFF) << 8) + ((this.field2057[this.field2052 - 4] & 0xFF) << 24) + ((this.field2057[this.field2052 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dg.az(B)J")
    public long method2324() {
        long var1 = (long) this.method2323() & 0xFFFFFFFFL;
        long var3 = (long) this.method2323() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dg.al(I)Ljava/lang/String;")
    public String method2325() {
        if (this.field2057[this.field2052] == 0) {
            this.field2052++;
            return null;
        } else {
            return this.method2315();
        }
    }

    @ObfuscatedName("dg.ar(B)Ljava/lang/String;")
    public String method2315() {
        int var1 = this.field2052;
        while (this.field2057[++this.field2052 - 1] != 0) {
        }
        int var2 = this.field2052 - var1 - 1;
        return var2 == 0 ? "" : class150.method1956(this.field2057, var1, var2);
    }

    @ObfuscatedName("dg.ay(I)Ljava/lang/String;")
    public String method2349() {
        byte var1 = this.field2057[++this.field2052 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2052;
        while (this.field2057[++this.field2052 - 1] != 0) {
        }
        int var3 = this.field2052 - var2 - 1;
        return var3 == 0 ? "" : class150.method1956(this.field2057, var2, var3);
    }

    @ObfuscatedName("dg.bi(B)Ljava/lang/String;")
    public String method2328() {
        byte var1 = this.field2057[++this.field2052 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2342();
        if (this.field2052 + var2 > this.field2057.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method2131(this.field2057, this.field2052, var2);
        this.field2052 += var2;
        return var3;
    }

    @ObfuscatedName("dg.bf([BIIB)V")
    public void method2329(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2057[++this.field2052 - 1];
        }
    }

    @ObfuscatedName("dg.be(I)I")
    public int method2412() {
        int var1 = this.field2057[this.field2052] & 0xFF;
        return var1 < 128 ? this.method2383() - 64 : this.method2327() - 49152;
    }

    @ObfuscatedName("dg.bl(B)I")
    public int method2331() {
        int var1 = this.field2057[this.field2052] & 0xFF;
        return var1 < 128 ? this.method2383() : this.method2327() - 32768;
    }

    @ObfuscatedName("dg.bd(I)I")
    public int method2332() {
        return this.field2057[this.field2052] < 0 ? this.method2323() & Integer.MAX_VALUE : this.method2327();
    }

    @ObfuscatedName("dg.bm(I)I")
    public int method2342() {
        byte var1 = this.field2057[++this.field2052 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2057[++this.field2052 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dg.ba([IIII)V")
    public void method2334(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2052;
        this.field2052 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2323();
            int var8 = this.method2323();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2052 -= 8;
            this.method2307(var7);
            this.method2307(var8);
        }
        this.field2052 = var4;
    }

    @ObfuscatedName("dg.bu([IIII)V")
    public void method2371(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2052;
        this.field2052 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2323();
            int var8 = this.method2323();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2052 -= 8;
            this.method2307(var7);
            this.method2307(var8);
        }
        this.field2052 = var4;
    }

    @ObfuscatedName("dg.bb(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2336(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2052;
        this.field2052 = 0;
        byte[] var4 = new byte[var3];
        this.method2329(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2052 = 0;
        this.method2306(var7.length);
        this.method2312(var7, 0, var7.length);
    }

    @ObfuscatedName("dg.by(IB)I")
    public int method2409(int arg0) {
        int var2 = method28(this.field2057, arg0, this.field2052);
        this.method2307(var2);
        return var2;
    }

    @ObfuscatedName("dg.bo(I)Z")
    public boolean method2338() {
        this.field2052 -= 4;
        int var1 = method28(this.field2057, 0, this.field2052);
        int var2 = this.method2323();
        return var1 == var2;
    }

    @ObfuscatedName("dg.bg(II)V")
    public void method2507(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dg.bs(IB)V")
    public void method2372(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dg.bc(IB)V")
    public void method2341(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dg.bv(I)I")
    public int method2444() {
        return this.field2057[++this.field2052 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dg.bx(B)I")
    public int method2515() {
        return -this.field2057[++this.field2052 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.bt(I)I")
    public int method2454() {
        return 128 - this.field2057[++this.field2052 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.bk(I)B")
    public byte method2345() {
        return (byte) (-this.field2057[++this.field2052 - 1]);
    }

    @ObfuscatedName("dg.bn(B)B")
    public byte method2346() {
        return (byte) (128 - this.field2057[++this.field2052 - 1]);
    }

    @ObfuscatedName("dg.bp(II)V")
    public void method2330(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) arg0;
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.bw(II)V")
    public void method2348(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dg.bz(IB)V")
    public void method2337(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 + 128);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.br(I)I")
    public int method2350() {
        this.field2052 += 2;
        return ((this.field2057[this.field2052 - 1] & 0xFF) << 8) + (this.field2057[this.field2052 - 2] & 0xFF);
    }

    @ObfuscatedName("dg.bh(B)I")
    public int method2393() {
        this.field2052 += 2;
        return ((this.field2057[this.field2052 - 2] & 0xFF) << 8) + (this.field2057[this.field2052 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dg.bq(I)I")
    public int method2387() {
        this.field2052 += 2;
        return ((this.field2057[this.field2052 - 1] & 0xFF) << 8) + (this.field2057[this.field2052 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dg.bj(B)I")
    public int method2353() {
        this.field2052 += 2;
        int var1 = ((this.field2057[this.field2052 - 1] & 0xFF) << 8) + (this.field2057[this.field2052 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.co(I)I")
    public int method2354() {
        this.field2052 += 2;
        int var1 = ((this.field2057[this.field2052 - 1] & 0xFF) << 8) + (this.field2057[this.field2052 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.ce(IB)V")
    public void method2362(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) arg0;
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dg.cf(I)I")
    public int method2440() {
        this.field2052 += 3;
        return (this.field2057[this.field2052 - 2] & 0xFF) + ((this.field2057[this.field2052 - 3] & 0xFF) << 16) + ((this.field2057[this.field2052 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dg.cr(II)V")
    public void method2370(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) arg0;
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dg.cy(II)V")
    public void method2305(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2057[++this.field2052 - 1] = (byte) arg0;
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 24);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dg.cq(II)V")
    public void method2359(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 24);
        this.field2057[++this.field2052 - 1] = (byte) arg0;
        this.field2057[++this.field2052 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.cj(I)I")
    public int method2463() {
        this.field2052 += 4;
        return (this.field2057[this.field2052 - 4] & 0xFF) + ((this.field2057[this.field2052 - 3] & 0xFF) << 8) + ((this.field2057[this.field2052 - 2] & 0xFF) << 16) + ((this.field2057[this.field2052 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.cd(B)I")
    public int method2361() {
        this.field2052 += 4;
        return (this.field2057[this.field2052 - 3] & 0xFF) + ((this.field2057[this.field2052 - 4] & 0xFF) << 8) + ((this.field2057[this.field2052 - 2] & 0xFF) << 24) + ((this.field2057[this.field2052 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dg.cw(I)I")
    public int method2477() {
        this.field2052 += 4;
        return (this.field2057[this.field2052 - 2] & 0xFF) + ((this.field2057[this.field2052 - 1] & 0xFF) << 8) + ((this.field2057[this.field2052 - 4] & 0xFF) << 16) + ((this.field2057[this.field2052 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.ch([BIII)V")
    public void method2363(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2057[++this.field2052 - 1];
        }
    }

    @ObfuscatedName("dg.ci([BIIB)V")
    public void method2391(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2057[++this.field2052 - 1] - 128);
        }
    }
}
