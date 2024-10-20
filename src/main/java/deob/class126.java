package deob;

import java.math.BigInteger;

@ObfuscatedName("dq")
public class class126 extends class177 {

    @ObfuscatedName("dq.p")
    public byte[] field2007;

    @ObfuscatedName("dq.i")
    public int field2003;

    @ObfuscatedName("dq.v")
    public static int[] field2005 = new int[256];

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
            field2005[var0] = var1;
        }
    }

    @ObfuscatedName("cg.j([BIII)I")
    public static int method2028(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2005[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class126(int arg0) {
        this.field2007 = class113.method2298(arg0);
        this.field2003 = 0;
    }

    public class126(byte[] arg0) {
        this.field2007 = arg0;
        this.field2003 = 0;
    }

    @ObfuscatedName("dq.s(IB)V")
    public void method2462(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.au(II)V")
    public void method2438(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2007[++this.field2003 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ay(II)V")
    public void method2439(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 16);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2007[++this.field2003 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ar(II)V")
    public void method2456(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 24);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 16);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2007[++this.field2003 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.aj(J)V")
    public void method2441(long arg0) {
        this.field2007[++this.field2003 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2007[++this.field2003 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2007[++this.field2003 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2007[++this.field2003 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2007[++this.field2003 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2007[++this.field2003 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2007[++this.field2003 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2007[++this.field2003 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dq.ad(Ljava/lang/String;B)V")
    public void method2442(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        int var3 = this.field2003;
        int var4 = arg0.length();
        byte[] var5 = this.field2007;
        int var6 = this.field2003;
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
        this.field2003 = var7 + var3;
        this.field2007[++this.field2003 - 1] = 0;
    }

    @ObfuscatedName("dq.at(Ljava/lang/CharSequence;B)V")
    public void method2443(CharSequence arg0) {
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
        this.field2007[++this.field2003 - 1] = 0;
        this.method2457(var3);
        this.field2003 += class178.method3205(this.field2007, this.field2003, arg0);
    }

    @ObfuscatedName("dq.as([BIII)V")
    public void method2559(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2007[++this.field2003 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dq.aw(IB)V")
    public void method2445(int arg0) {
        this.field2007[this.field2003 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2007[this.field2003 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2007[this.field2003 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2007[this.field2003 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.ax(II)V")
    public void method2446(int arg0) {
        this.field2007[this.field2003 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2007[this.field2003 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.am(II)V")
    public void method2447(int arg0) {
        this.field2007[this.field2003 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.an(IB)V")
    public void method2448(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2462(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2438(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dq.ap(II)V")
    public void method2457(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2462(arg0 >>> 28 | 0x80);
                    }
                    this.method2462(arg0 >>> 21 | 0x80);
                }
                this.method2462(arg0 >>> 14 | 0x80);
            }
            this.method2462(arg0 >>> 7 | 0x80);
        }
        this.method2462(arg0 & 0x7F);
    }

    @ObfuscatedName("dq.ae(B)I")
    public int method2450() {
        return this.field2007[++this.field2003 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.av(I)B")
    public byte method2451() {
        return this.field2007[++this.field2003 - 1];
    }

    @ObfuscatedName("dq.ac(I)I")
    public int method2627() {
        this.field2003 += 2;
        return ((this.field2007[this.field2003 - 2] & 0xFF) << 8) + (this.field2007[this.field2003 - 1] & 0xFF);
    }

    @ObfuscatedName("dq.ai(B)I")
    public int method2513() {
        this.field2003 += 2;
        int var1 = ((this.field2007[this.field2003 - 2] & 0xFF) << 8) + (this.field2007[this.field2003 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.ak(I)I")
    public int method2454() {
        this.field2003 += 3;
        return (this.field2007[this.field2003 - 1] & 0xFF) + ((this.field2007[this.field2003 - 3] & 0xFF) << 16) + ((this.field2007[this.field2003 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dq.ag(I)I")
    public int method2467() {
        this.field2003 += 4;
        return (this.field2007[this.field2003 - 1] & 0xFF) + ((this.field2007[this.field2003 - 2] & 0xFF) << 8) + ((this.field2007[this.field2003 - 4] & 0xFF) << 24) + ((this.field2007[this.field2003 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.ah(I)J")
    public long method2607() {
        long var1 = (long) this.method2467() & 0xFFFFFFFFL;
        long var3 = (long) this.method2467() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dq.af(I)Ljava/lang/String;")
    public String method2589() {
        if (this.field2007[this.field2003] == 0) {
            this.field2003++;
            return null;
        } else {
            return this.method2603();
        }
    }

    @ObfuscatedName("dq.aa(B)Ljava/lang/String;")
    public String method2603() {
        int var1 = this.field2003;
        while (this.field2007[++this.field2003 - 1] != 0) {
        }
        int var2 = this.field2003 - var1 - 1;
        return var2 == 0 ? "" : class148.method2212(this.field2007, var1, var2);
    }

    @ObfuscatedName("dq.ab(S)Ljava/lang/String;")
    public String method2459() {
        byte var1 = this.field2007[++this.field2003 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2003;
        while (this.field2007[++this.field2003 - 1] != 0) {
        }
        int var3 = this.field2003 - var2 - 1;
        return var3 == 0 ? "" : class148.method2212(this.field2007, var2, var3);
    }

    @ObfuscatedName("dq.ao(I)Ljava/lang/String;")
    public String method2460() {
        byte var1 = this.field2007[++this.field2003 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2469();
        if (this.field2003 + var2 > this.field2007.length) {
            throw new IllegalStateException("");
        }
        String var3 = class178.method1567(this.field2007, this.field2003, var2);
        this.field2003 += var2;
        return var3;
    }

    @ObfuscatedName("dq.al([BIII)V")
    public void method2461(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2007[++this.field2003 - 1];
        }
    }

    @ObfuscatedName("dq.aq(I)I")
    public int method2530() {
        int var1 = this.field2007[this.field2003] & 0xFF;
        return var1 < 128 ? this.method2450() - 64 : this.method2627() - 49152;
    }

    @ObfuscatedName("dq.az(I)I")
    public int method2463() {
        int var1 = this.field2007[this.field2003] & 0xFF;
        return var1 < 128 ? this.method2450() : this.method2627() - 32768;
    }

    @ObfuscatedName("dq.bv(I)I")
    public int method2444() {
        return this.field2007[this.field2003] < 0 ? this.method2467() & Integer.MAX_VALUE : this.method2627();
    }

    @ObfuscatedName("dq.bh(B)I")
    public int method2469() {
        byte var1 = this.field2007[++this.field2003 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2007[++this.field2003 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dq.bp([IIIB)V")
    public void method2585(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2003;
        this.field2003 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2467();
            int var8 = this.method2467();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2003 -= 8;
            this.method2456(var7);
            this.method2456(var8);
        }
        this.field2003 = var4;
    }

    @ObfuscatedName("dq.bt([IIIB)V")
    public void method2527(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2003;
        this.field2003 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2467();
            int var8 = this.method2467();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2003 -= 8;
            this.method2456(var7);
            this.method2456(var8);
        }
        this.field2003 = var4;
    }

    @ObfuscatedName("dq.bu(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2487(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2003;
        this.field2003 = 0;
        byte[] var4 = new byte[var3];
        this.method2461(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2003 = 0;
        this.method2438(var7.length);
        this.method2559(var7, 0, var7.length);
    }

    @ObfuscatedName("dq.bc(II)I")
    public int method2468(int arg0) {
        int var2 = method2028(this.field2007, arg0, this.field2003);
        this.method2456(var2);
        return var2;
    }

    @ObfuscatedName("dq.bw(I)Z")
    public boolean method2470() {
        this.field2003 -= 4;
        int var1 = method2028(this.field2007, 0, this.field2003);
        int var2 = this.method2467();
        return var1 == var2;
    }

    @ObfuscatedName("dq.bj(II)V")
    public void method2471(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.bl(II)V")
    public void method2472(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dq.be(IB)V")
    public void method2473(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dq.bz(I)I")
    public int method2480() {
        return this.field2007[++this.field2003 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dq.bm(I)I")
    public int method2475() {
        return -this.field2007[++this.field2003 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.bs(I)I")
    public int method2624() {
        return 128 - this.field2007[++this.field2003 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.br(I)B")
    public byte method2477() {
        return (byte) (this.field2007[++this.field2003 - 1] - 128);
    }

    @ObfuscatedName("dq.bi(I)B")
    public byte method2478() {
        return (byte) (128 - this.field2007[++this.field2003 - 1]);
    }

    @ObfuscatedName("dq.bd(II)V")
    public void method2479(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) arg0;
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bg(II)V")
    public void method2553(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.ba(II)V")
    public void method2481(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 + 128);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bo(B)I")
    public int method2465() {
        this.field2003 += 2;
        return ((this.field2007[this.field2003 - 1] & 0xFF) << 8) + (this.field2007[this.field2003 - 2] & 0xFF);
    }

    @ObfuscatedName("dq.bn(B)I")
    public int method2483() {
        this.field2003 += 2;
        return ((this.field2007[this.field2003 - 2] & 0xFF) << 8) + (this.field2007[this.field2003 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bb(B)I")
    public int method2484() {
        this.field2003 += 2;
        return ((this.field2007[this.field2003 - 1] & 0xFF) << 8) + (this.field2007[this.field2003 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bx(I)I")
    public int method2485() {
        this.field2003 += 2;
        int var1 = ((this.field2007[this.field2003 - 1] & 0xFF) << 8) + (this.field2007[this.field2003 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.bq(IB)V")
    public void method2486(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) arg0;
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 16);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dq.bf(II)V")
    public void method2455(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2007[++this.field2003 - 1] = (byte) arg0;
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 24);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dq.by(II)V")
    public void method2488(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 16);
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 24);
        this.field2007[++this.field2003 - 1] = (byte) arg0;
        this.field2007[++this.field2003 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bk(I)I")
    public int method2489() {
        this.field2003 += 4;
        return (this.field2007[this.field2003 - 4] & 0xFF) + ((this.field2007[this.field2003 - 3] & 0xFF) << 8) + ((this.field2007[this.field2003 - 2] & 0xFF) << 16) + ((this.field2007[this.field2003 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.ck(I)I")
    public int method2577() {
        this.field2003 += 4;
        return (this.field2007[this.field2003 - 3] & 0xFF) + ((this.field2007[this.field2003 - 4] & 0xFF) << 8) + ((this.field2007[this.field2003 - 1] & 0xFF) << 16) + ((this.field2007[this.field2003 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.cn(I)I")
    public int method2491() {
        this.field2003 += 4;
        return (this.field2007[this.field2003 - 2] & 0xFF) + ((this.field2007[this.field2003 - 1] & 0xFF) << 8) + ((this.field2007[this.field2003 - 4] & 0xFF) << 16) + ((this.field2007[this.field2003 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.cu([BIII)V")
    public void method2605(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2007[++this.field2003 - 1] - 128);
        }
    }

    @ObfuscatedName("dq.cw([BIIS)V")
    public void method2493(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2007[++this.field2003 - 1] - 128);
        }
    }
}
