import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 extends class32 {

    @OriginalMember(owner = "client!s", name = "z", descriptor = "[I")
    public int[] field2900 = new int[1];

    @OriginalMember(owner = "client!s", name = "y", descriptor = "[I")
    public int[] field2899 = new int[] { -1 };

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lv;")
    public static class146 field2893 = class159.method1226((byte) -37, "http:)4)4");

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lv;")
    public static class146 field2895 = null;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field2897 = 0;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "Lv;")
    private static class146 field2901 = class159.method1226((byte) -37, "Username: ");

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2894 = 5063219;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "[Lje;")
    public static class67[] field2902 = new class67[2048];

    @OriginalMember(owner = "client!s", name = "G", descriptor = "Lv;")
    public static class146 field2907 = class159.method1226((byte) -37, "sl_arrows");

    @OriginalMember(owner = "client!s", name = "I", descriptor = "Lv;")
    public static class146 field2909 = class159.method1226((byte) -37, "Cabbage");

    @OriginalMember(owner = "client!s", name = "L", descriptor = "Lv;")
    public static class146 field2912 = class159.method1226((byte) -37, "<col=ffffff>");

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public static int field2903 = 0;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Lv;")
    public static class146 field2905 = field2901;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "Lv;")
    private static class146 field2913 = class159.method1226((byte) -37, " from your friend list first");

    @OriginalMember(owner = "client!s", name = "N", descriptor = "Lv;")
    public static class146 field2914 = class159.method1226((byte) -37, "(U2");

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Lv;")
    public static class146 field2908 = field2913;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2898;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "[I")
    public static int[] field2911;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method934(byte arg0) {
        field2898 = null;
        field2908 = null;
        field2913 = null;
        field2912 = null;
        field2893 = null;
        field2895 = null;
        int var1 = 42 % ((arg0 - 62) / 59);
        field2905 = null;
        field2911 = null;
        field2909 = null;
        field2907 = null;
        field2901 = null;
        field2902 = null;
        field2914 = null;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)[Lie;")
    public static final class61[] method935(int arg0) {
        field2906++;
        class61[] var1 = new class61[class3.field86];
        if (arg0 != 21226) {
            field2901 = null;
        }
        for (int var2 = 0; var2 < class3.field86; var2++) {
            class61 var3 = var1[var2] = new class61();
            var3.field1416 = class22.field373;
            var3.field1415 = class67.field1538;
            var3.field1410 = class37.field833[var2];
            var3.field1413 = class122.field2840[var2];
            var3.field1412 = class41.field935[var2];
            var3.field1414 = class30.field617[var2];
            byte[] var4 = class46.field1063[var2];
            int var5 = var3.field1414 * var3.field1412;
            var3.field1411 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field1411[var6] = class59.field1358[class90.method711(255, var4[var6])];
            }
        }
        class69.method492(81);
        return var1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public static final void method936(int arg0, int arg1) {
        field2904++;
        class125 var2 = (class125) class124.field2868.method332((byte) -79, (long) arg1);
        if (var2 != null && arg0 >= 70) {
            var2.method217(-1264);
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public static final void method937(int arg0) {
        int var1 = class151.field3483.method811(class72.field1657);
        field2910++;
        for (int var2 = 0; var2 < class13.field208; var2++) {
            int var6 = class151.field3483.method811(class41.method270(var2, -1));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        if (arg0 != 765) {
            field2908 = null;
        }
        class38.field842 = true;
        var1 += 8;
        class44.field1024 = var1;
        int var3 = class13.field208 * 15 + 21;
        class17.field277 = class13.field208 * 15 + 22;
        int var4 = class90.field2150 - var1 / 2;
        if (var1 + var4 > 765) {
            var4 = 765 - var1;
        }
        int var5 = class25.field401;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class12.field192 = var5;
        class51.field1158 = var4;
    }
}
