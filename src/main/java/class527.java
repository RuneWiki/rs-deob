import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class527 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public int field7495;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Ldba;")
    public static class101 field7497 = new class101(11, 7);

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field7499 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lcb;")
    public static class544 field7498;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJ)V", line = 3)
    public static final void method3060(int arg0, long arg1) {
        class241.field3461.setTime(new Date(arg1));
        if (arg0 != -12477) {
            method3061(-54);
        }
        field7496++;
    }

    @OriginalMember(owner = "client!ve", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field7500++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V", line = 27)
    public class527(int arg0, int arg1) {
        this.field7495 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 47)
    public static void method3061(int arg0) {
        if (arg0 >= 93) {
            field7498 = null;
            field7497 = null;
        }
    }
}
