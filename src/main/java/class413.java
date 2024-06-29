import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class413 extends class134 {

    @OriginalMember(owner = "client!za", name = "j", descriptor = "[[J")
    public static long[][] field5623 = new long[8][256];

    @OriginalMember(owner = "client!za", name = "k", descriptor = "[J")
    public static long[] field5624 = new long[11];

    @OriginalMember(owner = "client!za", name = "n", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "Llga;")
    public static class710 field5628;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "[[[B")
    public static byte[][][] field5626;

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
            field5623[0][var0] = class181.method1122(var14, class181.method1122(class181.method1122(class181.method1122(var12 << 24, class181.method1122(class181.method1122(var8 << 40, class181.method1122(var4 << 56, var4 << 48)), var4 << 32)), var10 << 16), var6 << 8));
            for (int var16 = 1; var16 < 8; var16++) {
                field5623[var16][var0] = class181.method1122(field5623[var16 - 1][var0] << 56, field5623[var16 - 1][var0] >>> 8);
            }
        }
        field5624[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field5624[var1] = class660.method3762(class236.method1395(field5623[7][var2 + 7], 255L), class660.method3762(class660.method3762(class660.method3762(class236.method1395(4278190080L, field5623[4][var2 + 4]), class660.method3762(class236.method1395(1095216660480L, field5623[3][var2 + 3]), class660.method3762(class660.method3762(class236.method1395(71776119061217280L, field5623[1][var2 + 1]), class236.method1395(field5623[0][var2], -72057594037927936L)), class236.method1395(field5623[2][var2 + 2], 280375465082880L)))), class236.method1395(16711680L, field5623[5][var2 + 5])), class236.method1395(65280L, field5623[6][var2 + 6])));
        }
        field5627 = -1;
        field5628 = new class710(true);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2526(int arg0, int arg1) {
        class469.field6702 = -1;
        if (arg1 > -14) {
            field5627 = 27;
        }
        if (arg0 == 37) {
            class656.field9370 = 3.0F;
        } else if (arg0 == 50) {
            class656.field9370 = 4.0F;
        } else if (arg0 == 75) {
            class656.field9370 = 6.0F;
        } else if (arg0 == 100) {
            class656.field9370 = 8.0F;
        } else if (arg0 == 200) {
            class656.field9370 = 16.0F;
        }
        field5629++;
        class469.field6702 = -1;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V", line = 38)
    public static void method2527(byte arg0) {
        field5623 = null;
        field5624 = null;
        if (arg0 < -50) {
            field5626 = null;
            field5628 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 58)
    public static final void method2528(byte arg0, String arg1, boolean arg2) {
        class484.method2926(-1, arg2, -1, true, arg1);
        field5625++;
        if (arg0 <= 75) {
            field5624 = null;
        }
    }
}
