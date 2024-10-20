package deob;

import java.math.BigInteger;

@ObfuscatedName("dm")
public class class127 extends class180 {

    @ObfuscatedName("dm.w")
    public byte[] field2024;

    @ObfuscatedName("dm.r")
    public int field2022;

    @ObfuscatedName("dm.k")
    public static int[] field2023 = new int[256];

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
            field2023[var0] = var1;
        }
    }

    @ObfuscatedName("y.ar([BIIB)I")
    public static int method147(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2023[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cd.au([BII)I")
    public static int method1591(byte[] arg0, int arg1) {
        return method147(arg0, 0, arg1);
    }

    public class127(int arg0) {
        this.field2024 = class114.method2299(arg0);
        this.field2022 = 0;
    }

    public class127(byte[] arg0) {
        this.field2024 = arg0;
        this.field2022 = 0;
    }

    @ObfuscatedName("dm.an(II)V")
    public void method2493(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.ad(II)V")
    public void method2424(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2024[++this.field2022 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.at(II)V")
    public void method2425(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2024[++this.field2022 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.ay(II)V")
    public void method2540(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 24);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2024[++this.field2022 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.ac(J)V")
    public void method2427(long arg0) {
        this.field2024[++this.field2022 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2024[++this.field2022 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2024[++this.field2022 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2024[++this.field2022 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2024[++this.field2022 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2024[++this.field2022 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2024[++this.field2022 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2024[++this.field2022 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dm.av(Ljava/lang/String;I)V")
    public void method2428(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2022 += class151.method2613(arg0, 0, arg0.length(), this.field2024, this.field2022);
        this.field2024[++this.field2022 - 1] = 0;
    }

    @ObfuscatedName("dm.ae(Ljava/lang/String;I)V")
    public void method2429(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2024[++this.field2022 - 1] = 0;
        this.field2022 += class151.method2613(arg0, 0, arg0.length(), this.field2024, this.field2022);
        this.field2024[++this.field2022 - 1] = 0;
    }

    @ObfuscatedName("dm.ah(Ljava/lang/CharSequence;I)V")
    public void method2430(CharSequence arg0) {
        int var2 = class181.method797(arg0);
        this.field2024[++this.field2022 - 1] = 0;
        this.method2436(var2);
        this.field2022 += class181.method3132(this.field2024, this.field2022, arg0);
    }

    @ObfuscatedName("dm.aq([BIIB)V")
    public void method2576(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2024[++this.field2022 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dm.ax(II)V")
    public void method2432(int arg0) {
        this.field2024[this.field2022 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2024[this.field2022 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2024[this.field2022 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2024[this.field2022 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.am(IB)V")
    public void method2484(int arg0) {
        this.field2024[this.field2022 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2024[this.field2022 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.af(II)V")
    public void method2434(int arg0) {
        this.field2024[this.field2022 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.ao(II)V")
    public void method2567(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2493(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2424(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dm.ab(II)V")
    public void method2436(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2493(arg0 >>> 28 | 0x80);
                    }
                    this.method2493(arg0 >>> 21 | 0x80);
                }
                this.method2493(arg0 >>> 14 | 0x80);
            }
            this.method2493(arg0 >>> 7 | 0x80);
        }
        this.method2493(arg0 & 0x7F);
    }

    @ObfuscatedName("dm.aj(B)I")
    public int method2440() {
        return this.field2024[++this.field2022 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.ag(I)B")
    public byte method2438() {
        return this.field2024[++this.field2022 - 1];
    }

    @ObfuscatedName("dm.aw(I)I")
    public int method2442() {
        this.field2022 += 2;
        return ((this.field2024[this.field2022 - 2] & 0xFF) << 8) + (this.field2024[this.field2022 - 1] & 0xFF);
    }

    @ObfuscatedName("dm.az(I)I")
    public int method2606() {
        this.field2022 += 2;
        int var1 = ((this.field2024[this.field2022 - 2] & 0xFF) << 8) + (this.field2024[this.field2022 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.al(I)I")
    public int method2441() {
        this.field2022 += 3;
        return (this.field2024[this.field2022 - 1] & 0xFF) + ((this.field2024[this.field2022 - 3] & 0xFF) << 16) + ((this.field2024[this.field2022 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dm.as(B)I")
    public int method2586() {
        this.field2022 += 4;
        return (this.field2024[this.field2022 - 1] & 0xFF) + ((this.field2024[this.field2022 - 2] & 0xFF) << 8) + ((this.field2024[this.field2022 - 4] & 0xFF) << 24) + ((this.field2024[this.field2022 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.ap(I)J")
    public long method2443() {
        long var1 = (long) this.method2586() & 0xFFFFFFFFL;
        long var3 = (long) this.method2586() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dm.ai(B)Ljava/lang/String;")
    public String method2571() {
        if (this.field2024[this.field2022] == 0) {
            this.field2022++;
            return null;
        } else {
            return this.method2471();
        }
    }

    @ObfuscatedName("dm.aa(B)Ljava/lang/String;")
    public String method2471() {
        int var1 = this.field2022;
        while (this.field2024[++this.field2022 - 1] != 0) {
        }
        int var2 = this.field2022 - var1 - 1;
        return var2 == 0 ? "" : class151.method250(this.field2024, var1, var2);
    }

    @ObfuscatedName("dm.ak(I)Ljava/lang/String;")
    public String method2634() {
        byte var1 = this.field2024[++this.field2022 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2022;
        while (this.field2024[++this.field2022 - 1] != 0) {
        }
        int var3 = this.field2022 - var2 - 1;
        return var3 == 0 ? "" : class151.method250(this.field2024, var2, var3);
    }

    @ObfuscatedName("dm.bi(I)Ljava/lang/String;")
    public String method2461() {
        byte var1 = this.field2024[++this.field2022 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2575();
        if (this.field2022 + var2 > this.field2024.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2024;
        int var4 = this.field2022;
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
        this.field2022 += var2;
        return var12;
    }

    @ObfuscatedName("dm.bd([BIII)V")
    public void method2615(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2024[++this.field2022 - 1];
        }
    }

    @ObfuscatedName("dm.bb(I)I")
    public int method2449() {
        int var1 = this.field2024[this.field2022] & 0xFF;
        return var1 < 128 ? this.method2440() - 64 : this.method2442() - 49152;
    }

    @ObfuscatedName("dm.bn(S)I")
    public int method2450() {
        int var1 = this.field2024[this.field2022] & 0xFF;
        return var1 < 128 ? this.method2440() : this.method2442() - 32768;
    }

    @ObfuscatedName("dm.bp(B)I")
    public int method2525() {
        return this.field2024[this.field2022] < 0 ? this.method2586() & Integer.MAX_VALUE : this.method2442();
    }

    @ObfuscatedName("dm.bm(I)I")
    public int method2575() {
        byte var1 = this.field2024[++this.field2022 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2024[++this.field2022 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dm.bt([IIII)V")
    public void method2453(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2022;
        this.field2022 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2586();
            int var8 = this.method2586();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2022 -= 8;
            this.method2540(var7);
            this.method2540(var8);
        }
        this.field2022 = var4;
    }

    @ObfuscatedName("dm.bh([IIIB)V")
    public void method2554(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2022;
        this.field2022 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2586();
            int var8 = this.method2586();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2022 -= 8;
            this.method2540(var7);
            this.method2540(var8);
        }
        this.field2022 = var4;
    }

    @ObfuscatedName("dm.bj(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2455(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2022;
        this.field2022 = 0;
        byte[] var4 = new byte[var3];
        this.method2615(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2022 = 0;
        this.method2424(var7.length);
        this.method2576(var7, 0, var7.length);
    }

    @ObfuscatedName("dm.be(II)I")
    public int method2456(int arg0) {
        int var2 = method147(this.field2024, arg0, this.field2022);
        this.method2540(var2);
        return var2;
    }

    @ObfuscatedName("dm.bl(B)Z")
    public boolean method2457() {
        this.field2022 -= 4;
        int var1 = method147(this.field2024, 0, this.field2022);
        int var2 = this.method2586();
        return var1 == var2;
    }

    @ObfuscatedName("dm.bv(II)V")
    public void method2458(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.bc(II)V")
    public void method2459(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dm.br(IB)V")
    public void method2460(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dm.bx(I)I")
    public int method2515() {
        return this.field2024[++this.field2022 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dm.bu(I)I")
    public int method2462() {
        return -this.field2024[++this.field2022 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.bo(S)I")
    public int method2587() {
        return 128 - this.field2024[++this.field2022 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.by(B)B")
    public byte method2464() {
        return (byte) (this.field2024[++this.field2022 - 1] - 128);
    }

    @ObfuscatedName("dm.bg(I)B")
    public byte method2465() {
        return (byte) (-this.field2024[++this.field2022 - 1]);
    }

    @ObfuscatedName("dm.ba(I)B")
    public byte method2466() {
        return (byte) (128 - this.field2024[++this.field2022 - 1]);
    }

    @ObfuscatedName("dm.bf(IB)V")
    public void method2467(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) arg0;
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bk(II)V")
    public void method2444(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.bz(II)V")
    public void method2496(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 + 128);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bq(B)I")
    public int method2470() {
        this.field2022 += 2;
        return ((this.field2024[this.field2022 - 1] & 0xFF) << 8) + (this.field2024[this.field2022 - 2] & 0xFF);
    }

    @ObfuscatedName("dm.bw(I)I")
    public int method2469() {
        this.field2022 += 2;
        return ((this.field2024[this.field2022 - 2] & 0xFF) << 8) + (this.field2024[this.field2022 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.bs(B)I")
    public int method2629() {
        this.field2022 += 2;
        return ((this.field2024[this.field2022 - 1] & 0xFF) << 8) + (this.field2024[this.field2022 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.cl(I)I")
    public int method2473() {
        this.field2022 += 2;
        int var1 = ((this.field2024[this.field2022 - 1] & 0xFF) << 8) + (this.field2024[this.field2022 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.cd(I)I")
    public int method2474() {
        this.field2022 += 2;
        int var1 = ((this.field2024[this.field2022 - 2] & 0xFF) << 8) + (this.field2024[this.field2022 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.ck(I)I")
    public int method2475() {
        this.field2022 += 2;
        int var1 = ((this.field2024[this.field2022 - 1] & 0xFF) << 8) + (this.field2024[this.field2022 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.cn(II)V")
    public void method2476(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2024[++this.field2022 - 1] = (byte) arg0;
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.cj(B)I")
    public int method2477() {
        this.field2022 += 3;
        return (this.field2024[this.field2022 - 3] & 0xFF) + ((this.field2024[this.field2022 - 1] & 0xFF) << 16) + ((this.field2024[this.field2022 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dm.cb(IS)V")
    public void method2528(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) arg0;
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dm.cx(II)V")
    public void method2479(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
        this.field2024[++this.field2022 - 1] = (byte) arg0;
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 24);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.ch(II)V")
    public void method2574(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 16);
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 24);
        this.field2024[++this.field2022 - 1] = (byte) arg0;
        this.field2024[++this.field2022 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.cv(B)I")
    public int method2481() {
        this.field2022 += 4;
        return (this.field2024[this.field2022 - 4] & 0xFF) + ((this.field2024[this.field2022 - 3] & 0xFF) << 8) + ((this.field2024[this.field2022 - 2] & 0xFF) << 16) + ((this.field2024[this.field2022 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.cs(I)I")
    public int method2635() {
        this.field2022 += 4;
        return (this.field2024[this.field2022 - 3] & 0xFF) + ((this.field2024[this.field2022 - 4] & 0xFF) << 8) + ((this.field2024[this.field2022 - 1] & 0xFF) << 16) + ((this.field2024[this.field2022 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.cf(I)I")
    public int method2483() {
        this.field2022 += 4;
        return (this.field2024[this.field2022 - 2] & 0xFF) + ((this.field2024[this.field2022 - 1] & 0xFF) << 8) + ((this.field2024[this.field2022 - 4] & 0xFF) << 16) + ((this.field2024[this.field2022 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.co([BIII)V")
    public void method2513(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2024[++this.field2022 - 1] - 128);
        }
    }
}
