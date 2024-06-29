import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class693 extends class386 {

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    public static int field9827 = 0;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "[I")
    public static int[] field9833 = new int[2];

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "Lqfa;")
    public static class372 field9832 = new class372("", 12);

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "[[J")
    public static long[][] field9835 = new long[8][256];

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "[J")
    public static long[] field9836 = new long[11];

    @OriginalMember(owner = "client!gn", name = "S", descriptor = "Lrga;")
    public static class280 field9837;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "[B")
    private byte[] field9834;

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
            field9835[0][var0] = class463.method2462(class463.method2462(class463.method2462(class463.method2462(class463.method2462(class463.method2462(class463.method2462(var4 << 56, var4 << 48), var8 << 40), var4 << 32), var12 << 24), var10 << 16), var6 << 8), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field9835[var16][var0] = class463.method2462(field9835[var16 - 1][var0] >>> 8, field9835[var16 - 1][var0] << 56);
            }
        }
        field9836[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field9836[var1] = class413.method2187(class168.method964(255L, field9835[7][var2 + 7]), class413.method2187(class168.method964(65280L, field9835[6][var2 + 6]), class413.method2187(class413.method2187(class413.method2187(class168.method964(1095216660480L, field9835[3][var2 + 3]), class413.method2187(class413.method2187(class168.method964(-72057594037927936L, field9835[0][var2]), class168.method964(field9835[1][var2 + 1], 71776119061217280L)), class168.method964(280375465082880L, field9835[2][var2 + 2]))), class168.method964(4278190080L, field9835[4][var2 + 4])), class168.method964(field9835[5][var2 + 5], 16711680L))));
        }
        field9837 = new class280(37, 7);
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(B)V", line = 4)
    public static void method3908(byte arg0) {
        field9835 = null;
        field9833 = null;
        field9837 = null;
        field9832 = null;
        field9836 = null;
        if (arg0 <= 21) {
            field9833 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZII)Z", line = 18)
    public static final boolean method3909(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        } else {
            field9825++;
            return (arg1 & 0x70000) != 0 | class368.method2014(arg1, 1, arg2) || class127.method678(68, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)[B", line = 29)
    public final byte[] method3910(int arg0, int arg1, int arg2, int arg3) {
        field9831++;
        this.field9834 = new byte[arg1 * 2 * arg2 * arg3];
        if (arg0 != 0) {
            field9826 = -90;
        }
        this.method831((byte) 113, arg3, arg2, arg1);
        return this.field9834;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIZ)V", line = 42)
    public final void method2079(byte arg0, int arg1, boolean arg2) {
        field9829++;
        if (arg2) {
            field9835 = null;
        }
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var6 = var4 + 1;
        this.field9834[var4] = (byte) (var5 * 3 >> 5);
        this.field9834[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 65)
    public class693() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILks;)I", line = 74)
    public static final int method3911(int arg0, class30 arg1) {
        if (arg0 != 11) {
            method3909(false, -83, 70);
        }
        field9828++;
        int var2 = arg1.method200(false, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method200(false, 5);
        } else if (var2 == 2) {
            var3 = arg1.method200(false, 8);
        } else {
            var3 = arg1.method200(false, 11);
        }
        return var3;
    }
}
