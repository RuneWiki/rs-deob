import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class394 extends class710 {

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "Lks;")
    public static class460 field5582 = new class460("", 11);

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "[[J")
    public static long[][] field5584 = new long[8][256];

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "[J")
    public static long[] field5583 = new long[11];

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field5586;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)I")
    public static final int method2400(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        field5581++;
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        if (arg1 != -20302) {
            method2400(33, 32);
        }
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
    public static void method2401(int arg0) {
        if (arg0 >= -61) {
            method2401(0);
        }
        field5583 = null;
        field5584 = null;
        field5582 = null;
        field5586 = null;
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Lbv;")
    public abstract class320 method2402(int arg0);

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
            field5584[0][var0] = class546.method3179(class546.method3179(var6 << 8, class546.method3179(var10 << 16, class546.method3179(class546.method3179(class546.method3179(class546.method3179(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24))), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field5584[var16][var0] = class546.method3179(field5584[var16 - 1][var0] << 56, field5584[var16 - 1][var0] >>> 8);
            }
        }
        field5583[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field5583[var1] = class234.method1616(class638.method3630(255L, field5584[7][var2 + 7]), class234.method1616(class234.method1616(class638.method3630(field5584[5][var2 + 5], 16711680L), class234.method1616(class234.method1616(class234.method1616(class234.method1616(class638.method3630(field5584[0][var2], -72057594037927936L), class638.method3630(field5584[1][var2 + 1], 71776119061217280L)), class638.method3630(280375465082880L, field5584[2][var2 + 2])), class638.method3630(1095216660480L, field5584[3][var2 + 3])), class638.method3630(4278190080L, field5584[4][var2 + 4]))), class638.method3630(field5584[6][var2 + 6], 65280L)));
        }
    }
}
