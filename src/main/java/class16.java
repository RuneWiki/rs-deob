import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class16 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field181 = 2;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lbe;")
    public static class283 field186 = class153.method941(10, "settings");

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lbe;")
    public static class283 field180 = class153.method941(125, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Lbe;")
    private static class283 field184 = class153.method941(125, "Ok");

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Lbe;")
    public static class283 field182 = class153.method941(125, "::gc");

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "[Lbe;")
    public static class283[] field190 = new class283[200];

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Lbe;")
    public static class283 field191 = field184;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "Lbe;")
    public static class283 field189 = class153.method941(-23, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "[Lnh;")
    public static class107[] field188;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V", line = 23)
    public static final void method88(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            for (int var5 = arg3; var5 < arg4; var5++) {
                class97.field1636[var5][arg2] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class97.field1636[var6][arg2] = arg0;
            }
        }
        if (arg1 != -30009) {
            field180 = (class283) null;
        }
        field183++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V", line = 72)
    public static void method89(boolean arg0) {
        field182 = null;
        field184 = null;
        field188 = null;
        field186 = null;
        field180 = null;
        field191 = null;
        if (arg0) {
            field190 = null;
            field189 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lea;I)V", line = 97)
    public static final void method90(class191 arg0, int arg1) {
        field187++;
        class183 var2 = (class183) class172.field2899.method1612(arg0.field3274.method1929((byte) -24), 107);
        if (var2 != null) {
            if (var2.field3155 != null) {
                class301.field5089.method1275(var2.field3155);
                var2.field3155 = null;
            }
            var2.method557((byte) -89);
        }
        if (arg1 != 8735) {
            method88(81, -111, 35, 91, -62);
        }
    }
}
