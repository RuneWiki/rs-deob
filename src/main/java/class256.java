import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class256 {

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "Z")
    public static volatile boolean field3725 = true;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
    public static final void method1737(int arg0) {
        field3724++;
        class157.field2198 = null;
        if (arg0 <= 111) {
            method1737(81);
        }
        class545.field7567 = null;
        class238.field3554 = null;
        class32.field432 = null;
        class202.field2680 = false;
        class79.field1141 = null;
    }
}
