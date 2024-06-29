import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class478 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lfr;")
    public static class497 field7041 = new class497();

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Loo;")
    public static class31 field7043;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static void method2843(int arg0) {
        field7043 = null;
        if (arg0 < 118) {
            method2844(null, -18, null);
        }
        field7041 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method2844(String arg0, int arg1, String arg2) {
        class368.field5603 = arg0;
        class462.field6730 = arg2;
        field7042++;
        if (class516.field7574 != 3 && (class368.field5603.equals("") || class462.field6730.equals(""))) {
            class61.method436(3, 2000);
            return;
        }
        class420.field6295 = false;
        if (class516.field7574 != 1) {
            class263.field3916 = 0;
            class446.field6587 = -1;
        }
        class61.method436(-3, 2000);
        class7.field63 = 0;
        class34.field472 = 0;
        if (arg1 != 23238) {
            field7044 = 68;
        }
        class130.field1926 = 1;
    }
}
