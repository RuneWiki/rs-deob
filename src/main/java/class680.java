import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class680 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
    private boolean field9094 = true;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field9095 = 443;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Z")
    private boolean field9100 = false;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public int field9102 = 43594;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
    public static int[] field9098 = new int[3];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field9103 = -1;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field9099;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljava/lang/String;")
    public String field9101;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 8)
    public final void method3734(int arg0) {
        field9097++;
        if (!this.field9094) {
            this.field9094 = true;
            this.field9100 = true;
        } else if (this.field9100) {
            this.field9100 = false;
        } else {
            this.field9094 = false;
        }
        if (arg0 != 374) {
            this.method3738(-98, null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 35)
    public static void method3735(int arg0) {
        field9098 = null;
        if (arg0 != 458752) {
            field9103 = -67;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lec;B)Lth;", line = 50)
    public final class621 method3736(class248 arg0, byte arg1) {
        field9105++;
        return arg1 == -10 ? arg0.method1540(this.field9100, 0, this.field9094 ? this.field9095 : this.field9102, this.field9101) : null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z", line = 63)
    public static final boolean method3737(int arg0, int arg1, int arg2) {
        if (arg2 != 443) {
            field9098 = null;
        }
        field9104++;
        return class171.method1150(arg0, (byte) -103, arg1) | (arg1 & 0x70000) != 0 || class521.method3030(arg0, -68, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILpb;)Z", line = 87)
    public final boolean method3738(int arg0, class680 arg1) {
        field9096++;
        if (arg0 != -1) {
            this.field9102 = 84;
        }
        if (arg1 == null) {
            return false;
        } else {
            return this.field9099 == arg1.field9099 && this.field9101.equals(arg1.field9101);
        }
    }
}
