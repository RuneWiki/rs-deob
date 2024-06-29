import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class84 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lbg;")
    public static class324 field1151 = new class324(28, 3);

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1155 = 1;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lgk;")
    public static class331 field1154 = new class331("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[Ll;")
    public static class16[] field1153;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Lcn;", line = 11)
    public static final class355 method753(byte arg0) {
        field1152++;
        return arg0 == -83 ? class399.field5889 : null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 23)
    public static void method754(int arg0) {
        if (arg0 == 12) {
            field1153 = null;
            field1154 = null;
            field1151 = null;
        }
    }
}
