import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class265 extends class65 {

    @OriginalMember(owner = "client!uga", name = "p", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!uga", name = "o", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!uga", name = "q", descriptor = "[[J")
    public static long[][] field4128 = new long[8][256];

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "[J")
    public static long[] field4124 = new long[11];

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!uga", name = "n", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!uga", name = "r", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
    public static void method1769(int arg0) {
        field4124 = null;
        field4128 = null;
        if (arg0 <= 115) {
            method1769(17);
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1770(int arg0) {
        if (arg0 != 1) {
            method1770(119);
        }
        field4122++;
        return class32.field304 || class237.field3813 == null ? "" : class237.field3813.field3485;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(II)V")
    public class265(int arg0, int arg1) {
        this.field4127 = arg0;
        this.field4126 = arg1;
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
            field4128[0][var0] = class685.method3821(var14, class685.method3821(class685.method3821(class685.method3821(var12 << 24, class685.method3821(class685.method3821(class685.method3821(var4 << 56, var4 << 48), var8 << 40), var4 << 32)), var10 << 16), var6 << 8));
            for (int var16 = 1; var16 < 8; var16++) {
                field4128[var16][var0] = class685.method3821(field4128[var16 - 1][var0] << 56, field4128[var16 - 1][var0] >>> 8);
            }
        }
        field4124[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field4124[var1] = class22.method120(class22.method120(class22.method120(class22.method120(class399.method2467(4278190080L, field4128[4][var2 + 4]), class22.method120(class22.method120(class399.method2467(field4128[2][var2 + 2], 280375465082880L), class22.method120(class399.method2467(71776119061217280L, field4128[1][var2 + 1]), class399.method2467(-72057594037927936L, field4128[0][var2]))), class399.method2467(field4128[3][var2 + 3], 1095216660480L))), class399.method2467(16711680L, field4128[5][var2 + 5])), class399.method2467(field4128[6][var2 + 6], 65280L)), class399.method2467(255L, field4128[7][var2 + 7]));
        }
    }
}
