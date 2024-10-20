package deob;

import java.math.BigInteger;

@ObfuscatedName("dq")
public class class127 extends class179 {

    @ObfuscatedName("dq.e")
    public byte[] field2030;

    @ObfuscatedName("dq.l")
    public int field2033;

    @ObfuscatedName("dq.d")
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

    @ObfuscatedName("dx.z([BIIS)I")
    public static int method2198(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2031[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("c.w([BII)I")
    public static int method169(byte[] arg0, int arg1) {
        return method2198(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2030 = class114.method2310(arg0);
        this.field2033 = 0;
    }

    public class127(byte[] arg0) {
        this.field2030 = arg0;
        this.field2033 = 0;
    }

    @ObfuscatedName("dq.h(II)V")
    public void method2536(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.y(II)V")
    public void method2563(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2033 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.x(II)V")
    public void method2446(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2033 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.p(II)V")
    public void method2447(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 24);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2033 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.i(J)V")
    public void method2448(long arg0) {
        this.field2030[++this.field2033 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2030[++this.field2033 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2030[++this.field2033 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2030[++this.field2033 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2030[++this.field2033 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2030[++this.field2033 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2030[++this.field2033 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2030[++this.field2033 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dq.aa(Ljava/lang/String;I)V")
    public void method2449(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2033 += class150.method776(arg0, 0, arg0.length(), this.field2030, this.field2033);
        this.field2030[++this.field2033 - 1] = 0;
    }

    @ObfuscatedName("dq.ax(Ljava/lang/String;B)V")
    public void method2450(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2030[++this.field2033 - 1] = 0;
        this.field2033 += class150.method776(arg0, 0, arg0.length(), this.field2030, this.field2033);
        this.field2030[++this.field2033 - 1] = 0;
    }

    @ObfuscatedName("dq.ad(Ljava/lang/CharSequence;I)V")
    public void method2451(CharSequence arg0) {
        int var2 = class180.method2140(arg0);
        this.field2030[++this.field2033 - 1] = 0;
        this.method2457(var2);
        int var3 = this.field2033;
        byte[] var4 = this.field2030;
        int var5 = this.field2033;
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
        this.field2033 = var10 + var3;
    }

    @ObfuscatedName("dq.af([BIII)V")
    public void method2452(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2030[++this.field2033 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dq.ai(II)V")
    public void method2453(int arg0) {
        this.field2030[this.field2033 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2030[this.field2033 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2030[this.field2033 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2030[this.field2033 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ag(II)V")
    public void method2470(int arg0) {
        this.field2030[this.field2033 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2030[this.field2033 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.an(II)V")
    public void method2571(int arg0) {
        this.field2030[this.field2033 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ac(IB)V")
    public void method2505(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2536(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2563(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dq.al(II)V")
    public void method2457(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2536(arg0 >>> 28 | 0x80);
                    }
                    this.method2536(arg0 >>> 21 | 0x80);
                }
                this.method2536(arg0 >>> 14 | 0x80);
            }
            this.method2536(arg0 >>> 7 | 0x80);
        }
        this.method2536(arg0 & 0x7F);
    }

    @ObfuscatedName("dq.at(I)I")
    public int method2458() {
        return this.field2030[++this.field2033 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.ah(I)B")
    public byte method2459() {
        return this.field2030[++this.field2033 - 1];
    }

    @ObfuscatedName("dq.am(I)I")
    public int method2460() {
        this.field2033 += 2;
        return ((this.field2030[this.field2033 - 2] & 0xFF) << 8) + (this.field2030[this.field2033 - 1] & 0xFF);
    }

    @ObfuscatedName("dq.ab(I)I")
    public int method2461() {
        this.field2033 += 2;
        int var1 = ((this.field2030[this.field2033 - 2] & 0xFF) << 8) + (this.field2030[this.field2033 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.aq(I)I")
    public int method2554() {
        this.field2033 += 3;
        return (this.field2030[this.field2033 - 1] & 0xFF) + ((this.field2030[this.field2033 - 2] & 0xFF) << 8) + ((this.field2030[this.field2033 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.ap(I)I")
    public int method2463() {
        this.field2033 += 4;
        return (this.field2030[this.field2033 - 1] & 0xFF) + ((this.field2030[this.field2033 - 2] & 0xFF) << 8) + ((this.field2030[this.field2033 - 4] & 0xFF) << 24) + ((this.field2030[this.field2033 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.ar(I)J")
    public long method2464() {
        long var1 = (long) this.method2463() & 0xFFFFFFFFL;
        long var3 = (long) this.method2463() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dq.as(I)Ljava/lang/String;")
    public String method2465() {
        if (this.field2030[this.field2033] == 0) {
            this.field2033++;
            return null;
        } else {
            return this.method2636();
        }
    }

    @ObfuscatedName("dq.az(I)Ljava/lang/String;")
    public String method2636() {
        int var1 = this.field2033;
        while (this.field2030[++this.field2033 - 1] != 0) {
        }
        int var2 = this.field2033 - var1 - 1;
        return var2 == 0 ? "" : class150.method1625(this.field2030, var1, var2);
    }

    @ObfuscatedName("dq.aw(I)Ljava/lang/String;")
    public String method2467() {
        byte var1 = this.field2030[++this.field2033 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2033;
        while (this.field2030[++this.field2033 - 1] != 0) {
        }
        int var3 = this.field2033 - var2 - 1;
        return var3 == 0 ? "" : class150.method1625(this.field2030, var2, var3);
    }

    @ObfuscatedName("dq.av(I)Ljava/lang/String;")
    public String method2550() {
        byte var1 = this.field2030[++this.field2033 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2577();
        if (this.field2033 + var2 > this.field2030.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method2051(this.field2030, this.field2033, var2);
        this.field2033 += var2;
        return var3;
    }

    @ObfuscatedName("dq.ay([BIII)V")
    public void method2609(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2030[++this.field2033 - 1];
        }
    }

    @ObfuscatedName("dq.aj(I)I")
    public int method2521() {
        int var1 = this.field2030[this.field2033] & 0xFF;
        return var1 < 128 ? this.method2458() - 64 : this.method2460() - 49152;
    }

    @ObfuscatedName("dq.ae(I)I")
    public int method2471() {
        int var1 = this.field2030[this.field2033] & 0xFF;
        return var1 < 128 ? this.method2458() : this.method2460() - 32768;
    }

    @ObfuscatedName("dq.au(B)I")
    public int method2472() {
        return this.field2030[this.field2033] < 0 ? this.method2463() & Integer.MAX_VALUE : this.method2460();
    }

    @ObfuscatedName("dq.ao(I)I")
    public int method2577() {
        byte var1 = this.field2030[++this.field2033 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2030[++this.field2033 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dq.ak([IIIB)V")
    public void method2474(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2033;
        this.field2033 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2463();
            int var8 = this.method2463();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2033 -= 8;
            this.method2447(var7);
            this.method2447(var8);
        }
        this.field2033 = var4;
    }

    @ObfuscatedName("dq.bg([IIIB)V")
    public void method2497(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2033;
        this.field2033 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2463();
            int var8 = this.method2463();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2033 -= 8;
            this.method2447(var7);
            this.method2447(var8);
        }
        this.field2033 = var4;
    }

    @ObfuscatedName("dq.br(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2476(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2033;
        this.field2033 = 0;
        byte[] var4 = new byte[var3];
        this.method2609(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2033 = 0;
        this.method2563(var7.length);
        this.method2452(var7, 0, var7.length);
    }

    @ObfuscatedName("dq.bw(II)I")
    public int method2477(int arg0) {
        int var2 = method2198(this.field2030, arg0, this.field2033);
        this.method2447(var2);
        return var2;
    }

    @ObfuscatedName("dq.bc(I)Z")
    public boolean method2478() {
        this.field2033 -= 4;
        int var1 = method2198(this.field2030, 0, this.field2033);
        int var2 = this.method2463();
        return var1 == var2;
    }

    @ObfuscatedName("dq.bn(II)V")
    public void method2479(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.bo(II)V")
    public void method2503(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dq.by(II)V")
    public void method2475(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dq.bi(I)I")
    public int method2481() {
        return this.field2030[++this.field2033 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dq.bk(I)I")
    public int method2590() {
        return -this.field2030[++this.field2033 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.ba(I)I")
    public int method2647() {
        return 128 - this.field2030[++this.field2033 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.bt(B)B")
    public byte method2484() {
        return (byte) (this.field2030[++this.field2033 - 1] - 128);
    }

    @ObfuscatedName("dq.bs(I)B")
    public byte method2564() {
        return (byte) (-this.field2030[++this.field2033 - 1]);
    }

    @ObfuscatedName("dq.bd(I)B")
    public byte method2486() {
        return (byte) (128 - this.field2030[++this.field2033 - 1]);
    }

    @ObfuscatedName("dq.bh(II)V")
    public void method2487(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) arg0;
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bp(II)V")
    public void method2499(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.bb(II)V")
    public void method2489(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 + 128);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bv(B)I")
    public int method2539() {
        this.field2033 += 2;
        return ((this.field2030[this.field2033 - 1] & 0xFF) << 8) + (this.field2030[this.field2033 - 2] & 0xFF);
    }

    @ObfuscatedName("dq.bz(I)I")
    public int method2491() {
        this.field2033 += 2;
        return ((this.field2030[this.field2033 - 2] & 0xFF) << 8) + (this.field2030[this.field2033 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bl(I)I")
    public int method2492() {
        this.field2033 += 2;
        return ((this.field2030[this.field2033 - 1] & 0xFF) << 8) + (this.field2030[this.field2033 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bu(I)I")
    public int method2493() {
        this.field2033 += 2;
        int var1 = ((this.field2030[this.field2033 - 1] & 0xFF) << 8) + (this.field2030[this.field2033 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.bm(IB)V")
    public void method2494(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2033 - 1] = (byte) arg0;
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bj(I)I")
    public int method2495() {
        this.field2033 += 3;
        return (this.field2030[this.field2033 - 3] & 0xFF) + ((this.field2030[this.field2033 - 2] & 0xFF) << 8) + ((this.field2030[this.field2033 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.bf(II)V")
    public void method2496(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) arg0;
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dq.bq(II)V")
    public void method2568(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
        this.field2030[++this.field2033 - 1] = (byte) arg0;
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 24);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dq.be(II)V")
    public void method2498(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 16);
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 24);
        this.field2030[++this.field2033 - 1] = (byte) arg0;
        this.field2030[++this.field2033 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bx(I)I")
    public int method2525() {
        this.field2033 += 4;
        return (this.field2030[this.field2033 - 4] & 0xFF) + ((this.field2030[this.field2033 - 3] & 0xFF) << 8) + ((this.field2030[this.field2033 - 2] & 0xFF) << 16) + ((this.field2030[this.field2033 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.cf(I)I")
    public int method2500() {
        this.field2033 += 4;
        return (this.field2030[this.field2033 - 3] & 0xFF) + ((this.field2030[this.field2033 - 4] & 0xFF) << 8) + ((this.field2030[this.field2033 - 1] & 0xFF) << 16) + ((this.field2030[this.field2033 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.cj(I)I")
    public int method2501() {
        this.field2033 += 4;
        return (this.field2030[this.field2033 - 2] & 0xFF) + ((this.field2030[this.field2033 - 1] & 0xFF) << 8) + ((this.field2030[this.field2033 - 4] & 0xFF) << 16) + ((this.field2030[this.field2033 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.ce([BIII)V")
    public void method2502(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2030[++this.field2033 - 1] - 128);
        }
    }
}
