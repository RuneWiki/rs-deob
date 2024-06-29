import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class55 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field1116 = 0;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[Lrf;")
    public static class163[] field1118 = new class163[100];

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lrf;")
    public static class163 field1120 = class53.method392(-112, "<col=ff7000>");

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[Lpf;")
    public static class145[] field1117;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method403(byte arg0) {
        if (arg0 <= 12) {
            field1116 = 72;
        }
        field1117 = null;
        field1118 = null;
        field1120 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lu;Z)V")
    public static final void method404(class184 arg0, boolean arg1) {
        field1115++;
        if (!arg1) {
            field1117 = null;
        }
        class49.field950 = arg0;
    }
}
