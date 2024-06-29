import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class207 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[[B")
    public static byte[][] field3713 = new byte[50][];

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3716 = -2;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lid;")
    private static class149 field3714 = class60.method382("Loading sprites )2 ", (byte) 11);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lid;")
    public static class149 field3715 = field3714;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field3715 = null;
        field3714 = null;
        field3713 = null;
        if (arg0 != 1) {
            method1412(-73);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lgh;")
    public static final class24 method1413(int arg0, int arg1, int arg2) {
        field3717++;
        if (arg0 != 19451) {
            field3713 = null;
        }
        for (class24 var3 = (class24) class167.field3095.method1140(0); var3 != null; var3 = (class24) class167.field3095.method1127(0)) {
            if (var3.field369 && var3.method137(arg2, arg1, false)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public static final void method1414(int arg0, int arg1) {
        field3712++;
        if (arg1 == -11770) {
            class155.field2832.method1289(arg0, arg1 + 11854);
            class124.field2182.method1289(arg0, 76);
            class93.field1642.method1289(arg0, 114);
        }
    }
}
