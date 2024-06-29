import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class202 {

    @OriginalMember(owner = "client!op", name = "h", descriptor = "Z")
    public boolean field2679;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Laga;")
    public static class696 field2675 = new class696();

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Lmga;")
    public static class739 field2678 = new class739(29, 4);

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "Lid;")
    public class612 field2674;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "Lid;")
    public class612 field2676;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
    public boolean field2673;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public final void method1368(int arg0) {
        if (this.field2674 != null) {
            this.field2674.method2614(arg0 + 17065);
        }
        if (arg0 == -16578) {
            field2672++;
            this.field2673 = false;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public static void method1369(int arg0) {
        field2675 = null;
        field2678 = null;
        if (arg0 != 4) {
            method1370(29, 57, -60);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)Z")
    public static final boolean method1370(int arg0, int arg1, int arg2) {
        field2677++;
        if (arg0 == 16) {
            return (arg1 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z")
    public final boolean method1371(int arg0) {
        field2680++;
        if (arg0 != 4) {
            method1370(-105, -18, -29);
        }
        return this.field2673 && !this.field2679;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Z)V")
    public class202(boolean arg0) {
        this.field2679 = arg0;
    }
}
