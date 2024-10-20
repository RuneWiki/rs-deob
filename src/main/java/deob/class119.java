package deob;

import java.math.BigInteger;

@ObfuscatedName("dm")
public class class119 extends class208 {

    @ObfuscatedName("dm.h")
    public byte[] field1978;

    @ObfuscatedName("dm.q")
    public int field1973;

    @ObfuscatedName("dm.v")
    public static int[] field1972 = new int[256];

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
            field1972[var0] = var1;
        }
    }

    public class119(int arg0) {
        this.field1978 = class121.method2624(arg0);
        this.field1973 = 0;
    }

    public class119(byte[] arg0) {
        this.field1978 = arg0;
        this.field1973 = 0;
    }

    @ObfuscatedName("dm.h(II)V")
    public void method2499(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.q(IB)V")
    public void method2369(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1978[++this.field1973 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.v(II)V")
    public void method2413(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 16);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1978[++this.field1973 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.n(IB)V")
    public void method2556(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 24);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 16);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1978[++this.field1973 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.f(J)V")
    public void method2406(long arg0) {
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1978[++this.field1973 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dm.g(J)V")
    public void method2402(long arg0) {
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1978[++this.field1973 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1978[++this.field1973 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cr.o(Ljava/lang/String;I)I")
    public static int method2072(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dm.s(Ljava/lang/String;I)V")
    public void method2374(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1973 += class165.method1975(arg0, 0, arg0.length(), this.field1978, this.field1973);
        this.field1978[++this.field1973 - 1] = 0;
    }

    @ObfuscatedName("o.k(Ljava/lang/String;B)I")
    public static int method106(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dm.b(Ljava/lang/String;B)V")
    public void method2375(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1978[++this.field1973 - 1] = 0;
        this.field1973 += class165.method1975(arg0, 0, arg0.length(), this.field1978, this.field1973);
        this.field1978[++this.field1973 - 1] = 0;
    }

    @ObfuscatedName("dm.c(Ljava/lang/CharSequence;I)V")
    public void method2463(CharSequence arg0) {
        int var2 = class209.method3286(arg0);
        this.field1978[++this.field1973 - 1] = 0;
        this.method2372(var2);
        int var3 = this.field1973;
        byte[] var4 = this.field1978;
        int var5 = this.field1973;
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
        this.field1973 = var10 + var3;
    }

    @ObfuscatedName("dm.l([BIII)V")
    public void method2377(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1978[++this.field1973 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dm.p(II)V")
    public void method2420(int arg0) {
        this.field1978[this.field1973 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1978[this.field1973 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1978[this.field1973 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1978[this.field1973 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.d(II)V")
    public void method2379(int arg0) {
        this.field1978[this.field1973 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1978[this.field1973 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.i(IB)V")
    public void method2380(int arg0) {
        this.field1978[this.field1973 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.x(II)V")
    public void method2381(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2499(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2369(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dm.j(II)V")
    public void method2372(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2499(arg0 >>> 28 | 0x80);
                    }
                    this.method2499(arg0 >>> 21 | 0x80);
                }
                this.method2499(arg0 >>> 14 | 0x80);
            }
            this.method2499(arg0 >>> 7 | 0x80);
        }
        this.method2499(arg0 & 0x7F);
    }

    @ObfuscatedName("dm.w(I)I")
    public int method2383() {
        return this.field1978[++this.field1973 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.r(I)B")
    public byte method2370() {
        return this.field1978[++this.field1973 - 1];
    }

    @ObfuscatedName("dm.u(I)I")
    public int method2385() {
        this.field1973 += 2;
        return ((this.field1978[this.field1973 - 2] & 0xFF) << 8) + (this.field1978[this.field1973 - 1] & 0xFF);
    }

    @ObfuscatedName("dm.m(I)I")
    public int method2386() {
        this.field1973 += 2;
        int var1 = ((this.field1978[this.field1973 - 2] & 0xFF) << 8) + (this.field1978[this.field1973 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.t(I)I")
    public int method2387() {
        this.field1973 += 3;
        return (this.field1978[this.field1973 - 1] & 0xFF) + ((this.field1978[this.field1973 - 3] & 0xFF) << 16) + ((this.field1978[this.field1973 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dm.z(B)I")
    public int method2388() {
        this.field1973 += 4;
        return (this.field1978[this.field1973 - 1] & 0xFF) + ((this.field1978[this.field1973 - 2] & 0xFF) << 8) + ((this.field1978[this.field1973 - 3] & 0xFF) << 16) + ((this.field1978[this.field1973 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.e(I)J")
    public long method2389() {
        long var1 = (long) this.method2388() & 0xFFFFFFFFL;
        long var3 = (long) this.method2388() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dm.y(I)Ljava/lang/String;")
    public String method2471() {
        if (this.field1978[this.field1973] == 0) {
            this.field1973++;
            return null;
        } else {
            return this.method2391();
        }
    }

    @ObfuscatedName("dm.a(B)Ljava/lang/String;")
    public String method2391() {
        int var1 = this.field1973;
        while (this.field1978[++this.field1973 - 1] != 0) {
        }
        int var2 = this.field1973 - var1 - 1;
        return var2 == 0 ? "" : class165.method832(this.field1978, var1, var2);
    }

    @ObfuscatedName("dm.at(S)Ljava/lang/String;")
    public String method2392() {
        byte var1 = this.field1978[++this.field1973 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1973;
        while (this.field1978[++this.field1973 - 1] != 0) {
        }
        int var3 = this.field1973 - var2 - 1;
        return var3 == 0 ? "" : class165.method832(this.field1978, var2, var3);
    }

    @ObfuscatedName("dm.aa(I)Ljava/lang/String;")
    public String method2393() {
        byte var1 = this.field1978[++this.field1973 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2500();
        if (this.field1973 + var2 > this.field1978.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1978;
        int var4 = this.field1973;
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
        this.field1973 += var2;
        return var12;
    }

    @ObfuscatedName("dm.ad([BIII)V")
    public void method2394(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1978[++this.field1973 - 1];
        }
    }

    @ObfuscatedName("dm.af(I)I")
    public int method2429() {
        int var1 = this.field1978[this.field1973] & 0xFF;
        return var1 < 128 ? this.method2383() - 64 : this.method2385() - 49152;
    }

    @ObfuscatedName("dm.ag(B)I")
    public int method2484() {
        int var1 = this.field1978[this.field1973] & 0xFF;
        return var1 < 128 ? this.method2383() : this.method2385() - 32768;
    }

    @ObfuscatedName("dm.as(B)I")
    public int method2450() {
        return this.field1978[this.field1973] < 0 ? this.method2388() & Integer.MAX_VALUE : this.method2385();
    }

    @ObfuscatedName("dm.al(I)I")
    public int method2500() {
        byte var1 = this.field1978[++this.field1973 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1978[++this.field1973 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dm.am([II)V")
    public void method2578(int[] arg0) {
        int var2 = this.field1973 / 8;
        this.field1973 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2388();
            int var5 = this.method2388();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1973 -= 8;
            this.method2556(var4);
            this.method2556(var5);
        }
    }

    @ObfuscatedName("dm.ar([IS)V")
    public void method2501(int[] arg0) {
        int var2 = this.field1973 / 8;
        this.field1973 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2388();
            int var5 = this.method2388();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1973 -= 8;
            this.method2556(var4);
            this.method2556(var5);
        }
    }

    @ObfuscatedName("dm.ap([IIII)V")
    public void method2401(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1973;
        this.field1973 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2388();
            int var8 = this.method2388();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1973 -= 8;
            this.method2556(var7);
            this.method2556(var8);
        }
        this.field1973 = var4;
    }

    @ObfuscatedName("dm.ac([IIII)V")
    public void method2521(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1973;
        this.field1973 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2388();
            int var8 = this.method2388();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1973 -= 8;
            this.method2556(var7);
            this.method2556(var8);
        }
        this.field1973 = var4;
    }

    @ObfuscatedName("dm.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2403(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1973;
        this.field1973 = 0;
        byte[] var4 = new byte[var3];
        this.method2394(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1973 = 0;
        this.method2369(var7.length);
        this.method2377(var7, 0, var7.length);
    }

    @ObfuscatedName("dm.an(II)I")
    public int method2404(int arg0) {
        byte[] var2 = this.field1978;
        int var3 = this.field1973;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1972[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2556(var6);
        return var6;
    }

    @ObfuscatedName("dm.ak(I)Z")
    public boolean method2405() {
        this.field1973 -= 4;
        byte[] var1 = this.field1978;
        int var2 = this.field1973;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1972[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2388();
        return var5 == var8;
    }

    @ObfuscatedName("dm.ay(II)V")
    public void method2397(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.au(IB)V")
    public void method2407(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dm.az(II)V")
    public void method2408(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dm.aw(I)I")
    public int method2549() {
        return this.field1978[++this.field1973 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dm.av(B)I")
    public int method2423() {
        return -this.field1978[++this.field1973 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.aq(I)I")
    public int method2411() {
        return 128 - this.field1978[++this.field1973 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.ax(S)B")
    public byte method2371() {
        return (byte) (this.field1978[++this.field1973 - 1] - 128);
    }

    @ObfuscatedName("dm.ai(I)B")
    public byte method2483() {
        return (byte) (-this.field1978[++this.field1973 - 1]);
    }

    @ObfuscatedName("dm.ae(I)B")
    public byte method2414() {
        return (byte) (128 - this.field1978[++this.field1973 - 1]);
    }

    @ObfuscatedName("dm.aj(IB)V")
    public void method2415(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) arg0;
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.ah(II)V")
    public void method2582(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.ao(IB)V")
    public void method2441(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 + 128);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bs(B)I")
    public int method2418() {
        this.field1973 += 2;
        return ((this.field1978[this.field1973 - 1] & 0xFF) << 8) + (this.field1978[this.field1973 - 2] & 0xFF);
    }

    @ObfuscatedName("dm.be(I)I")
    public int method2419() {
        this.field1973 += 2;
        return ((this.field1978[this.field1973 - 2] & 0xFF) << 8) + (this.field1978[this.field1973 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.bq(B)I")
    public int method2559() {
        this.field1973 += 2;
        return ((this.field1978[this.field1973 - 1] & 0xFF) << 8) + (this.field1978[this.field1973 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.bm(B)I")
    public int method2421() {
        this.field1973 += 2;
        int var1 = ((this.field1978[this.field1973 - 1] & 0xFF) << 8) + (this.field1978[this.field1973 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.bi(I)I")
    public int method2422() {
        this.field1973 += 2;
        int var1 = ((this.field1978[this.field1973 - 2] & 0xFF) << 8) + (this.field1978[this.field1973 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.bc(II)V")
    public void method2587(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) arg0;
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.bd(I)I")
    public int method2424() {
        this.field1973 += 3;
        return (this.field1978[this.field1973 - 2] & 0xFF) + ((this.field1978[this.field1973 - 1] & 0xFF) << 8) + ((this.field1978[this.field1973 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.bk(II)V")
    public void method2382(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) arg0;
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 16);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dm.bu(II)V")
    public void method2426(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
        this.field1978[++this.field1973 - 1] = (byte) arg0;
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 24);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.bj(II)V")
    public void method2427(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 16);
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 24);
        this.field1978[++this.field1973 - 1] = (byte) arg0;
        this.field1978[++this.field1973 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bl(B)I")
    public int method2428() {
        this.field1973 += 4;
        return (this.field1978[this.field1973 - 4] & 0xFF) + ((this.field1978[this.field1973 - 3] & 0xFF) << 8) + ((this.field1978[this.field1973 - 2] & 0xFF) << 16) + ((this.field1978[this.field1973 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.bn(B)I")
    public int method2487() {
        this.field1973 += 4;
        return (this.field1978[this.field1973 - 3] & 0xFF) + ((this.field1978[this.field1973 - 4] & 0xFF) << 8) + ((this.field1978[this.field1973 - 1] & 0xFF) << 16) + ((this.field1978[this.field1973 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.br(I)I")
    public int method2430() {
        this.field1973 += 4;
        return (this.field1978[this.field1973 - 2] & 0xFF) + ((this.field1978[this.field1973 - 1] & 0xFF) << 8) + ((this.field1978[this.field1973 - 3] & 0xFF) << 24) + ((this.field1978[this.field1973 - 4] & 0xFF) << 16);
    }
}
