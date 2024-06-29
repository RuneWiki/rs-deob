import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class230 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[J")
    public static long[] field3595 = new long[11];

    @OriginalMember(owner = "client!se", name = "b", descriptor = "[[J")
    public static long[][] field3596 = new long[8][256];

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method1586(byte arg0) {
        if (arg0 != 126) {
            field3596 = null;
        }
        class565.field7971 = class437.field6392;
        class375.field5342 = false;
        class196.field2799 = new class327[500];
        class186.field2673 = 0;
        class9.field94 = 0;
        class586.field8205 = 0;
        field3598++;
        class612.field8574 = new class327[500];
        class7.field67 = new class327[1000];
        class101.field1583 = class437.field6392;
        class266.field4020 = 0;
        class178.field2538 = new class327[2000];
        class580.field8171 = new int[class41.field685][class302.field4492 + 1][class8.field82 + 1];
        if (class682.field9618 instanceof class18) {
            class202.field2847 = false;
        } else {
            class202.field2847 = true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public static final void method1587(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class300.method1929(var3.field658);
        class300.method1929(var3.field669);
        if (var3.field658 != null) {
            var3.field658 = null;
        }
        if (var3.field669 != null) {
            var3.field669 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1588(int arg0, byte arg1, int arg2) {
        field3597++;
        if (arg1 != 4) {
            method1586((byte) -89);
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        if (arg0 <= -20) {
            field3596 = null;
            field3595 = null;
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
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field3596[0][var0] = class463.method2729(var14, class463.method2729(var6 << 8, class463.method2729(class463.method2729(var12 << 24, class463.method2729(var4 << 32, class463.method2729(var8 << 40, class463.method2729(var4 << 48, var4 << 56)))), var10 << 16)));
            for (int var16 = 1; var16 < 8; var16++) {
                field3596[var16][var0] = class463.method2729(field3596[var16 - 1][var0] >>> 8, field3596[var16 - 1][var0] << 56);
            }
        }
        field3595[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field3595[var1] = class43.method467(class43.method467(class120.method917(65280L, field3596[6][var2 + 6]), class43.method467(class120.method917(16711680L, field3596[5][var2 + 5]), class43.method467(class120.method917(4278190080L, field3596[4][var2 + 4]), class43.method467(class43.method467(class120.method917(280375465082880L, field3596[2][var2 + 2]), class43.method467(class120.method917(field3596[0][var2], -72057594037927936L), class120.method917(71776119061217280L, field3596[1][var2 + 1]))), class120.method917(field3596[3][var2 + 3], 1095216660480L))))), class120.method917(255L, field3596[7][var2 + 7]));
        }
    }
}
