import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class579 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lmia;")
    public static class63 field8241 = new class63(53, 15);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Z")
    public static boolean field8242 = false;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method3362(int arg0) {
        field8241 = null;
        if (arg0 != -8941) {
            method3362(-121);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static final void method3363(byte arg0) {
        for (class567 var1 = (class567) class673.field9386.method3508(-2); var1 != null; var1 = (class567) class673.field9386.method3507(-51)) {
            if (var1.field8052 > 1) {
                var1.field8052 = 0;
                class606.field8553.method801(1, var1, ((class342) var1.field8055.field8521.field6156).field4959);
                var1.field8055.method3503(-16);
            }
        }
        field8239++;
        class68.field969 = 0;
        class565.field8032 = 0;
        class748.field10459.method1200(93);
        class33.field350.method2289(1393);
        class673.field9386.method3503(-16);
        class305.method1929(0, class419.field6268);
        if (arg0 != 73) {
            field8241 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lgt;I)V")
    public static final void method3364(class457 arg0, int arg1) {
        field8240++;
        if (arg1 > -41) {
            method3362(-41);
        }
        arg0.field6737 = null;
        if (class505.field7181 < 20) {
            class475.field6903.method1616(22437, arg0);
            class505.field7181++;
        }
    }
}
