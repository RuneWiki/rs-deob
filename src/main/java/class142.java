import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class142 {

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lca;")
    public static class24 field2618 = new class24(5);

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Li;")
    public static class88 field2621 = class208.method1425(105, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Li;")
    public static class88 field2620 = class208.method1425(105, "<br>");

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2622 = 0;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Li;")
    public static class88 field2624 = class208.method1425(105, "hint_mapmarkers");

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Li;")
    public static class88 field2627 = class208.method1425(105, "VOLL");

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Li;")
    public static class88 field2623 = class208.method1425(105, "scrollbar");

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lnb;")
    public static class144 field2626;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Z")
    public static boolean field2625;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    public static final int method930(int arg0, int arg1) {
        field2616++;
        if (arg0 <= 88) {
            method930(-34, 93);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Z")
    public static final boolean method931(boolean arg0) {
        field2615++;
        try {
            if (class122.field2232 == 2) {
                if (class196.field3766 == null) {
                    class196.field3766 = class91.method663(class158.field3041, class228.field4270, class242.field4482);
                    if (class196.field3766 == null) {
                        return false;
                    }
                }
                if (class248.field4554 == null) {
                    class248.field4554 = new class151(class153.field2957, class86.field1553);
                }
                if (class31.field503.method1184(22050, class248.field4554, class196.field3766, 0, class12.field177)) {
                    class31.field503.method1189(0);
                    class31.field503.method1188((byte) -14, class11.field159);
                    class31.field503.method1187(0, class196.field3766, class17.field277);
                    class158.field3041 = null;
                    class196.field3766 = null;
                    class122.field2232 = 0;
                    class248.field4554 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class31.field503.method1210(false);
            class248.field4554 = null;
            class158.field3041 = null;
            class122.field2232 = 0;
            class196.field3766 = null;
        }
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)I")
    public static final int method932(int arg0, int arg1) {
        field2617++;
        class226 var2 = class153.method1045(15913, arg1);
        int var3 = var2.field4236;
        int var4 = var2.field4239;
        int var5 = var2.field4235;
        if (arg0 != -17611) {
            method933((byte) -94);
        }
        int var6 = class101.field1834[var4 - var3];
        return class113.field2052[var5] >> var3 & var6;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method933(byte arg0) {
        field2627 = null;
        if (arg0 != 75) {
            field2620 = null;
        }
        field2621 = null;
        field2618 = null;
        field2620 = null;
        field2623 = null;
        field2626 = null;
        field2624 = null;
    }
}
