import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[Lad;")
    public static class5[] field543 = new class5[200];

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static volatile int field545 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field544 = 0;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Z")
    public static boolean field547 = false;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lad;")
    public static class5 field556 = class88.method674("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", 98);

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lad;")
    public static class5 field554 = class88.method674("nicht hergestellt werden)3", -86);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field549 = -1;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lad;")
    public static class5 field555 = class88.method674("Bitte versuchen Sie es in ", 86);

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lad;")
    private static class5 field557 = class88.method674("Too many connections from your address)3", 45);

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lad;")
    public static class5 field550 = field557;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lsb;")
    public static class110 field546;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[I")
    public static int[] field548;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[I")
    public static int[] field551;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 27)
    public static void method167(boolean arg0) {
        field546 = null;
        field557 = null;
        field555 = null;
        field551 = null;
        field554 = null;
        field548 = null;
        field556 = null;
        if (!arg0) {
            field551 = null;
        }
        field543 = null;
        field550 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lad;Lad;ZI)V", line = 46)
    public static final void method168(class5 arg0, class5 arg1, boolean arg2, int arg3) {
        field558++;
        if (class6.field225 == -1) {
            class99.field2384 = true;
        }
        if (arg3 == 0 && class90.field2124 != -1) {
            class33.field817 = arg0;
            class90.field2126 = 0;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class46.field1215[var4] = class46.field1215[var4 - 1];
            class116.field2879[var4] = class116.field2879[var4 - 1];
            class96.field2282[var4] = class96.field2282[var4 - 1];
        }
        if (arg2) {
            method169((byte) 100);
        }
        class46.field1215[0] = arg3;
        class116.field2879[0] = arg1;
        class96.field2282[0] = arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 81)
    public static final void method169(byte arg0) {
        class43.field1095 = null;
        class38.field930 = null;
        class61.field1504 = null;
        class17.field458 = null;
        if (arg0 != 25) {
            field548 = null;
        }
        field552++;
        class16.field432 = null;
        class46.field1198 = null;
    }
}
