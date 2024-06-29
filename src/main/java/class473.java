import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class473 {

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "[J")
    public static long[] field6795 = new long[11];

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "[[J")
    public static long[][] field6793 = new long[8][256];

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
    public static boolean field6798;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Lvg;")
    public static class622 field6797;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Lvg;")
    public static class622 field6799;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Lfo;")
    public static class606 field6800;

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
            field6793[0][var0] = class98.method693(class98.method693(class98.method693(var10 << 16, class98.method693(var12 << 24, class98.method693(class98.method693(var8 << 40, class98.method693(var4 << 48, var4 << 56)), var4 << 32))), var6 << 8), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field6793[var16][var0] = class98.method693(field6793[var16 - 1][var0] << 56, field6793[var16 - 1][var0] >>> 8);
            }
        }
        field6795[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field6795[var1] = class393.method2444(class95.method596(255L, field6793[7][var2 + 7]), class393.method2444(class95.method596(field6793[6][var2 + 6], 65280L), class393.method2444(class95.method596(16711680L, field6793[5][var2 + 5]), class393.method2444(class393.method2444(class95.method596(1095216660480L, field6793[3][var2 + 3]), class393.method2444(class95.method596(280375465082880L, field6793[2][var2 + 2]), class393.method2444(class95.method596(field6793[0][var2], -72057594037927936L), class95.method596(field6793[1][var2 + 1], 71776119061217280L)))), class95.method596(4278190080L, field6793[4][var2 + 4])))));
        }
        field6798 = false;
        field6797 = new class622(87, 20);
        field6799 = new class622(27, 6);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2723(boolean arg0) {
        field6800 = null;
        field6793 = null;
        field6795 = null;
        field6797 = null;
        field6799 = null;
        if (arg0) {
            method2725(46, 109, -52, -88, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILps;)Lps;", line = 18)
    public static final class5 method2724(int arg0, class5 arg1) {
        int var2 = 60 / ((25 - arg0) / 38);
        field6794++;
        class5 var3 = client.method571(arg1);
        if (var3 == null) {
            var3 = arg1.field153;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIB)I", line = 34)
    public static final int method2725(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6796++;
        int var5 = 66 / ((arg4 + 25) / 50);
        int var6 = arg2 & 0xF;
        int var7 = var6 >= 8 ? arg1 : arg3;
        int var8 = var6 >= 4 ? (var6 == 12 || var6 == 14 ? arg3 : arg0) : arg1;
        return ((var6 & 0x1) == 0 ? var7 : -var7) + ((var6 & 0x2) == 0 ? var8 : -var8);
    }
}
