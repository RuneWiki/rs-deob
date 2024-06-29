import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class547 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
    public static int[] field7822 = new int[32];

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZI)Z")
    public static final boolean method3095(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field7821++;
            return class601.method3359(1, arg0, arg2) | (arg2 & 0x70000) != 0 || class354.method1959(759600449, arg0, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(II)V")
    public class547(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!gl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7824++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method3096(int arg0) {
        if (arg0 != -11399) {
            method3096(-110);
        }
        field7822 = null;
    }
}
