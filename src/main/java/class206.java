import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class206 {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Z")
    public static boolean field2843 = false;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lff;")
    public static class9 field2841 = new class9(36, 2);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lcu;")
    public static class145 field2847 = new class145(59, 4);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lkf;")
    public static class165 field2848;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Ltq;")
    public static class442 field2849;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Ltt;")
    public static class60 field2850;

    static {
        new class304("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1319(int arg0) {
        field2844++;
        if (arg0 < 32) {
            method1323(-86, -80, 32, 47);
        }
        class302.field3987.method561(class482.field6721, class402.field5395, class51.field807);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method1320(boolean arg0) {
        field2846++;
        if (arg0 || class435.field5980 < 0) {
            return;
        }
        long var1 = class498.method2854(-127);
        class435.field5980 = (int) ((long) class435.field5980 - (var1 - class73.field1109));
        if (class435.field5980 <= 0) {
            class402.field5395 = class444.field6089.field2127;
            class326.field4287 = class444.field6089.field2115;
            class482.field6721 = class444.field6089.field2116;
            class97.field1468 = class444.field6089.field2122;
            class154.field2241 = class444.field6089.field2121;
            class155.field2275 = class444.field6089.field2126;
            class374.field5068 = class444.field6089.field2110;
            class435.field5980 = -1;
            class51.field807 = class444.field6089.field2113;
            class372.field5008 = class444.field6089.field2114;
            class381.field5206 = class444.field6089.field2118;
        } else {
            int var3 = (class435.field5980 << 8) / class282.field3701;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class374.field5068 = ((class392.field5311 & 0xFF00) * var3 + ((class444.field6089.field2110 & 0xFF00) * var4) & 0xFF0000) + ((class392.field5311 & 0xFF00FF) * var3 + (class444.field6089.field2110 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class326.field4287 = (class444.field6089.field2115 - class135.field1939) * var6 + class135.field1939;
            class154.field2241 = ((class46.field697 & 0xFF00) * var3 + (class444.field6089.field2121 & 0xFF00) * var4 & 0xFF0000) + ((class46.field697 & 0xFF00FF) * var3 + (class444.field6089.field2121 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class155.field2275 = (class444.field6089.field2126 - class207.field2853) * var6 + class207.field2853;
            class372.field5008 = (class444.field6089.field2114 - class224.field3019) * var6 + class224.field3019;
            class482.field6721 = (class444.field6089.field2116 - class516.field7654) * var6 + class516.field7654;
            class51.field807 = (class444.field6089.field2113 - class352.field4762) * var6 + class352.field4762;
            class381.field5206 = class285.field3728 * var3 + class444.field6089.field2118 * var4 >> 8;
            class402.field5395 = (class444.field6089.field2127 - class40.field605) * var6 + class40.field605;
            if (class123.field1809 != class444.field6089.field2122) {
                class97.field1468 = class302.field3987.method566(class123.field1809, class444.field6089.field2122, var6, class97.field1468);
            }
        }
        class73.field1109 = var1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 80)
    public static void method1321(byte arg0) {
        field2847 = null;
        field2849 = null;
        field2850 = null;
        field2848 = null;
        field2841 = null;
        if (arg0 <= 89) {
            method1323(-22, -52, -107, 26);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)Z", line = 97)
    public static final boolean method1322(int arg0, byte arg1, int arg2) {
        if (arg1 == 53) {
            field2840++;
            return (arg2 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)I", line = 109)
    public static final int method1323(int arg0, int arg1, int arg2, int arg3) {
        field2842++;
        if ((class117.field1677[arg1][arg2][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class117.field1677[1][arg2][arg3] & 0x2) == 0) {
            return arg0 == -15434 ? arg1 : 103;
        } else {
            return arg1 - 1;
        }
    }
}
