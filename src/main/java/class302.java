import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class302 extends class68 {

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public int field5034;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field5028;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lce;")
    public static class126 field5032 = class206.method1445(-7923, "zap");

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lce;")
    private static class126 field5031 = class206.method1445(-7923, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lce;")
    public static class126 field5036 = field5031;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbb;Z)V", line = 11)
    public static final void method2028(class134 arg0, boolean arg1) {
        field5035++;
        if (class63.field1059 != null) {
            try {
                class63.field1059.method1151(0L, 0);
                class63.field1059.method1148(arg0.field2282, -128, arg0.field2299, 24);
            } catch (Exception var3) {
            }
        }
        arg0.field2299 += 24;
        if (arg1) {
            field5029 = -60;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)V", line = 36)
    public static final void method2029(int arg0, byte arg1) {
        if (arg1 == 12) {
            class280.field4656.method1175(true, arg0);
            field5033++;
            class168.field2997.method1175(true, arg0);
            class278.field4632.method1175(true, arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 63)
    public static void method2030(int arg0) {
        field5031 = null;
        field5032 = null;
        field5036 = null;
        if (arg0 != 3523) {
            field5036 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(II)V", line = 89)
    public class302(int arg0, int arg1) {
        this.field5034 = arg0;
        this.field5028 = arg1;
    }
}
