import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class340 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "[J")
    public static long[] field4981 = new long[11];

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "[[J")
    public static long[][] field4984 = new long[8][256];

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "Ljava/lang/String;")
    public String field4982;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public static void method2111(int arg0) {
        field4981 = null;
        field4984 = null;
        if (arg0 != 2002681832) {
            method2113((byte) -27, -21);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2112(boolean arg0, int arg1, int arg2) {
        field4985++;
        return arg0 ? class474.method2888(arg1, (byte) 87, arg2) & class371.method2261(arg1, arg2, (byte) -78) : true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)Z")
    public static final boolean method2113(byte arg0, int arg1) {
        field4980++;
        if (arg1 == 10 || arg1 == 49 || arg1 == 8 || arg1 == 20 || arg1 == 1010) {
            return true;
        } else {
            if (arg0 != -82) {
                field4984 = null;
            }
            return arg1 == 57 || arg1 == 1006;
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
            field4984[0][var0] = class270.method1713(class270.method1713(class270.method1713(class270.method1713(class270.method1713(class270.method1713(class270.method1713(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24), var10 << 16), var6 << 8), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field4984[var16][var0] = class270.method1713(field4984[var16 - 1][var0] >>> 8, field4984[var16 - 1][var0] << 56);
            }
        }
        field4981[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field4981[var1] = class410.method2438(class410.method2438(class155.method901(field4984[6][var2 + 6], 65280L), class410.method2438(class155.method901(field4984[5][var2 + 5], 16711680L), class410.method2438(class410.method2438(class155.method901(field4984[3][var2 + 3], 1095216660480L), class410.method2438(class410.method2438(class155.method901(-72057594037927936L, field4984[0][var2]), class155.method901(71776119061217280L, field4984[1][var2 + 1])), class155.method901(280375465082880L, field4984[2][var2 + 2]))), class155.method901(4278190080L, field4984[4][var2 + 4])))), class155.method901(field4984[7][var2 + 7], 255L));
        }
    }
}
