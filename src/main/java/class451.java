import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class451 {

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "Lmba;")
    private class646 field6254;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lst;")
    public static class335 field6253 = new class335(35, 7);

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field6256 = 0;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "Lno;")
    private class71 field6252;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V", line = 7)
    public static void method2759(byte arg0) {
        int var1 = 99 / ((-arg0 - 19) / 35);
        field6253 = null;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)Lno;", line = 17)
    public final class71 method2760(byte arg0) {
        field6257++;
        class71 var2 = this.field6254.field8670.field1077;
        if (this.field6254.field8670 == var2) {
            this.field6252 = null;
            return null;
        } else {
            this.field6252 = var2.field1077;
            return arg0 < 1 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 38)
    public static final void method2761(int arg0) {
        field6251++;
        int var1 = -115 % ((arg0 - 43) / 46);
        class496.field6948.method1444(class601.field8132);
        class496.field6948.method1421(class683.field9497, class726.field10055, class655.field8753, class606.field8184);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lmba;I)V", line = 51)
    public final void method2762(class646 arg0, int arg1) {
        this.field6254 = arg0;
        field6250++;
        if (arg1 != 526) {
            field6256 = 84;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Lno;", line = 62)
    public final class71 method2763(int arg0) {
        field6249++;
        if (arg0 != 26385) {
            field6255 = -101;
        }
        class71 var2 = this.field6252;
        if (this.field6254.field8670 == var2) {
            this.field6252 = null;
            return null;
        } else {
            this.field6252 = var2.field1077;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V", line = 92)
    public class451() {
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lmba;)V", line = 94)
    public class451(class646 arg0) {
        this.field6254 = arg0;
    }
}
