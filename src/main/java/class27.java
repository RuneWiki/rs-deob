import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class27 {

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[I")
    public static int[] field719 = new int[8];

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lvf;")
    public static class265 field717 = class87.method582(-46, ")4a=");

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lvf;")
    public static class265 field720 = class87.method582(-46, "hint_mapmarkers");

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lvf;")
    public static class265 field721 = class87.method582(-46, "glissement:");

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
    public static final void method236(byte arg0, int arg1) {
        if (arg0 != -14) {
            method236((byte) -70, -68);
        }
        field716++;
        class178 var2 = class188.method1282(arg1, 9, arg0 + 261360494);
        var2.method1160(arg0 + 135);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method237(int arg0) {
        field720 = null;
        field721 = null;
        field719 = null;
        if (arg0 < 55) {
            method237(83);
        }
        field717 = null;
    }
}
