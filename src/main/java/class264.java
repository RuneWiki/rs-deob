import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class264 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lcea;")
    public static class180 field3441 = new class180("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lbg;")
    public static class393 field3445 = new class393();

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIII)V")
    public static final void method1475(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3446++;
        if (!arg1) {
            field3441 = null;
        }
        class557 var5 = class93.method564(10, -14073, arg4);
        var5.method3257(1948);
        var5.field8211 = arg0;
        var5.field8201 = arg2;
        var5.field8207 = arg3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Z")
    public static final boolean method1476(int arg0, int arg1, int arg2) {
        if (arg0 != 10) {
            method1478(true);
        }
        field3444++;
        return (class558.method3269(70, arg1, arg2) | class13.method103(arg2, 2, arg1) | class220.method1269(-124, arg1, arg2)) & class204.method1091(0, arg2, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZI)V")
    public static final void method1477(boolean arg0, boolean arg1, int arg2) {
        field3442++;
        class125 var3 = class256.method1445(arg2, (byte) -51, arg1);
        if (var3 != null) {
            var3.method3187(arg0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static void method1478(boolean arg0) {
        field3441 = null;
        if (!arg0) {
            method1476(-115, 119, -87);
        }
        field3445 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1479(boolean arg0, String arg1) {
        field3443++;
        if (!arg0) {
            method1478(false);
        }
        System.exit(1);
    }
}
