package deob;

import java.math.BigInteger;

@ObfuscatedName("dr")
public class class126 extends class177 {

    @ObfuscatedName("dr.z")
    public byte[] field2025;

    @ObfuscatedName("dr.c")
    public int field2020;

    @ObfuscatedName("dr.e")
    public static int[] field2021 = new int[256];

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
            field2021[var0] = var1;
        }
    }

    public class126(int arg0) {
        this.field2025 = Statics.method2248(arg0);
        this.field2020 = 0;
    }

    public class126(byte[] arg0) {
        this.field2025 = arg0;
        this.field2020 = 0;
    }

    @ObfuscatedName("dr.a(II)V")
    public void method2369(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.f(II)V")
    public void method2505(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2020 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.h(II)V")
    public void method2371(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 16);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2020 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.az(II)V")
    public void method2372(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 24);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 16);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2020 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.ao(J)V")
    public void method2537(long arg0) {
        this.field2025[++this.field2020 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2025[++this.field2020 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2025[++this.field2020 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2025[++this.field2020 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2025[++this.field2020 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2025[++this.field2020 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2025[++this.field2020 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2025[++this.field2020 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ay.au(Ljava/lang/String;S)I")
    public static int method871(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dr.aw(Ljava/lang/String;I)V")
    public void method2374(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        int var3 = this.field2020;
        int var4 = arg0.length();
        byte[] var5 = this.field2025;
        int var6 = this.field2020;
        int var7 = var4;
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 > 0 && var9 < 128 || var9 >= 160 && var9 <= 255) {
                var5[var6 + var8] = (byte) var9;
            } else if (var9 == 8364) {
                var5[var6 + var8] = -128;
            } else if (var9 == 8218) {
                var5[var6 + var8] = -126;
            } else if (var9 == 402) {
                var5[var6 + var8] = -125;
            } else if (var9 == 8222) {
                var5[var6 + var8] = -124;
            } else if (var9 == 8230) {
                var5[var6 + var8] = -123;
            } else if (var9 == 8224) {
                var5[var6 + var8] = -122;
            } else if (var9 == 8225) {
                var5[var6 + var8] = -121;
            } else if (var9 == 710) {
                var5[var6 + var8] = -120;
            } else if (var9 == 8240) {
                var5[var6 + var8] = -119;
            } else if (var9 == 352) {
                var5[var6 + var8] = -118;
            } else if (var9 == 8249) {
                var5[var6 + var8] = -117;
            } else if (var9 == 338) {
                var5[var6 + var8] = -116;
            } else if (var9 == 381) {
                var5[var6 + var8] = -114;
            } else if (var9 == 8216) {
                var5[var6 + var8] = -111;
            } else if (var9 == 8217) {
                var5[var6 + var8] = -110;
            } else if (var9 == 8220) {
                var5[var6 + var8] = -109;
            } else if (var9 == 8221) {
                var5[var6 + var8] = -108;
            } else if (var9 == 8226) {
                var5[var6 + var8] = -107;
            } else if (var9 == 8211) {
                var5[var6 + var8] = -106;
            } else if (var9 == 8212) {
                var5[var6 + var8] = -105;
            } else if (var9 == 732) {
                var5[var6 + var8] = -104;
            } else if (var9 == 8482) {
                var5[var6 + var8] = -103;
            } else if (var9 == 353) {
                var5[var6 + var8] = -102;
            } else if (var9 == 8250) {
                var5[var6 + var8] = -101;
            } else if (var9 == 339) {
                var5[var6 + var8] = -100;
            } else if (var9 == 382) {
                var5[var6 + var8] = -98;
            } else if (var9 == 376) {
                var5[var6 + var8] = -97;
            } else {
                var5[var6 + var8] = 63;
            }
        }
        this.field2020 = var7 + var3;
        this.field2025[++this.field2020 - 1] = 0;
    }

    @ObfuscatedName("dr.ad(Ljava/lang/CharSequence;I)V")
    public void method2567(CharSequence arg0) {
        int var2 = class178.method2129(arg0);
        this.field2025[++this.field2020 - 1] = 0;
        this.method2392(var2);
        int var3 = this.field2020;
        byte[] var4 = this.field2025;
        int var5 = this.field2020;
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
        this.field2020 = var10 + var3;
    }

    @ObfuscatedName("dr.av([BIIB)V")
    public void method2376(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2025[++this.field2020 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dr.am(IB)V")
    public void method2554(int arg0) {
        this.field2025[this.field2020 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2025[this.field2020 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2025[this.field2020 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2025[this.field2020 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.an(II)V")
    public void method2373(int arg0) {
        this.field2025[this.field2020 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2025[this.field2020 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.ac(II)V")
    public void method2379(int arg0) {
        this.field2025[this.field2020 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dr.at(II)V")
    public void method2380(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2369(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2505(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.ax(II)V")
    public void method2392(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2369(arg0 >>> 28 | 0x80);
                    }
                    this.method2369(arg0 >>> 21 | 0x80);
                }
                this.method2369(arg0 >>> 14 | 0x80);
            }
            this.method2369(arg0 >>> 7 | 0x80);
        }
        this.method2369(arg0 & 0x7F);
    }

    @ObfuscatedName("dr.aj(I)I")
    public int method2399() {
        return this.field2025[++this.field2020 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.ai(I)B")
    public byte method2383() {
        return this.field2025[++this.field2020 - 1];
    }

    @ObfuscatedName("dr.ay(I)I")
    public int method2405() {
        this.field2020 += 2;
        return ((this.field2025[this.field2020 - 2] & 0xFF) << 8) + (this.field2025[this.field2020 - 1] & 0xFF);
    }

    @ObfuscatedName("dr.ag(B)I")
    public int method2385() {
        this.field2020 += 2;
        int var1 = ((this.field2025[this.field2020 - 2] & 0xFF) << 8) + (this.field2025[this.field2020 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.ar(I)I")
    public int method2386() {
        this.field2020 += 3;
        return (this.field2025[this.field2020 - 1] & 0xFF) + ((this.field2025[this.field2020 - 3] & 0xFF) << 16) + ((this.field2025[this.field2020 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dr.ae(I)I")
    public int method2387() {
        this.field2020 += 4;
        return (this.field2025[this.field2020 - 1] & 0xFF) + ((this.field2025[this.field2020 - 2] & 0xFF) << 8) + ((this.field2025[this.field2020 - 4] & 0xFF) << 24) + ((this.field2025[this.field2020 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.ah(B)J")
    public long method2388() {
        long var1 = (long) this.method2387() & 0xFFFFFFFFL;
        long var3 = (long) this.method2387() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dr.aa(I)Ljava/lang/String;")
    public String method2389() {
        if (this.field2025[this.field2020] == 0) {
            this.field2020++;
            return null;
        } else {
            return this.method2390();
        }
    }

    @ObfuscatedName("dr.ab(I)Ljava/lang/String;")
    public String method2390() {
        int var1 = this.field2020;
        while (this.field2025[++this.field2020 - 1] != 0) {
        }
        int var2 = this.field2020 - var1 - 1;
        return var2 == 0 ? "" : class148.method1262(this.field2025, var1, var2);
    }

    @ObfuscatedName("dr.ak(B)Ljava/lang/String;")
    public String method2391() {
        byte var1 = this.field2025[++this.field2020 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2020;
        while (this.field2025[++this.field2020 - 1] != 0) {
        }
        int var3 = this.field2020 - var2 - 1;
        return var3 == 0 ? "" : class148.method1262(this.field2025, var2, var3);
    }

    @ObfuscatedName("dr.al(B)Ljava/lang/String;")
    public String method2450() {
        byte var1 = this.field2025[++this.field2020 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2397();
        if (this.field2020 + var2 > this.field2025.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2025;
        int var4 = this.field2020;
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
        this.field2020 += var2;
        return var12;
    }

    @ObfuscatedName("dr.as([BIII)V")
    public void method2393(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2025[++this.field2020 - 1];
        }
    }

    @ObfuscatedName("dr.ap(I)I")
    public int method2394() {
        int var1 = this.field2025[this.field2020] & 0xFF;
        return var1 < 128 ? this.method2399() - 64 : this.method2405() - 49152;
    }

    @ObfuscatedName("dr.aq(I)I")
    public int method2395() {
        int var1 = this.field2025[this.field2020] & 0xFF;
        return var1 < 128 ? this.method2399() : this.method2405() - 32768;
    }

    @ObfuscatedName("dr.af(I)I")
    public int method2534() {
        return this.field2025[this.field2020] < 0 ? this.method2387() & Integer.MAX_VALUE : this.method2405();
    }

    @ObfuscatedName("dr.bv(I)I")
    public int method2397() {
        byte var1 = this.field2025[++this.field2020 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2025[++this.field2020 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dr.bz([IIII)V")
    public void method2398(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2020;
        this.field2020 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2387();
            int var8 = this.method2387();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2020 -= 8;
            this.method2372(var7);
            this.method2372(var8);
        }
        this.field2020 = var4;
    }

    @ObfuscatedName("dr.ba([IIII)V")
    public void method2423(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2020;
        this.field2020 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2387();
            int var8 = this.method2387();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2020 -= 8;
            this.method2372(var7);
            this.method2372(var8);
        }
        this.field2020 = var4;
    }

    @ObfuscatedName("dr.br(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2400(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2020;
        this.field2020 = 0;
        byte[] var4 = new byte[var3];
        this.method2393(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2020 = 0;
        this.method2505(var7.length);
        this.method2376(var7, 0, var7.length);
    }

    @ObfuscatedName("dr.by(II)I")
    public int method2408(int arg0) {
        byte[] var2 = this.field2025;
        int var3 = this.field2020;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2021[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2372(var6);
        return var6;
    }

    @ObfuscatedName("dr.bt(I)Z")
    public boolean method2402() {
        this.field2020 -= 4;
        byte[] var1 = this.field2025;
        int var2 = this.field2020;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2021[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2387();
        return var5 == var8;
    }

    @ObfuscatedName("dr.bs(IB)V")
    public void method2428(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dr.bi(II)V")
    public void method2575(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dr.bg(IB)V")
    public void method2552(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dr.bb(B)I")
    public int method2553() {
        return this.field2025[++this.field2020 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dr.bj(I)I")
    public int method2407() {
        return -this.field2025[++this.field2020 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.bl(I)I")
    public int method2583() {
        return 128 - this.field2025[++this.field2020 - 1] & 0xFF;
    }

    @ObfuscatedName("dr.bm(B)B")
    public byte method2409() {
        return (byte) (-this.field2025[++this.field2020 - 1]);
    }

    @ObfuscatedName("dr.bw(B)B")
    public byte method2411() {
        return (byte) (128 - this.field2025[++this.field2020 - 1]);
    }

    @ObfuscatedName("dr.bh(IB)V")
    public void method2544(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) arg0;
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bp(II)V")
    public void method2412(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dr.bn(IB)V")
    public void method2579(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 + 128);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.bd(I)I")
    public int method2414() {
        this.field2020 += 2;
        return ((this.field2025[this.field2020 - 1] & 0xFF) << 8) + (this.field2025[this.field2020 - 2] & 0xFF);
    }

    @ObfuscatedName("dr.bq(B)I")
    public int method2415() {
        this.field2020 += 2;
        return ((this.field2025[this.field2020 - 2] & 0xFF) << 8) + (this.field2025[this.field2020 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dr.bc(I)I")
    public int method2416() {
        this.field2020 += 2;
        return ((this.field2025[this.field2020 - 1] & 0xFF) << 8) + (this.field2025[this.field2020 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dr.bo(B)I")
    public int method2442() {
        this.field2020 += 2;
        int var1 = ((this.field2025[this.field2020 - 1] & 0xFF) << 8) + (this.field2025[this.field2020 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.bk(I)I")
    public int method2418() {
        this.field2020 += 2;
        int var1 = ((this.field2025[this.field2020 - 1] & 0xFF) << 8) + (this.field2025[this.field2020 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dr.bu(I)I")
    public int method2559() {
        this.field2020 += 3;
        return (this.field2025[this.field2020 - 3] & 0xFF) + ((this.field2025[this.field2020 - 1] & 0xFF) << 16) + ((this.field2025[this.field2020 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dr.be(IS)V")
    public void method2420(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) arg0;
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 16);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dr.bx(II)V")
    public void method2421(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
        this.field2025[++this.field2020 - 1] = (byte) arg0;
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 24);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dr.bf(II)V")
    public void method2550(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 16);
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 24);
        this.field2025[++this.field2020 - 1] = (byte) arg0;
        this.field2025[++this.field2020 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dr.cr(I)I")
    public int method2474() {
        this.field2020 += 4;
        return (this.field2025[this.field2020 - 4] & 0xFF) + ((this.field2025[this.field2020 - 3] & 0xFF) << 8) + ((this.field2025[this.field2020 - 2] & 0xFF) << 16) + ((this.field2025[this.field2020 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dr.cu(B)I")
    public int method2543() {
        this.field2020 += 4;
        return (this.field2025[this.field2020 - 3] & 0xFF) + ((this.field2025[this.field2020 - 4] & 0xFF) << 8) + ((this.field2025[this.field2020 - 2] & 0xFF) << 24) + ((this.field2025[this.field2020 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.cg(S)I")
    public int method2425() {
        this.field2020 += 4;
        return (this.field2025[this.field2020 - 2] & 0xFF) + ((this.field2025[this.field2020 - 1] & 0xFF) << 8) + ((this.field2025[this.field2020 - 3] & 0xFF) << 24) + ((this.field2025[this.field2020 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dr.cv([BIII)V")
    public void method2426(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2025[++this.field2020 - 1];
        }
    }

    @ObfuscatedName("dr.ci([BIII)V")
    public void method2427(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2025[++this.field2020 - 1] - 128);
        }
    }
}
