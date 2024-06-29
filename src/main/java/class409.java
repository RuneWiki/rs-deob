import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class409 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Ljava/lang/String;")
    public String field5255;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Ljava/lang/String;")
    public String field5260;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Ljava/lang/String;")
    public String field5256;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[[J")
    public static long[][] field5258 = new long[8][256];

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "[J")
    public static long[] field5261 = new long[11];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field5262;

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
            field5258[0][var0] = method2300(method2300(var6 << 8, method2300(method2300(method2300(method2300(method2300(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24), var10 << 16)), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field5258[var16][var0] = method2300(field5258[var16 - 1][var0] >>> 8, field5258[var16 - 1][var0] << 56);
            }
        }
        field5261[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field5261[var1] = class311.method1832(class431.method2370(field5258[7][var2 + 7], 255L), class311.method1832(class311.method1832(class431.method2370(field5258[5][var2 + 5], 16711680L), class311.method1832(class431.method2370(field5258[4][var2 + 4], 4278190080L), class311.method1832(class431.method2370(field5258[3][var2 + 3], 1095216660480L), class311.method1832(class311.method1832(class431.method2370(field5258[1][var2 + 1], 71776119061217280L), class431.method2370(-72057594037927936L, field5258[0][var2])), class431.method2370(field5258[2][var2 + 2], 280375465082880L))))), class431.method2370(65280L, field5258[6][var2 + 6])));
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 5)
    public static void method2297(byte arg0) {
        field5258 = null;
        if (arg0 != 19) {
            method2298(-11, 48, (byte) 3);
        }
        field5261 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)Z", line = 16)
    public static final boolean method2298(int arg0, int arg1, byte arg2) {
        if (arg2 != -93) {
            field5262 = 31;
        }
        field5257++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Z", line = 29)
    public static final boolean method2299(byte arg0, int arg1) {
        field5254++;
        if (class492.field6136[arg1]) {
            return true;
        } else if (class276.field3526.method1662(arg1, -44)) {
            int var2 = class276.field3526.method1655(arg1, (byte) -82);
            if (var2 == 0) {
                class492.field6136[arg1] = true;
                return true;
            }
            if (class325.field4062[arg1] == null) {
                class325.field4062[arg1] = new class337[var2];
            }
            if (arg0 >= -30) {
                return false;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class325.field4062[arg1][var3] == null) {
                    byte[] var4 = class276.field3526.method1659(123, var3, arg1);
                    if (var4 != null) {
                        class337 var5 = class325.field4062[arg1][var3] = new class337();
                        var5.field4172 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1937(16, new class572(var4));
                    }
                }
            }
            class492.field6136[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(JJ)J", line = 88)
    private static long method2300(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 101)
    public class409(String arg0, String arg1, String arg2) {
        this.field5255 = arg1;
        this.field5260 = arg0;
        this.field5256 = arg2;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)V", line = 111)
    public static final void method2301(byte arg0, int arg1) {
        field5259++;
        class331.field4104.method1222(14564, arg1);
        if (arg0 != 114) {
            method2298(89, -13, (byte) 12);
        }
    }
}
