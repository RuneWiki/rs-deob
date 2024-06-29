import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class9 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    public static int[] field89 = new int[4];

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    public static int[] field85;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lof;", line = 3)
    public final class9 method43(int arg0, int arg1) {
        if (arg0 != 4) {
            this.field83 = -41;
        }
        field88++;
        return new class9(this.field86, arg1, this.field84, this.field87);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 15)
    public static void method44(int arg0) {
        field85 = null;
        field89 = null;
        if (arg0 < 29) {
            field89 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIII)V", line = 31)
    public class9(int arg0, int arg1, int arg2, int arg3) {
        this.field87 = arg3;
        this.field84 = arg2;
        this.field83 = arg1;
        this.field86 = arg0;
    }
}
