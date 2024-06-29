import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field188 = 20;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field193 = 1401;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Ljm;")
    public static class485 field192 = new class485(68, 8);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
    public final int method141(byte arg0) {
        if (arg0 == 103) {
            field191++;
            return this.field190;
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class18(String arg0, int arg1) {
        this.field190 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field189++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        field192 = null;
        int var1 = 48 / ((81 - arg0) / 33);
    }
}
