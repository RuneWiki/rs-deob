import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[[B")
    public static byte[][] field2258 = new byte[50][];

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lsc;")
    public static class128 field2257 = class129.method1017(false, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lsc;")
    public static class128 field2262 = class129.method1017(false, " <col=ffff00>");

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lsc;")
    public static class128 field2263 = class129.method1017(false, ")2");

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field2260 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lgf;")
    public static class48 field2255;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "[Li;")
    public static class56[] field2264;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    public static int method751(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[BI)I")
    public static final int method752(int arg0, int arg1, byte[] arg2, int arg3) {
        field2266++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class16.field288[(arg2[var5] ^ var4) & 0xFF];
        }
        int var6 = ~var4;
        int var7 = 68 / ((52 - arg0) / 49);
        return var6;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static final void method753(byte arg0) {
        class55.field1224.method919((byte) -104);
        field2265++;
        if (arg0 < 18) {
            method756(-13);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lha;B)V")
    public static final void method754(class50 arg0, byte arg1) {
        field2261++;
        arg0.field958 = arg0.field1009;
        if (arg0.field947 == 0) {
            arg0.field995 = 0;
            return;
        }
        if (arg0.field981 != -1 && arg0.field970 == 0) {
            class134 var2 = class70.method527(12, arg0.field981);
            if (arg0.field1004 > 0 && var2.field3148 == 0) {
                arg0.field995++;
                return;
            }
            if (arg0.field1004 <= 0 && var2.field3175 == 0) {
                arg0.field995++;
                return;
            }
        }
        int var3 = arg0.field989[arg0.field947 - 1] * 128 + arg0.field960 * 64;
        int var4 = arg0.field962[arg0.field947 - 1] * 128 + arg0.field960 * 64;
        int var5 = arg0.field987;
        int var6 = arg0.field975;
        if (var4 - var6 > 256 || var4 - var6 < -256 || var3 - var5 > 256 || var3 - var5 < -256) {
            arg0.field987 = var3;
            arg0.field975 = var4;
            return;
        }
        if (var6 < var4) {
            if (var5 < var3) {
                arg0.field985 = 1280;
            } else if (var5 <= var3) {
                arg0.field985 = 1536;
            } else {
                arg0.field985 = 1792;
            }
        } else if (var6 > var4) {
            if (var3 > var5) {
                arg0.field985 = 768;
            } else if (var5 > var3) {
                arg0.field985 = 256;
            } else {
                arg0.field985 = 512;
            }
        } else if (var3 > var5) {
            arg0.field985 = 1024;
        } else if (var5 > var3) {
            arg0.field985 = 0;
        }
        int var7 = 124 / ((10 - arg1) / 42);
        int var8 = arg0.field985 - arg0.field1012 & 0x7FF;
        boolean var9 = true;
        int var10 = 4;
        int var11 = arg0.field1018;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var11 = arg0.field977;
        } else if (var8 >= 256 && var8 < 768) {
            var11 = arg0.field1013;
        } else if (var8 >= -768 && var8 <= -256) {
            var11 = arg0.field963;
        }
        if (var11 == -1) {
            var11 = arg0.field977;
        }
        arg0.field958 = var11;
        if (arg0 instanceof class51) {
            var9 = ((class51) arg0).field1028.field1313;
        }
        if (var9) {
            if (arg0.field985 != arg0.field1012 && arg0.field951 == -1 && arg0.field953 != 0) {
                var10 = 2;
            }
            if (arg0.field947 > 2) {
                var10 = 6;
            }
            if (arg0.field947 > 3) {
                var10 = 8;
            }
            if (arg0.field995 > 0 && arg0.field947 > 1) {
                arg0.field995--;
                var10 = 8;
            }
        } else {
            if (arg0.field947 > 1) {
                var10 = 6;
            }
            if (arg0.field947 > 2) {
                var10 = 8;
            }
            if (arg0.field995 > 0 && arg0.field947 > 1) {
                arg0.field995--;
                var10 = 8;
            }
        }
        if (arg0.field991[arg0.field947 - 1]) {
            var10 <<= 0x1;
        }
        if (var3 > var5) {
            arg0.field987 += var10;
            if (var3 < arg0.field987) {
                arg0.field987 = var3;
            }
        } else if (var5 > var3) {
            arg0.field987 -= var10;
            if (var3 > arg0.field987) {
                arg0.field987 = var3;
            }
        }
        if (var6 < var4) {
            arg0.field975 += var10;
            if (var4 < arg0.field975) {
                arg0.field975 = var4;
            }
        } else if (var4 < var6) {
            arg0.field975 -= var10;
            if (arg0.field975 < var4) {
                arg0.field975 = var4;
            }
        }
        if (arg0.field975 == var4 && arg0.field987 == var3) {
            if (arg0.field1004 > 0) {
                arg0.field1004--;
            }
            arg0.field947--;
        }
        if (var10 >= 8 && arg0.field977 == arg0.field958 && arg0.field964 != -1) {
            arg0.field958 = arg0.field964;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)I")
    public static final int method755(int arg0, int arg1, int arg2, int arg3) {
        field2259++;
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg1;
        if (arg3 != 256) {
            return 69;
        }
        if (arg1 < 3 && (class110.field2485[1][var5][var4] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var6) * class55.field1229[var7][var5][var4 - -1] + class55.field1229[var7][var5 + 1][var4 + 1] * var6 >> 7;
        int var10 = (128 - var6) * class55.field1229[var7][var5][var4] + class55.field1229[var7][var5 + 1][var4] * var6 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method756(int arg0) {
        field2262 = null;
        field2263 = null;
        if (arg0 == 1) {
            field2257 = null;
            field2255 = null;
            field2258 = null;
            field2264 = null;
        }
    }
}
