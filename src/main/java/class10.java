import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[Lbj;")
    public static class22[] field141 = new class22[256];

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Li;")
    private static class88 field148 = class208.method1425(105, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Li;")
    public static class88 field143 = field148;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Z")
    public static boolean field145 = false;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Li;")
    private static class88 field147 = class208.method1425(105, "Created gameworld");

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Li;")
    public static class88 field144 = field147;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Li;")
    public static class88 field150 = class208.method1425(105, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static void method52(boolean arg0) {
        if (!arg0) {
            method52(true);
        }
        field144 = null;
        field147 = null;
        field141 = null;
        field150 = null;
        field143 = null;
        field148 = null;
    }
}
