import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class1 {

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lja;")
    public static class62 field10 = class30.method243(43, "Weiter");

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field1 = -1;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lja;")
    public static class62 field2 = class30.method243(43, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lja;")
    public static class62 field9 = class30.method243(43, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lhe;")
    public static class54 field5 = null;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lja;")
    public static class62 field7 = class30.method243(43, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lja;")
    public static class62 field12 = class30.method243(43, "<col=00ffff>");

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lja;")
    public static class62 field14 = class30.method243(43, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[I")
    public static int[] field17 = new int[128];

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lja;")
    public static class62 field18 = class30.method243(43, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lpd;")
    public static class108 field16;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lja;Lja;Lja;I)V")
    public static final void method1(class62 arg0, class62 arg1, class62 arg2, int arg3) {
        class7.field217 = arg1;
        class7.field213 = arg0;
        class7.field218 = arg2;
        if (arg3 == 0) {
            field4++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method2(byte arg0) {
        if (arg0 > -92) {
            field13 = -128;
        }
        field14 = null;
        field18 = null;
        field2 = null;
        field16 = null;
        field10 = null;
        field17 = null;
        field12 = null;
        field5 = null;
        field7 = null;
        field9 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
    public static final void method3(boolean arg0, int arg1) {
        class24.field589 = arg0;
        field6++;
        if (arg1 < 10) {
            field11 = 11;
        }
        if (!class24.field589) {
            int var25 = class38.field879.method1023((byte) -22);
            int var26 = class38.field879.method1004(-101981656);
            int var27 = class38.field879.method1041(212464720);
            int var28 = (class115.field2651 - class38.field879.field2873) / 16;
            class132.field3028 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class132.field3028[var29][var37] = class38.field879.method1020((byte) -104);
                }
            }
            int var30 = class38.field879.method1041(212464720);
            int var31 = class38.field879.method1041(212464720);
            class22.field516 = new int[var28];
            boolean var32 = false;
            class34.field801 = new byte[var28][];
            class146.field3442 = new int[var28];
            if ((var27 / 8 == 48 || var27 / 8 == 49) && (var30 / 8) == 48) {
                var32 = true;
            }
            class85.field2043 = new int[var28];
            class24.field601 = new byte[var28][];
            if (var27 / 8 == 48 && var30 / 8 == 148) {
                var32 = true;
            }
            int var33 = 0;
            for (int var34 = (var27 - 6) / 8; var34 <= (var27 + 6) / 8; var34++) {
                for (int var35 = (var30 - 6) / 8; var35 <= (var30 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class85.field2043[var33] = var36;
                        class146.field3442[var33] = class17.field399.method877(80, class70.method594(new class62[] { class111.field2556, class31.method249(true, var34), class134.field3099, class31.method249(true, var35) }, 1229));
                        class22.field516[var33] = class17.field399.method877(80, class70.method594(new class62[] { class59.field1451, class31.method249(true, var34), class134.field3099, class31.method249(true, var35) }, 1229));
                        var33++;
                    }
                }
            }
            class36.method278(var31, var25, var30, var26, var27, -32537);
            return;
        }
        int var2 = class38.field879.method989(true);
        int var3 = class38.field879.method1004(-101981656);
        class38.field879.method805(8);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class38.field879.method811(7, 1);
                    if (var24 == 1) {
                        class40.field927[var4][var22][var23] = class38.field879.method811(7, 26);
                    } else {
                        class40.field927[var4][var22][var23] = -1;
                    }
                }
            }
        }
        class38.field879.method802(-7);
        int var5 = (class115.field2651 - class38.field879.field2873) / 16;
        class132.field3028 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class132.field3028[var6][var21] = class38.field879.method1020((byte) -108);
            }
        }
        int var7 = class38.field879.method1004(-101981656);
        int var8 = class38.field879.method1041(212464720);
        int var9 = class38.field879.method1041(212464720);
        class85.field2043 = new int[var5];
        class34.field801 = new byte[var5][];
        class22.field516 = new int[var5];
        class24.field601 = new byte[var5][];
        class146.field3442 = new int[var5];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class40.field927[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class85.field2043[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class85.field2043[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class146.field3442[var10] = class17.field399.method877(80, class70.method594(new class62[] { class111.field2556, class31.method249(true, var19), class134.field3099, class31.method249(true, var20) }, 1229));
                            class22.field516[var10] = class17.field399.method877(80, class70.method594(new class62[] { class59.field1451, class31.method249(true, var19), class134.field3099, class31.method249(true, var20) }, 1229));
                            var10++;
                        }
                    }
                }
            }
        }
        class36.method278(var7, var2, var9, var8, var3, -32537);
    }
}
