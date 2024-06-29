import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class203 implements class338 {

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Llr;")
    private class684 field2489;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Lrm;")
    public static class373 field2487;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        field2490++;
        return arg0 == -18257 ? true : true;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field2487 = null;
        if (arg0 != 0) {
            method1245(-115);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)I")
    public static int method1246(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        field2488++;
        if (arg0 != -29265) {
            field2487 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Llr;)V")
    public class203(class684 arg0) {
        this.field2489 = arg0;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)V")
    public final void method725(boolean arg0, int arg1) {
        field2491++;
        if (arg1 != -2536) {
            this.method149(-15);
        }
        if (arg0) {
            class453.field6284.method286(0, 0, class399.field5336, class416.field5524, this.field2489.field9694, 0);
        }
    }
}
