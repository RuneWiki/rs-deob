import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lrd;")
    public static class117 field1127 = class95.method812("::qa_op_test", (byte) 8);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lrd;")
    public static class117 field1128 = class95.method812("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", (byte) 8);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
    public static boolean field1135 = false;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1133 = 0;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lrd;")
    public static class117 field1134 = class95.method812("@cr2@", (byte) 8);

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lrd;")
    private static class117 field1137 = class95.method812("Trade)4compete", (byte) 8);

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lrd;")
    public static class117 field1132 = field1137;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lrd;")
    public static class117 field1129 = class95.method812("Ladevorgang )2 bitte warten Sie)3", (byte) 8);

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field1136 = 0;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lra;")
    public static class114 field1130;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILge;Lge;)I")
    public static final int method458(int arg0, class47 arg1, class47 arg2) {
        field1139++;
        int var3 = arg0;
        if (arg1.method515(-16594, class107.field2667, class56.field1570)) {
            var3 = arg0 + 1;
        }
        if (arg2.method515(-16594, class49.field1378, class56.field1570)) {
            var3++;
        }
        if (arg2.method515(-16594, class90.field2313, class56.field1570)) {
            var3++;
        }
        if (arg2.method515(arg0 - 16594, class148.field3622, class56.field1570)) {
            var3++;
        }
        if (arg2.method515(-16594, class136.field3268, class56.field1570)) {
            var3++;
        }
        if (arg2.method515(-16594, class124.field2997, class56.field1570)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1134 = null;
        field1132 = null;
        field1128 = null;
        field1129 = null;
        field1127 = null;
        if (arg0 == 0) {
            field1137 = null;
            field1130 = null;
        }
    }
}
