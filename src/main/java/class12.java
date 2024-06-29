import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class12 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Ljava/lang/String;")
    public String field129;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lbq;")
    public static class341 field131 = new class341(0, 0);

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field135 = -1;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field130++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)Z", line = 13)
    public static final boolean method88(int arg0, byte arg1, int arg2) {
        field133++;
        int var3 = -114 / ((81 - arg1) / 42);
        return class279.method1614((byte) -102, arg0, arg2) & class205.method1314(arg2, arg0, 102);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 31)
    public static void method89(int arg0) {
        if (arg0 != 0) {
            method89(2);
        }
        field131 = null;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 44)
    public class12(String arg0, int arg1) {
        this.field134 = arg1;
        this.field129 = arg0;
    }
}
