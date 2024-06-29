import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class63 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field995 = 0;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[Lgd;")
    public static class60[] field999 = new class60[6];

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "J")
    public static long field998 = 0L;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lkb;")
    private static class93 field1001 = class76.method390("RuneScape is loading )2 please wait)3)3)3", 0);

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lkb;")
    public static class93 field1004 = field1001;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lkb;")
    private static class93 field997 = class76.method390("Error connecting to server)3", 0);

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lkb;")
    private static class93 field1002 = class76.method390("Unable to find ", 0);

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lkb;")
    public static class93 field1003 = field997;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lkb;")
    public static class93 field1005 = field1002;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Lme;")
    public static class114 field1000;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Lme;")
    public static class114 field994;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lbb;")
    public static class13 field996;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "[Lob;")
    public static class129[] field1006;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method323(int arg0) {
        field1006 = null;
        field996 = null;
        field999 = null;
        field1000 = null;
        field1004 = null;
        field1002 = null;
        field1001 = null;
        field1003 = null;
        field997 = null;
        field994 = null;
        field1005 = null;
        if (arg0 != 6) {
            field1000 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method324(byte arg0) {
        for (class110 var1 = (class110) class98.field1834.method692(false); var1 != null; var1 = (class110) class98.field1834.method695(512)) {
            if (var1.field1977 != null) {
                class184.field3634.method1133(var1.field1977);
                var1.field1977 = null;
            }
            if (var1.field1975 != null) {
                class184.field3634.method1133(var1.field1975);
                var1.field1975 = null;
            }
        }
        field1007++;
        int var2 = 3 / ((arg0 - 7) / 63);
        class98.field1834.method702((byte) 111);
    }
}
