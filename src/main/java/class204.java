import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class204 extends class309 {

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "Leea;")
    public class112 field2441;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "Lvj;")
    public static class373 field2435 = new class373(71, 12);

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "Lvj;")
    public static class373 field2442 = new class373(32, 4);

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2444 = null;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "[[J")
    public static long[][] field2445 = new long[8][256];

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "[J")
    public static long[] field2446 = new long[11];

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "[I")
    public static int[] field2447;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)Z")
    public static final boolean method1091(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1094(-49, -80, -17, 29, 85, -10, -11, -105, null, 40, null, 93, 9);
        }
        field2439++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2445 = null;
        if (arg0 != -8099) {
            return;
        }
        field2447 = null;
        field2446 = null;
        field2444 = null;
        field2435 = null;
        field2442 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IC)Z")
    public static final boolean method1093(int arg0, char arg1) {
        if (arg0 != 90) {
            method1095((byte) -41);
        }
        field2437++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIIIIII[[[BILqa;II)V")
    public static final void method1094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[][][] arg8, int arg9, class206 arg10, int arg11, int arg12) {
        field2438++;
        if (arg3 == arg6 || arg5 == 0) {
            return;
        }
        if (arg3 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg3 = 1;
        }
        if (arg3 == 10) {
            arg3 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        if (arg3 == 11) {
            arg3 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        arg10.method1125(arg0, arg4, arg11, arg1, arg2, arg12, arg8[arg3 - 1][arg9], arg5, arg7);
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lbda;II[B)V")
    public class204(class428 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2441 = arg0.method2477(arg2, arg3, 0, false, class37.field293, arg1);
        this.field2441.method647(false, false, (byte) 80);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
    public static final void method1095(byte arg0) {
        field2436++;
        int var1 = class42.field335 * 128 + 64;
        int var2 = class641.field9238 * 128 + 64;
        int var3 = class426.method2400(arg0 ^ 0xFFFFFF81, var2, var1, class442.field6099) - class64.field632;
        if (class241.field3003 < 100) {
            if (var1 > class286.field3729) {
                class286.field3729 += (var1 - class286.field3729) * class241.field3003 / 1000 + class230.field2856;
                if (class286.field3729 > var1) {
                    class286.field3729 = var1;
                }
            }
            if (class521.field7321 < var3) {
                class521.field7321 += (var3 - class521.field7321) * class241.field3003 / 1000 + class230.field2856;
                if (class521.field7321 > var3) {
                    class521.field7321 = var3;
                }
            }
            if (class286.field3729 > var1) {
                class286.field3729 -= (class286.field3729 - var1) * class241.field3003 / 1000 + class230.field2856;
                if (class286.field3729 < var1) {
                    class286.field3729 = var1;
                }
            }
            if (class521.field7321 > var3) {
                class521.field7321 -= (class521.field7321 - var3) * class241.field3003 / 1000 + class230.field2856;
                if (var3 > class521.field7321) {
                    class521.field7321 = var3;
                }
            }
            if (class39.field303 < var2) {
                class39.field303 += class230.field2856 + ((var2 - class39.field303) * class241.field3003 / 1000);
                if (var2 < class39.field303) {
                    class39.field303 = var2;
                }
            }
            if (class39.field303 > var2) {
                class39.field303 -= class230.field2856 + ((class39.field303 - var2) * class241.field3003 / 1000);
                if (var2 > class39.field303) {
                    class39.field303 = var2;
                }
            }
        } else {
            class286.field3729 = class42.field335 * 128 + 64;
            class39.field303 = class641.field9238 * 128 + 64;
            class521.field7321 = class426.method2400(-1, class39.field303, class286.field3729, class442.field6099) - class64.field632;
        }
        if (arg0 != 126) {
            field2447 = null;
        }
        int var4 = class306.field3891 * 128 + 64;
        int var5 = class58.field543 * 128 + 64;
        int var6 = class426.method2400(arg0 ^ 0xFFFFFF81, var4, var5, class442.field6099) - class356.field4684;
        int var7 = var5 - class286.field3729;
        int var8 = var6 - class521.field7321;
        int var9 = var4 - class39.field303;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class482.field6748) {
            class482.field6748 += class189.field2280 + ((var11 - class482.field6748 >> 3) * class611.field8872 / 1000) << 3;
            if (class482.field6748 > var11) {
                class482.field6748 = var11;
            }
        }
        if (var11 < class482.field6748) {
            class482.field6748 -= (class482.field6748 - var11 >> 3) * class611.field8872 / 1000 + class189.field2280 << 3;
            if (class482.field6748 < var11) {
                class482.field6748 = var11;
            }
        }
        int var13 = var12 - class168.field2055;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class168.field2055 += class189.field2280 + (class611.field8872 * var14 / 1000) << 3;
            class168.field2055 &= 0x3FFF;
        }
        if (var14 < 0) {
            class168.field2055 -= -var14 * class611.field8872 / 1000 + class189.field2280 << 3;
            class168.field2055 &= 0x3FFF;
        }
        int var15 = var12 - class168.field2055;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class168.field2055 = var12;
        }
        class263.field3390 = 0;
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lbda;II[I)V")
    public class204(class428 arg0, int arg1, int arg2, int[] arg3) {
        this.field2441 = arg0.method2430(-119, arg3, arg2, arg1, false);
        this.field2441.method647(false, false, (byte) 115);
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
            long var14 = var4 ^ var12;
            field2445[0][var0] = class128.method726(class128.method726(var6 << 8, class128.method726(var10 << 16, class128.method726(var12 << 24, class128.method726(class128.method726(var8 << 40, class128.method726(var4 << 56, var4 << 48)), var4 << 32)))), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field2445[var16][var0] = class128.method726(field2445[var16 - 1][var0] << 56, field2445[var16 - 1][var0] >>> 8);
            }
        }
        field2446[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field2446[var1] = class463.method2691(class463.method2691(class84.method495(65280L, field2445[6][var2 + 6]), class463.method2691(class84.method495(field2445[5][var2 + 5], 16711680L), class463.method2691(class463.method2691(class463.method2691(class463.method2691(class84.method495(-72057594037927936L, field2445[0][var2]), class84.method495(71776119061217280L, field2445[1][var2 + 1])), class84.method495(field2445[2][var2 + 2], 280375465082880L)), class84.method495(field2445[3][var2 + 3], 1095216660480L)), class84.method495(field2445[4][var2 + 4], 4278190080L)))), class84.method495(255L, field2445[7][var2 + 7]));
        }
        field2447 = new int[] { 16, 32, 64, 128 };
    }
}
