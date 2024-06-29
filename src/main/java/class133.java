import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class133 {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lvf;")
    public static class265 field2404 = class87.method582(-46, ":assistreq:");

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lvf;")
    public static class265 field2406 = class87.method582(-46, "Wordpack geladen)3");

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field2409 = -1;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Ldl;")
    public static class31 field2403;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lgk;")
    public static class6 field2402;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method885(int arg0) {
        if (arg0 != -1140) {
            method885(-88);
        }
        field2403 = null;
        field2406 = null;
        field2402 = null;
        field2404 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lvf;Lvf;Lvf;II)V")
    public static final void method886(class265 arg0, class265 arg1, class265 arg2, int arg3, int arg4) {
        client.method1468(arg1, -1, arg0, -128, arg2, arg3);
        if (arg4 >= -108) {
            method885(-85);
        }
        field2405++;
    }
}
