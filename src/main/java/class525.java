import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class525 {

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "Lhu;")
    public static class238 field6674 = new class238();

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "Luw;")
    public static class208 field6675 = new class208(106, 0);

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "Z")
    public static boolean field6678 = false;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field6680;

    @OriginalMember(owner = "client!qt", name = "toString", descriptor = "()Ljava/lang/String;", line = 12)
    public final String toString() {
        field6676++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IJ)V", line = 22)
    public static final void method2886(int arg0, long arg1) {
        class368.field4508.setTime(new Date(arg1));
        int var3 = -17 / ((-arg0 - 24) / 50);
        field6677++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 44)
    public static void method2887(int arg0) {
        field6675 = null;
        field6680 = null;
        field6674 = null;
        if (arg0 != -11053) {
            field6675 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)I", line = 57)
    public static final int method2888(int arg0, byte arg1) {
        field6673++;
        if (arg1 != -41) {
            method2886(35, -95L);
        }
        return arg0 & 0xFF;
    }
}
