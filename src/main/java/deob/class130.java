package deob;

import java.math.BigInteger;

@ObfuscatedName("du")
public class class130 extends class149 {

    @ObfuscatedName("du.d")
    public byte[] field1955;

    @ObfuscatedName("du.c")
    public int field1956;

    @ObfuscatedName("du.n")
    public static int[] field1957 = new int[256];

    @ObfuscatedName("du.t")
    public static long[] field1959;

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
            field1957[var0] = var1;
        }
        field1959 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1959[var3] = var4;
        }
    }

    @ObfuscatedName("q.d([BIII)I")
    public static int method42(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1957[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class130(int arg0) {
        this.field1955 = class131.method2449(arg0);
        this.field1956 = 0;
    }

    public class130(byte[] arg0) {
        this.field1955 = arg0;
        this.field1956 = 0;
    }

    @ObfuscatedName("du.c(IB)V")
    public void method2215(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.n(IB)V")
    public void method2216(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
        this.field1955[++this.field1956 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.q(II)V")
    public void method2305(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 16);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
        this.field1955[++this.field1956 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.t(IB)V")
    public void method2218(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 24);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 16);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
        this.field1955[++this.field1956 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.p(J)V")
    public void method2219(long arg0) {
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1955[++this.field1956 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("du.u(J)V")
    public void method2220(long arg0) {
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1955[++this.field1956 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1955[++this.field1956 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("aq.w(Ljava/lang/String;B)I")
    public static int method740(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("du.r(Ljava/lang/String;I)V")
    public void method2351(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1956 += class211.method1893(arg0, 0, arg0.length(), this.field1955, this.field1956);
        this.field1955[++this.field1956 - 1] = 0;
    }

    @ObfuscatedName("ck.s(Ljava/lang/String;I)I")
    public static int method1480(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("du.k(Ljava/lang/String;I)V")
    public void method2294(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1955[++this.field1956 - 1] = 0;
        this.field1956 += class211.method1893(arg0, 0, arg0.length(), this.field1955, this.field1956);
        this.field1955[++this.field1956 - 1] = 0;
    }

    @ObfuscatedName("du.e(Ljava/lang/CharSequence;I)V")
    public void method2223(CharSequence arg0) {
        int var2 = class10.method174(arg0);
        this.field1955[++this.field1956 - 1] = 0;
        this.method2302(var2);
        int var3 = this.field1956;
        byte[] var4 = this.field1955;
        int var5 = this.field1956;
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
        this.field1956 = var10 + var3;
    }

    @ObfuscatedName("du.j([BIII)V")
    public void method2255(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1955[++this.field1956 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("du.i(IB)V")
    public void method2225(int arg0) {
        this.field1955[this.field1956 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1955[this.field1956 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1955[this.field1956 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1955[this.field1956 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.a(II)V")
    public void method2226(int arg0) {
        this.field1955[this.field1956 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1955[this.field1956 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.x(II)V")
    public void method2227(int arg0) {
        this.field1955[this.field1956 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.h(IB)V")
    public void method2228(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2215(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2216(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("du.b(II)V")
    public void method2302(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2215(arg0 >>> 28 | 0x80);
                    }
                    this.method2215(arg0 >>> 21 | 0x80);
                }
                this.method2215(arg0 >>> 14 | 0x80);
            }
            this.method2215(arg0 >>> 7 | 0x80);
        }
        this.method2215(arg0 & 0x7F);
    }

    @ObfuscatedName("du.f(I)I")
    public int method2379() {
        return this.field1955[++this.field1956 - 1] & 0xFF;
    }

    @ObfuscatedName("du.o(I)B")
    public byte method2230() {
        return this.field1955[++this.field1956 - 1];
    }

    @ObfuscatedName("du.m(B)I")
    public int method2232() {
        this.field1956 += 2;
        return ((this.field1955[this.field1956 - 2] & 0xFF) << 8) + (this.field1955[this.field1956 - 1] & 0xFF);
    }

    @ObfuscatedName("du.y(B)I")
    public int method2254() {
        this.field1956 += 2;
        int var1 = ((this.field1955[this.field1956 - 2] & 0xFF) << 8) + (this.field1955[this.field1956 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.am(I)I")
    public int method2233() {
        this.field1956 += 3;
        return (this.field1955[this.field1956 - 1] & 0xFF) + ((this.field1955[this.field1956 - 2] & 0xFF) << 8) + ((this.field1955[this.field1956 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("du.ax(B)I")
    public int method2246() {
        this.field1956 += 4;
        return (this.field1955[this.field1956 - 1] & 0xFF) + ((this.field1955[this.field1956 - 2] & 0xFF) << 8) + ((this.field1955[this.field1956 - 4] & 0xFF) << 24) + ((this.field1955[this.field1956 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("du.ac(I)J")
    public long method2320() {
        long var1 = (long) this.method2246() & 0xFFFFFFFFL;
        long var3 = (long) this.method2246() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("du.az(B)Ljava/lang/String;")
    public String method2236() {
        if (this.field1955[this.field1956] == 0) {
            this.field1956++;
            return null;
        } else {
            return this.method2314();
        }
    }

    @ObfuscatedName("du.ao(B)Ljava/lang/String;")
    public String method2314() {
        int var1 = this.field1956;
        while (this.field1955[++this.field1956 - 1] != 0) {
        }
        int var2 = this.field1956 - var1 - 1;
        return var2 == 0 ? "" : Statics.method1946(this.field1955, var1, var2);
    }

    @ObfuscatedName("du.ak(I)Ljava/lang/String;")
    public String method2277() {
        byte var1 = this.field1955[++this.field1956 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1956;
        while (this.field1955[++this.field1956 - 1] != 0) {
        }
        int var3 = this.field1956 - var2 - 1;
        return var3 == 0 ? "" : Statics.method1946(this.field1955, var2, var3);
    }

    @ObfuscatedName("du.aa(I)Ljava/lang/String;")
    public String method2396() {
        byte var1 = this.field1955[++this.field1956 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2441();
        if (this.field1956 + var2 > this.field1955.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1955;
        int var4 = this.field1956;
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
        this.field1956 += var2;
        return var12;
    }

    @ObfuscatedName("du.aj([BIII)V")
    public void method2240(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1955[++this.field1956 - 1];
        }
    }

    @ObfuscatedName("du.ay(I)I")
    public int method2241() {
        int var1 = this.field1955[this.field1956] & 0xFF;
        return var1 < 128 ? this.method2379() - 64 : this.method2232() - 49152;
    }

    @ObfuscatedName("du.ae(I)I")
    public int method2242() {
        int var1 = this.field1955[this.field1956] & 0xFF;
        return var1 < 128 ? this.method2379() : this.method2232() - 32768;
    }

    @ObfuscatedName("du.aq(B)I")
    public int method2341() {
        return this.field1955[this.field1956] < 0 ? this.method2246() & Integer.MAX_VALUE : this.method2232();
    }

    @ObfuscatedName("du.av(I)I")
    public int method2244() {
        if (this.field1955[this.field1956] < 0) {
            return this.method2246() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2232();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("du.aw(I)I")
    public int method2441() {
        byte var1 = this.field1955[++this.field1956 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1955[++this.field1956 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("du.ag([IB)V")
    public void method2352(int[] arg0) {
        int var2 = this.field1956 / 8;
        this.field1956 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2246();
            int var5 = this.method2246();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1956 -= 8;
            this.method2218(var4);
            this.method2218(var5);
        }
    }

    @ObfuscatedName("du.af([II)V")
    public void method2445(int[] arg0) {
        int var2 = this.field1956 / 8;
        this.field1956 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2246();
            int var5 = this.method2246();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1956 -= 8;
            this.method2218(var4);
            this.method2218(var5);
        }
    }

    @ObfuscatedName("du.ar([IIII)V")
    public void method2214(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1956;
        this.field1956 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2246();
            int var8 = this.method2246();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1956 -= 8;
            this.method2218(var7);
            this.method2218(var8);
        }
        this.field1956 = var4;
    }

    @ObfuscatedName("du.ab([IIIB)V")
    public void method2439(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1956;
        this.field1956 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2246();
            int var8 = this.method2246();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1956 -= 8;
            this.method2218(var7);
            this.method2218(var8);
        }
        this.field1956 = var4;
    }

    @ObfuscatedName("du.as(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2330(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1956;
        this.field1956 = 0;
        byte[] var4 = new byte[var3];
        this.method2240(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1956 = 0;
        this.method2216(var7.length);
        this.method2255(var7, 0, var7.length);
    }

    @ObfuscatedName("du.ai(II)I")
    public int method2251(int arg0) {
        int var2 = method42(this.field1955, arg0, this.field1956);
        this.method2218(var2);
        return var2;
    }

    @ObfuscatedName("du.ad(B)Z")
    public boolean method2374() {
        this.field1956 -= 4;
        int var1 = method42(this.field1955, 0, this.field1956);
        int var2 = this.method2246();
        return var1 == var2;
    }

    @ObfuscatedName("du.an(II)V")
    public void method2253(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("du.al(II)V")
    public void method2346(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("du.at(IB)V")
    public void method2276(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("du.ah(B)I")
    public int method2256() {
        return this.field1955[++this.field1956 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("du.ap(I)I")
    public int method2257() {
        return -this.field1955[++this.field1956 - 1] & 0xFF;
    }

    @ObfuscatedName("du.au(S)I")
    public int method2405() {
        return 128 - this.field1955[++this.field1956 - 1] & 0xFF;
    }

    @ObfuscatedName("du.bu(I)B")
    public byte method2259() {
        return (byte) (this.field1955[++this.field1956 - 1] - 128);
    }

    @ObfuscatedName("du.br(B)B")
    public byte method2362() {
        return (byte) (-this.field1955[++this.field1956 - 1]);
    }

    @ObfuscatedName("du.bk(B)B")
    public byte method2348() {
        return (byte) (128 - this.field1955[++this.field1956 - 1]);
    }

    @ObfuscatedName("du.bo(IB)V")
    public void method2373(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) arg0;
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.bw(II)V")
    public void method2263(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("du.bi(II)V")
    public void method2222(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 + 128);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.bl(B)I")
    public int method2265() {
        this.field1956 += 2;
        return ((this.field1955[this.field1956 - 1] & 0xFF) << 8) + (this.field1955[this.field1956 - 2] & 0xFF);
    }

    @ObfuscatedName("du.by(B)I")
    public int method2266() {
        this.field1956 += 2;
        return ((this.field1955[this.field1956 - 2] & 0xFF) << 8) + (this.field1955[this.field1956 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("du.bv(B)I")
    public int method2267() {
        this.field1956 += 2;
        return ((this.field1955[this.field1956 - 1] & 0xFF) << 8) + (this.field1955[this.field1956 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("du.bf(I)I")
    public int method2268() {
        this.field1956 += 2;
        int var1 = ((this.field1955[this.field1956 - 1] & 0xFF) << 8) + (this.field1955[this.field1956 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.be(I)I")
    public int method2221() {
        this.field1956 += 2;
        int var1 = ((this.field1955[this.field1956 - 2] & 0xFF) << 8) + (this.field1955[this.field1956 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.bm(II)V")
    public void method2298(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) arg0;
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("du.bx(I)I")
    public int method2444() {
        this.field1956 += 3;
        return (this.field1955[this.field1956 - 3] & 0xFF) + ((this.field1955[this.field1956 - 2] & 0xFF) << 8) + ((this.field1955[this.field1956 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("du.bb(II)V")
    public void method2258(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) arg0;
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 16);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("du.bj(II)V")
    public void method2273(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
        this.field1955[++this.field1956 - 1] = (byte) arg0;
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 24);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("du.bp(II)V")
    public void method2274(int arg0) {
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 16);
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 24);
        this.field1955[++this.field1956 - 1] = (byte) arg0;
        this.field1955[++this.field1956 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.bc(I)I")
    public int method2424() {
        this.field1956 += 4;
        return (this.field1955[this.field1956 - 4] & 0xFF) + ((this.field1955[this.field1956 - 3] & 0xFF) << 8) + ((this.field1955[this.field1956 - 1] & 0xFF) << 24) + ((this.field1955[this.field1956 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("du.bh(I)I")
    public int method2332() {
        this.field1956 += 4;
        return (this.field1955[this.field1956 - 3] & 0xFF) + ((this.field1955[this.field1956 - 4] & 0xFF) << 8) + ((this.field1955[this.field1956 - 2] & 0xFF) << 24) + ((this.field1955[this.field1956 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("du.bs(I)I")
    public int method2334() {
        this.field1956 += 4;
        return (this.field1955[this.field1956 - 2] & 0xFF) + ((this.field1955[this.field1956 - 1] & 0xFF) << 8) + ((this.field1955[this.field1956 - 3] & 0xFF) << 24) + ((this.field1955[this.field1956 - 4] & 0xFF) << 16);
    }
}
