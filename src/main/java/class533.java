import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class533 extends class321 {

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZIII)V")
    public final void method1755(boolean arg0, int arg1, int arg2, int arg3) {
        ++field7697;
        if (!arg0) {
            field7698 = -75;
        }
        super.field4638 = arg2;
        super.field4646 = arg3;
        super.field4640 = arg1;
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(IIIIIF)V")
    public class533(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(FI)V")
    public final void method1756(float arg0, int arg1) {
        if (arg1 == 99999) {
            super.field4643 = arg0;
            ++field7699;
        }
    }
}
