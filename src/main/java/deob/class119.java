package deob;

import java.math.BigInteger;

@ObfuscatedName("dx")
public class class119 extends class208 {

    @ObfuscatedName("dx.i")
    public byte[] field1982;

    @ObfuscatedName("dx.v")
    public int field1980;

    @ObfuscatedName("dx.r")
    public static int[] field1986 = new int[256];

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
            field1986[var0] = var1;
        }
    }

    @ObfuscatedName("fl.i([BIII)I")
    public static int method3142(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1986[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1982 = class121.method2569(arg0);
        this.field1980 = 0;
    }

    public class119(byte[] arg0) {
        this.field1982 = arg0;
        this.field1980 = 0;
    }

    @ObfuscatedName("dx.v(II)V")
    public void method2436(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.r(II)V")
    public void method2331(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1982[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.n(IB)V")
    public void method2467(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1982[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.x(II)V")
    public void method2333(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 24);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1982[++this.field1980 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.q(J)V")
    public void method2334(long arg0) {
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1982[++this.field1980 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dx.h(J)V")
    public void method2335(long arg0) {
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1982[++this.field1980 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1982[++this.field1980 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("z.d(Ljava/lang/String;I)I")
    public static int method141(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dx.c(Ljava/lang/String;I)V")
    public void method2336(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1980 += class165.method2929(arg0, 0, arg0.length(), this.field1982, this.field1980);
        this.field1982[++this.field1980 - 1] = 0;
    }

    @ObfuscatedName("dx.y(Ljava/lang/String;B)V")
    public void method2337(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1982[++this.field1980 - 1] = 0;
        this.field1980 += class165.method2929(arg0, 0, arg0.length(), this.field1982, this.field1980);
        this.field1982[++this.field1980 - 1] = 0;
    }

    @ObfuscatedName("dx.m(Ljava/lang/CharSequence;B)V")
    public void method2494(CharSequence arg0) {
        int var2 = class209.method2533(arg0);
        this.field1982[++this.field1980 - 1] = 0;
        this.method2358(var2);
        int var3 = this.field1980;
        byte[] var4 = this.field1982;
        int var5 = this.field1980;
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
        this.field1980 = var10 + var3;
    }

    @ObfuscatedName("dx.e([BIIB)V")
    public void method2393(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1982[++this.field1980 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dx.z(II)V")
    public void method2340(int arg0) {
        this.field1982[this.field1980 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1982[this.field1980 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1982[this.field1980 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1982[this.field1980 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.t(II)V")
    public void method2474(int arg0) {
        this.field1982[this.field1980 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1982[this.field1980 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.b(II)V")
    public void method2366(int arg0) {
        this.field1982[this.field1980 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.l(II)V")
    public void method2343(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2436(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2331(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.s(IB)V")
    public void method2358(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2436(arg0 >>> 28 | 0x80);
                    }
                    this.method2436(arg0 >>> 21 | 0x80);
                }
                this.method2436(arg0 >>> 14 | 0x80);
            }
            this.method2436(arg0 >>> 7 | 0x80);
        }
        this.method2436(arg0 & 0x7F);
    }

    @ObfuscatedName("dx.f(B)I")
    public int method2380() {
        return this.field1982[++this.field1980 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.g(I)B")
    public byte method2346() {
        return this.field1982[++this.field1980 - 1];
    }

    @ObfuscatedName("dx.u(I)I")
    public int method2347() {
        this.field1980 += 2;
        return ((this.field1982[this.field1980 - 2] & 0xFF) << 8) + (this.field1982[this.field1980 - 1] & 0xFF);
    }

    @ObfuscatedName("dx.o(B)I")
    public int method2348() {
        this.field1980 += 2;
        int var1 = ((this.field1982[this.field1980 - 2] & 0xFF) << 8) + (this.field1982[this.field1980 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.k(I)I")
    public int method2349() {
        this.field1980 += 3;
        return (this.field1982[this.field1980 - 1] & 0xFF) + ((this.field1982[this.field1980 - 3] & 0xFF) << 16) + ((this.field1982[this.field1980 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dx.a(I)I")
    public int method2350() {
        this.field1980 += 4;
        return (this.field1982[this.field1980 - 1] & 0xFF) + ((this.field1982[this.field1980 - 2] & 0xFF) << 8) + ((this.field1982[this.field1980 - 3] & 0xFF) << 16) + ((this.field1982[this.field1980 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.j(I)J")
    public long method2451() {
        long var1 = (long) this.method2350() & 0xFFFFFFFFL;
        long var3 = (long) this.method2350() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dx.p(I)Ljava/lang/String;")
    public String method2411() {
        if (this.field1982[this.field1980] == 0) {
            this.field1980++;
            return null;
        } else {
            return this.method2356();
        }
    }

    @ObfuscatedName("dx.w(B)Ljava/lang/String;")
    public String method2356() {
        int var1 = this.field1980;
        while (this.field1982[++this.field1980 - 1] != 0) {
        }
        int var2 = this.field1980 - var1 - 1;
        return var2 == 0 ? "" : class165.method2598(this.field1982, var1, var2);
    }

    @ObfuscatedName("dx.au(I)Ljava/lang/String;")
    public String method2354() {
        byte var1 = this.field1982[++this.field1980 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1980;
        while (this.field1982[++this.field1980 - 1] != 0) {
        }
        int var3 = this.field1980 - var2 - 1;
        return var3 == 0 ? "" : class165.method2598(this.field1982, var2, var3);
    }

    @ObfuscatedName("dx.ar(B)Ljava/lang/String;")
    public String method2389() {
        byte var1 = this.field1982[++this.field1980 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2360();
        if (this.field1980 + var2 > this.field1982.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1982;
        int var4 = this.field1980;
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
        this.field1980 += var2;
        return var12;
    }

    @ObfuscatedName("dx.ah([BIII)V")
    public void method2351(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1982[++this.field1980 - 1];
        }
    }

    @ObfuscatedName("dx.af(I)I")
    public int method2357() {
        int var1 = this.field1982[this.field1980] & 0xFF;
        return var1 < 128 ? this.method2380() - 64 : this.method2347() - 49152;
    }

    @ObfuscatedName("dx.az(I)I")
    public int method2446() {
        int var1 = this.field1982[this.field1980] & 0xFF;
        return var1 < 128 ? this.method2380() : this.method2347() - 32768;
    }

    @ObfuscatedName("dx.av(B)I")
    public int method2363() {
        return this.field1982[this.field1980] < 0 ? this.method2350() & Integer.MAX_VALUE : this.method2347();
    }

    @ObfuscatedName("dx.al(B)I")
    public int method2360() {
        byte var1 = this.field1982[++this.field1980 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1982[++this.field1980 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dx.aw([IB)V")
    public void method2361(int[] arg0) {
        int var2 = this.field1980 / 8;
        this.field1980 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2350();
            int var5 = this.method2350();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1980 -= 8;
            this.method2333(var4);
            this.method2333(var5);
        }
    }

    @ObfuscatedName("dx.ac([II)V")
    public void method2362(int[] arg0) {
        int var2 = this.field1980 / 8;
        this.field1980 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2350();
            int var5 = this.method2350();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1980 -= 8;
            this.method2333(var4);
            this.method2333(var5);
        }
    }

    @ObfuscatedName("dx.ai([IIII)V")
    public void method2523(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1980;
        this.field1980 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2350();
            int var8 = this.method2350();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1980 -= 8;
            this.method2333(var7);
            this.method2333(var8);
        }
        this.field1980 = var4;
    }

    @ObfuscatedName("dx.ab([IIII)V")
    public void method2364(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1980;
        this.field1980 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2350();
            int var8 = this.method2350();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1980 -= 8;
            this.method2333(var7);
            this.method2333(var8);
        }
        this.field1980 = var4;
    }

    @ObfuscatedName("dx.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2401(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1980;
        this.field1980 = 0;
        byte[] var4 = new byte[var3];
        this.method2351(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1980 = 0;
        this.method2331(var7.length);
        this.method2393(var7, 0, var7.length);
    }

    @ObfuscatedName("dx.an(II)I")
    public int method2493(int arg0) {
        int var2 = method3142(this.field1982, arg0, this.field1980);
        this.method2333(var2);
        return var2;
    }

    @ObfuscatedName("dx.ay(B)Z")
    public boolean method2367() {
        this.field1980 -= 4;
        int var1 = method3142(this.field1982, 0, this.field1980);
        int var2 = this.method2350();
        return var1 == var2;
    }

    @ObfuscatedName("dx.ap(IB)V")
    public void method2368(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ax(II)V")
    public void method2417(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dx.aa(II)V")
    public void method2370(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dx.ae(I)I")
    public int method2371() {
        return this.field1982[++this.field1980 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dx.ao(B)I")
    public int method2372() {
        return -this.field1982[++this.field1980 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.am(I)I")
    public int method2355() {
        return 128 - this.field1982[++this.field1980 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.aq(I)B")
    public byte method2374() {
        return (byte) (this.field1982[++this.field1980 - 1] - 128);
    }

    @ObfuscatedName("dx.ak(B)B")
    public byte method2456() {
        return (byte) (128 - this.field1982[++this.field1980 - 1]);
    }

    @ObfuscatedName("dx.at(II)V")
    public void method2339(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) arg0;
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.as(II)V")
    public void method2365(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ag(II)V")
    public void method2378(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 + 128);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.ad(B)I")
    public int method2379() {
        this.field1980 += 2;
        return ((this.field1982[this.field1980 - 1] & 0xFF) << 8) + (this.field1982[this.field1980 - 2] & 0xFF);
    }

    @ObfuscatedName("dx.bw(I)I")
    public int method2430() {
        this.field1980 += 2;
        return ((this.field1982[this.field1980 - 2] & 0xFF) << 8) + (this.field1982[this.field1980 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bq(I)I")
    public int method2381() {
        this.field1980 += 2;
        return ((this.field1982[this.field1980 - 1] & 0xFF) << 8) + (this.field1982[this.field1980 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bt(I)I")
    public int method2382() {
        this.field1980 += 2;
        int var1 = ((this.field1982[this.field1980 - 1] & 0xFF) << 8) + (this.field1982[this.field1980 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bl(S)I")
    public int method2383() {
        this.field1980 += 3;
        return (this.field1982[this.field1980 - 1] & 0xFF) + ((this.field1982[this.field1980 - 3] & 0xFF) << 8) + ((this.field1982[this.field1980 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bg(II)V")
    public void method2384(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) arg0;
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dx.bz(II)V")
    public void method2505(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
        this.field1982[++this.field1980 - 1] = (byte) arg0;
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 24);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dx.ba(IB)V")
    public void method2341(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 16);
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 24);
        this.field1982[++this.field1980 - 1] = (byte) arg0;
        this.field1982[++this.field1980 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.by(I)I")
    public int method2387() {
        this.field1980 += 4;
        return (this.field1982[this.field1980 - 4] & 0xFF) + ((this.field1982[this.field1980 - 3] & 0xFF) << 8) + ((this.field1982[this.field1980 - 1] & 0xFF) << 24) + ((this.field1982[this.field1980 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bf(I)I")
    public int method2388() {
        this.field1980 += 4;
        return (this.field1982[this.field1980 - 3] & 0xFF) + ((this.field1982[this.field1980 - 4] & 0xFF) << 8) + ((this.field1982[this.field1980 - 2] & 0xFF) << 24) + ((this.field1982[this.field1980 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bi(I)I")
    public int method2352() {
        this.field1980 += 4;
        return (this.field1982[this.field1980 - 2] & 0xFF) + ((this.field1982[this.field1980 - 1] & 0xFF) << 8) + ((this.field1982[this.field1980 - 3] & 0xFF) << 24) + ((this.field1982[this.field1980 - 4] & 0xFF) << 16);
    }
}
