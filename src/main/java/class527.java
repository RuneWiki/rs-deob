import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class527 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lwo;")
    public static class690 field7713 = new class690(88, 8);

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Z")
    public static boolean field7715 = false;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lnga;")
    public static class477 field7716;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 3)
    public static void method3105(byte arg0) {
        field7716 = null;
        if (arg0 >= -96) {
            method3105((byte) -118);
        }
        field7713 = null;
    }

    @OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field7712++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(II)V", line = 34)
    public class527(int arg0, int arg1) {
        this.field7714 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Leba;", line = 44)
    public static final class543 method3106(int arg0) {
        field7711++;
        return class598.field8637 == arg0 ? new class543() : class261.field3592[--class598.field8637];
    }
}
