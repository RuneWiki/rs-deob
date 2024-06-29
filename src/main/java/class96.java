import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class96 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[I")
    public static int[] field1777 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Ldj;")
    public static class44 field1779 = class89.method650(255, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Ldj;")
    public static class44 field1778 = class89.method650(255, "Texturen geladen)3");

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Ldj;")
    private static class44 field1780 = class89.method650(255, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Ldj;")
    public static class44 field1775 = field1780;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Ldj;")
    public static class44 field1776 = class89.method650(255, "<col=ffff00>");

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field1773 = 1;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Ls;")
    public static class190 field1782 = new class190();

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "[I")
    public static int[] field1783 = new int[5];

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lca;")
    public static class24 field1774;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZII)Lvc;")
    public static final class223 method678(boolean arg0, int arg1, int arg2) {
        field1781++;
        class223 var3 = class213.method1379(arg1, -10051);
        if (!arg0) {
            field1773 = 50;
        }
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4169 == null || var3.field4169.length <= arg2) {
            return null;
        } else {
            return var3.field4169[arg2];
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method679(int arg0) {
        if (arg0 != 15536) {
            method678(false, 97, 33);
        }
        field1775 = null;
        field1774 = null;
        field1780 = null;
        field1782 = null;
        field1777 = null;
        field1783 = null;
        field1779 = null;
        field1776 = null;
        field1778 = null;
    }
}
