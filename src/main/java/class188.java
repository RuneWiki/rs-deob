import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class188 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lea;")
    public static class547 field2261 = new class547(70, -2);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lkba;")
    public static class108 field2263 = new class108();

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lea;")
    public static class547 field2265 = new class547(61, 4);

    @OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
    public static int[] field2266 = new int[8];

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[[J")
    public static long[][] field2267 = new long[8][256];

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[J")
    public static long[] field2268 = new long[11];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lqn;")
    public static class65 field2264;

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
            long var14 = var4 ^ var12;
            field2267[0][var0] = class102.method701(var14, class102.method701(class102.method701(var10 << 16, class102.method701(var12 << 24, class102.method701(class102.method701(var8 << 40, class102.method701(var4 << 48, var4 << 56)), var4 << 32))), var6 << 8));
            for (int var16 = 1; var16 < 8; var16++) {
                field2267[var16][var0] = class102.method701(field2267[var16 - 1][var0] << 56, field2267[var16 - 1][var0] >>> 8);
            }
        }
        field2268[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field2268[var1] = class705.method3974(class614.method3458(field2267[7][var2 + 7], 255L), class705.method3974(class705.method3974(class705.method3974(class614.method3458(field2267[4][var2 + 4], 4278190080L), class705.method3974(class614.method3458(field2267[3][var2 + 3], 1095216660480L), class705.method3974(class705.method3974(class614.method3458(71776119061217280L, field2267[1][var2 + 1]), class614.method3458(field2267[0][var2], -72057594037927936L)), class614.method3458(field2267[2][var2 + 2], 280375465082880L)))), class614.method3458(field2267[5][var2 + 5], 16711680L)), class614.method3458(field2267[6][var2 + 6], 65280L)));
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1055(boolean arg0) {
        class301.field4067.method985((byte) -46);
        field2260++;
        class130.field1685.method1519((byte) 62);
        class135.field1723.method1553(-113);
        class707.field9894.method4110((byte) 127);
        class51.field540.method4081((byte) -19);
        class761.field10628.method4174((byte) 71);
        class460.field6365.method1086(-2118);
        class303.field4090.method3516(4);
        class465.field6445.method1842(0);
        class684.field9522.method786((byte) 97);
        class137.field1743.method1349((byte) 96);
        class593.field8266.method1367(10673);
        class224.field2894.method1653(36);
        class461.field6378.method2222(arg0);
        class482.field6654.method300(-1);
        class147.field1893.method2794(-112);
        class278.field3718.method830(arg0);
        class537.field7293.method2678(arg0);
        class360.field4768.method957(1);
        class758.field10568.method3196(32);
        class142.field1830.method2858(0);
        class298.method1780(1);
        class511.method2831(false);
        class219.method1242(0);
        class58.method335(-106);
        class30.method129((byte) 60);
        class539.field7308.method1575((byte) -106);
        class302.field4084.method1575((byte) -82);
        class375.field5217.method1575((byte) -80);
        class317.field4276.method1575((byte) 118);
        class498.field6790.method1575((byte) 28);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 42)
    public static void method1056(byte arg0) {
        field2266 = null;
        field2264 = null;
        field2267 = null;
        if (arg0 <= -121) {
            field2263 = null;
            field2265 = null;
            field2268 = null;
            field2261 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 60)
    public static final void method1057(byte arg0) {
        class8.field55 = 1;
        field2262++;
        class381.field5302 = -1;
        long var1 = 0L;
        if (class692.field9682 == null) {
            class158.method948(35, (byte) -55);
            return;
        }
        class611 var3 = new class611(class171.method994(class375.method2207(class692.field9682, -1), 12705));
        long var4 = var3.method3445(arg0 - 171);
        class394.field5582 = var3.method3445(-105);
        class163.method961(true, class543.method3084(-111, var4), 80, "");
        if (arg0 != 55) {
            field2266 = null;
        }
    }
}
