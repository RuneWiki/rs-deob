package deob;

import java.math.BigInteger;

@ObfuscatedName("dr")
public class class126 extends class178 {

    @ObfuscatedName("dr.c")
    public byte[] field2029;

    @ObfuscatedName("dr.r")
    public int field2027;

    @ObfuscatedName("dr.k")
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

    @ObfuscatedName("dc.g([BIII)I")
    public static int method2360(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2028[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class126(int arg0) {
        this.field2029 = class113.method2326(arg0);
        this.field2027 = 0;
    }

    public class126(byte[] arg0) {
        this.field2029 = arg0;
        this.field2027 = 0;
    }

    @ObfuscatedName("dr.x(II)V")
    public void method2452(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.b(II)V")
    public void method2642(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2029[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.w(IB)V")
    public void method2568(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2029[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.y(II)V")
    public void method2455(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 24);
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2029[++this.field2027 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.au(J)V")
    public void method2456(long arg0) {
        this.field2029[++this.field2027 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2029[++this.field2027 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2029[++this.field2027 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2029[++this.field2027 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2029[++this.field2027 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2029[++this.field2027 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2029[++this.field2027 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2029[++this.field2027 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ck.az(Ljava/lang/String;I)I")
    public static int method2141(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dr.ak(Ljava/lang/String;B)V")
    public void method2457(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2027 += class148.method2938(arg0, 0, arg0.length(), this.field2029, this.field2027);
        this.field2029[++this.field2027 - 1] = 0;
    }

    @ObfuscatedName("bp.ah(Ljava/lang/String;I)I")
    public static int method1308(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dr.aa(Ljava/lang/String;B)V")
    public void method2629(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2029[++this.field2027 - 1] = 0;
        this.field2027 += class148.method2938(arg0, 0, arg0.length(), this.field2029, this.field2027);
        this.field2029[++this.field2027 - 1] = 0;
    }

    @ObfuscatedName("dr.am(Ljava/lang/CharSequence;I)V")
    public void method2535(CharSequence arg0) {
        int var2 = class179.method2677(arg0);
        this.field2029[++this.field2027 - 1] = 0;
        this.method2529(var2);
        int var3 = this.field2027;
        byte[] var4 = this.field2029;
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

    @ObfuscatedName("dr.al([BIII)V")
    public void method2460(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2029[++this.field2027 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dr.ae(II)V")
    public void method2461(int arg0) {
        this.field2029[this.field2027 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2029[this.field2027 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2029[this.field2027 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2029[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.ab(IB)V")
    public void method2453(int arg0) {
        this.field2029[this.field2027 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2029[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.as(II)V")
    public void method2463(int arg0) {
        this.field2029[this.field2027 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.ai(II)V")
    public void method2464(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2452(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2642(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.aj(II)V")
    public void method2529(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2452(arg0 >>> 28 | 0x80);
                    }
                    this.method2452(arg0 >>> 21 | 0x80);
                }
                this.method2452(arg0 >>> 14 | 0x80);
            }
            this.method2452(arg0 >>> 7 | 0x80);
        }
        this.method2452(arg0 & 0x7F);
    }

    @ObfuscatedName("dr.an(I)I")
    public int method2466() {
        return this.field2029[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.av(B)B")
    public byte method2499() {
        return this.field2029[++this.field2027 - 1];
    }

    @ObfuscatedName("dr.af(B)I")
    public int method2468() {
        this.field2027 += 2;
        return ((this.field2029[this.field2027 - 2] & 0xFF) << 8) + (this.field2029[this.field2027 - 1] & 0xFF);
    }

    @ObfuscatedName("dr.ax(I)I")
    public int method2469() {
        this.field2027 += 2;
        int var1 = ((this.field2029[this.field2027 - 2] & 0xFF) << 8) + (this.field2029[this.field2027 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.ao(B)I")
    public int method2470() {
        this.field2027 += 3;
        return (this.field2029[this.field2027 - 1] & 0xFF) + ((this.field2029[this.field2027 - 2] & 0xFF) << 8) + ((this.field2029[this.field2027 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.aw(S)I")
    public int method2500() {
        this.field2027 += 4;
        return (this.field2029[this.field2027 - 1] & 0xFF) + ((this.field2029[this.field2027 - 2] & 0xFF) << 8) + ((this.field2029[this.field2027 - 4] & 0xFF) << 24) + ((this.field2029[this.field2027 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.ap(I)J")
    public long method2472() {
        long var1 = (long) this.method2500() & 0xFFFFFFFFL;
        long var3 = (long) this.method2500() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dr.ay(I)Ljava/lang/String;")
    public String method2473() {
        if (this.field2029[this.field2027] == 0) {
            this.field2027++;
            return null;
        } else {
            return this.method2462();
        }
    }

    @ObfuscatedName("dr.ag(I)Ljava/lang/String;")
    public String method2462() {
        int var1 = this.field2027;
        while (this.field2029[++this.field2027 - 1] != 0) {
        }
        int var2 = this.field2027 - var1 - 1;
        return var2 == 0 ? "" : class148.method64(this.field2029, var1, var2);
    }

    @ObfuscatedName("dr.ar(I)Ljava/lang/String;")
    public String method2475() {
        byte var1 = this.field2029[++this.field2027 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2027;
        while (this.field2029[++this.field2027 - 1] != 0) {
        }
        int var3 = this.field2027 - var2 - 1;
        return var3 == 0 ? "" : class148.method64(this.field2029, var2, var3);
    }

    @ObfuscatedName("dr.aq(I)Ljava/lang/String;")
    public String method2476() {
        byte var1 = this.field2029[++this.field2027 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2561();
        if (this.field2027 + var2 > this.field2029.length) {
            throw new IllegalStateException("");
        }
        String var3 = class179.method208(this.field2029, this.field2027, var2);
        this.field2027 += var2;
        return var3;
    }

    @ObfuscatedName("dr.ac([BIII)V")
    public void method2587(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2029[++this.field2027 - 1];
        }
    }

    @ObfuscatedName("dr.at(I)I")
    public int method2610() {
        int var1 = this.field2029[this.field2027] & 0xFF;
        return var1 < 128 ? this.method2466() - 64 : this.method2468() - 49152;
    }

    @ObfuscatedName("dr.ad(I)I")
    public int method2479() {
        int var1 = this.field2029[this.field2027] & 0xFF;
        return var1 < 128 ? this.method2466() : this.method2468() - 32768;
    }

    @ObfuscatedName("dr.bh(I)I")
    public int method2480() {
        return this.field2029[this.field2027] < 0 ? this.method2500() & Integer.MAX_VALUE : this.method2468();
    }

    @ObfuscatedName("dr.bs(I)I")
    public int method2561() {
        byte var1 = this.field2029[++this.field2027 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2029[++this.field2027 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dr.bk([IIII)V")
    public void method2556(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2027;
        this.field2027 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2500();
            int var8 = this.method2500();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2027 -= 8;
            this.method2455(var7);
            this.method2455(var8);
        }
        this.field2027 = var4;
    }

    @ObfuscatedName("dr.be([IIII)V")
    public void method2483(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2027;
        this.field2027 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2500();
            int var8 = this.method2500();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2027 -= 8;
            this.method2455(var7);
            this.method2455(var8);
        }
        this.field2027 = var4;
    }

    @ObfuscatedName("dr.bp(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2498(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2027;
        this.field2027 = 0;
        byte[] var4 = new byte[var3];
        this.method2587(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2027 = 0;
        this.method2642(var7.length);
        this.method2460(var7, 0, var7.length);
    }

    @ObfuscatedName("dr.bi(II)I")
    public int method2485(int arg0) {
        int var2 = method2360(this.field2029, arg0, this.field2027);
        this.method2455(var2);
        return var2;
    }

    @ObfuscatedName("dr.bf(B)Z")
    public boolean method2486() {
        this.field2027 -= 4;
        int var1 = method2360(this.field2029, 0, this.field2027);
        int var2 = this.method2500();
        return var1 == var2;
    }

    @ObfuscatedName("dr.bo(II)V")
    public void method2502(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dr.by(IB)V")
    public void method2488(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dr.bz(B)I")
    public int method2489() {
        return this.field2029[++this.field2027 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dr.bt(I)I")
    public int method2490() {
        return -this.field2029[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.bc(B)I")
    public int method2619() {
        return 128 - this.field2029[++this.field2027 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.bd(B)B")
    public byte method2492() {
        return (byte) (128 - this.field2029[++this.field2027 - 1]);
    }

    @ObfuscatedName("dr.bj(II)V")
    public void method2493(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) arg0;
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bn(II)V")
    public void method2494(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2029[++this.field2027 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dr.bv(IS)V")
    public void method2454(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 + 128);
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bw(I)I")
    public int method2496() {
        this.field2027 += 2;
        return ((this.field2029[this.field2027 - 1] & 0xFF) << 8) + (this.field2029[this.field2027 - 2] & 0xFF);
    }

    @ObfuscatedName("dr.bg(I)I")
    public int method2606() {
        this.field2027 += 2;
        return ((this.field2029[this.field2027 - 2] & 0xFF) << 8) + (this.field2029[this.field2027 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dr.bm(B)I")
    public int method2543() {
        this.field2027 += 2;
        return ((this.field2029[this.field2027 - 1] & 0xFF) << 8) + (this.field2029[this.field2027 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dr.bu(B)I")
    public int method2509() {
        this.field2027 += 2;
        int var1 = ((this.field2029[this.field2027 - 1] & 0xFF) << 8) + (this.field2029[this.field2027 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.br(I)I")
    public int method2534() {
        this.field2027 += 2;
        int var1 = ((this.field2029[this.field2027 - 2] & 0xFF) << 8) + (this.field2029[this.field2027 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.bx(II)V")
    public void method2501(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2029[++this.field2027 - 1] = (byte) arg0;
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bq(I)I")
    public int method2511() {
        this.field2027 += 3;
        return (this.field2029[this.field2027 - 2] & 0xFF) + ((this.field2029[this.field2027 - 3] & 0xFF) << 16) + ((this.field2029[this.field2027 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dr.ba(II)V")
    public void method2503(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) arg0;
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dr.bb(II)V")
    public void method2504(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 16);
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 24);
        this.field2029[++this.field2027 - 1] = (byte) arg0;
        this.field2029[++this.field2027 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bl(I)I")
    public int method2505() {
        this.field2027 += 4;
        return (this.field2029[this.field2027 - 4] & 0xFF) + ((this.field2029[this.field2027 - 3] & 0xFF) << 8) + ((this.field2029[this.field2027 - 1] & 0xFF) << 24) + ((this.field2029[this.field2027 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.cn(B)I")
    public int method2506() {
        this.field2027 += 4;
        return (this.field2029[this.field2027 - 3] & 0xFF) + ((this.field2029[this.field2027 - 4] & 0xFF) << 8) + ((this.field2029[this.field2027 - 2] & 0xFF) << 24) + ((this.field2029[this.field2027 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.ch(B)I")
    public int method2507() {
        this.field2027 += 4;
        return (this.field2029[this.field2027 - 2] & 0xFF) + ((this.field2029[this.field2027 - 1] & 0xFF) << 8) + ((this.field2029[this.field2027 - 4] & 0xFF) << 16) + ((this.field2029[this.field2027 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dr.cl([BIII)V")
    public void method2508(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2029[++this.field2027 - 1];
        }
    }
}
