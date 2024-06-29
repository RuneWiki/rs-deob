import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class277 extends class74 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lcc;")
    public static class209 field4877 = class95.method669(87, "leuchten3:");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lcc;")
    private static class209 field4876 = class95.method669(91, "glow1:");

    @OriginalMember(owner = "client!g", name = "o", descriptor = "[[I")
    public static int[][] field4883 = new int[104][104];

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lcc;")
    public static class209 field4878 = field4876;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lcc;")
    public static class209 field4884 = field4876;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Ln;")
    public static class16 field4875;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method1875(byte arg0) {
        field4876 = null;
        field4884 = null;
        field4875 = null;
        field4877 = null;
        field4883 = null;
        if (arg0 >= -21) {
            field4884 = null;
        }
        field4878 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(BI)I")
    public static final int method1876(byte arg0, int arg1) {
        field4886++;
        if (arg0 != -38) {
            method1879((class106) null, -48);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Lmb;")
    public static final class159 method1877(int arg0) {
        if (arg0 == 104) {
            field4887++;
            return class229.field4168 < class9.field175.length ? class9.field175[class229.field4168++] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BIZ)I")
    public static final int method1878(byte[] arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4883 = null;
        }
        field4882++;
        return class272.method1854(115, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ltf;I)Lbj;")
    public static final class154 method1879(class106 arg0, int arg1) {
        if (arg1 != 32093) {
            return null;
        }
        field4885++;
        class154 var2 = new class154();
        var2.field2807 = arg0.method736(121);
        var2.field2802 = class215.method1507(var2.field2807, arg1 - 20017);
        return var2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method1880(int arg0, int arg1) {
        int var2 = 87 / ((arg1 + 37) / 42);
        field4880++;
        class195 var3 = class178.method1229(arg0, 12, -116);
        var3.method1340(true);
    }
}
