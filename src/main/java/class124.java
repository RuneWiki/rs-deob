import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class124 {

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lfc;")
    public static class39 field3185 = class90.method774("und Ihr Passwort ein)3", -78);

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lfc;")
    private static class39 field3184 = class90.method774("Please wait 5 minutes before trying again)3", -85);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3181 = 0;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[J")
    public static long[] field3190 = new long[32];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lfc;")
    public static class39 field3179 = class90.method774("Freie Welt", -112);

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Lfc;")
    private static class39 field3189 = class90.method774("Welcome to RuneScape", -85);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lfc;")
    public static class39 field3182 = field3189;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lfc;")
    public static class39 field3183 = field3184;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Z")
    public static boolean field3192 = false;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)Lfc;", line = 9)
    public static final class39 method1039(boolean arg0, int arg1) {
        field3188++;
        class39 var2 = new class39();
        if (arg0) {
            return null;
        } else {
            var2.field1067 = new byte[arg1];
            var2.field1046 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLoc;)V", line = 41)
    public static final void method1040(boolean arg0, class100 arg1) {
        if (arg0) {
            field3189 = null;
        }
        class128.field3267 = arg1;
        field3187++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 79)
    public static void method1041(int arg0) {
        field3190 = null;
        field3183 = null;
        field3185 = null;
        field3184 = null;
        field3189 = null;
        field3182 = null;
        if (arg0 != -1) {
            method1042(-14, -117, -60, 62);
        }
        field3179 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V", line = 96)
    public static final void method1042(int arg0, int arg1, int arg2, int arg3) {
        field3180++;
        if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
            class14.field370 = -1;
            class61.field1506 = -1;
            return;
        }
        int var4 = class153.method1225(arg3 + 27341, arg2, class24.field661, arg0) - arg1;
        int var5 = arg0 - class87.field2022;
        int var6 = arg2 - class78.field1778;
        int var7 = var4 - class104.field2631;
        int var8 = class40.field1124[class39.field1104];
        int var9 = class40.field1114[class39.field1104];
        int var10 = class40.field1124[class121.field3160];
        int var11 = class40.field1114[class121.field3160];
        int var12 = var5 * var11 + var6 * var10 >> 16;
        int var13 = var6 * var11 - var5 * var10 >> 16;
        int var15 = var7 * var9 - var8 * var13 >> 16;
        int var16 = var7 * var8 + var9 * var13 >> 16;
        if (var16 < 50) {
            class14.field370 = -1;
            class61.field1506 = -1;
        } else {
            class14.field370 = (var12 << 9) / var16 + 256;
            class61.field1506 = (var15 << 9) / var16 + 167;
        }
        if (arg3 != -27213) {
            method1041(80);
        }
    }
}
