import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class465 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    private int field6724;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field6723;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[Leca;")
    public static class755[] field6726 = new class755[14];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field6722++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 15)
    public static void method2828(int arg0) {
        if (arg0 != 14) {
            field6726 = null;
        }
        field6726 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I", line = 31)
    public final int method2829(boolean arg0) {
        field6727++;
        if (arg0) {
            this.field6723 = -13;
        }
        return this.field6724;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V", line = 42)
    public class465(int arg0, int arg1) {
        this.field6724 = arg0;
        this.field6723 = arg1;
    }
}
