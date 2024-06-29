import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class527 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lsb;")
    public static class266 field7430 = new class266(83, 18);

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field7433 = 0;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field7435 = -1;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lko;")
    public static class470 field7429;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method3083(int arg0) {
        if (arg0 == 83) {
            field7429 = null;
            field7430 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(II)V")
    public class527(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!kj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7432++;
        throw new IllegalStateException();
    }
}
