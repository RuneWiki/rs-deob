import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 extends class270 {

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "[[J")
    public static long[][] field350 = new long[8][256];

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "[J")
    public static long[] field351 = new long[11];

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Lfv;")
    public static class108 field352;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field354;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field355;

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
            long var14 = var4 ^ var12;
            field350[0][var0] = class462.method2628(var14, class462.method2628(var6 << 8, class462.method2628(class462.method2628(var12 << 24, class462.method2628(class462.method2628(class462.method2628(var4 << 56, var4 << 48), var8 << 40), var4 << 32)), var10 << 16)));
            for (int var16 = 1; var16 < 8; var16++) {
                field350[var16][var0] = class462.method2628(field350[var16 - 1][var0] << 56, field350[var16 - 1][var0] >>> 8);
            }
        }
        field351[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field351[var1] = class243.method1403(class243.method1403(class436.method2409(field350[6][var2 + 6], 65280L), class243.method1403(class243.method1403(class436.method2409(4278190080L, field350[4][var2 + 4]), class243.method1403(class243.method1403(class243.method1403(class436.method2409(71776119061217280L, field350[1][var2 + 1]), class436.method2409(-72057594037927936L, field350[0][var2])), class436.method2409(field350[2][var2 + 2], 280375465082880L)), class436.method2409(1095216660480L, field350[3][var2 + 3]))), class436.method2409(field350[5][var2 + 5], 16711680L))), class436.method2409(255L, field350[7][var2 + 7]));
        }
        field352 = new class108(4, 1, 1, 1);
        field354 = new String[100];
        field353 = 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILmfa;Loa;I)V", line = 6)
    public static final void method164(int arg0, int arg1, class562 arg2, class635 arg3, int arg4) {
        field348++;
        class504.field7252.method3170((byte) -127);
        if (class555.field7909) {
            return;
        }
        int var5 = 111 % ((80 - arg1) / 32);
        for (class276 var6 = (class276) arg2.method3174((byte) 49); var6 != null; var6 = (class276) arg2.method3168(false)) {
            class89 var7 = class637.field9013.method1972(var6.field3483, (byte) -18);
            if (class139.method774(-123, var7)) {
                boolean var8 = class600.method3354(arg4, var7, arg3, var6, 81, arg0);
                if (var8) {
                    class259.method1475(var6, arg3, var7, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(II)V", line = 41)
    public class30(int arg0, int arg1) {
        this.field347 = arg1;
        this.field349 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 52)
    public static void method165(int arg0) {
        field351 = null;
        if (arg0 == 7) {
            field354 = null;
            field350 = null;
            field352 = null;
        }
    }
}
