package deob;

import java.math.BigInteger;

@ObfuscatedName("dl")
public class class125 extends class177 {

    @ObfuscatedName("dl.y")
    public byte[] field2002;

    @ObfuscatedName("dl.x")
    public int field2003;

    @ObfuscatedName("dl.e")
    public static int[] field2004 = new int[256];

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
            field2004[var0] = var1;
        }
    }

    @ObfuscatedName("aw.i([BIII)I")
    public static int method719(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2004[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class125(int arg0) {
        this.field2002 = class113.method2190(arg0);
        this.field2003 = 0;
    }

    public class125(byte[] arg0) {
        this.field2002 = arg0;
        this.field2003 = 0;
    }

    @ObfuscatedName("dl.k(IB)V")
    public void method2339(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.o(II)V")
    public void method2314(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2003 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.d(IB)V")
    public void method2332(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2003 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.u(II)V")
    public void method2316(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 24);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2003 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.ap(J)V")
    public void method2317(long arg0) {
        this.field2002[++this.field2003 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2002[++this.field2003 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2002[++this.field2003 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2002[++this.field2003 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2002[++this.field2003 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2002[++this.field2003 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2002[++this.field2003 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2002[++this.field2003 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dl.ad(Ljava/lang/String;I)V")
    public void method2318(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        int var3 = this.field2003;
        int var4 = arg0.length();
        byte[] var5 = this.field2002;
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
        this.field2002[++this.field2003 - 1] = 0;
    }

    @ObfuscatedName("dl.ao(Ljava/lang/CharSequence;B)V")
    public void method2319(CharSequence arg0) {
        int var2 = class178.method120(arg0);
        this.field2002[++this.field2003 - 1] = 0;
        this.method2325(var2);
        this.field2003 += class178.method839(this.field2002, this.field2003, arg0);
    }

    @ObfuscatedName("dl.av([BIII)V")
    public void method2374(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2002[++this.field2003 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dl.af(II)V")
    public void method2321(int arg0) {
        this.field2002[this.field2003 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2002[this.field2003 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2002[this.field2003 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2002[this.field2003 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.ae(IB)V")
    public void method2322(int arg0) {
        this.field2002[this.field2003 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2002[this.field2003 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.ax(II)V")
    public void method2323(int arg0) {
        this.field2002[this.field2003 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.aw(II)V")
    public void method2324(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2339(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2314(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.an(II)V")
    public void method2325(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2339(arg0 >>> 28 | 0x80);
                    }
                    this.method2339(arg0 >>> 21 | 0x80);
                }
                this.method2339(arg0 >>> 14 | 0x80);
            }
            this.method2339(arg0 >>> 7 | 0x80);
        }
        this.method2339(arg0 & 0x7F);
    }

    @ObfuscatedName("dl.az(I)I")
    public int method2326() {
        return this.field2002[++this.field2003 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.as(I)B")
    public byte method2347() {
        return this.field2002[++this.field2003 - 1];
    }

    @ObfuscatedName("dl.ag(I)I")
    public int method2328() {
        this.field2003 += 2;
        return ((this.field2002[this.field2003 - 2] & 0xFF) << 8) + (this.field2002[this.field2003 - 1] & 0xFF);
    }

    @ObfuscatedName("dl.am(B)I")
    public int method2329() {
        this.field2003 += 2;
        int var1 = ((this.field2002[this.field2003 - 2] & 0xFF) << 8) + (this.field2002[this.field2003 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.ah(I)I")
    public int method2330() {
        this.field2003 += 3;
        return (this.field2002[this.field2003 - 1] & 0xFF) + ((this.field2002[this.field2003 - 3] & 0xFF) << 16) + ((this.field2002[this.field2003 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dl.aj(B)I")
    public int method2489() {
        this.field2003 += 4;
        return (this.field2002[this.field2003 - 1] & 0xFF) + ((this.field2002[this.field2003 - 2] & 0xFF) << 8) + ((this.field2002[this.field2003 - 4] & 0xFF) << 24) + ((this.field2002[this.field2003 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.ab(S)J")
    public long method2402() {
        long var1 = (long) this.method2489() & 0xFFFFFFFFL;
        long var3 = (long) this.method2489() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dl.at(B)Ljava/lang/String;")
    public String method2333() {
        if (this.field2002[this.field2003] == 0) {
            this.field2003++;
            return null;
        } else {
            return this.method2515();
        }
    }

    @ObfuscatedName("dl.ai(I)Ljava/lang/String;")
    public String method2515() {
        int var1 = this.field2003;
        while (this.field2002[++this.field2003 - 1] != 0) {
        }
        int var2 = this.field2003 - var1 - 1;
        return var2 == 0 ? "" : class148.method167(this.field2002, var1, var2);
    }

    @ObfuscatedName("dl.aa(I)Ljava/lang/String;")
    public String method2405() {
        byte var1 = this.field2002[++this.field2003 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2003;
        while (this.field2002[++this.field2003 - 1] != 0) {
        }
        int var3 = this.field2003 - var2 - 1;
        return var3 == 0 ? "" : class148.method167(this.field2002, var2, var3);
    }

    @ObfuscatedName("dl.ar(S)Ljava/lang/String;")
    public String method2388() {
        byte var1 = this.field2002[++this.field2003 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2421();
        if (this.field2003 + var2 > this.field2002.length) {
            throw new IllegalStateException("");
        }
        String var3 = class178.method1386(this.field2002, this.field2003, var2);
        this.field2003 += var2;
        return var3;
    }

    @ObfuscatedName("dl.au([BIII)V")
    public void method2337(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2002[++this.field2003 - 1];
        }
    }

    @ObfuscatedName("dl.aq(B)I")
    public int method2338() {
        int var1 = this.field2002[this.field2003] & 0xFF;
        return var1 < 128 ? this.method2326() - 64 : this.method2328() - 49152;
    }

    @ObfuscatedName("dl.ay(S)I")
    public int method2377() {
        int var1 = this.field2002[this.field2003] & 0xFF;
        return var1 < 128 ? this.method2326() : this.method2328() - 32768;
    }

    @ObfuscatedName("dl.ak(I)I")
    public int method2340() {
        return this.field2002[this.field2003] < 0 ? this.method2489() & Integer.MAX_VALUE : this.method2328();
    }

    @ObfuscatedName("dl.ac(I)I")
    public int method2421() {
        byte var1 = this.field2002[++this.field2003 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2002[++this.field2003 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dl.al([IIII)V")
    public void method2442(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2003;
        this.field2003 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2489();
            int var8 = this.method2489();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2003 -= 8;
            this.method2316(var7);
            this.method2316(var8);
        }
        this.field2003 = var4;
    }

    @ObfuscatedName("dl.bd([IIII)V")
    public void method2431(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2003;
        this.field2003 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2489();
            int var8 = this.method2489();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2003 -= 8;
            this.method2316(var7);
            this.method2316(var8);
        }
        this.field2003 = var4;
    }

    @ObfuscatedName("dl.bt(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2344(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2003;
        this.field2003 = 0;
        byte[] var4 = new byte[var3];
        this.method2337(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2003 = 0;
        this.method2314(var7.length);
        this.method2374(var7, 0, var7.length);
    }

    @ObfuscatedName("dl.bh(II)I")
    public int method2320(int arg0) {
        int var2 = method719(this.field2002, arg0, this.field2003);
        this.method2316(var2);
        return var2;
    }

    @ObfuscatedName("dl.bl(I)Z")
    public boolean method2346() {
        this.field2003 -= 4;
        int var1 = method719(this.field2002, 0, this.field2003);
        int var2 = this.method2489();
        return var1 == var2;
    }

    @ObfuscatedName("dl.bx(IB)V")
    public void method2370(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.bk(II)V")
    public void method2355(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dl.bu(II)V")
    public void method2494(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dl.bo(I)I")
    public int method2313() {
        return this.field2002[++this.field2003 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dl.br(I)I")
    public int method2351() {
        return -this.field2002[++this.field2003 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.bm(B)I")
    public int method2352() {
        return 128 - this.field2002[++this.field2003 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.bg(I)B")
    public byte method2353() {
        return (byte) (this.field2002[++this.field2003 - 1] - 128);
    }

    @ObfuscatedName("dl.bb(I)B")
    public byte method2467() {
        return (byte) (-this.field2002[++this.field2003 - 1]);
    }

    @ObfuscatedName("dl.bp(II)V")
    public void method2492(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) arg0;
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bw(II)V")
    public void method2381(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.bi(II)V")
    public void method2357(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 + 128);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bs(S)I")
    public int method2358() {
        this.field2003 += 2;
        return ((this.field2002[this.field2003 - 1] & 0xFF) << 8) + (this.field2002[this.field2003 - 2] & 0xFF);
    }

    @ObfuscatedName("dl.bq(B)I")
    public int method2359() {
        this.field2003 += 2;
        return ((this.field2002[this.field2003 - 2] & 0xFF) << 8) + (this.field2002[this.field2003 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bc(I)I")
    public int method2360() {
        this.field2003 += 2;
        return ((this.field2002[this.field2003 - 1] & 0xFF) << 8) + (this.field2002[this.field2003 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bz(B)I")
    public int method2362() {
        this.field2003 += 2;
        int var1 = ((this.field2002[this.field2003 - 2] & 0xFF) << 8) + (this.field2002[this.field2003 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.be(B)I")
    public int method2408() {
        this.field2003 += 3;
        return (this.field2002[this.field2003 - 2] & 0xFF) + ((this.field2002[this.field2003 - 1] & 0xFF) << 8) + ((this.field2002[this.field2003 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.by(II)V")
    public void method2363(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) arg0;
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dl.bn(IB)V")
    public void method2364(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
        this.field2002[++this.field2003 - 1] = (byte) arg0;
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 24);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dl.bv(IB)V")
    public void method2365(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 16);
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 24);
        this.field2002[++this.field2003 - 1] = (byte) arg0;
        this.field2002[++this.field2003 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.ba(I)I")
    public int method2366() {
        this.field2003 += 4;
        return (this.field2002[this.field2003 - 4] & 0xFF) + ((this.field2002[this.field2003 - 3] & 0xFF) << 8) + ((this.field2002[this.field2003 - 2] & 0xFF) << 16) + ((this.field2002[this.field2003 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.bj(B)I")
    public int method2367() {
        this.field2003 += 4;
        return (this.field2002[this.field2003 - 3] & 0xFF) + ((this.field2002[this.field2003 - 4] & 0xFF) << 8) + ((this.field2002[this.field2003 - 2] & 0xFF) << 24) + ((this.field2002[this.field2003 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.bf(B)I")
    public int method2378() {
        this.field2003 += 4;
        return (this.field2002[this.field2003 - 2] & 0xFF) + ((this.field2002[this.field2003 - 1] & 0xFF) << 8) + ((this.field2002[this.field2003 - 3] & 0xFF) << 24) + ((this.field2002[this.field2003 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.cd([BIII)V")
    public void method2369(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2002[++this.field2003 - 1] - 128);
        }
    }

    @ObfuscatedName("dl.ci([BIIB)V")
    public void method2311(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2002[++this.field2003 - 1] - 128);
        }
    }
}
