import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class679 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public int field9548;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Llh;")
    public static class128 field9549 = new class128(16);

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "F")
    public static float field9551;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "J")
    public static long field9552;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)I")
    public final int method3822(byte arg0) {
        if (arg0 != -114) {
            this.field9548 = -26;
        }
        field9546++;
        return this.field9548;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method3823(int arg0) {
        field9549 = null;
        if (arg0 != -19211) {
            field9551 = 1.1029164F;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class679(String arg0, int arg1) {
        this.field9548 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lpl;Lfa;I)V")
    public static final void method3824(class612 arg0, class526 arg1, int arg2) {
        class227.field2829 = arg0;
        if (arg2 == -27984) {
            class177.field2288 = arg1;
            field9547++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9550++;
        throw new IllegalStateException();
    }
}
