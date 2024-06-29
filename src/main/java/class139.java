import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class139 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field2721 = -1;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Leh;")
    private static class47 field2725 = class195.method1282((byte) -4, "No response from server)3");

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Leh;")
    public static class47 field2720 = class195.method1282((byte) -4, "::fps ");

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Leh;")
    public static class47 field2728 = field2725;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lpa;")
    public static class136 field2726 = new class136(30);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Lhc;")
    public class67 field2723;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
    public int[] field2722;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[Leh;")
    public class47[] field2724;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1008(int arg0) {
        field2728 = null;
        field2720 = null;
        int var1 = -4 / ((46 - arg0) / 62);
        field2725 = null;
        field2726 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static final void method1009(int arg0) {
        field2727++;
        if (class190.field3684 != null || class26.field511 != null) {
            return;
        }
        int var1 = -63 % ((arg0 + 52) / 39);
        int var2 = class100.field2105;
        if (class80.field1726) {
            if (var2 != 1) {
                int var7 = class84.field1788;
                int var8 = class41.field814;
                if (var7 < class105.field2182 - 10 || class152.field2967 + class105.field2182 + 10 < var7 || var8 < class76.field1648 - 10 || class79.field1694 + class76.field1648 + 10 < var8) {
                    class80.field1726 = false;
                    class27.method249(class76.field1648, -23343, class152.field2967, class79.field1694, class105.field2182);
                }
            }
            if (var2 != 1) {
                return;
            }
            int var9 = class105.field2182;
            int var10 = class76.field1648;
            int var11 = class152.field2967;
            int var12 = class3.field29;
            int var13 = class185.field3546;
            int var14 = -1;
            for (int var15 = 0; var15 < class95.field1971; var15++) {
                int var16 = (class95.field1971 - var15 - 1) * 15 + var10 + 31;
                if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var16 + 3 > var13) {
                    var14 = var15;
                }
            }
            if (var14 != -1) {
                class151.method1062(var14, -2366);
            }
            class80.field1726 = false;
            class27.method249(class76.field1648, -23343, class152.field2967, class79.field1694, class105.field2182);
            return;
        }
        if (var2 == 1 && class95.field1971 > 0) {
            short var3 = class25.field478[class95.field1971 - 1];
            if (var3 == 5 || var3 == 21 || var3 == 19 || var3 == 33 || var3 == 22 || var3 == 57 || var3 == 12 || var3 == 1 || var3 == 2 || var3 == 47 || var3 == 7 || var3 == 1007) {
                int var4 = class9.field210[class95.field1971 - 1];
                int var5 = class55.field1063[class95.field1971 - 1];
                class61 var6 = class23.method224(var5, 484111152);
                if (class135.method984(-120, class5.method25(var6, (byte) 104)) || class109.method877(class5.method25(var6, (byte) 98), -1)) {
                    class44.field892 = 0;
                    class185.field3544 = false;
                    if (class190.field3684 != null) {
                        class20.method204(class190.field3684, (byte) -5);
                    }
                    class190.field3684 = class23.method224(var5, 484111152);
                    class80.field1730 = var4;
                    class19.field371 = class185.field3546;
                    class91.field1914 = class3.field29;
                    class20.method204(class190.field3684, (byte) -5);
                    return;
                }
            }
        }
        if (var2 == 1 && (class6.field95 == 1 && class95.field1971 > 2 || class44.method367(0, class95.field1971 - 1))) {
            var2 = 2;
        }
        if (var2 == 1 && class95.field1971 > 0) {
            class151.method1062(class95.field1971 - 1, -2366);
        }
        if (var2 == 2 && class95.field1971 > 0) {
            class84.method697((byte) 117);
            return;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lah;B)V")
    public static final void method1010(class9 arg0, byte arg1) {
        field2730++;
        class166.field3219 = arg0;
        if (arg1 < 121) {
            field2726 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Ll;")
    public static final class99 method1011(int arg0, int arg1) {
        field2719++;
        class99 var2 = (class99) class83.field1776.method986((byte) 50, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class22.field432.method67(arg1, -1, arg0);
        class99 var4 = new class99();
        if (var3 != null) {
            var4.method801(new class68(var3), true);
        }
        class83.field1776.method987((long) arg0, var4, 28842);
        return var4;
    }
}
