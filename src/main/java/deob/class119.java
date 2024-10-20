package deob;

import java.math.BigInteger;

@ObfuscatedName("dq")
public class class119 extends class208 {

    @ObfuscatedName("dq.n")
    public byte[] field1981;

    @ObfuscatedName("dq.d")
    public int field1977;

    @ObfuscatedName("dq.s")
    public static int[] field1976 = new int[256];

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
            field1976[var0] = var1;
        }
    }

    @ObfuscatedName("ar.n([BIII)I")
    public static int method693(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1976[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1981 = class121.method2571(arg0);
        this.field1977 = 0;
    }

    public class119(byte[] arg0) {
        this.field1981 = arg0;
        this.field1977 = 0;
    }

    @ObfuscatedName("dq.d(II)V")
    public void method2323(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.s(II)V")
    public void method2324(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.q(II)V")
    public void method2409(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.j(IB)V")
    public void method2326(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.k(J)V")
    public void method2327(long arg0) {
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1981[++this.field1977 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dq.i(J)V")
    public void method2350(long arg0) {
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1981[++this.field1977 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1981[++this.field1977 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("do.m(Ljava/lang/String;I)I")
    public static int method2648(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dq.p(Ljava/lang/String;I)V")
    public void method2329(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1977 += class165.method1552(arg0, 0, arg0.length(), this.field1981, this.field1977);
        this.field1981[++this.field1977 - 1] = 0;
    }

    @ObfuscatedName("dq.h(Ljava/lang/String;I)V")
    public void method2491(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1981[++this.field1977 - 1] = 0;
        this.field1977 += class165.method1552(arg0, 0, arg0.length(), this.field1981, this.field1977);
        this.field1981[++this.field1977 - 1] = 0;
    }

    @ObfuscatedName("dq.e(Ljava/lang/CharSequence;I)V")
    public void method2340(CharSequence arg0) {
        int var2 = class209.method2950(arg0);
        this.field1981[++this.field1977 - 1] = 0;
        this.method2337(var2);
        int var3 = this.field1977;
        byte[] var4 = this.field1981;
        int var5 = this.field1977;
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
        this.field1977 = var10 + var3;
    }

    @ObfuscatedName("dq.g([BIII)V")
    public void method2425(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1981[++this.field1977 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dq.b(IS)V")
    public void method2333(int arg0) {
        this.field1981[this.field1977 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1981[this.field1977 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1981[this.field1977 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1981[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.f(II)V")
    public void method2454(int arg0) {
        this.field1981[this.field1977 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1981[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.y(II)V")
    public void method2506(int arg0) {
        this.field1981[this.field1977 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.z(II)V")
    public void method2336(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2323(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2324(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dq.t(II)V")
    public void method2337(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2323(arg0 >>> 28 | 0x80);
                    }
                    this.method2323(arg0 >>> 21 | 0x80);
                }
                this.method2323(arg0 >>> 14 | 0x80);
            }
            this.method2323(arg0 >>> 7 | 0x80);
        }
        this.method2323(arg0 & 0x7F);
    }

    @ObfuscatedName("dq.o(I)I")
    public int method2338() {
        return this.field1981[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.r(S)B")
    public byte method2330() {
        return this.field1981[++this.field1977 - 1];
    }

    @ObfuscatedName("dq.u(I)I")
    public int method2377() {
        this.field1977 += 2;
        return ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + (this.field1981[this.field1977 - 1] & 0xFF);
    }

    @ObfuscatedName("dq.v(I)I")
    public int method2341() {
        this.field1977 += 2;
        int var1 = ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + (this.field1981[this.field1977 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.a(B)I")
    public int method2342() {
        this.field1977 += 3;
        return (this.field1981[this.field1977 - 1] & 0xFF) + ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + ((this.field1981[this.field1977 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.c(I)I")
    public int method2343() {
        this.field1977 += 4;
        return (this.field1981[this.field1977 - 1] & 0xFF) + ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + ((this.field1981[this.field1977 - 3] & 0xFF) << 16) + ((this.field1981[this.field1977 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.l(I)J")
    public long method2344() {
        long var1 = (long) this.method2343() & 0xFFFFFFFFL;
        long var3 = (long) this.method2343() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dq.x(I)Ljava/lang/String;")
    public String method2345() {
        if (this.field1981[this.field1977] == 0) {
            this.field1977++;
            return null;
        } else {
            return this.method2492();
        }
    }

    @ObfuscatedName("dq.w(S)Ljava/lang/String;")
    public String method2492() {
        int var1 = this.field1977;
        while (this.field1981[++this.field1977 - 1] != 0) {
        }
        int var2 = this.field1977 - var1 - 1;
        return var2 == 0 ? "" : class165.method581(this.field1981, var1, var2);
    }

    @ObfuscatedName("dq.aq(B)Ljava/lang/String;")
    public String method2335() {
        byte var1 = this.field1981[++this.field1977 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1977;
        while (this.field1981[++this.field1977 - 1] != 0) {
        }
        int var3 = this.field1977 - var2 - 1;
        return var3 == 0 ? "" : class165.method581(this.field1981, var2, var3);
    }

    @ObfuscatedName("dq.az(I)Ljava/lang/String;")
    public String method2434() {
        byte var1 = this.field1981[++this.field1977 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2353();
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

    @ObfuscatedName("dq.ab([BIIB)V")
    public void method2358(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1981[++this.field1977 - 1];
        }
    }

    @ObfuscatedName("dq.ac(I)I")
    public int method2536() {
        int var1 = this.field1981[this.field1977] & 0xFF;
        return var1 < 128 ? this.method2338() - 64 : this.method2377() - 49152;
    }

    @ObfuscatedName("dq.ad(I)I")
    public int method2351() {
        int var1 = this.field1981[this.field1977] & 0xFF;
        return var1 < 128 ? this.method2338() : this.method2377() - 32768;
    }

    @ObfuscatedName("dq.av(I)I")
    public int method2352() {
        return this.field1981[this.field1977] < 0 ? this.method2343() & Integer.MAX_VALUE : this.method2377();
    }

    @ObfuscatedName("dq.ar(B)I")
    public int method2353() {
        byte var1 = this.field1981[++this.field1977 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1981[++this.field1977 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dq.al([IB)V")
    public void method2354(int[] arg0) {
        int var2 = this.field1977 / 8;
        this.field1977 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2343();
            int var5 = this.method2343();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1977 -= 8;
            this.method2326(var4);
            this.method2326(var5);
        }
    }

    @ObfuscatedName("dq.aj([IB)V")
    public void method2390(int[] arg0) {
        int var2 = this.field1977 / 8;
        this.field1977 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2343();
            int var5 = this.method2343();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1977 -= 8;
            this.method2326(var4);
            this.method2326(var5);
        }
    }

    @ObfuscatedName("dq.au([IIII)V")
    public void method2356(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        this.field1977 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2343();
            int var8 = this.method2343();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1977 -= 8;
            this.method2326(var7);
            this.method2326(var8);
        }
        this.field1977 = var4;
    }

    @ObfuscatedName("dq.aw([IIII)V")
    public void method2357(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        this.field1977 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2343();
            int var8 = this.method2343();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1977 -= 8;
            this.method2326(var7);
            this.method2326(var8);
        }
        this.field1977 = var4;
    }

    @ObfuscatedName("dq.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2355(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1977;
        this.field1977 = 0;
        byte[] var4 = new byte[var3];
        this.method2358(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1977 = 0;
        this.method2324(var7.length);
        this.method2425(var7, 0, var7.length);
    }

    @ObfuscatedName("dq.ap(II)I")
    public int method2445(int arg0) {
        int var2 = method693(this.field1981, arg0, this.field1977);
        this.method2326(var2);
        return var2;
    }

    @ObfuscatedName("dq.af(I)Z")
    public boolean method2360() {
        this.field1977 -= 4;
        int var1 = method693(this.field1981, 0, this.field1977);
        int var2 = this.method2343();
        return var1 == var2;
    }

    @ObfuscatedName("dq.ag(II)V")
    public void method2361(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.ah(II)V")
    public void method2397(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dq.at(IB)V")
    public void method2325(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dq.ak(I)I")
    public int method2347() {
        return this.field1981[++this.field1977 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dq.ay(B)I")
    public int method2365() {
        return -this.field1981[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.ai(I)I")
    public int method2366() {
        return 128 - this.field1981[++this.field1977 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.am(I)B")
    public byte method2367() {
        return (byte) (this.field1981[++this.field1977 - 1] - 128);
    }

    @ObfuscatedName("dq.ao(I)B")
    public byte method2503() {
        return (byte) (-this.field1981[++this.field1977 - 1]);
    }

    @ObfuscatedName("dq.as(I)B")
    public byte method2537() {
        return (byte) (128 - this.field1981[++this.field1977 - 1]);
    }

    @ObfuscatedName("dq.aa(II)V")
    public void method2370(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.ae(II)V")
    public void method2371(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.an(II)V")
    public void method2372(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 + 128);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bd(I)I")
    public int method2373() {
        this.field1977 += 2;
        return ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + (this.field1981[this.field1977 - 2] & 0xFF);
    }

    @ObfuscatedName("dq.by(B)I")
    public int method2331() {
        this.field1977 += 2;
        return ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + (this.field1981[this.field1977 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bm(I)I")
    public int method2375() {
        this.field1977 += 2;
        return ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + (this.field1981[this.field1977 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bq(B)I")
    public int method2376() {
        this.field1977 += 2;
        int var1 = ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + (this.field1981[this.field1977 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.bn(I)I")
    public int method2484() {
        this.field1977 += 2;
        int var1 = ((this.field1981[this.field1977 - 2] & 0xFF) << 8) + (this.field1981[this.field1977 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.bp(B)I")
    public int method2378() {
        this.field1977 += 2;
        int var1 = ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + (this.field1981[this.field1977 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.bs(I)I")
    public int method2379() {
        this.field1977 += 3;
        return (this.field1981[this.field1977 - 2] & 0xFF) + ((this.field1981[this.field1977 - 3] & 0xFF) << 16) + ((this.field1981[this.field1977 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dq.bf(II)V")
    public void method2471(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dq.ba(IB)V")
    public void method2381(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dq.bo(II)V")
    public void method2382(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1977 - 1] = (byte) arg0;
        this.field1981[++this.field1977 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.be(I)I")
    public int method2383() {
        this.field1977 += 4;
        return (this.field1981[this.field1977 - 4] & 0xFF) + ((this.field1981[this.field1977 - 3] & 0xFF) << 8) + ((this.field1981[this.field1977 - 1] & 0xFF) << 24) + ((this.field1981[this.field1977 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.bu(I)I")
    public int method2384() {
        this.field1977 += 4;
        return (this.field1981[this.field1977 - 3] & 0xFF) + ((this.field1981[this.field1977 - 4] & 0xFF) << 8) + ((this.field1981[this.field1977 - 1] & 0xFF) << 16) + ((this.field1981[this.field1977 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.bg(B)I")
    public int method2508() {
        this.field1977 += 4;
        return (this.field1981[this.field1977 - 2] & 0xFF) + ((this.field1981[this.field1977 - 1] & 0xFF) << 8) + ((this.field1981[this.field1977 - 3] & 0xFF) << 24) + ((this.field1981[this.field1977 - 4] & 0xFF) << 16);
    }
}
