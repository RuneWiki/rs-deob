package deob;

import java.math.BigInteger;

@ObfuscatedName("dq")
public class class120 extends class209 {

    @ObfuscatedName("dq.e")
    public byte[] field1981;

    @ObfuscatedName("dq.w")
    public int field1977;

    @ObfuscatedName("dq.f")
    public static int[] field1980 = new int[256];

    @ObfuscatedName("dq.p")
    public static long[] field1985;

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
            field1980[var0] = var1;
        }
        field1985 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1985[var3] = var4;
        }
    }

    @ObfuscatedName("ep.e([BIB)I")
    public static int method2797(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1980[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class120(int arg0) {
        this.field1981 = class122.method2583(arg0);
        this.field1977 = 0;
    }

    public class120(byte[] arg0) {
        this.field1981 = arg0;
        this.field1977 = 0;
    }

    @ObfuscatedName("dq.w(II)V")
    public void method2397(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.f(IB)V")
    public void method2545(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.s(II)V")
    public void method2342(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.p(II)V")
    public void method2449(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.h(J)V")
    public void method2478(long arg0) {
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1981[++this.field1977 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dq.g(J)V")
    public void method2412(long arg0) {
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1981[++this.field1977 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("at.a(Ljava/lang/String;I)I")
    public static int method957(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dq.r(Ljava/lang/String;B)V")
    public void method2346(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1977 += class166.method6(arg0, 0, arg0.length(), this.field1981, this.field1977);
        this.field1981[++this.field1977 - 1] = 0;
    }

    @ObfuscatedName("dq.k(Ljava/lang/String;B)V")
    public void method2347(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1981[++this.field1977 - 1] = 0;
        this.field1977 += class166.method6(arg0, 0, arg0.length(), this.field1981, this.field1977);
        this.field1981[++this.field1977 - 1] = 0;
    }

    @ObfuscatedName("dq.m(Ljava/lang/CharSequence;I)V")
    public void method2348(CharSequence arg0) {
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
        this.field1981[++this.field1977 - 1] = 0;
        this.method2354(var3);
        this.field1977 += class210.method718(this.field1981, this.field1977, arg0);
    }

    @ObfuscatedName("dq.n([BIII)V")
    public void method2349(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1981[++this.field1977 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dq.y(IB)V")
    public void method2523(int arg0) {
        this.field1981[this.field1977 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1981[this.field1977 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1981[this.field1977 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1981[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.i(IB)V")
    public void method2351(int arg0) {
        this.field1981[this.field1977 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1981[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.j(II)V")
    public void method2356(int arg0) {
        this.field1981[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.l(II)V")
    public void method2353(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2397(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2545(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dq.o(II)V")
    public void method2354(int arg0) {
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

    @ObfuscatedName("dq.c(I)I")
    public int method2355() {
        return this.field1981[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.x(I)B")
    public byte method2465() {
        return this.field1981[++this.field1977 - 1];
    }

    @ObfuscatedName("dq.b(B)I")
    public int method2532() {
        this.field1977 += 2;
        return ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + (this.field1981[this.field1977 - 1] & 0xFF);
    }

    @ObfuscatedName("dq.q(I)I")
    public int method2358() {
        this.field1977 += 2;
        int var1 = ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + (this.field1981[this.field1977 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.u(I)I")
    public int method2359() {
        this.field1977 += 3;
        return (this.field1981[this.field1977 - 1] & 0xFF) + ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + ((this.field1981[this.field1977 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.t(I)I")
    public int method2360() {
        this.field1977 += 4;
        return (this.field1981[this.field1977 - 1] & 0xFF) + ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + ((this.field1981[this.field1977 - 4] & 0xFF) << 24) + ((this.field1981[this.field1977 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.d(S)J")
    public long method2361() {
        long var1 = (long) this.method2360() & 0xFFFFFFFFL;
        long var3 = (long) this.method2360() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dq.z(I)Ljava/lang/String;")
    public String method2362() {
        if (this.field1981[this.field1977] == 0) {
            this.field1977++;
            return null;
        } else {
            return this.method2363();
        }
    }

    @ObfuscatedName("dq.v(I)Ljava/lang/String;")
    public String method2363() {
        int var1 = this.field1977;
        while (this.field1981[++this.field1977 - 1] != 0) {
        }
        int var2 = this.field1977 - var1 - 1;
        return var2 == 0 ? "" : class166.method1947(this.field1981, var1, var2);
    }

    @ObfuscatedName("dq.aq(I)Ljava/lang/String;")
    public String method2364() {
        byte var1 = this.field1981[++this.field1977 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1977;
        while (this.field1981[++this.field1977 - 1] != 0) {
        }
        int var3 = this.field1977 - var2 - 1;
        return var3 == 0 ? "" : class166.method1947(this.field1981, var2, var3);
    }

    @ObfuscatedName("dq.ap(I)Ljava/lang/String;")
    public String method2456() {
        byte var1 = this.field1981[++this.field1977 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2511();
        if (this.field1977 + var2 > this.field1981.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1981;
        int var4 = this.field1977;
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
        this.field1977 += var2;
        return var12;
    }

    @ObfuscatedName("dq.ai([BIII)V")
    public void method2541(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1981[++this.field1977 - 1];
        }
    }

    @ObfuscatedName("dq.ae(I)I")
    public int method2367() {
        int var1 = this.field1981[this.field1977] & 0xFF;
        return var1 < 128 ? this.method2355() - 64 : this.method2532() - 49152;
    }

    @ObfuscatedName("dq.az(I)I")
    public int method2368() {
        int var1 = this.field1981[this.field1977] & 0xFF;
        return var1 < 128 ? this.method2355() : this.method2532() - 32768;
    }

    @ObfuscatedName("dq.ah(I)I")
    public int method2369() {
        return this.field1981[this.field1977] < 0 ? this.method2360() & Integer.MAX_VALUE : this.method2532();
    }

    @ObfuscatedName("dq.ar(I)I")
    public int method2511() {
        byte var1 = this.field1981[++this.field1977 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1981[++this.field1977 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dq.ab([II)V")
    public void method2371(int[] arg0) {
        int var2 = this.field1977 / 8;
        this.field1977 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2360();
            int var5 = this.method2360();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1977 -= 8;
            this.method2449(var4);
            this.method2449(var5);
        }
    }

    @ObfuscatedName("dq.aj([IB)V")
    public void method2372(int[] arg0) {
        int var2 = this.field1977 / 8;
        this.field1977 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2360();
            int var5 = this.method2360();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1977 -= 8;
            this.method2449(var4);
            this.method2449(var5);
        }
    }

    @ObfuscatedName("dq.ay([IIII)V")
    public void method2366(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        this.field1977 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2360();
            int var8 = this.method2360();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1977 -= 8;
            this.method2449(var7);
            this.method2449(var8);
        }
        this.field1977 = var4;
    }

    @ObfuscatedName("dq.ag([IIIS)V")
    public void method2374(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        this.field1977 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2360();
            int var8 = this.method2360();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1977 -= 8;
            this.method2449(var7);
            this.method2449(var8);
        }
        this.field1977 = var4;
    }

    @ObfuscatedName("dq.av(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2473(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1977;
        this.field1977 = 0;
        byte[] var4 = new byte[var3];
        this.method2541(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1977 = 0;
        this.method2545(var7.length);
        this.method2349(var7, 0, var7.length);
    }

    @ObfuscatedName("dq.af(IB)I")
    public int method2459(int arg0) {
        byte[] var2 = this.field1981;
        int var3 = this.field1977;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1980[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2449(var6);
        return var6;
    }

    @ObfuscatedName("dq.am(I)Z")
    public boolean method2377() {
        this.field1977 -= 4;
        byte[] var1 = this.field1981;
        int var2 = this.field1977;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1980[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2360();
        return var5 == var8;
    }

    @ObfuscatedName("dq.aw(IS)V")
    public void method2378(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.ad(II)V")
    public void method2540(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dq.aa(II)V")
    public void method2387(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dq.ac(B)I")
    public int method2381() {
        return this.field1981[++this.field1977 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dq.an(I)I")
    public int method2382() {
        return -this.field1981[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.ax(B)I")
    public int method2383() {
        return 128 - this.field1981[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.au(B)B")
    public byte method2384() {
        return (byte) (this.field1981[++this.field1977 - 1] - 128);
    }

    @ObfuscatedName("dq.at(I)B")
    public byte method2420() {
        return (byte) (-this.field1981[++this.field1977 - 1]);
    }

    @ObfuscatedName("dq.ao(II)V")
    public void method2386(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.al(II)V")
    public void method2380(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.ak(IB)V")
    public void method2388(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 + 128);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.as(I)I")
    public int method2389() {
        this.field1977 += 2;
        return ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + (this.field1981[this.field1977 - 2] & 0xFF);
    }

    @ObfuscatedName("dq.bj(I)I")
    public int method2419() {
        this.field1977 += 2;
        return ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + (this.field1981[this.field1977 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bq(I)I")
    public int method2393() {
        this.field1977 += 2;
        return ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + (this.field1981[this.field1977 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bo(I)I")
    public int method2392() {
        this.field1977 += 2;
        int var1 = ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + (this.field1981[this.field1977 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.br(II)V")
    public void method2375(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bl(II)V")
    public void method2515(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dq.bd(II)V")
    public void method2395(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dq.bh(IB)V")
    public void method2542(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bw(I)I")
    public int method2495() {
        this.field1977 += 4;
        return (this.field1981[this.field1977 - 4] & 0xFF) + ((this.field1981[this.field1977 - 3] & 0xFF) << 8) + ((this.field1981[this.field1977 - 2] & 0xFF) << 16) + ((this.field1981[this.field1977 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.bn(B)I")
    public int method2398() {
        this.field1977 += 4;
        return (this.field1981[this.field1977 - 3] & 0xFF) + ((this.field1981[this.field1977 - 4] & 0xFF) << 8) + ((this.field1981[this.field1977 - 2] & 0xFF) << 24) + ((this.field1981[this.field1977 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.by(I)I")
    public int method2399() {
        this.field1977 += 4;
        return (this.field1981[this.field1977 - 2] & 0xFF) + ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + ((this.field1981[this.field1977 - 3] & 0xFF) << 24) + ((this.field1981[this.field1977 - 4] & 0xFF) << 16);
    }
}
