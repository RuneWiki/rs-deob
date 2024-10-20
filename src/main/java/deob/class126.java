package deob;

import java.math.BigInteger;

@ObfuscatedName("dv")
public class class126 extends class178 {

    @ObfuscatedName("dv.h")
    public byte[] field2047;

    @ObfuscatedName("dv.v")
    public int field2043;

    @ObfuscatedName("dv.k")
    public static int[] field2041 = new int[256];

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
            field2041[var0] = var1;
        }
    }

    public class126(int arg0) {
        this.field2047 = class113.method2246(arg0);
        this.field2043 = 0;
    }

    public class126(byte[] arg0) {
        this.field2047 = arg0;
        this.field2043 = 0;
    }

    @ObfuscatedName("dv.q(II)V")
    public void method2362(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ae(IB)V")
    public void method2363(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
        this.field2047[++this.field2043 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.at(IB)V")
    public void method2364(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 16);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
        this.field2047[++this.field2043 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.aj(II)V")
    public void method2365(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 24);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 16);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
        this.field2047[++this.field2043 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.aq(J)V")
    public void method2459(long arg0) {
        this.field2047[++this.field2043 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2047[++this.field2043 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2047[++this.field2043 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2047[++this.field2043 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2047[++this.field2043 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2047[++this.field2043 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2047[++this.field2043 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2047[++this.field2043 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("p.ac(Ljava/lang/String;I)I")
    public static int method5(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dv.az(Ljava/lang/String;I)V")
    public void method2366(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2043 += class148.method2628(arg0, 0, arg0.length(), this.field2047, this.field2043);
        this.field2047[++this.field2043 - 1] = 0;
    }

    @ObfuscatedName("al.ao(Ljava/lang/String;I)I")
    public static int method786(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dv.am(Ljava/lang/String;I)V")
    public void method2367(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2047[++this.field2043 - 1] = 0;
        this.field2043 += class148.method2628(arg0, 0, arg0.length(), this.field2047, this.field2043);
        this.field2047[++this.field2043 - 1] = 0;
    }

    @ObfuscatedName("dv.ad(Ljava/lang/CharSequence;I)V")
    public void method2368(CharSequence arg0) {
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
        this.field2047[++this.field2043 - 1] = 0;
        this.method2381(var3);
        this.field2043 += class179.method2250(this.field2047, this.field2043, arg0);
    }

    @ObfuscatedName("dv.an([BIIB)V")
    public void method2369(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2047[++this.field2043 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dv.al(II)V")
    public void method2370(int arg0) {
        this.field2047[this.field2043 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2047[this.field2043 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2047[this.field2043 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2047[this.field2043 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ab(II)V")
    public void method2371(int arg0) {
        this.field2047[this.field2043 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2047[this.field2043 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.af(II)V")
    public void method2470(int arg0) {
        this.field2047[this.field2043 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ap(II)V")
    public void method2373(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2362(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2363(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dv.as(IB)V")
    public void method2381(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2362(arg0 >>> 28 | 0x80);
                    }
                    this.method2362(arg0 >>> 21 | 0x80);
                }
                this.method2362(arg0 >>> 14 | 0x80);
            }
            this.method2362(arg0 >>> 7 | 0x80);
        }
        this.method2362(arg0 & 0x7F);
    }

    @ObfuscatedName("dv.av(B)I")
    public int method2544() {
        return this.field2047[++this.field2043 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.ay(I)B")
    public byte method2376() {
        return this.field2047[++this.field2043 - 1];
    }

    @ObfuscatedName("dv.ah(I)I")
    public int method2489() {
        this.field2043 += 2;
        return ((this.field2047[this.field2043 - 2] & 0xFF) << 8) + (this.field2047[this.field2043 - 1] & 0xFF);
    }

    @ObfuscatedName("dv.aa(I)I")
    public int method2378() {
        this.field2043 += 2;
        int var1 = ((this.field2047[this.field2043 - 2] & 0xFF) << 8) + (this.field2047[this.field2043 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.ag(I)I")
    public int method2530() {
        this.field2043 += 3;
        return (this.field2047[this.field2043 - 1] & 0xFF) + ((this.field2047[this.field2043 - 3] & 0xFF) << 16) + ((this.field2047[this.field2043 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dv.au(I)I")
    public int method2380() {
        this.field2043 += 4;
        return (this.field2047[this.field2043 - 1] & 0xFF) + ((this.field2047[this.field2043 - 2] & 0xFF) << 8) + ((this.field2047[this.field2043 - 4] & 0xFF) << 24) + ((this.field2047[this.field2043 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dv.aw(I)J")
    public long method2502() {
        long var1 = (long) this.method2380() & 0xFFFFFFFFL;
        long var3 = (long) this.method2380() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dv.ar(B)Ljava/lang/String;")
    public String method2382() {
        if (this.field2047[this.field2043] == 0) {
            this.field2043++;
            return null;
        } else {
            return this.method2383();
        }
    }

    @ObfuscatedName("dv.ai(I)Ljava/lang/String;")
    public String method2383() {
        int var1 = this.field2043;
        while (this.field2047[++this.field2043 - 1] != 0) {
        }
        int var2 = this.field2043 - var1 - 1;
        return var2 == 0 ? "" : class148.method2247(this.field2047, var1, var2);
    }

    @ObfuscatedName("dv.ak(I)Ljava/lang/String;")
    public String method2443() {
        byte var1 = this.field2047[++this.field2043 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2043;
        while (this.field2047[++this.field2043 - 1] != 0) {
        }
        int var3 = this.field2043 - var2 - 1;
        return var3 == 0 ? "" : class148.method2247(this.field2047, var2, var3);
    }

    @ObfuscatedName("dv.ax(I)Ljava/lang/String;")
    public String method2385() {
        byte var1 = this.field2047[++this.field2043 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2449();
        if (this.field2043 + var2 > this.field2047.length) {
            throw new IllegalStateException("");
        }
        String var3 = class179.method2739(this.field2047, this.field2043, var2);
        this.field2043 += var2;
        return var3;
    }

    @ObfuscatedName("dv.bs([BIII)V")
    public void method2576(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2047[++this.field2043 - 1];
        }
    }

    @ObfuscatedName("dv.bf(B)I")
    public int method2361() {
        int var1 = this.field2047[this.field2043] & 0xFF;
        return var1 < 128 ? this.method2544() - 64 : this.method2489() - 49152;
    }

    @ObfuscatedName("dv.bz(I)I")
    public int method2388() {
        int var1 = this.field2047[this.field2043] & 0xFF;
        return var1 < 128 ? this.method2544() : this.method2489() - 32768;
    }

    @ObfuscatedName("dv.br(I)I")
    public int method2389() {
        return this.field2047[this.field2043] < 0 ? this.method2380() & Integer.MAX_VALUE : this.method2489();
    }

    @ObfuscatedName("dv.ba(B)I")
    public int method2449() {
        byte var1 = this.field2047[++this.field2043 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2047[++this.field2043 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dv.bn([IIIB)V")
    public void method2391(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2043;
        this.field2043 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2380();
            int var8 = this.method2380();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2043 -= 8;
            this.method2365(var7);
            this.method2365(var8);
        }
        this.field2043 = var4;
    }

    @ObfuscatedName("dv.bo([IIII)V")
    public void method2392(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2043;
        this.field2043 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2380();
            int var8 = this.method2380();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2043 -= 8;
            this.method2365(var7);
            this.method2365(var8);
        }
        this.field2043 = var4;
    }

    @ObfuscatedName("dv.bq(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2471(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2043;
        this.field2043 = 0;
        byte[] var4 = new byte[var3];
        this.method2576(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2043 = 0;
        this.method2363(var7.length);
        this.method2369(var7, 0, var7.length);
    }

    @ObfuscatedName("dv.bd(II)I")
    public int method2394(int arg0) {
        byte[] var2 = this.field2047;
        int var3 = this.field2043;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2041[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2365(var6);
        return var6;
    }

    @ObfuscatedName("dv.bl(I)Z")
    public boolean method2395() {
        this.field2043 -= 4;
        byte[] var1 = this.field2047;
        int var2 = this.field2043;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2041[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2380();
        return var5 == var8;
    }

    @ObfuscatedName("dv.bu(II)V")
    public void method2396(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dv.bg(IS)V")
    public void method2397(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dv.bb(I)I")
    public int method2573() {
        return this.field2047[++this.field2043 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dv.bj(B)I")
    public int method2416() {
        return -this.field2047[++this.field2043 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.bm(I)I")
    public int method2400() {
        return 128 - this.field2047[++this.field2043 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.bp(I)B")
    public byte method2401() {
        return (byte) (this.field2047[++this.field2043 - 1] - 128);
    }

    @ObfuscatedName("dv.bv(I)B")
    public byte method2402() {
        return (byte) (-this.field2047[++this.field2043 - 1]);
    }

    @ObfuscatedName("dv.bx(IB)V")
    public void method2403(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) arg0;
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.be(II)V")
    public void method2550(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dv.bh(II)V")
    public void method2405(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 + 128);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.bt(I)I")
    public int method2486() {
        this.field2043 += 2;
        return ((this.field2047[this.field2043 - 1] & 0xFF) << 8) + (this.field2047[this.field2043 - 2] & 0xFF);
    }

    @ObfuscatedName("dv.by(B)I")
    public int method2551() {
        this.field2043 += 2;
        return ((this.field2047[this.field2043 - 2] & 0xFF) << 8) + (this.field2047[this.field2043 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dv.bk(I)I")
    public int method2408() {
        this.field2043 += 2;
        return ((this.field2047[this.field2043 - 1] & 0xFF) << 8) + (this.field2047[this.field2043 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dv.bi(I)I")
    public int method2537() {
        this.field2043 += 2;
        int var1 = ((this.field2047[this.field2043 - 1] & 0xFF) << 8) + (this.field2047[this.field2043 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.bc(I)I")
    public int method2410() {
        this.field2043 += 2;
        int var1 = ((this.field2047[this.field2043 - 2] & 0xFF) << 8) + (this.field2047[this.field2043 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.bw(I)I")
    public int method2404() {
        this.field2043 += 2;
        int var1 = ((this.field2047[this.field2043 - 1] & 0xFF) << 8) + (this.field2047[this.field2043 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.cj(II)V")
    public void method2532(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 16);
        this.field2047[++this.field2043 - 1] = (byte) arg0;
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.cs(I)I")
    public int method2413() {
        this.field2043 += 3;
        return (this.field2047[this.field2043 - 2] & 0xFF) + ((this.field2047[this.field2043 - 3] & 0xFF) << 16) + ((this.field2047[this.field2043 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dv.cq(IB)V")
    public void method2414(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) arg0;
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 16);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dv.cx(II)V")
    public void method2536(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
        this.field2047[++this.field2043 - 1] = (byte) arg0;
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 24);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dv.ck(II)V")
    public void method2533(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 16);
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 24);
        this.field2047[++this.field2043 - 1] = (byte) arg0;
        this.field2047[++this.field2043 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.cd(I)I")
    public int method2417() {
        this.field2043 += 4;
        return (this.field2047[this.field2043 - 4] & 0xFF) + ((this.field2047[this.field2043 - 3] & 0xFF) << 8) + ((this.field2047[this.field2043 - 2] & 0xFF) << 16) + ((this.field2047[this.field2043 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.ct(I)I")
    public int method2418() {
        this.field2043 += 4;
        return (this.field2047[this.field2043 - 3] & 0xFF) + ((this.field2047[this.field2043 - 4] & 0xFF) << 8) + ((this.field2047[this.field2043 - 1] & 0xFF) << 16) + ((this.field2047[this.field2043 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.cb(B)I")
    public int method2419() {
        this.field2043 += 4;
        return (this.field2047[this.field2043 - 2] & 0xFF) + ((this.field2047[this.field2043 - 1] & 0xFF) << 8) + ((this.field2047[this.field2043 - 4] & 0xFF) << 16) + ((this.field2047[this.field2043 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.cl([BIIB)V")
    public void method2412(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2047[++this.field2043 - 1];
        }
    }

    @ObfuscatedName("dv.cc([BIII)V")
    public void method2568(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2047[++this.field2043 - 1] - 128);
        }
    }
}
