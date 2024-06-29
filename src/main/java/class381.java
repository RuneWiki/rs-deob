import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class381 extends Exception {

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Lkn;")
    public static class307 field4889;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "Lclient;")
    public static client field4890;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2173(int arg0) {
        field4891++;
        class258.field3482.method3877(2);
        int var1 = 39 / ((arg0 - 65) / 47);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLfs;)Z", line = 13)
    public static final boolean method2174(boolean arg0, class546 arg1) {
        field4892++;
        if (!arg0) {
            field4889 = null;
        }
        return class419.field5427 == arg1 || class122.field1585 == arg1 || class547.field7104 == arg1 || class384.field4913 == arg1;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V", line = 24)
    public static void method2175(int arg0) {
        field4890 = null;
        field4889 = null;
        if (arg0 != 16653) {
            field4890 = null;
        }
    }
}
