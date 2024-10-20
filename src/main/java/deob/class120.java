package deob;

import java.math.BigInteger;

@ObfuscatedName("dr")
public class class120 extends class209 {

    @ObfuscatedName("dr.t")
    public byte[] field2002;

    @ObfuscatedName("dr.i")
    public int field2001;

    @ObfuscatedName("dr.g")
    public static int[] field2000 = new int[256];

    @ObfuscatedName("dr.z")
    public static long[] field2004;

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
            field2000[var0] = var1;
        }
        field2004 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2004[var3] = var4;
        }
    }

    @ObfuscatedName("ec.t([BIII)I")
    public static int method2915(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2000[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class120(int arg0) {
        this.field2002 = class122.method2543(arg0);
        this.field2001 = 0;
    }

    public class120(byte[] arg0) {
        this.field2002 = arg0;
        this.field2001 = 0;
    }

    @ObfuscatedName("dr.i(II)V")
    public void method2293(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.g(II)V")
    public void method2294(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2001 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.h(II)V")
    public void method2295(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2001 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.z(IB)V")
    public void method2296(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 24);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2001 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.r(J)V")
    public void method2297(long arg0) {
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2002[++this.field2001 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dr.f(J)V")
    public void method2303(long arg0) {
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2002[++this.field2001 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2002[++this.field2001 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cp.s(Ljava/lang/String;I)I")
    public static int method2086(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dr.d(Ljava/lang/String;B)V")
    public void method2426(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2001 += class166.method2097(arg0, 0, arg0.length(), this.field2002, this.field2001);
        this.field2002[++this.field2001 - 1] = 0;
    }

    @ObfuscatedName("ao.l(Ljava/lang/String;I)I")
    public static int method797(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dr.y(Ljava/lang/String;I)V")
    public void method2375(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2002[++this.field2001 - 1] = 0;
        this.field2001 += class166.method2097(arg0, 0, arg0.length(), this.field2002, this.field2001);
        this.field2002[++this.field2001 - 1] = 0;
    }

    @ObfuscatedName("dr.p(Ljava/lang/CharSequence;I)V")
    public void method2301(CharSequence arg0) {
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
        this.field2002[++this.field2001 - 1] = 0;
        this.method2307(var3);
        this.field2001 += class210.method130(this.field2002, this.field2001, arg0);
    }

    @ObfuscatedName("dr.k([BIII)V")
    public void method2302(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2002[++this.field2001 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dr.o(II)V")
    public void method2377(int arg0) {
        this.field2002[this.field2001 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2002[this.field2001 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2002[this.field2001 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2002[this.field2001 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.b(IB)V")
    public void method2311(int arg0) {
        this.field2002[this.field2001 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2002[this.field2001 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.j(II)V")
    public void method2305(int arg0) {
        this.field2002[this.field2001 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.a(II)V")
    public void method2386(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2293(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2294(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.u(II)V")
    public void method2307(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2293(arg0 >>> 28 | 0x80);
                    }
                    this.method2293(arg0 >>> 21 | 0x80);
                }
                this.method2293(arg0 >>> 14 | 0x80);
            }
            this.method2293(arg0 >>> 7 | 0x80);
        }
        this.method2293(arg0 & 0x7F);
    }

    @ObfuscatedName("dr.c(I)I")
    public int method2334() {
        return this.field2002[++this.field2001 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.n(I)B")
    public byte method2309() {
        return this.field2002[++this.field2001 - 1];
    }

    @ObfuscatedName("dr.q(I)I")
    public int method2310() {
        this.field2001 += 2;
        return ((this.field2002[this.field2001 - 2] & 0xFF) << 8) + (this.field2002[this.field2001 - 1] & 0xFF);
    }

    @ObfuscatedName("dr.x(I)I")
    public int method2478() {
        this.field2001 += 2;
        int var1 = ((this.field2002[this.field2001 - 2] & 0xFF) << 8) + (this.field2002[this.field2001 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.v(I)I")
    public int method2312() {
        this.field2001 += 3;
        return (this.field2002[this.field2001 - 1] & 0xFF) + ((this.field2002[this.field2001 - 3] & 0xFF) << 16) + ((this.field2002[this.field2001 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dr.m(I)I")
    public int method2345() {
        this.field2001 += 4;
        return (this.field2002[this.field2001 - 1] & 0xFF) + ((this.field2002[this.field2001 - 2] & 0xFF) << 8) + ((this.field2002[this.field2001 - 4] & 0xFF) << 24) + ((this.field2002[this.field2001 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.w(I)J")
    public long method2314() {
        long var1 = (long) this.method2345() & 0xFFFFFFFFL;
        long var3 = (long) this.method2345() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dr.e(B)Ljava/lang/String;")
    public String method2406() {
        if (this.field2002[this.field2001] == 0) {
            this.field2001++;
            return null;
        } else {
            return this.method2316();
        }
    }

    @ObfuscatedName("dr.ad(I)Ljava/lang/String;")
    public String method2316() {
        int var1 = this.field2001;
        while (this.field2002[++this.field2001 - 1] != 0) {
        }
        int var2 = this.field2001 - var1 - 1;
        return var2 == 0 ? "" : class166.method2779(this.field2002, var1, var2);
    }

    @ObfuscatedName("dr.as(B)Ljava/lang/String;")
    public String method2317() {
        byte var1 = this.field2002[++this.field2001 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2001;
        while (this.field2002[++this.field2001 - 1] != 0) {
        }
        int var3 = this.field2001 - var2 - 1;
        return var3 == 0 ? "" : class166.method2779(this.field2002, var2, var3);
    }

    @ObfuscatedName("dr.ag(I)Ljava/lang/String;")
    public String method2318() {
        byte var1 = this.field2002[++this.field2001 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2292();
        if (this.field2001 + var2 > this.field2002.length) {
            throw new IllegalStateException("");
        }
        String var3 = Statics.method2088(this.field2002, this.field2001, var2);
        this.field2001 += var2;
        return var3;
    }

    @ObfuscatedName("dr.al([BIIB)V")
    public void method2319(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2002[++this.field2001 - 1];
        }
    }

    @ObfuscatedName("dr.av(S)I")
    public int method2405() {
        int var1 = this.field2002[this.field2001] & 0xFF;
        return var1 < 128 ? this.method2334() - 64 : this.method2310() - 49152;
    }

    @ObfuscatedName("dr.ar(S)I")
    public int method2321() {
        int var1 = this.field2002[this.field2001] & 0xFF;
        return var1 < 128 ? this.method2334() : this.method2310() - 32768;
    }

    @ObfuscatedName("dr.ay(I)I")
    public int method2322() {
        return this.field2002[this.field2001] < 0 ? this.method2345() & Integer.MAX_VALUE : this.method2310();
    }

    @ObfuscatedName("dr.aq(I)I")
    public int method2292() {
        byte var1 = this.field2002[++this.field2001 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2002[++this.field2001 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dr.ai([II)V")
    public void method2500(int[] arg0) {
        int var2 = this.field2001 / 8;
        this.field2001 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2345();
            int var5 = this.method2345();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2001 -= 8;
            this.method2296(var4);
            this.method2296(var5);
        }
    }

    @ObfuscatedName("dr.an([II)V")
    public void method2325(int[] arg0) {
        int var2 = this.field2001 / 8;
        this.field2001 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2345();
            int var5 = this.method2345();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2001 -= 8;
            this.method2296(var4);
            this.method2296(var5);
        }
    }

    @ObfuscatedName("dr.aw([IIII)V")
    public void method2326(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2001;
        this.field2001 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2345();
            int var8 = this.method2345();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2001 -= 8;
            this.method2296(var7);
            this.method2296(var8);
        }
        this.field2001 = var4;
    }

    @ObfuscatedName("dr.ap([IIII)V")
    public void method2327(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2001;
        this.field2001 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2345();
            int var8 = this.method2345();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2001 -= 8;
            this.method2296(var7);
            this.method2296(var8);
        }
        this.field2001 = var4;
    }

    @ObfuscatedName("dr.ak(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2480(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2001;
        this.field2001 = 0;
        byte[] var4 = new byte[var3];
        this.method2319(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2001 = 0;
        this.method2294(var7.length);
        this.method2302(var7, 0, var7.length);
    }

    @ObfuscatedName("dr.ac(II)I")
    public int method2329(int arg0) {
        int var2 = method2915(this.field2002, arg0, this.field2001);
        this.method2296(var2);
        return var2;
    }

    @ObfuscatedName("dr.ao(I)Z")
    public boolean method2330() {
        this.field2001 -= 4;
        int var1 = method2915(this.field2002, 0, this.field2001);
        int var2 = this.method2345();
        return var1 == var2;
    }

    @ObfuscatedName("dr.aj(II)V")
    public void method2434(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dr.ah(IB)V")
    public void method2332(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dr.ae(II)V")
    public void method2328(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dr.aa(I)I")
    public int method2463() {
        return this.field2002[++this.field2001 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dr.au(I)I")
    public int method2335() {
        return -this.field2002[++this.field2001 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.ab(I)I")
    public int method2453() {
        return 128 - this.field2002[++this.field2001 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.am(I)B")
    public byte method2337() {
        return (byte) (this.field2002[++this.field2001 - 1] - 128);
    }

    @ObfuscatedName("dr.at(B)B")
    public byte method2499() {
        return (byte) (-this.field2002[++this.field2001 - 1]);
    }

    @ObfuscatedName("dr.az(I)B")
    public byte method2441() {
        return (byte) (128 - this.field2002[++this.field2001 - 1]);
    }

    @ObfuscatedName("dr.af(II)V")
    public void method2340(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) arg0;
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.ax(II)V")
    public void method2341(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dr.bf(II)V")
    public void method2342(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 + 128);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bi(I)I")
    public int method2385() {
        this.field2001 += 2;
        return ((this.field2002[this.field2001 - 1] & 0xFF) << 8) + (this.field2002[this.field2001 - 2] & 0xFF);
    }

    @ObfuscatedName("dr.br(B)I")
    public int method2344() {
        this.field2001 += 2;
        return ((this.field2002[this.field2001 - 2] & 0xFF) << 8) + (this.field2002[this.field2001 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dr.bd(I)I")
    public int method2486() {
        this.field2001 += 2;
        return ((this.field2002[this.field2001 - 1] & 0xFF) << 8) + (this.field2002[this.field2001 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dr.bg(B)I")
    public int method2387() {
        this.field2001 += 2;
        int var1 = ((this.field2002[this.field2001 - 1] & 0xFF) << 8) + (this.field2002[this.field2001 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.bh(II)V")
    public void method2347(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2001 - 1] = (byte) arg0;
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bn(I)I")
    public int method2304() {
        this.field2001 += 3;
        return (this.field2002[this.field2001 - 2] & 0xFF) + ((this.field2002[this.field2001 - 1] & 0xFF) << 8) + ((this.field2002[this.field2001 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.bb(IB)V")
    public void method2349(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) arg0;
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dr.ba(II)V")
    public void method2350(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2001 - 1] = (byte) arg0;
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 24);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dr.bw(IB)V")
    public void method2323(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 24);
        this.field2002[++this.field2001 - 1] = (byte) arg0;
        this.field2002[++this.field2001 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bl(I)I")
    public int method2352() {
        this.field2001 += 4;
        return (this.field2002[this.field2001 - 4] & 0xFF) + ((this.field2002[this.field2001 - 3] & 0xFF) << 8) + ((this.field2002[this.field2001 - 2] & 0xFF) << 16) + ((this.field2002[this.field2001 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dr.bj(I)I")
    public int method2353() {
        this.field2001 += 4;
        return (this.field2002[this.field2001 - 3] & 0xFF) + ((this.field2002[this.field2001 - 4] & 0xFF) << 8) + ((this.field2002[this.field2001 - 1] & 0xFF) << 16) + ((this.field2002[this.field2001 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dr.bx(B)I")
    public int method2354() {
        this.field2001 += 4;
        return (this.field2002[this.field2001 - 2] & 0xFF) + ((this.field2002[this.field2001 - 1] & 0xFF) << 8) + ((this.field2002[this.field2001 - 4] & 0xFF) << 16) + ((this.field2002[this.field2001 - 3] & 0xFF) << 24);
    }
}
