import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class255 {

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field3275 = 2;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "Lvj;")
    public static class373 field3277 = new class373(43, 10);

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "Lrg;")
    public static class548 field3280 = new class548(1, -1);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "Lsm;")
    public static class236 field3276;

    @OriginalMember(owner = "client!bv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3274++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Let;II)Ljava/lang/String;")
    public static final String method1441(class509 arg0, int arg1, int arg2) {
        field3278++;
        if (arg2 != -11691) {
            field3280 = null;
        }
        if (!client.method1412(arg0).method1506(arg1, (byte) -123) && arg0.field7176 == null) {
            return null;
        } else if (arg0.field7132 == null || arg0.field7132.length <= arg1 || arg0.field7132[arg1] == null || arg0.field7132[arg1].trim().length() == 0) {
            return class2.field8 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field7132[arg1];
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(II)V")
    public class255(int arg0, int arg1) {
        this.field3279 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public static void method1442(int arg0) {
        if (arg0 < 47) {
            field3277 = null;
        }
        field3277 = null;
        field3276 = null;
        field3280 = null;
    }
}
