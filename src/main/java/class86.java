import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class86 {

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Li;")
    public static class88 field1554 = class208.method1425(105, "Weiter");

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1552 = -1;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Li;")
    public static class88 field1556 = class208.method1425(105, ":assistreq:");

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
    public static int[] field1557 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lnb;")
    public static class144 field1553;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBIII)V")
    public static final void method580(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1555++;
        if (class67.field1207 <= arg4 && arg4 <= class12.field183) {
            int var5 = class156.method1060(class49.field919, class18.field279, -119, arg3);
            int var6 = class156.method1060(class49.field919, class18.field279, -102, arg2);
            class109.method755(arg0, var5, 89, arg4, var6);
        }
        if (arg1 != 48) {
            method582(57);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V")
    public static final void method581(int arg0, boolean arg1) {
        class44.field772 = arg0;
        if (arg1) {
            field1551++;
            class54.field1012 = 50;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public abstract void method205(byte arg0);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I")
    public abstract int method204(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method582(int arg0) {
        if (arg0 != 14642) {
            method581(-40, false);
        }
        field1554 = null;
        field1553 = null;
        field1556 = null;
        field1557 = null;
    }
}
