import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class176 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[J")
    public static long[] field2269 = new long[11];

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[[J")
    public static long[][] field2270 = new long[8][256];

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lim;")
    public static class353 field2271;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public static void method1087(boolean arg0) {
        field2269 = null;
        if (!arg0) {
            field2273 = -72;
        }
        field2270 = null;
        field2271 = null;
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
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field2270[0][var0] = class164.method891(class164.method891(var6 << 8, class164.method891(var10 << 16, class164.method891(var12 << 24, class164.method891(class164.method891(class164.method891(var4 << 56, var4 << 48), var8 << 40), var4 << 32)))), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field2270[var16][var0] = class164.method891(field2270[var16 - 1][var0] >>> 8, field2270[var16 - 1][var0] << 56);
            }
        }
        field2269[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field2269[var1] = class93.method509(class93.method509(class93.method509(class93.method509(class491.method2760(4278190080L, field2270[4][var2 + 4]), class93.method509(class93.method509(class491.method2760(field2270[2][var2 + 2], 280375465082880L), class93.method509(class491.method2760(71776119061217280L, field2270[1][var2 + 1]), class491.method2760(-72057594037927936L, field2270[0][var2]))), class491.method2760(field2270[3][var2 + 3], 1095216660480L))), class491.method2760(field2270[5][var2 + 5], 16711680L)), class491.method2760(65280L, field2270[6][var2 + 6])), class491.method2760(255L, field2270[7][var2 + 7]));
        }
        field2271 = new class353(16, -2);
        field2272 = 2;
        field2273 = 0;
    }
}
