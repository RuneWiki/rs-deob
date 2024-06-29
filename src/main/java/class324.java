import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class324 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[J")
    public static long[] field4331 = new long[11];

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[[J")
    public static long[][] field4334 = new long[8][256];

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static final void method1888(int arg0) {
        field4332++;
        int var1 = class473.field6626 * 512 + 256;
        int var2 = class451.field6341 * 512 + 256;
        int var3 = class589.method3416(var1, -115, class617.field8853, var2) - class679.field9735;
        if (class452.field6354 < 100) {
            if (var1 > class346.field4550) {
                class346.field4550 += (var1 - class346.field4550) * class452.field6354 / 1000 + class48.field818;
                if (class346.field4550 > var1) {
                    class346.field4550 = var1;
                }
            }
            if (var1 < class346.field4550) {
                class346.field4550 -= (class346.field4550 - var1) * class452.field6354 / 1000 + class48.field818;
                if (var1 > class346.field4550) {
                    class346.field4550 = var1;
                }
            }
            if (class614.field8846 < var3) {
                class614.field8846 += (var3 - class614.field8846) * class452.field6354 / 1000 + class48.field818;
                if (class614.field8846 > var3) {
                    class614.field8846 = var3;
                }
            }
            if (var3 < class614.field8846) {
                class614.field8846 -= (class614.field8846 - var3) * class452.field6354 / 1000 + class48.field818;
                if (class614.field8846 < var3) {
                    class614.field8846 = var3;
                }
            }
            if (class627.field8995 < var2) {
                class627.field8995 += (var2 - class627.field8995) * class452.field6354 / 1000 + class48.field818;
                if (var2 < class627.field8995) {
                    class627.field8995 = var2;
                }
            }
            if (class627.field8995 > var2) {
                class627.field8995 -= (class627.field8995 - var2) * class452.field6354 / 1000 + class48.field818;
                if (class627.field8995 < var2) {
                    class627.field8995 = var2;
                }
            }
        } else {
            class346.field4550 = class473.field6626 * 512 + 256;
            class627.field8995 = class451.field6341 * 512 + 256;
            class614.field8846 = class589.method3416(class346.field4550, -109, class617.field8853, class627.field8995) - class679.field9735;
        }
        int var4 = class175.field2160 * 512 + 256;
        int var5 = class224.field2914 * 512 + 256;
        int var6 = class589.method3416(var4, -10, class617.field8853, var5) - class417.field5911;
        int var7 = var4 - class346.field4550;
        int var8 = var6 - class614.field8846;
        int var9 = var5 - class627.field8995;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (arg0 > -109) {
            method1891(-34, 58);
        }
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class569.field8329) {
            class569.field8329 += (var11 - class569.field8329 >> 3) * class366.field4932 / 1000 + class311.field4115 << 3;
            if (class569.field8329 > var11) {
                class569.field8329 = var11;
            }
        }
        if (class569.field8329 > var11) {
            class569.field8329 -= class311.field4115 + ((class569.field8329 - var11 >> 3) * class366.field4932 / 1000) << 3;
            if (class569.field8329 < var11) {
                class569.field8329 = var11;
            }
        }
        int var13 = var12 - class89.field1250;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class89.field1250 += class366.field4932 * var14 / 1000 + class311.field4115 << 3;
            class89.field1250 &= 0x3FFF;
        }
        if (var14 < 0) {
            class89.field1250 -= class311.field4115 + (-var14 * class366.field4932 / 1000) << 3;
            class89.field1250 &= 0x3FFF;
        }
        int var15 = var12 - class89.field1250;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class89.field1250 = var12;
        }
        class377.field5071 = 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BZIIIII[B)V")
    public static final void method1889(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field4333++;
        int var9 = -(arg6 >> 2);
        if (!arg2) {
            field4334 = null;
        }
        int var10 = -(arg6 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg0++]);
                int var14 = arg4++;
                arg8[var14] = (byte) (arg8[var14] - arg1[arg0++]);
                int var15 = arg4++;
                arg8[var15] = (byte) (arg8[var15] - arg1[arg0++]);
                int var16 = arg4++;
                arg8[var16] = (byte) (arg8[var16] - arg1[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg0++]);
            }
            arg0 += arg7;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method1890(byte arg0) {
        field4334 = null;
        if (arg0 > -87) {
            field4336 = 3;
        }
        field4331 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
    public static final void method1891(int arg0, int arg1) {
        class358.field4772 = arg0;
        field4337++;
        if (arg1 != 16383) {
            field4336 = 50;
        }
        class310.field4100.method2776(false);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)B")
    public static final byte method1892(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            return -26;
        }
        field4335++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field4334[0][var0] = class31.method391(var14, class31.method391(var6 << 8, class31.method391(var10 << 16, class31.method391(class31.method391(var4 << 32, class31.method391(class31.method391(var4 << 48, var4 << 56), var8 << 40)), var12 << 24))));
            for (int var16 = 1; var16 < 8; var16++) {
                field4334[var16][var0] = class31.method391(field4334[var16 - 1][var0] << 56, field4334[var16 - 1][var0] >>> 8);
            }
        }
        field4331[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field4331[var1] = class421.method2547(class567.method3323(255L, field4334[7][var2 + 7]), class421.method2547(class567.method3323(65280L, field4334[6][var2 + 6]), class421.method2547(class567.method3323(field4334[5][var2 + 5], 16711680L), class421.method2547(class567.method3323(field4334[4][var2 + 4], 4278190080L), class421.method2547(class567.method3323(field4334[3][var2 + 3], 1095216660480L), class421.method2547(class421.method2547(class567.method3323(-72057594037927936L, field4334[0][var2]), class567.method3323(field4334[1][var2 + 1], 71776119061217280L)), class567.method3323(field4334[2][var2 + 2], 280375465082880L)))))));
        }
        field4336 = 0;
    }
}
