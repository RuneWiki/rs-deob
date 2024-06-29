import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class134 {

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lqk;")
    public static class207 field2324 = class24.method212(255, "(U0a )2 in: ");

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2325 = 0;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lqk;")
    private static class207 field2321 = class24.method212(255, "Created gameworld");

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lqk;")
    public static class207 field2320 = field2321;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[Luh;")
    public static class100[] field2319;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[[B")
    public static byte[][] field2327;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILqk;)I")
    public static final int method939(int arg0, class207 arg1) {
        field2326++;
        for (int var2 = arg0; var2 < class220.field4022.length; var2++) {
            if (class220.field4022[var2].method1462(arg1, true)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method940(int arg0) {
        if (arg0 != -1) {
            field2328 = 96;
        }
        field2321 = null;
        field2320 = null;
        field2319 = null;
        field2327 = null;
        field2324 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLka;)V")
    public static final void method941(byte arg0, class256 arg1) {
        field2323++;
        for (class79 var2 = (class79) class47.field942.method922((byte) 83); var2 != null; var2 = (class79) class47.field942.method928(-88)) {
            if (var2.field1432 == arg1) {
                if (var2.field1438 != null) {
                    class65.field1177.method661(var2.field1438);
                    var2.field1438 = null;
                }
                var2.method1346((byte) -16);
                return;
            }
        }
        if (arg0 < 90) {
            method939(58, (class207) null);
        }
    }
}
