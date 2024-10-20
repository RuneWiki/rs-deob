package deob;

import java.math.BigInteger;

@ObfuscatedName("do")
public class class127 extends class179 {

    @ObfuscatedName("do.t")
    public byte[] field2035;

    @ObfuscatedName("do.f")
    public int field2042;

    @ObfuscatedName("do.c")
    public static int[] field2039 = new int[256];

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
            field2039[var0] = var1;
        }
    }

    @ObfuscatedName("q.q([BIII)I")
    public static int method207(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2039[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("dw.w([BIB)I")
    public static int method2323(byte[] arg0, int arg1) {
        return method207(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2035 = class114.method2261(arg0);
        this.field2042 = 0;
    }

    public class127(byte[] arg0) {
        this.field2035 = arg0;
        this.field2042 = 0;
    }

    @ObfuscatedName("do.o(II)V")
    public void method2386(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.j(IB)V")
    public void method2387(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
        this.field2035[++this.field2042 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.ae(II)V")
    public void method2460(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 16);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
        this.field2035[++this.field2042 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.aq(IB)V")
    public void method2389(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 24);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 16);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
        this.field2035[++this.field2042 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.ap(J)V")
    public void method2390(long arg0) {
        this.field2035[++this.field2042 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2035[++this.field2042 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2035[++this.field2042 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2035[++this.field2042 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2035[++this.field2042 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2035[++this.field2042 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2035[++this.field2042 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2035[++this.field2042 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("do.ah(Ljava/lang/String;I)V")
    public void method2574(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2042 += class149.method31(arg0, 0, arg0.length(), this.field2035, this.field2042);
        this.field2035[++this.field2042 - 1] = 0;
    }

    @ObfuscatedName("bn.ax(Ljava/lang/String;I)I")
    public static int method1537(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("do.ai(Ljava/lang/String;I)V")
    public void method2392(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2035[++this.field2042 - 1] = 0;
        this.field2042 += class149.method31(arg0, 0, arg0.length(), this.field2035, this.field2042);
        this.field2035[++this.field2042 - 1] = 0;
    }

    @ObfuscatedName("do.aa(Ljava/lang/CharSequence;I)V")
    public void method2517(CharSequence arg0) {
        int var2 = class180.method156(arg0);
        this.field2035[++this.field2042 - 1] = 0;
        this.method2399(var2);
        this.field2042 += class180.method132(this.field2035, this.field2042, arg0);
    }

    @ObfuscatedName("do.ar([BIII)V")
    public void method2423(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2035[++this.field2042 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("do.ak(II)V")
    public void method2455(int arg0) {
        this.field2035[this.field2042 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2035[this.field2042 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2035[this.field2042 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2035[this.field2042 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.al(II)V")
    public void method2396(int arg0) {
        this.field2035[this.field2042 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2035[this.field2042 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.au(II)V")
    public void method2397(int arg0) {
        this.field2035[this.field2042 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.aj(II)V")
    public void method2421(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2386(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2387(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.az(II)V")
    public void method2399(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2386(arg0 >>> 28 | 0x80);
                    }
                    this.method2386(arg0 >>> 21 | 0x80);
                }
                this.method2386(arg0 >>> 14 | 0x80);
            }
            this.method2386(arg0 >>> 7 | 0x80);
        }
        this.method2386(arg0 & 0x7F);
    }

    @ObfuscatedName("do.ac(I)I")
    public int method2509() {
        return this.field2035[++this.field2042 - 1] & 0xFF;
    }

    @ObfuscatedName("do.ay(I)B")
    public byte method2500() {
        return this.field2035[++this.field2042 - 1];
    }

    @ObfuscatedName("do.as(I)I")
    public int method2512() {
        this.field2042 += 2;
        return ((this.field2035[this.field2042 - 2] & 0xFF) << 8) + (this.field2035[this.field2042 - 1] & 0xFF);
    }

    @ObfuscatedName("do.af(I)I")
    public int method2403() {
        this.field2042 += 2;
        int var1 = ((this.field2035[this.field2042 - 2] & 0xFF) << 8) + (this.field2035[this.field2042 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.an(B)I")
    public int method2404() {
        this.field2042 += 3;
        return (this.field2035[this.field2042 - 1] & 0xFF) + ((this.field2035[this.field2042 - 2] & 0xFF) << 8) + ((this.field2035[this.field2042 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("do.am(I)I")
    public int method2405() {
        this.field2042 += 4;
        return (this.field2035[this.field2042 - 1] & 0xFF) + ((this.field2035[this.field2042 - 2] & 0xFF) << 8) + ((this.field2035[this.field2042 - 3] & 0xFF) << 16) + ((this.field2035[this.field2042 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("do.av(I)J")
    public long method2406() {
        long var1 = (long) this.method2405() & 0xFFFFFFFFL;
        long var3 = (long) this.method2405() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("do.aw(B)Ljava/lang/String;")
    public String method2385() {
        if (this.field2035[this.field2042] == 0) {
            this.field2042++;
            return null;
        } else {
            return this.method2408();
        }
    }

    @ObfuscatedName("do.ao(I)Ljava/lang/String;")
    public String method2408() {
        int var1 = this.field2042;
        while (this.field2035[++this.field2042 - 1] != 0) {
        }
        int var2 = this.field2042 - var1 - 1;
        return var2 == 0 ? "" : class149.method2913(this.field2035, var1, var2);
    }

    @ObfuscatedName("do.at(B)Ljava/lang/String;")
    public String method2409() {
        byte var1 = this.field2035[++this.field2042 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2042;
        while (this.field2035[++this.field2042 - 1] != 0) {
        }
        int var3 = this.field2042 - var2 - 1;
        return var3 == 0 ? "" : class149.method2913(this.field2035, var2, var3);
    }

    @ObfuscatedName("do.ad(I)Ljava/lang/String;")
    public String method2519() {
        byte var1 = this.field2035[++this.field2042 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2415();
        if (this.field2042 + var2 > this.field2035.length) {
            throw new IllegalStateException("");
        }
        String var3 = class180.method867(this.field2035, this.field2042, var2);
        this.field2042 += var2;
        return var3;
    }

    @ObfuscatedName("do.ag([BIII)V")
    public void method2388(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2035[++this.field2042 - 1];
        }
    }

    @ObfuscatedName("do.ab(I)I")
    public int method2412() {
        int var1 = this.field2035[this.field2042] & 0xFF;
        return var1 < 128 ? this.method2509() - 64 : this.method2512() - 49152;
    }

    @ObfuscatedName("do.bw(I)I")
    public int method2413() {
        int var1 = this.field2035[this.field2042] & 0xFF;
        return var1 < 128 ? this.method2509() : this.method2512() - 32768;
    }

    @ObfuscatedName("do.bz(I)I")
    public int method2414() {
        return this.field2035[this.field2042] < 0 ? this.method2405() & Integer.MAX_VALUE : this.method2512();
    }

    @ObfuscatedName("do.bm(B)I")
    public int method2415() {
        byte var1 = this.field2035[++this.field2042 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2035[++this.field2042 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("do.bq([IIII)V")
    public void method2542(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2042;
        this.field2042 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2405();
            int var8 = this.method2405();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2042 -= 8;
            this.method2389(var7);
            this.method2389(var8);
        }
        this.field2042 = var4;
    }

    @ObfuscatedName("do.bh([IIIB)V")
    public void method2417(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2042;
        this.field2042 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2405();
            int var8 = this.method2405();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2042 -= 8;
            this.method2389(var7);
            this.method2389(var8);
        }
        this.field2042 = var4;
    }

    @ObfuscatedName("do.bi(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2418(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2042;
        this.field2042 = 0;
        byte[] var4 = new byte[var3];
        this.method2388(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2042 = 0;
        this.method2387(var7.length);
        this.method2423(var7, 0, var7.length);
    }

    @ObfuscatedName("do.bf(II)I")
    public int method2579(int arg0) {
        int var2 = method207(this.field2035, arg0, this.field2042);
        this.method2389(var2);
        return var2;
    }

    @ObfuscatedName("do.bv(I)Z")
    public boolean method2420() {
        this.field2042 -= 4;
        int var1 = method207(this.field2035, 0, this.field2042);
        int var2 = this.method2405();
        return var1 == var2;
    }

    @ObfuscatedName("do.bk(II)V")
    public void method2550(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.bc(IB)V")
    public void method2453(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("do.bl(I)I")
    public int method2410() {
        return this.field2035[++this.field2042 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("do.bp(B)I")
    public int method2568() {
        return -this.field2035[++this.field2042 - 1] & 0xFF;
    }

    @ObfuscatedName("do.bs(I)I")
    public int method2425() {
        return 128 - this.field2035[++this.field2042 - 1] & 0xFF;
    }

    @ObfuscatedName("do.bu(S)B")
    public byte method2426() {
        return (byte) (this.field2035[++this.field2042 - 1] - 128);
    }

    @ObfuscatedName("do.bt(B)B")
    public byte method2427() {
        return (byte) (-this.field2035[++this.field2042 - 1]);
    }

    @ObfuscatedName("do.be(B)B")
    public byte method2428() {
        return (byte) (128 - this.field2035[++this.field2042 - 1]);
    }

    @ObfuscatedName("do.bd(II)V")
    public void method2429(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) arg0;
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.br(II)V")
    public void method2430(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.bo(IB)V")
    public void method2538(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 + 128);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.bx(I)I")
    public int method2432() {
        this.field2042 += 2;
        return ((this.field2035[this.field2042 - 1] & 0xFF) << 8) + (this.field2035[this.field2042 - 2] & 0xFF);
    }

    @ObfuscatedName("do.bb(B)I")
    public int method2578() {
        this.field2042 += 2;
        return ((this.field2035[this.field2042 - 2] & 0xFF) << 8) + (this.field2035[this.field2042 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("do.by(I)I")
    public int method2434() {
        this.field2042 += 2;
        return ((this.field2035[this.field2042 - 1] & 0xFF) << 8) + (this.field2035[this.field2042 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("do.ba(B)I")
    public int method2471() {
        this.field2042 += 2;
        int var1 = ((this.field2035[this.field2042 - 1] & 0xFF) << 8) + (this.field2035[this.field2042 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.bg(B)I")
    public int method2436() {
        this.field2042 += 2;
        int var1 = ((this.field2035[this.field2042 - 2] & 0xFF) << 8) + (this.field2035[this.field2042 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.bn(II)V")
    public void method2437(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 16);
        this.field2035[++this.field2042 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.bj(S)I")
    public int method2585() {
        this.field2042 += 3;
        return (this.field2035[this.field2042 - 3] & 0xFF) + ((this.field2035[this.field2042 - 2] & 0xFF) << 8) + ((this.field2035[this.field2042 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("do.ca(II)V")
    public void method2439(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) arg0;
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 16);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("do.ci(II)V")
    public void method2559(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
        this.field2035[++this.field2042 - 1] = (byte) arg0;
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 24);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("do.cf(II)V")
    public void method2522(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 16);
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 24);
        this.field2035[++this.field2042 - 1] = (byte) arg0;
        this.field2035[++this.field2042 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.cb(I)I")
    public int method2391() {
        this.field2042 += 4;
        return (this.field2035[this.field2042 - 4] & 0xFF) + ((this.field2035[this.field2042 - 3] & 0xFF) << 8) + ((this.field2035[this.field2042 - 2] & 0xFF) << 16) + ((this.field2035[this.field2042 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("do.cy(I)I")
    public int method2441() {
        this.field2042 += 4;
        return (this.field2035[this.field2042 - 3] & 0xFF) + ((this.field2035[this.field2042 - 4] & 0xFF) << 8) + ((this.field2035[this.field2042 - 1] & 0xFF) << 16) + ((this.field2035[this.field2042 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("do.cs(I)I")
    public int method2419() {
        this.field2042 += 4;
        return (this.field2035[this.field2042 - 2] & 0xFF) + ((this.field2035[this.field2042 - 1] & 0xFF) << 8) + ((this.field2035[this.field2042 - 3] & 0xFF) << 24) + ((this.field2035[this.field2042 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("do.co([BIII)V")
    public void method2465(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2035[++this.field2042 - 1] - 128);
        }
    }
}
